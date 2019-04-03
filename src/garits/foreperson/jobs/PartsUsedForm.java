/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.foreperson.jobs;

import garits.mechanic.*;
import garits.DBConnectivity.DBConnection;
import garits.InvalidError;
import garits.SignInForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ionut
 */
public class PartsUsedForm extends javax.swing.JFrame {

    /**
     * Creates new form MechanicPartsUsedForm
     */
    public PartsUsedForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeNumberField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        addPartButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        partsTable = new javax.swing.JTable();
        partNumberField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        searchPartsButton = new javax.swing.JButton();
        viewPartsButton = new javax.swing.JButton();
        searchJobsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Employee Number");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Quantity");

        addPartButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addPartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/add parts-icon.png"))); // NOI18N
        addPartButton.setText("Add Part");
        addPartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPartButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/back-icon.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jobTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "jobNumber", "dateBookedIn", "jobType", "workDescription", "status", "VehicleregistrationNumber", "InvoiceinvoiceNumber", "EmployeeemployeeID"
            }
        ));
        jScrollPane1.setViewportView(jobTable);

        partsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "code", "partName", "reorderThreshold", "quantity", "price"
            }
        ));
        jScrollPane2.setViewportView(partsTable);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Enter Part Number");

        searchPartsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchPartsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/parts icon.png"))); // NOI18N
        searchPartsButton.setText("Search Parts");
        searchPartsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPartsButtonActionPerformed(evt);
            }
        });

        viewPartsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        viewPartsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/view-icon.png"))); // NOI18N
        viewPartsButton.setText("View Parts");
        viewPartsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPartsButtonActionPerformed(evt);
            }
        });

        searchJobsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchJobsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/search-icon.png"))); // NOI18N
        searchJobsButton.setText("Search Jobs");
        searchJobsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJobsButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(searchJobsButton)
                                    .addComponent(jLabel1)
                                    .addComponent(employeeNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(searchPartsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(partNumberField))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(viewPartsButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(quantityField)
                                    .addComponent(jLabel3)
                                    .addComponent(addPartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(employeeNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(searchJobsButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(partNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPartButton)
                            .addComponent(searchPartsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewPartsButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(backButton)
                .addContainerGap())
        );

        setBounds(0, 0, 1936, 1119);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new MechanicHomePage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchPartsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPartsButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Button Clicked");
        String partNumber;
        try {
            
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "SELECT * FROM StockLedger WHERE code = ?";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            partNumber = partNumberField.getText();
            System.out.println("Part Number Is: " + partNumber);
            pStatement.setString(1, partNumber);
            ResultSet resultSet = pStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) partsTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("code"), resultSet.getString("partName"), resultSet.getString("reorderThreshold"), resultSet.getString("quantity"), resultSet.getString("price")
                };
                model.addRow(o);
                
                        
            }
            pStatement.close();
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_searchPartsButtonActionPerformed

    private void searchJobsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJobsButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Button Clicked");
        String employeeNumber;
        try {
            
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "SELECT * FROM JobSheet WHERE EmployeeemployeeID = ? AND status = ?";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            employeeNumber = employeeNumberField.getText();
            pStatement.setString(1, employeeNumber);
            pStatement.setString(2, "Pending");
            ResultSet resultSet = pStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jobTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("jobNumber"), resultSet.getString("dateBookedIn"), resultSet.getString("jobType"), resultSet.getString("workDescription"), resultSet.getString("status"), resultSet.getString("VehicleregistrationNumber"),resultSet.getString("InvoiceinvoiceNumber"), resultSet.getString("EmployeeemployeeID")
                };
                model.addRow(o);
                
                        
            }
            pStatement.close();
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

    }//GEN-LAST:event_searchJobsButtonActionPerformed

    private void viewPartsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPartsButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "SELECT * FROM StockLedger";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = pStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) partsTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("code"), resultSet.getString("partName"), resultSet.getString("reorderThreshold"), resultSet.getString("quantity"), resultSet.getString("price")
                };
                model.addRow(o);
                
                        
            }
            pStatement.close();
            resultSet.close();
            connection.close();
        } catch (Exception e) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_viewPartsButtonActionPerformed

    private void addPartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPartButtonActionPerformed
        // TODO add your handling code here:
        String partQuantity = quantityField.getText();
        try {
            
            Connection connection = DBConnection.getConnection();
            connection.setAutoCommit(false);
            
            int jobRow = jobTable.getSelectedRow();
            String jobNumber = jobTable.getModel().getValueAt(jobRow, 0).toString();
            int partRow = partsTable.getSelectedRow();
            String partCode = partsTable.getModel().getValueAt(partRow, 0).toString();
            String partName = partsTable.getModel().getValueAt(partRow, 1).toString();
            String qty = partsTable.getModel().getValueAt(partRow, 3).toString();
            String partNumber = null;
            
            String sqlQuery2 = "SELECT partNo FROM Part WHERE StockLedgercode = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery2);
            preparedStatement.setString(1, partCode);
            ResultSet rSet = preparedStatement.executeQuery();
            
            while(rSet.next()) {
                
                partNumber = rSet.getString("partNo");
                System.out.println(partNumber);
               
            }
            
            if (!partNumber.isEmpty()) {
            
                String sqlQuery = "INSERT INTO PartsUsed (Description, partNo, qty, JobSheetjobNumber) VALUES (?, ?, ?, ?)";
                PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
                pStatement.setString(1, partName);
                pStatement.setString(2, partNumber);
                pStatement.setString(3, partQuantity);
                pStatement.setString(4, partCode);
                pStatement.executeUpdate();
                System.out.println("updated");
                
                
                int qtyUsed = Integer.parseInt(partQuantity);
                int originalQty = Integer.parseInt(qty);
                int newqty = originalQty - qtyUsed;
                String newQty = Integer.toString(newqty);
                
                
                String updateQuery = "UPDATE StockLedger SET quantity = ? WHERE code = ?";
                PreparedStatement pStatement2 = connection.prepareStatement(updateQuery);
                pStatement2.setString(1, newQty);
                pStatement2.setString(2, partCode);
                pStatement2.executeUpdate();
               
                
                
                
                
                
            }
            
            connection.commit();
            connection.setAutoCommit(true);
            rSet.close();
            preparedStatement.close();
            connection.close();
           

        } catch (Exception e) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_addPartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PartsUsedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartsUsedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartsUsedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartsUsedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartsUsedForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPartButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField employeeNumberField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jobTable;
    private java.awt.Label label1;
    private javax.swing.JTextField partNumberField;
    private javax.swing.JTable partsTable;
    private javax.swing.JTextField quantityField;
    private javax.swing.JButton searchJobsButton;
    private javax.swing.JButton searchPartsButton;
    private javax.swing.JButton viewPartsButton;
    // End of variables declaration//GEN-END:variables
}
