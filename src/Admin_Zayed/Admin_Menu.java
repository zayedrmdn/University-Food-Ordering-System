package Admin_Zayed;

import javax.swing.*;
import javax.swing.table.*;

public class Admin_Menu extends javax.swing.JFrame {

    public Admin_Menu() {
        initComponents();
        AdminClass AC = new AdminClass();

        AC.centerFrameOnScreen(this);
        addToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void addToTable(){
        
        DefaultTableModel model = (DefaultTableModel) tableVendors.getModel();
        Object[] rowData = {"Sepehr", "123", 0.0}; // Replace with the actual data
        model.addRow(rowData);
        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableAdmins = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableVendors = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableRunners = new javax.swing.JTable();
        buttonChangePass = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonCheckBalance = new javax.swing.JButton();
        buttonSignOut = new javax.swing.JButton();
        buttonChangePass1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tableAdmins);

        tabbedPane.addTab("Admins", jScrollPane5);

        tableVendors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tableVendors);

        tabbedPane.addTab("Vendors", jScrollPane7);

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tableCustomers);

        tabbedPane.addTab("Customers", jScrollPane8);

        tableRunners.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tableRunners);

        tabbedPane.addTab("Runners", jScrollPane9);

        buttonChangePass.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonChangePass.setText("Change Password");

        buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonDelete.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonSave.setBackground(new java.awt.Color(51, 255, 51));
        buttonSave.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonSave.setText("Add");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonCheckBalance.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonCheckBalance.setText("Top Up Balance");
        buttonCheckBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheckBalanceActionPerformed(evt);
            }
        });

        buttonSignOut.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonSignOut.setText("Sign Out");
        buttonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignOutActionPerformed(evt);
            }
        });

        buttonChangePass1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonChangePass1.setText("Modify Account");
        buttonChangePass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangePass1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonChangePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonCheckBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonChangePass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(buttonChangePass1)
                .addGap(8, 8, 8)
                .addComponent(buttonChangePass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCheckBalance)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDelete)
                    .addComponent(buttonSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSignOut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignOutActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Sign Out Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "You have been signed out successfully.");
            new Admin_Zayed.Login_Menu(null, true).setVisible(true);
        }
    }//GEN-LAST:event_buttonSignOutActionPerformed

    private void buttonCheckBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheckBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCheckBalanceActionPerformed

    private void buttonChangePass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangePass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonChangePass1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChangePass;
    private javax.swing.JButton buttonChangePass1;
    private javax.swing.JButton buttonCheckBalance;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSignOut;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableAdmins;
    private javax.swing.JTable tableCustomers;
    private javax.swing.JTable tableRunners;
    private javax.swing.JTable tableVendors;
    // End of variables declaration//GEN-END:variables
}
