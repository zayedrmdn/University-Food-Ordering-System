/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Yjun;


import Vendor_SEPEHR.MenuItem;
import java.io.File;

import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



public class OrderHistory extends javax.swing.JFrame {
   
    
    public OrderHistory() {
        initComponents();
        SaveToTable();
        
    }
    public void SaveToTable()
    {
        File file=new File("C:\\Users\\yjun0\\OneDrive\\Desktop\\Orders.txt");
        try {
            FileReader Fread=new FileReader(file);
            BufferedReader Bread=new BufferedReader(Fread);
            DefaultTableModel md= (DefaultTableModel)TableOrderHistory.getModel();
            Object[] lines=Bread.lines().toArray();
            
            for(int i=0;i<lines.length;i++){
                String[] row=lines[i].toString().split(" ");
                md.addRow(row);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

Order order = new Order();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrder_History = new javax.swing.JLabel();
        btnReOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableOrderHistory = new javax.swing.JTable();
        txtOrder = new javax.swing.JLabel();
        btnShowOrder = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOrder_History.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        lblOrder_History.setText("Order History");

        btnReOrder.setText(" ReOrder");
        btnReOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReOrderActionPerformed(evt);
            }
        });

        TableOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Food", "Amount", "Status", "Reviews"
            }
        ));
        TableOrderHistory.setColumnSelectionAllowed(true);
        TableOrderHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableOrderHistoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableOrderHistory);
        TableOrderHistory.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        txtOrder.setText("jLabel1");

        btnShowOrder.setText("Show");
        btnShowOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOrderActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowOrder)
                                .addGap(47, 47, 47))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblOrder_History, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenu)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrder_History)
                    .addComponent(btnMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReOrder)
                    .addComponent(txtOrder)
                    .addComponent(btnShowOrder))
                .addGap(14, 14, 14))
        );

        getAccessibleContext().setAccessibleName("OrderHistory");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnReOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReOrderActionPerformed
        File file=new File("C:\\Users\\yjun0\\OneDrive\\Desktop\\Orders.txt");
        try {
            FileWriter fw=new FileWriter(file,true);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0;i<TableOrderHistory.getRowCount();i++){
                
                    bw.write(TableOrderHistory.getValueAt(i,0).toString()+" "+TableOrderHistory.getValueAt(i,1).toString()+" ");
                    
            
            bw.newLine(); 
            }
            bw.close();
            fw.close();

            System.out.println("Order Ordered");
            
        } catch (IOException ex) {
            Logger.getLogger(MenuItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReOrderActionPerformed

    private void btnShowOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOrderActionPerformed
        txtOrder.setText(order.getItems().toString());
    }//GEN-LAST:event_btnShowOrderActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        this.setVisible(false);
        new MainPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void TableOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableOrderHistoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableOrderHistoryMouseClicked

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
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableOrderHistory;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnReOrder;
    private javax.swing.JButton btnShowOrder;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrder_History;
    private javax.swing.JLabel txtOrder;
    // End of variables declaration//GEN-END:variables
}
