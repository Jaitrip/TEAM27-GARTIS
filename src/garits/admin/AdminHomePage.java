/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits.admin;

import garits.SignInForm;
import javax.swing.JFrame;

/**
 *
 * @author shazidtipu
 */
public class AdminHomePage extends javax.swing.JFrame {

    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
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

        jToolBar1 = new javax.swing.JToolBar();
        databaseButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setSize(new java.awt.Dimension(1920, 1080));

        databaseButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        databaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/Data-Database-Protection-icon.png"))); // NOI18N
        databaseButton.setText("Database");
        databaseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        databaseButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        databaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseButtonActionPerformed(evt);
            }
        });

        usersButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/users-4-icon.png"))); // NOI18N
        usersButton.setText("Users");
        usersButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usersButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });

        logOutButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garits/ICONS/User-Interface-Logout-icon.png"))); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
                .addContainerGap(1731, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(databaseButton)
                .addGap(57, 57, 57)
                .addComponent(usersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(databaseButton)
                        .addComponent(usersButton)))
                .addContainerGap(400, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonActionPerformed
        // Go to add account form
        this.dispose();
        JFrame frame = new AddAccountForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_usersButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // log out of garits
        this.dispose();
        JFrame frame = new SignInForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void databaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseButtonActionPerformed
        // go to back up and resore
        this.dispose();
        JFrame frame = new BackupForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_databaseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton databaseButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private java.awt.Label label1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables
}
