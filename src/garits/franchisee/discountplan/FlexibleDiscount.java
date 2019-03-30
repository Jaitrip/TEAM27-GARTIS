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
public class FlexibleDiscount extends javax.swing.JFrame {

    /**
     * Creates new form FlexibleDiscount
     */
    public FlexibleDiscount() {
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

        jLabel7 = new javax.swing.JLabel();
        fixedRateTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fixedRateTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        homeButton = new javax.swing.JButton();
        variableDiscountButton = new javax.swing.JButton();
        fixedDiscountButton = new javax.swing.JButton();
        viewCustomersButton = new javax.swing.JButton();
        updateDiscountPlan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deleteDiscountPlanButton = new javax.swing.JButton();
        zeroToThousandField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        discountTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        accountHolderTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        FlexibleDiscountTable = new javax.swing.JTable();
        viewFlexiblePlansButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addDiscountPlanButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        thousandToFiveField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fiveThousandToTenField = new javax.swing.JTextField();

        jLabel7.setText("£0 - £1000 rate");

        jLabel8.setText("£0 - £1000 rate");

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

        variableDiscountButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        variableDiscountButton.setText("Variable Discount Plans");
        variableDiscountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                variableDiscountButtonActionPerformed(evt);
            }
        });

        fixedDiscountButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fixedDiscountButton.setText("Fixed Discount Plans");
        fixedDiscountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixedDiscountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fixedDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(variableDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(variableDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fixedDiscountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        viewCustomersButton.setText("View Customer Accounts");
        viewCustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomersButtonActionPerformed(evt);
            }
        });

        updateDiscountPlan.setText("Update Discount Plan");
        updateDiscountPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDiscountPlanActionPerformed(evt);
            }
        });

        jLabel5.setText("£0 - £1000 rate");

        deleteDiscountPlanButton.setText("Delete Discount Plan ");
        deleteDiscountPlanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDiscountPlanButtonActionPerformed(evt);
            }
        });

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

        FlexibleDiscountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flexi_ID", "Discount_ID", "0-1000", "1001-5000", "5001-10000"
            }
        ));
        jScrollPane2.setViewportView(FlexibleDiscountTable);

        viewFlexiblePlansButton.setText("View Flexible Plans");
        viewFlexiblePlansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlexiblePlansButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Flexible Discount");

        addDiscountPlanButton.setText("Add Discount Plan");
        addDiscountPlanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiscountPlanButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("£1001- £5000 rate");

        jLabel9.setText("£5001 - £10000 rate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewCustomersButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viewFlexiblePlansButton, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateDiscountPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addDiscountPlanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteDiscountPlanButton))
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fiveThousandToTenField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(thousandToFiveField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(zeroToThousandField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
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
                            .addComponent(zeroToThousandField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(thousandToFiveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(fiveThousandToTenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(addDiscountPlanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateDiscountPlan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteDiscountPlanButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewFlexiblePlansButton)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 688, Short.MAX_VALUE)))
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

    private void variableDiscountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_variableDiscountButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new VariableDiscount();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_variableDiscountButtonActionPerformed

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

    private void updateDiscountPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDiscountPlanActionPerformed
        // TODO add your handling code here:
        String zeroToThousand = zeroToThousandField.getText();
        String thousandToFive = thousandToFiveField.getText();
        String fiveToTen = fiveThousandToTenField.getText();
        int row = FlexibleDiscountTable.getSelectedRow();
        String discountID = FlexibleDiscountTable.getModel().getValueAt(row, 1).toString();

        try {
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "UPDATE Flexible SET zeroToThousand = ?, thousandToFive = ?, fiveToTenThousand = ? WHERE Discount_ID =" + discountID;
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            pStatement.setString(1, zeroToThousand);
            pStatement.setString(2, thousandToFive);
            pStatement.setString(3, fiveToTen);
            pStatement.executeUpdate();
            System.out.println("Added");
            viewFlexiblePlansButtonActionPerformed(evt);

            pStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateDiscountPlanActionPerformed

    private void deleteDiscountPlanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDiscountPlanButtonActionPerformed
        // TODO add your handling code here:

        try {
            Connection connection = DBConnection.getConnection();

            int row = FlexibleDiscountTable.getSelectedRow();
            String flexiID = FlexibleDiscountTable.getModel().getValueAt(row, 0).toString();
            System.out.println(flexiID);

            String sqlQuery = "DELETE FROM Flexible WHERE Flexi_ID =" + flexiID;
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            pStatement.executeUpdate();
            System.out.println("Deleted");
            pStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        }

        viewFlexiblePlansButtonActionPerformed(evt);
    }//GEN-LAST:event_deleteDiscountPlanButtonActionPerformed

    private void viewFlexiblePlansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlexiblePlansButtonActionPerformed
        // TODO add your handling code here:
        try {
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "SELECT * FROM Flexible";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = pStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) FlexibleDiscountTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object o[] = {
                    resultSet.getString("Flexi_ID"), resultSet.getString("Discount_ID"), resultSet.getString("zeroToThousand"), resultSet.getString("thousandToFive"), resultSet.getString("fiveToTenThousand")
                };
                model.addRow(o);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewFlexiblePlansButtonActionPerformed

    private void addDiscountPlanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiscountPlanButtonActionPerformed
        // TODO add your handling code here:

        Random rand = new Random();
        int n = rand.nextInt(100);
        String flexibleID = String.valueOf(n);

        String zeroToThousand = zeroToThousandField.getText();
        String thousandToFive = thousandToFiveField.getText();
        String fiveToTen = fiveThousandToTenField.getText();
        int row = discountTable.getSelectedRow();
        String discountID = discountTable.getModel().getValueAt(row, 0).toString();

        try {
            Connection connection = DBConnection.getConnection();

            String sqlQuery = "INSERT INTO Flexible (Flexi_ID, Discount_ID, zeroToThousand, thousandToFive, fiveToTenThousand) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);

            pStatement.setString(1, flexibleID);
            pStatement.setString(2, discountID);
            pStatement.setString(3, zeroToThousand);
            pStatement.setString(4, thousandToFive);
            pStatement.setString(5, fiveToTen);

            pStatement.executeUpdate();
            System.out.println("Added");
            pStatement.close();
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        viewFlexiblePlansButtonActionPerformed(evt);
    }//GEN-LAST:event_addDiscountPlanButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FlexibleDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlexibleDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlexibleDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlexibleDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlexibleDiscount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FlexibleDiscountTable;
    private javax.swing.JTable accountHolderTable;
    private javax.swing.JButton addDiscountPlanButton;
    private javax.swing.JButton deleteDiscountPlanButton;
    private javax.swing.JTable discountTable;
    private javax.swing.JTextField fiveThousandToTenField;
    private javax.swing.JButton fixedDiscountButton;
    private javax.swing.JTextField fixedRateTextField2;
    private javax.swing.JTextField fixedRateTextField3;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private javax.swing.JTextField thousandToFiveField;
    private javax.swing.JButton updateDiscountPlan;
    private javax.swing.JButton variableDiscountButton;
    private javax.swing.JButton viewCustomersButton;
    private javax.swing.JButton viewFlexiblePlansButton;
    private javax.swing.JTextField zeroToThousandField;
    // End of variables declaration//GEN-END:variables
}
