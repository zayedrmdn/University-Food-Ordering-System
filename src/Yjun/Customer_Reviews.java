package Yjun;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Customer_Reviews extends javax.swing.JFrame {
Customer cc = new Customer();
  
    public Customer_Reviews() {
        initComponents();
        SaveToCombo();
        } 
    
    public void SaveToCombo(){
         try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\yjun0\\OneDrive\\Desktop\\Order.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("order ID:")) {
                    String orderID = line.substring(10); 
                    CboxOrderId.addItem(orderID); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    

            
    
     
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbReviews = new javax.swing.JLabel();
        tFieldReviews = new javax.swing.JTextField();
        btnReview = new javax.swing.JButton();
        CboxOrderId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbReviews.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        lbReviews.setText("Reviews");
        lbReviews.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReviewsMouseClicked(evt);
            }
        });

        tFieldReviews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFieldReviewsActionPerformed(evt);
            }
        });

        btnReview.setText("Save Reviews");
        btnReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewActionPerformed(evt);
            }
        });

        CboxOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxOrderIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(lbReviews, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboxOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFieldReviews, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnReview)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbReviews)
                .addGap(25, 25, 25)
                .addComponent(CboxOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tFieldReviews, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnReview)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbReviewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReviewsMouseClicked
        
        
    }//GEN-LAST:event_lbReviewsMouseClicked

    private void tFieldReviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFieldReviewsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFieldReviewsActionPerformed

    private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewActionPerformed
        String filePath = "C:\\Users\\yjun0\\OneDrive\\Desktop\\Reviews.txt"; 
        String selectedID = CboxOrderId.getSelectedItem().toString();
        String line = tFieldReviews.getText() +"\n"+"Order ID: " +selectedID;
        cc.addReviews(line);
        cc.saveReviewsToFile(filePath);
        JOptionPane.showMessageDialog(null, "Thank you for your review!");        
    }//GEN-LAST:event_btnReviewActionPerformed

    private void CboxOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxOrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboxOrderIdActionPerformed


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Customer_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Reviews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Reviews().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxOrderId;
    private javax.swing.JButton btnReview;
    private javax.swing.JLabel lbReviews;
    private javax.swing.JTextField tFieldReviews;
    // End of variables declaration//GEN-END:variables
}
