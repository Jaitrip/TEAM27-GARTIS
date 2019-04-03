/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.Job;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import garits.DBConnectivity.DBConnection;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jaimik
 */
public class SaveInvoice {
    
        public SaveInvoice() {}
    
    
    public void printInvoice(String invoiceNumber, Connection connection) throws SQLException {
        
        String customerQuery = "SELECT firstName, lastName, address, postcode FROM Customer INNER JOIN Vehicle ON Customer.customerID = Vehicle.CustomercustomerID INNER JOIN JobSheet ON Vehicle.registrationNumber = JobSheet.VehicleregistrationNumber INNER JOIN Invoice ON Invoice.jobNumber = JobSheet.jobNumber WHERE Invoice.invoiceNumber = ?";
        String vehicleQuery = "SELECT registrationNumber, make, model FROM Vehicle INNER JOIN JobSheet ON Vehicle.registrationNumber = JobSheet.VehicleregistrationNumber INNER JOIN Invoice ON Invoice.jobNumber = JobSheet.jobNumber WHERE Invoice.invoiceNumber = ?";
        String getTasksQuery = "SELECT taskDescription FROM JobTask INNER JOIN JobSheet ON JobTask.JobSheetjobNumber = JobSheet.jobNumber INNER JOIN Invoice ON JobSheet.jobNumber = Invoice.jobNumber WHERE Invoice.invoiceNumber = ?";
        String getPartsQuery = "SELECT Description, partNo, qty FROM PartsUsed INNER JOIN JobSheet ON PartsUsed.JobSheetjobNumber = JobSheet.jobNumber INNER JOIN Invoice ON Invoice.jobNumber = JobSheet.jobNumber WHERE Invoice.invoiceNumber = ?";
        String invoiceDetailsQuery = "SELECT labourCost, partCost, grandTotal, datePaymentDue FROM Invoice where invoiceNumber = ?";
        
        try {
            
            PreparedStatement customerStatement = connection.prepareStatement(customerQuery);
            customerStatement.setString(1, invoiceNumber);
            ResultSet customerDetailsSet = customerStatement.executeQuery();
            
            PreparedStatement vehicleStatement = connection.prepareStatement(vehicleQuery);
            vehicleStatement.setString(1, invoiceNumber);
            ResultSet vehicleSet = vehicleStatement.executeQuery();
            
            PreparedStatement tasks = connection.prepareStatement(getTasksQuery);
            tasks.setString(1, invoiceNumber);
            ResultSet taskSet = tasks.executeQuery();
            
            PreparedStatement parts = connection.prepareStatement(getPartsQuery);
            parts.setString(1, invoiceNumber);
            ResultSet partSet = parts.executeQuery();
            
            PreparedStatement invoiceDetails = connection.prepareStatement(invoiceDetailsQuery);
            invoiceDetails.setString(1, invoiceNumber);
            ResultSet invoiceSet = invoiceDetails.executeQuery();
            
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Invoice" + invoiceNumber + ".pdf"));
            document.open();
            
            while (customerDetailsSet.next()) {
                document.add(new Paragraph(customerDetailsSet.getString("firstName") + " " + customerDetailsSet.getString("lastName")));
                document.add(new Paragraph(customerDetailsSet.getString("address")));
                document.add(new Paragraph(customerDetailsSet.getString("postcode")));
            }
            
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
            document.add(new Paragraph("Invoice Number: " + invoiceNumber));
            document.add(Chunk.NEWLINE);
            
            while (vehicleSet.next()) {
                document.add(new Paragraph("Registration Number: " + vehicleSet.getString("registrationNumber")));
                document.add(new Paragraph("Make: " + vehicleSet.getString("make")));
                document.add(new Paragraph("Model: " + vehicleSet.getString("model")));
            }
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Description of work:"));
            
            List workDescription = new List(List.UNORDERED);
            
            while (taskSet.next()) {
                workDescription.add(new ListItem(taskSet.getString("taskDescription")));
            }
            
            document.add(workDescription);
            
            document.add(Chunk.NEWLINE);
            
            PdfPTable table = new PdfPTable(3);
            
            PdfPCell descriptionCell = new PdfPCell(new Phrase("Part Description"));
            table.addCell(descriptionCell);
            
            PdfPCell partNoCell = new PdfPCell(new Phrase("Part Number"));
            table.addCell(partNoCell);
                    
            PdfPCell qtyCell = new PdfPCell(new Phrase("Quantity"));
            table.addCell(qtyCell);
            
            table.setHeaderRows(1);
            
            while(partSet.next()) {
                
                table.addCell(partSet.getString("Description"));
                table.addCell(partSet.getString("partNo"));
                table.addCell(partSet.getString("qty"));
                
            }

            document.add(table);
            
            document.add(Chunk.NEWLINE);
            
            while (invoiceSet.next()) {
                document.add(new Paragraph("Labour Cost: £" + invoiceSet.getString("labourCost")));
                document.add(new Paragraph("Part Cost: £" + invoiceSet.getString("partCost")));
                document.add(new Paragraph("Grand Total: £" + invoiceSet.getString("grandTotal")));
                document.add(new Paragraph("Payment Due: " + invoiceSet.getString("datePaymentDue")));
            }
            
             document.add(Chunk.NEWLINE);
             
             document.add(new Paragraph("Thank you for your valued custom. We look forward to receiving your payment in due course"));
             
             document.add(Chunk.NEWLINE);
             
             document.add(new Paragraph("Yours sincerely"));
             
             document.add(Chunk.NEWLINE);
             
             document.add(new Paragraph("G. Lancaster"));
            
            document.close();
            writer.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
