/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.franchisee.discountplan;

import garits.DBConnectivity.DBConnection;
import garits.franchisee.FranchiseeHomePage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jaimik
 */
public class VariableDiscount extends javax.swing.JFrame {

    /**
     * Creates new form VariableDiscount
     */
    public VariableDiscount() {
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

        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        homeButton = new javax.swing.JButton();
        fixedDiscountButton = new javax.swing.JButton();
        flexibleDiscountButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        VariableDiscountTable = new javax.swing.JTable();
        viewCustomersButton = new javax.swing.JButton();
        viewVariablePlansButton = new javax.swing.JButton();
        updateDiscountPlan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addDiscountPlanButton = new javax.swing.JButton();
        deleteDiscountPlanButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        motDiscountField = new javax.swing.JTextField();
        serviceDiscountField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        discountTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        partsDiscountField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        accountHolderTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("GARITS");

        homeButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        fixedDiscountButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fixedDiscountButton.setText("Fixed Discount Plans");
        fixedDiscountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixedDiscountButtonActionPerformed(evt);
            }
        });

        flexibleDiscountButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        flexibleDiscountButton.setText("Flexible Discount Plans");
        flexibleDiscountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flexibleDiscountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fixedDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(flexibleDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fixedDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flexibleDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        VariableDiscountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Var_ID", "Discount_ID", "MoTDiscount", "serviceDiscount", "sparePartsDiscount"
            }
        ));
        jScrollPane2.setViewportView(VariableDiscountTable);

        viewCustomersButton.setText("View Customer Accounts");
        viewCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersButtonActionPerformed(evt);
            }
        });

        viewVariablePlansButton.setText("View Variable Discounts");
        viewVariablePlansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVariablePlansButtonActionPerformed(evt);
            }
        });

        updateDiscountPlan.setText("Update Discount Plan");
        updateDiscountPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDiscountPlanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Variable Discount");

        jLabel5.setText("MoT Discount Rate");

        addDiscountPlanButton.setText("Add Discount Plan");
        addDiscountPlanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiscountPlanButtonActionPerformed(evt);
            }
        });

        deleteDiscountPlanButton.setText("Delete Discount Plan ");
        deleteDiscountPlanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDiscountPlanButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Service Discount Rate");

        discountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Discount_ID", "customerID"
            }
        ));
        jScrollPane1.setViewportView(discountTable);

        jLabel9.setText("Spare Parts Discount Rate");

        accountHolderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "customerID", "firstName", "lastName"
            }
        ));
        jScrollPane3.setViewportView(accountHolderTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewVariablePlansButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(viewCustomersButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateDiscountPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addDiscountPlanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteDiscountPlanButton))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(partsDiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviceDiscountField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motDiscountField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewCustomersButton)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(motDiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(serviceDiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(partsDiscountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(addDiscountPlanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateDiscountPlan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteDiscountPlanButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewVariablePlansButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 684, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new FranchiseeHomePage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void fixedDiscountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixedDiscountButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new FixedDiscount();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_fixedDiscountButtonActionPerformed

    private void flexibleDiscountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flexibleDiscountButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new FlexibleDiscount();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_flexibleDiscountButtonActionPerformed

    private void viewCustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomersButtonActionPerformed
        // TODO add your handling code here:
        try {
            Connection connection = DBConnection.getConnection();
            connection.setAutoCommit(false);

            String sqlQuery = "SELECT customerID, firstName, lastName FROM Customer";
            String sqlQuery2 = "SELECT * FROM Discount";

            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = pStatement.executeQuery();

            PreparedStatement pStatement2 = connection.prepareStatement(sqlQuery2);
            ResultSet resultSet2 = pStatement2.executeQuery();

            DefaultTableModel model = (DefaultTableModel) accountHolderTable.getModel();
            DefaultTableModel model2 = (DefaultTableModel) discountTable.getModel();

            model.setRowCount(0);
            model2.setRowCount(0);

            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("customerID"), resultSet.getString("firstName"), resultSet.getString("lastName")
                };
                model.addRow(o);

            }

            while (resultSet2.next()) {
                Object o[] = {
                    resultSet2.getString("Discount_ID"), resultSet2.getString("customerID")
                };
                model2.addRow(o);

            }

            connection.commit();
            connection.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewCustomersButtonActionPerformed

    private void viewVariablePlansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVariablePlansButtonActionPerformed
        // TODO add your handling code here:
        try {
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "SELECT * FROM Variable";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = pStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) VariableDiscountTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("Var_ID"), resultSet.getString("Discount_ID"), resultSet.getString("MoTDiscount"), resultSet.getString("serviceDiscount"), resultSet.getString("sparePartsDiscount")
                };
                model.addRow(o);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewVariablePlansButtonActionPerformed

    private void updateDiscountPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDiscountPlanActionPerformed
        // TODO add your handling code here:
        String motDiscount = motDiscountField.getText();
        String serviceDiscount = serviceDiscountField.getText();
        String partsDiscount = partsDiscountField.getText();
        int row = VariableDiscountTable.getSelectedRow();
        String discountID = VariableDiscountTable.getModel().getValueAt(row, 1).toString();

        try {
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "UPDATE Variable SET MoTDiscount = ?, serviceDiscount = ?, sparePartsDiscount = ? WHERE Discount_ID =" + discountID;
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            pStatement.setString(1, motDiscount);
            pStatement.setString(2, serviceDiscount);
            pStatement.setString(3, partsDiscount);
            pStatement.executeUpdate();
            System.out.println("Added");
            viewVariablePlansButtonActionPerformed(evt);

            pStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateDiscountPlanActionPerformed

    private void addDiscountPlanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiscountPlanButtonActionPerformed
        // TODO add your handling code here:

        Random rand = new Random();
        int n = rand.nextInt(100);
        String variableID = String.valueOf(n);

        String motDiscount = motDiscountField.getText();
        String serviceDiscount = serviceDiscountField.getText();
        String partsDiscount = partsDiscountField.getText();
        int row = discountTable.getSelectedRow();
        String discountID = discountTable.getModel().getValueAt(row, 0).toString();

        try {
            Connection connection = DBConnection.getConnection();

            String sqlQuery = "INSERT INTO Variable (Var_ID, Discount_ID, MoTDiscount, serviceDiscount, sparePartsDiscount) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);

            pStatement.setString(1, variableID);
            pStatement.setString(2, discountID);
            pStatement.setString(3, motDiscount);
            pStatement.setString(4, serviceDiscount);
            pStatement.setString(5, partsDiscount);

            pStatement.executeUpdate();
            System.out.println("Added");
            pStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        viewVariablePlansButtonActionPerformed(evt);
    }//GEN-LAST:event_addDiscountPlanButtonActionPerformed

    private void deleteDiscountPlanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDiscountPlanButtonActionPerformed
        // TODO add your handling code here:

        try {
            Connection connection = DBConnection.getConnection();

            int row = VariableDiscountTable.getSelectedRow();
            String variableID = VariableDiscountTable.getModel().getValueAt(row, 0).toString();
            System.out.println(variableID);

            String sqlQuery = "DELETE FROM Variable WHERE Var_ID =" + variableID;
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            pStatement.executeUpdate();
            System.out.println("Deleted");
            pStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        }

        viewVariablePlansButtonActionPerformed(evt);
    }//GEN-LAST:event_deleteDiscountPlanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VariableDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VariableDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VariableDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VariableDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VariableDiscount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VariableDiscountTable;
    private javax.swing.JTable accountHolderTable;
    private javax.swing.JButton addDiscountPlanButton;
    private javax.swing.JButton deleteDiscountPlanButton;
    private javax.swing.JTable discountTable;
    private javax.swing.JButton fixedDiscountButton;
    private javax.swing.JButton flexibleDiscountButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private javax.swing.JTextField motDiscountField;
    private javax.swing.JTextField partsDiscountField;
    private javax.swing.JTextField serviceDiscountField;
    private javax.swing.JButton updateDiscountPlan;
    private javax.swing.JButton viewCustomersButton;
    private javax.swing.JButton viewVariablePlansButton;
    // End of variables declaration//GEN-END:variables
}
