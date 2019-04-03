/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.receptionist.stock;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import garits.DBConnectivity.DBConnection;
import garits.receptionist.Stock;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shazidtipu
 */
public class StockReport extends javax.swing.JFrame {

    /**
     * Creates new form ReceptionistStockReport
     */
    public StockReport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        stockValueLabel = new javax.swing.JLabel();
        generateReportButton = new javax.swing.JButton();
        printReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/back-icon.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 100));

        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("GARITS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1733, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "partNo", "partName", "manufacturer", "vehicleType", "startYear", "endYear", "price", "reorderThreshold", "quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        stockValueLabel.setText("Total Stock Value: ");

        generateReportButton.setText("Generate Report");
        generateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportButtonActionPerformed(evt);
            }
        });

        printReportButton.setText("Print Report");
        printReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(stockValueLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(printReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(generateReportButton, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockValueLabel)
                    .addComponent(generateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(printReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
        );

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new Stock();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void generateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportButtonActionPerformed
        // TODO add your handling code here:

        String reportQuery = "SELECT partNo, Part.partName, manufacturer, vehicleType, startYear, endYear, price, reorderThreshold, quantity FROM Part INNER JOIN StockLedger ON Part.StockLedgercode = StockLedger.code";
        double totalStockValue = 0;

        try {

            Connection connection = DBConnection.getConnection();

            PreparedStatement reportStatement = connection.prepareStatement(reportQuery);
            ResultSet resultSet = reportStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("partNo"), resultSet.getString("partName"), resultSet.getString("manufacturer"), resultSet.getString("vehicleType"), resultSet.getString("startYear"), resultSet.getString("endYear"), resultSet.getString("price"), resultSet.getString("reorderThreshold"), resultSet.getString("quantity")
                };
                model.addRow(o);

                totalStockValue = totalStockValue + Double.parseDouble(resultSet.getString("price"));

            }

            stockValueLabel.setText("Total Stock Value: £" + totalStockValue);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }//GEN-LAST:event_generateReportButtonActionPerformed

    private void printReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReportButtonActionPerformed
        // TODO add your handling code here:
        
        String reportQuery = "SELECT partNo, Part.partName, manufacturer, vehicleType, startYear, endYear, price, reorderThreshold, quantity FROM Part INNER JOIN StockLedger ON Part.StockLedgercode = StockLedger.code";
        
        try {
            
            Connection connection = DBConnection.getConnection();

            PreparedStatement reportStatement = connection.prepareStatement(reportQuery);
            ResultSet resultSet = reportStatement.executeQuery();
            
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("StockReport" + df.format(date) + ".pdf"));
            document.open();

            document.add(new Paragraph("Stock Report"));
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph("Report Date: " + df.format(date)));
            
            document.add(Chunk.NEWLINE);
            
            PdfPTable table = new PdfPTable(9);
            
            PdfPCell partNoCell = new PdfPCell(new Phrase("Part Number"));
            table.addCell(partNoCell);
            
            PdfPCell partNameCell = new PdfPCell(new Phrase("Part Name"));
            table.addCell(partNameCell);
                    
            PdfPCell manuCell = new PdfPCell(new Phrase("Manufacturer"));
            table.addCell(manuCell);
            
            PdfPCell typeCell = new PdfPCell(new Phrase("Vehicle Type"));
            table.addCell(typeCell);
            
            PdfPCell startCell = new PdfPCell(new Phrase("Start Year"));
            table.addCell(startCell);
            
            PdfPCell endCell = new PdfPCell(new Phrase("End Year"));
            table.addCell(endCell);
            
            PdfPCell priceCell = new PdfPCell(new Phrase("Price"));
            table.addCell(priceCell);
            
            PdfPCell reorderCell = new PdfPCell(new Phrase("Reorder Threshold"));
            table.addCell(reorderCell);
            
            PdfPCell qtyCell = new PdfPCell(new Phrase("Quantity"));
            table.addCell(qtyCell);
            
            table.setHeaderRows(1);
            
            while(resultSet.next()) {
                
                table.addCell(resultSet.getString("partNo"));
                table.addCell(resultSet.getString("partName"));
                table.addCell(resultSet.getString("manufacturer"));
                table.addCell(resultSet.getString("vehicleType"));
                table.addCell(resultSet.getString("startYear"));
                table.addCell(resultSet.getString("endYear"));
                table.addCell(resultSet.getString("price"));
                table.addCell(resultSet.getString("quantity"));
                
            }

            document.add(table);
            
            document.add(Chunk.NEWLINE);
            
            document.add(new Paragraph(stockValueLabel.getText()));
            

            document.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_printReportButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton generateReportButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JButton printReportButton;
    private javax.swing.JLabel stockValueLabel;
    // End of variables declaration//GEN-END:variables
}
