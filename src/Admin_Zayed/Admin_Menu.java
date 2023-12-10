package Admin_Zayed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

public class Admin_Menu extends JFrame {

    public Admin_Menu() {
        initComponents();
        AdminClass AC = new AdminClass();
        AC.centerFrameOnScreen(this);
        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
        buttonDelete = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonTopUp = new javax.swing.JButton();
        buttonSignOut = new javax.swing.JButton();
        buttonModify = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableAdmins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonDelete.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonAdd.setBackground(new java.awt.Color(51, 255, 51));
        buttonAdd.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonTopUp.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonTopUp.setText("Top Up Balance");
        buttonTopUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTopUpActionPerformed(evt);
            }
        });

        buttonSignOut.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonSignOut.setText("Sign Out");
        buttonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignOutActionPerformed(evt);
            }
        });

        buttonModify.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        buttonModify.setText("Modify Account");
        buttonModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyActionPerformed(evt);
            }
        });

        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(buttonSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonTopUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(buttonModify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonTopUp)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDelete)
                    .addComponent(buttonAdd))
                .addGap(27, 27, 27)
                .addComponent(buttonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSignOut)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void refreshTable(){
        clearTable(tableAdmins);
        clearTable(tableVendors);
        clearTable(tableCustomers);
        clearTable(tableRunners);
        
        readsAccount();
    }
    public void openTopUp(){
        Object[] data = readData(selectedTable());
        TopUp topUp = new TopUp(data);
        
        topUp.setVisible(true);
        
    }
    
    public void openModify(){
        Object[] data = readData(selectedTable());
        
        Modify_Account modify = new Modify_Account(data,getSelectedTableName());
        modify.setVisible(true);
    }
    public JTable selectedTable (){
        int selectedTable = tabbedPane.getSelectedIndex();
        JTable table = null;
        switch (selectedTable){
            case 0:
                table = tableAdmins;
                break;
            case 1:
                table = tableVendors;
                break;
            case 2:
                table = tableCustomers;
                break;
            case 3:
                table = tableRunners;
                break;
            default:
                System.out.println("No selected table");
        }
        return table;
    }
    private String getSelectedTableName() {
        int selectedTable = tabbedPane.getSelectedIndex();
        switch (selectedTable) {
            case 0:
                return "Admin";
            case 1:
                return "Vendor";
            case 2:
                return "Customer";
            case 3:
                return "Delivery Runner";
            default:
                System.out.println("No selected table");
                return "";
        }
    }
    public Object[] readData(JTable table){
        
        String userName = null; 
        String passWord = null;
        Double balance = null;
        Object[] data = {userName, passWord, balance};
        try{
            int selectedRow = table.getSelectedRow();
            data[0] = (String) table.getValueAt(selectedRow, 0);
            data[1] = (String) table.getValueAt(selectedRow, 1);
            data[2] = (Double) table.getValueAt(selectedRow, 2);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No selected row");
        }
        
        return data;
    }
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        Object [] data = readData(getTable());
        String username = data[0].toString();
        
        String workingDirectory = System.getProperty("user.dir");
        File resourcesFile = new File(workingDirectory + "/src/Admin_Zayed/resources/Accounts.txt");

        try {
            List<String> lines = Files.readAllLines(resourcesFile.toPath(), StandardCharsets.UTF_8);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.contains(username)) {
                    // Remove the line if it contains the specified username
                    lines.remove(i);
                    break; // Stop searching after the first occurrence (if there are multiple)
                }
            }

            // Write the updated lines back to the file
            Files.write(resourcesFile.toPath(), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "This account has been deleted succesfully.");
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        Register_Menu register = new Register_Menu();
        register.setVisible(true);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignOutActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Sign Out Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "You have been signed out successfully.");
            new Admin_Zayed.Login_Menu(null, true).setVisible(true);
        }
    }//GEN-LAST:event_buttonSignOutActionPerformed

    private void buttonTopUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTopUpActionPerformed
        // TODO add your handling code here:
        String tableName = getSelectedTableName();
        if (tableName.equals("Customer")){
            openTopUp();
        }
        else{
            JOptionPane.showMessageDialog(null, "This role is not allowed to this function");
        }
        
    }//GEN-LAST:event_buttonTopUpActionPerformed

    private void buttonModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyActionPerformed
        // TODO add your handling code here:
        openModify();
        
    }//GEN-LAST:event_buttonModifyActionPerformed
    public void clearTable(JTable table) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
    }
    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_buttonRefreshActionPerformed
    public static String username;
    public static String password;
    public static String role;
    public static double balance;

    public void readsAccount() {
        String workingDirectory = System.getProperty("user.dir");
        File resourcesFile = new File(workingDirectory + "/src/Admin_Zayed/resources/Accounts.txt");
        try {
            FileReader fr = new FileReader(resourcesFile);
            BufferedReader reader = new BufferedReader(fr);

            String line;
            while ((line = reader.readLine()) != null) 
            {
                String[] parts = line.split(",");
                username = parts[0];
                password = parts[1];
                role = parts[2];
                balance = Double.parseDouble(parts[3]);
                
                addToTable(getTable());
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void addToTable(JTable table) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        Object[] rowData = {username, password, balance}; 
        tableModel.addRow(rowData);
    }
    
    public JTable getTable(){
        switch (role) 
        {
            case "Admin":
                return tableAdmins;
            case "Vendor":
                return tableVendors;
            case "Customer":
                return tableCustomers;
            case "Runner":
                return tableRunners;
            default:
                System.out.println("cannot find the role");
                return null; // or throw an exception if appropriate
        }
    }
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
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonModify;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonSignOut;
    private javax.swing.JButton buttonTopUp;
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
