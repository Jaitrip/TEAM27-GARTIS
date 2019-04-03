/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.receptionist.customer;

import garits.DBConnectivity.DBConnection;
import garits.InvalidError;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaimik
 */
public class addCorprateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form addCorprateCustomer
     */
    public addCorprateCustomer() {
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

        addCustomerButton = new javax.swing.JButton();
        addCorprateCustomer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerIDField = new javax.swing.JTextField();
        contactRoleField = new javax.swing.JTextField();
        companyNameField = new javax.swing.JTextField();
        addCustomerButton1 = new javax.swing.JButton();
        refreshListButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        addCorprateCustomer.setText("Add Corprate Customer");
        addCorprateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCorprateCustomerActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "customerID", "contactRole", "companyName"
            }
        ));
        jScrollPane2.setViewportView(customerTable);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Add Corprate Customer:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("customerID");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("contactRole");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("companyName");

        customerIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIDFieldActionPerformed(evt);
            }
        });

        addCustomerButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addCustomerButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/user-add small-icon.png"))); // NOI18N
        addCustomerButton1.setText("Add Customer");
        addCustomerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButton1ActionPerformed(evt);
            }
        });

        refreshListButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        refreshListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/Refresh job list small-icon.png"))); // NOI18N
        refreshListButton.setText("Refresh List ");
        refreshListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshListButtonActionPerformed(evt);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(contactRoleField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerIDField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCustomerButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(companyNameField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshListButton)))
                .addGap(112, 112, 112)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(contactRoleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(companyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCustomerButton1)
                            .addComponent(refreshListButton))))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void customerIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIDFieldActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        // TODO add your handling code here

    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void addCorprateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCorprateCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCorprateCustomerActionPerformed

    private void addCustomerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButton1ActionPerformed
        // TODO add your handling code here
        try {

            Connection connection = DBConnection.getConnection();
            String sqlQuery = "INSERT INTO CorprateCustomer (customerID, contactRole, companyName) VALUES (?, ?, ?)";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            pStatement.setString(1, customerIDField.getText());
            pStatement.setString(2, contactRoleField.getText());
            pStatement.setString(3, companyNameField.getText());
            pStatement.executeUpdate();
            pStatement.close();
            connection.close();

        } catch (Exception e) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_addCustomerButton1ActionPerformed

    private void refreshListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshListButtonActionPerformed
        // TODO add your handling code here:
        try {

            Connection connection = DBConnection.getConnection();
            String sqlQuery = "SELECT * FROM CorprateCustomer";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = pStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("customerID"), resultSet.getString("contactRole"), resultSet.getString("companyName")
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
    }//GEN-LAST:event_refreshListButtonActionPerformed

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
            java.util.logging.Logger.getLogger(addCorprateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCorprateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCorprateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCorprateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCorprateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCorprateCustomer;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton addCustomerButton1;
    private javax.swing.JTextField companyNameField;
    private javax.swing.JTextField contactRoleField;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JButton refreshListButton;
    // End of variables declaration//GEN-END:variables
}
