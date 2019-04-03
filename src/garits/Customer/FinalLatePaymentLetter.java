/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Customer;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jaimik
 */
public class FinalLatePaymentLetter {

    public FinalLatePaymentLetter() {
    }
    
        public void saveFinalLetter(String invoiceNumber, Connection connection) throws SQLException {
        
                
        String customerQuery = "SELECT firstName, lastName, address, postcode FROM Customer INNER JOIN Vehicle ON Customer.customerID = Vehicle.CustomercustomerID INNER JOIN JobSheet ON Vehicle.registrationNumber = JobSheet.VehicleregistrationNumber INNER JOIN Invoice ON Invoice.jobNumber = JobSheet.jobNumber WHERE Invoice.invoiceNumber = ?";
        String vehicleQuery = "SELECT registrationNumber, make, model FROM Vehicle INNER JOIN JobSheet ON Vehicle.registrationNumber = JobSheet.VehicleregistrationNumber INNER JOIN Invoice ON Invoice.jobNumber = JobSheet.jobNumber WHERE Invoice.invoiceNumber = ?";
        String invoiceDetailsQuery = "SELECT grandTotal, datePaymentDue FROM Invoice where invoiceNumber = ?";
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            
            PreparedStatement customerStatement = connection.prepareStatement(customerQuery);
            customerStatement.setString(1, invoiceNumber);
            ResultSet customerDetailsSet = customerStatement.executeQuery();
            
            PreparedStatement vehicleStatement = connection.prepareStatement(vehicleQuery);
            vehicleStatement.setString(1, invoiceNumber);
            ResultSet vehicleSet = vehicleStatement.executeQuery();
            
            PreparedStatement invoiceDetails = connection.prepareStatement(invoiceDetailsQuery);
            invoiceDetails.setString(1, invoiceNumber);
            ResultSet invoiceSet = invoiceDetails.executeQuery();
            
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("FinalLatePaymentLetter" + invoiceNumber + ".pdf"));
            document.open();
            
            while (customerDetailsSet.next()) {
                document.add(new Paragraph(customerDetailsSet.getString("firstName") + " " + customerDetailsSet.getString("lastName")));
                document.add(new Paragraph(customerDetailsSet.getString("address")));
                document.add(new Paragraph(customerDetailsSet.getString("postcode")));
                
                document.add(Chunk.NEWLINE);
            
                document.add(new Paragraph("Dear " + customerDetailsSet.getString("firstName") + " " + customerDetailsSet.getString("lastName")));
            }
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph(df.format(date)));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("FINAL REMINDER - INVOICE NO: " + invoiceNumber));
            
            while (vehicleSet.next()) {
                document.add(new Paragraph("Registration Number: " + vehicleSet.getString("registrationNumber")));
            }
            
            while (invoiceSet.next()) {
                document.add(new Paragraph("Total Amount: " + invoiceSet.getString("grandTotal")));
                document.add(new Paragraph("Payment Due: " + invoiceSet.getString("datePaymentDue")));
            }
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Despite two reminders, it appears that we still have not yet received payment of the above invoice, for work done on the vehicle(s) listed above."));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Unless you pay the outstanding amount in full within SEVEN DAYS, or contact us with proposals for repayment, we will have no option but to refer the matter to our solicitor."));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Please send payment immediately to avoid further action."));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Yours sincerely,"));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("G. Lancaster"));
            
            document.close();
            writer.close();
            
            
            
        } catch(Exception e) {
            e.printStackTrace();
        }

        
    }

    
}
