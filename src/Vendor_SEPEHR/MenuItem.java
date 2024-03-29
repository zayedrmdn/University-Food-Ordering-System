/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vendor_SEPEHR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sepehrjokanian
 */
public class MenuItem extends javax.swing.JFrame {

     
    
            
            
    public MenuItem() {
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
        Add = new javax.swing.JButton();
        Food = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        View = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FOOD", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        Add.setBackground(new java.awt.Color(0, 255, 255));
        Add.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel1.setText(" FOOD");

        jLabel2.setText(" PRICE");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton1.setText("RETURN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 102, 102));
        Delete.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(255, 255, 51));
        Update.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        Update.setText("UPDATE");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(0, 255, 102));
        Save.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        View.setBackground(new java.awt.Color(255, 0, 255));
        View.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        View.setText("VIEW MENU");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(Food))
                                    .addComponent(Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(View)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Food, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Update))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(Save))
                .addGap(18, 18, 18)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
      
     DefaultTableModel md= (DefaultTableModel)jTable1.getModel();
     md.addRow(new Object[]{Food.getText(),Price.getText()});
     //To remove
     Food.setText("");
     Price.setText("");
     
        
    }//GEN-LAST:event_AddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      DefaultTableModel md= (DefaultTableModel)jTable1.getModel();
        int dlt=jTable1.getSelectedRow();
      md.removeRow(dlt);
      Food.setText("");
      Price.setText("");
        
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        DefaultTableModel md= (DefaultTableModel)jTable1.getModel();
        int row=jTable1.getSelectedRow();
        md.setValueAt(Food.getText(),row,0);
        md.setValueAt(Price.getText(), row, 1);
        //remove
        Food.setText("");
        Price.setText("");
    }//GEN-LAST:event_UpdateActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int selected=jTable1.getSelectedRow();
       DefaultTableModel md= (DefaultTableModel)jTable1.getModel();
       Food.setText(md.getValueAt(selected,0).toString());
       Price.setText(md.getValueAt(selected,1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       File file=new File("/Users/sepehrjokanian/Documents/Menu.txt");
        try {
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0;i<jTable1.getRowCount();i++){
                for(int j=0;j<jTable1.getColumnCount();j++){
                    bw.write(jTable1.getValueAt(i,j).toString()+" ");
            }
            bw.newLine();   
            }
            bw.close();
            fw.close();
            System.out.println("Menu Has Been Updated");
            
        } catch (IOException ex) {
            Logger.getLogger(MenuItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_SaveActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        File file=new File("/Users/sepehrjokanian/Documents/Menu.txt");
        try {
            FileReader Fread=new FileReader(file);
            BufferedReader Bread=new BufferedReader(Fread);
            DefaultTableModel md= (DefaultTableModel)jTable1.getModel();
            Object[] lines=Bread.lines().toArray();
            
            for(int i=0;i<lines.length;i++){
                String[] row=lines[i].toString().split(" ");
                md.addRow(row);
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ViewActionPerformed

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
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Food;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Save;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
