/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.mechanic;

import garits.SignInForm;
import javax.swing.JFrame;

/**
 *
 * @author shazidtipu
 */
public class MechanicHomePage extends javax.swing.JFrame {

    /**
     * Creates new form MechanicHomePage
     */
    public MechanicHomePage() {
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

        pickupJobButton = new javax.swing.JButton();
        partsUsedButton = new javax.swing.JButton();
        tasksCompletedButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        pickupJobButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pickupJobButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/Pickup Job-icon.png"))); // NOI18N
        pickupJobButton.setText("Pick Up Job");
        pickupJobButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pickupJobButton.setPreferredSize(new java.awt.Dimension(161, 157));
        pickupJobButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pickupJobButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupJobButtonActionPerformed(evt);
            }
        });

        partsUsedButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        partsUsedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/parts-icon.png"))); // NOI18N
        partsUsedButton.setText("Parts Used");
        partsUsedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        partsUsedButton.setPreferredSize(new java.awt.Dimension(161, 157));
        partsUsedButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        partsUsedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partsUsedButtonActionPerformed(evt);
            }
        });

        tasksCompletedButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tasksCompletedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/Task completed-icon.png"))); // NOI18N
        tasksCompletedButton.setText("Tasks Completed");
        tasksCompletedButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tasksCompletedButton.setPreferredSize(new java.awt.Dimension(161, 157));
        tasksCompletedButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tasksCompletedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasksCompletedButtonActionPerformed(evt);
            }
        });

        logOutButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/User-Interface-Logout-icon.png"))); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logOutButton.setPreferredSize(new java.awt.Dimension(161, 157));
        logOutButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pickupJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(partsUsedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(tasksCompletedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(536, 536, 536))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pickupJobButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(partsUsedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tasksCompletedButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(550, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tasksCompletedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasksCompletedButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new TasksCompletedForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_tasksCompletedButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new SignInForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void partsUsedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partsUsedButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new PartsUsedForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_partsUsedButtonActionPerformed

    private void pickupJobButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupJobButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFrame frame = new PickUpJobForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_pickupJobButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MechanicHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MechanicHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MechanicHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MechanicHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MechanicHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton partsUsedButton;
    private javax.swing.JButton pickupJobButton;
    private javax.swing.JButton tasksCompletedButton;
    // End of variables declaration//GEN-END:variables
}
