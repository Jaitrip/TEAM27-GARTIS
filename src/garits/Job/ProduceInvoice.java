/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Job;

import garits.DBConnectivity.DBConnection;
import garits.Stock.Part;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jaimik
 */
public class ProduceInvoice {
    
    Connection connection;
    
    public ProduceInvoice() {
        try {
            connection = DBConnection.getConnection();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    
    public boolean isConnected() {
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Invoice produceInvoice(String jNumber) throws SQLException {
        
        Invoice invoice = new Invoice("", "", "", "", "", "", "", "", "");
        List<String> taskTotalTimes = new LinkedList<String>();
        List<Part> partList = new LinkedList<Part>();
        double labourCost = 0;
        double partCost = 0;
        double grandTotal = 0;
        double totalHours = 0;
        
        String jobTypeQuery = "SELECT jobtype FROM JobSheet WHERE jobNumber = ?";
        String partQuery = "SELECT price, qty FROM PartsUsed INNER JOIN StockLedger ON StockLedger.partName = PartsUsed.Description WHERE JobSheetjobNumber = ?";
        String taskTimeQuery = "SELECT actualTime FROM JobTask WHERE JobSheetjobNumber = ?";
        String labourRateQuery = "SELECT labourRate FROM Mechanic INNER JOIN JobSheet ON JobSheet.EmployeeemployeeID = Mechanic.employeeID WHERE JobSheet.jobNumber = ?";
        String customerIDQuery = "SELECT CustomercustomerID FROM Vehicle INNER JOIN JobSheet ON JobSheet.VehicleregistrationNumber = Vehicle.registrationNumber WHERE JobSheet.jobNumber = ?";
        String fixedQuery = "SELECT Fixed_Rate FROM Fixed INNER JOIN Discount ON Discount.Discount_ID = Fixed.Discount_ID WHERE Discount.customerID = ?";
        String variableQuery = "SELECT MoTDiscount, annualServiceDiscount, repairDiscount, sparePartsDiscount FROM Variable INNER JOIN Discount ON Discount.Discount_ID = Variable.Discount_ID WHERE Discount.customerID = ?";
        String flexibleQuery = "SELECT zeroToThousand, thousandToFive, fiveToTenThousand FROM Flexible INNER JOIN Discount ON Discount.Discount_ID = Flexible.Discount_ID WHERE Discount.customerID = ?";
        String creditQuery = "SELECT credit FROM AccountHolder WHERE customerID = ?";
        String payLaterQuery = "SELECT payLater FROM AccountHolder WHERE customerID = ?";
        try {
            
            //connection.setAutoCommit(false);
            
            PreparedStatement jobStatement = connection.prepareStatement(jobTypeQuery);
            jobStatement.setString(1, jNumber);
            ResultSet jobSet = jobStatement.executeQuery();
            
            String jobType = jobSet.getString("jobtype");
            
            if (!jobType.equals("Part Purchase")) {
                
                PreparedStatement pStatement = connection.prepareStatement(taskTimeQuery);
                pStatement.setString(1, jNumber);
                ResultSet resultSet = pStatement.executeQuery();

                while (resultSet.next()) {
                    taskTotalTimes.add(resultSet.getString("actualTime"));
                }

                double totalMins = 0;
                double hours = 0;
                double mins = 0;

                for (int i = 0; i < taskTotalTimes.size(); i++) {

                    hours = Double.parseDouble(taskTotalTimes.get(i).substring(0, 2));
                    System.out.println(hours);
                    mins = Double.parseDouble(taskTotalTimes.get(i).substring(3, 5));

                    totalMins = totalMins + mins;
                    totalHours = totalHours + hours;

                }

                totalHours = totalHours + (totalMins / 60);

                PreparedStatement labourCostStatement = connection.prepareStatement(labourRateQuery);
                labourCostStatement.setString(1, jNumber);
                ResultSet labourSet = labourCostStatement.executeQuery();
                double labourRate = Double.parseDouble(labourSet.getString("labourRate"));

                labourCost = totalHours * labourRate;
                
            }
            
            PreparedStatement partStatement = connection.prepareStatement(partQuery);
            partStatement.setString(1, jNumber);
            ResultSet parts = partStatement.executeQuery();
            
            while (parts.next()) {
                Part part = new Part(Integer.parseInt(parts.getString("qty")), Double.parseDouble(parts.getString("price")));
                partList.add(part);
            }
            
            partCost = 0;
            
            for (int i = 0; i < partList.size(); i++) {
                partCost = ((partList.get(i).getPartQuantity()) * (partList.get(i).getPartCost()));
            }
            
            partCost = partCost * 1.3;
            
            grandTotal = ((partCost + labourCost) * 1.2);
            
            PreparedStatement getCustomerID = connection.prepareStatement(customerIDQuery);
            getCustomerID.setString(1, jNumber);
            ResultSet customerIDSet = getCustomerID.executeQuery();
            String customerID = "";
            
            while(customerIDSet.next()) {
                customerID = customerIDSet.getString("CustomercustomerID");   
            }
            
            PreparedStatement fixedDiscountCheck = connection.prepareStatement(fixedQuery);
            fixedDiscountCheck.setString(1, customerID);
            ResultSet fixedDiscountCheckSet = fixedDiscountCheck.executeQuery();
            
            PreparedStatement variableDiscountCheck = connection.prepareStatement(variableQuery);
            variableDiscountCheck.setString(1, customerID);
            ResultSet variableDiscountCheckSet = variableDiscountCheck.executeQuery();
            
            PreparedStatement flexibleDiscountCheck = connection.prepareStatement(flexibleQuery);
            flexibleDiscountCheck.setString(1, customerID);
            ResultSet flexibleDiscountCheckSet = flexibleDiscountCheck.executeQuery();
            
            
            if (fixedDiscountCheckSet.next()) {
                
                double fixedRate = Double.parseDouble(fixedDiscountCheckSet.getString("Fixed_Rate"));
                grandTotal = grandTotal * (1 - fixedRate);
  
            } else if (variableDiscountCheckSet.next()) {
                
                if (jobType.equals("MOT")) {
                    
                    double motRate = Double.parseDouble(variableDiscountCheckSet.getString("MoTDiscount"));
                    grandTotal = grandTotal * (1 - motRate);
                    
                } else if (jobType.equals("Annual Service")) {
                    
                    double serviceRate = Double.parseDouble(variableDiscountCheckSet.getString("annualServiceDiscount"));
                    grandTotal = grandTotal * (1 - serviceRate);
                    
                } else if (jobType.equals("Repair")) {
                    
                    double repairRate = Double.parseDouble(variableDiscountCheckSet.getString("repairDiscount"));
                    grandTotal = grandTotal * (1 - repairRate);
                    
                } else if (jobType.equals("Spare Parts")) {
                    
                    double sparePartRate = Double.parseDouble(variableDiscountCheckSet.getString("sparePartsDiscount"));
                    grandTotal = grandTotal * (1 - sparePartRate);
                    
                }
                
            } else if (flexibleDiscountCheckSet.next()) {
                
                PreparedStatement getCredit = connection.prepareStatement(creditQuery);
                getCredit.setString(1, customerID);
                ResultSet creditSet = getCredit.executeQuery();
                
                double credit = Double.parseDouble(creditSet.getString("credit"));
                double flexibleRate = 0;
                
                if (credit >= 0 && credit <= 1000) {
                    
                    flexibleRate = Double.parseDouble(flexibleDiscountCheckSet.getString("zeroToThousand"));
                    grandTotal = grandTotal * (1 - flexibleRate);
                    
                } else if (credit >= 1001 && credit <= 5000) {
                    
                    flexibleRate = Double.parseDouble(flexibleDiscountCheckSet.getString("thousandToFive"));
                    grandTotal = grandTotal * (1 - flexibleRate);

                } else if (credit >= 5001) {
                    
                    flexibleRate = Double.parseDouble(flexibleDiscountCheckSet.getString("fiveToTenThousand"));
                    grandTotal = grandTotal * (1 - flexibleRate);

                }

            }
            
            Date dateToday = new Date();
            Date dateDue = new Date();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            
            PreparedStatement payLaterStatement = connection.prepareStatement(payLaterQuery);
            payLaterStatement.setString(1, customerID);
            ResultSet payLaterSet = payLaterStatement.executeQuery();
            
            while (payLaterSet.next()) {
                
                Calendar calendar = new GregorianCalendar();
                calendar.setTime(dateDue);
                calendar.add(Calendar.DATE, 30);
                dateDue = calendar.getTime();
                
            }
            
            String newDateDue = df.format(dateDue);
            String dateOfInvoice = df.format(dateToday);
            
            Random rand = new Random();
            int n = rand.nextInt(100);
            String invoiceNumber = String.valueOf(n);

            invoice = new Invoice(invoiceNumber, jNumber, dateOfInvoice, newDateDue, String.valueOf(grandTotal), String.valueOf(labourCost), String.valueOf(partCost), "Unpaid", String.valueOf(totalHours));
            
            //connection.commit();
            //connection.setAutoCommit(true);
            connection.close();
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return invoice;

    }
    
}
