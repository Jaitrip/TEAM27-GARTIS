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
public class MoTReminderLetter {

    public MoTReminderLetter() {
    }
    
    public void saveMoTLetter(String registrationNumber, String motDate, Connection connection) throws SQLException {
        
                
        String customerQuery = "SELECT firstName, lastName, address, postcode FROM Customer INNER JOIN Vehicle ON Customer.customerID = Vehicle.CustomercustomerID WHERE Vehicle.registrationNumber = ?";
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            
            PreparedStatement customerStatement = connection.prepareStatement(customerQuery);
            customerStatement.setString(1, registrationNumber);
            ResultSet customerDetailsSet = customerStatement.executeQuery();
          
            
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("MoTReminderLetter" + registrationNumber + ".pdf"));
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
            
            document.add(new Paragraph("REMINDER - MoT TEST DUE"));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Registration Number: " + registrationNumber));
            
            document.add(new Paragraph("Renewal Test Date: " + motDate));
            
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("According to our records, the above vehicle is due to have its MoT certificate renewed on the date shown."));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Account Holders customers such as yourself are assured of our prompt attention, and we hope that you will use our services on this occasion in order to have the necessary test carried out on your vehicle."));
            
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
