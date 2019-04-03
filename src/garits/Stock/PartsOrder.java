/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package garits.Stock;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import garits.InvalidError;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author jaimik
 */
public class PartsOrder {

    public PartsOrder() {
    }
    
    public void saveOrder(Connection connection) throws SQLException {
        
        try {
            
            Date date = new Date();
            DateFormat df = new SimpleDateFormat();
            
            String sqlQuery = "SELECT partNo, Part.partName, reorderThreshold, price FROM Part INNER JOIN StockLedger ON  Part.StockLedgercode = StockLedger.code WHERE quantity <= reorderThreshold";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = pStatement.executeQuery();
  
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("PartsOrder.pdf"));
            document.open();
            
            document.add(new Paragraph("Quick Fix Fitters,"));
            document.add(new Paragraph("19 High St.,"));
            document.add(new Paragraph("Ashford,"));
            document.add(new Paragraph("Kent CT16 8YY"));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Date " + df.format(date)));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Company: Fjord Distribution Ltd"));
            document.add(new Paragraph("Address: 25 The Causeway, Staines, Middlesex"));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Tel: 01784 407862"));
            document.add(new Paragraph("Fax: 01784 407863"));
            
            document.add(Chunk.NEWLINE);
            
            PdfPTable table = new PdfPTable(4);
            
            PdfPCell numberCell = new PdfPCell(new Phrase("Part Number"));
            table.addCell(numberCell);
            
            PdfPCell partNameCell = new PdfPCell(new Phrase("Part Name"));
            table.addCell(partNameCell);
                    
            PdfPCell qtyCell = new PdfPCell(new Phrase("Quantity"));
            table.addCell(qtyCell);
            
            PdfPCell priceCell = new PdfPCell(new Phrase("Price"));
            table.addCell(priceCell);
            
            table.setHeaderRows(1);
            
            while(resultSet.next()) {
                
                table.addCell(resultSet.getString("partNo"));
                table.addCell(resultSet.getString("partName"));
                table.addCell(resultSet.getString("reorderThreshold"));
                table.addCell(resultSet.getString("price"));
                
            }

            document.add(table);
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Signed: "));
            
            
            
            
            document.close();
            writer.close();
            
            pStatement.close();
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        
    }
    
    
}
