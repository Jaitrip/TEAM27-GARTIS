/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.foreperson.jobs;

import garits.DBConnectivity.DBConnection;
import garits.InvalidError;
import garits.foreperson.JobsPage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ionut
 */
public class PickUpJobForm extends javax.swing.JFrame {

    /**
     * Creates new form MechanicPickUpJobForm
     */
    public PickUpJobForm() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        allocateMechanicButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        refreshJobButton = new javax.swing.JButton();
        mechanicIDField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        allocateMechanicButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        allocateMechanicButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/Repair-icon.png"))); // NOI18N
        allocateMechanicButton.setText("Allocate Mechanic");
        allocateMechanicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocateMechanicButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/back-icon.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        refreshJobButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        refreshJobButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/Refresh job list small-icon.png"))); // NOI18N
        refreshJobButton.setText("Refresh Job List");
        refreshJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJobButtonActionPerformed(evt);
            }
        });

        mechanicIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mechanicIDFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Enter Mechanic ID");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(allocateMechanicButton)
                                    .addComponent(refreshJobButton)
                                    .addComponent(mechanicIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mechanicIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(allocateMechanicButton)
                        .addGap(50, 50, 50)
                        .addComponent(refreshJobButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)))
                .addContainerGap())
        );

        setBounds(0, 0, 1920, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new JobsPage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void mechanicIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mechanicIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mechanicIDFieldActionPerformed

    private void refreshJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJobButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            Connection connection = DBConnection.getConnection();
            String sqlQuery = "SELECT * FROM JobSheet";
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = pStatement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
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
    }//GEN-LAST:event_refreshJobButtonActionPerformed

    private void allocateMechanicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocateMechanicButtonActionPerformed
        // TODO add your handling code here:
        try {
            
            Connection connection = DBConnection.getConnection();
            int row = jTable1.getSelectedRow();
            String jobNumber = jTable1.getModel().getValueAt(row, 0).toString();
            System.out.println(jobNumber);
            String sqlQuery = "UPDATE JobSheet SET EmployeeemployeeID = ? WHERE jobNumber =" + jobNumber ;
            PreparedStatement pStatement = connection.prepareStatement(sqlQuery);
            pStatement.setString(1, mechanicIDField.getText());
            pStatement.executeUpdate();
            pStatement.close();
            connection.close();

        } catch (Exception e) {
            JFrame frame = new InvalidError();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }//GEN-LAST:event_allocateMechanicButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PickUpJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PickUpJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PickUpJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PickUpJobForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PickUpJobForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allocateMechanicButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private javax.swing.JTextField mechanicIDField;
    private javax.swing.JButton refreshJobButton;
    // End of variables declaration//GEN-END:variables
}
