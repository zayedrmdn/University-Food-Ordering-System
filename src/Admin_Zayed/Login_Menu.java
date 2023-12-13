package Admin_Zayed;
import javax.swing.event.DocumentListener;
import javax.swing.event.DocumentEvent;
import javax.swing.JDialog;
import java.io.*;
import javax.swing.*;



public class Login_Menu extends JDialog {

    public Login_Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonLogin.setEnabled(false); // Initial button is disabled
        TextFieldDetector(); // Constant checking if field text is null
        
        AdminClass AC = new AdminClass();
        
        AC.centerFrameOnScreen(this);
        
    }
    
    @SuppressWarnings("unchecked") //Ignore this
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUserLogin = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        textUsername = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        checkboxShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelUserLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserLogin.setText("User Login");
        labelUserLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textPassword.setToolTipText("Password");
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        textUsername.setToolTipText("");
        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        labelUsername.setText("Username");

        labelPassword.setText("Password");

        buttonLogin.setBackground(new java.awt.Color(51, 153, 255));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("LOGIN");
        buttonLogin.setBorder(null);
        buttonLogin.setBorderPainted(false);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        checkboxShowPassword.setText("Show Password");
        checkboxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(labelUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textPassword)
                            .addComponent(textUsername)
                            .addComponent(labelPassword)
                            .addComponent(labelUsername)
                            .addComponent(checkboxShowPassword)
                            .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(labelUserLogin)
                .addGap(93, 93, 93)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void textChecker()
    {
        // Convert inputs to string
        String Username = textUsername.getText();
        String Password = textPassword.getText();
        
        // If Username & Password lenght is not 0 then enable button
        buttonLogin.setEnabled(!(Username.length() <= 0) && !(Password.length() <= 0));
    }
    public void TextFieldDetector()
    {
        // Using 'DocumentListener' built-in feature to constantly check
        textUsername.getDocument().addDocumentListener(new DocumentListener()
        {
            public void insertUpdate(DocumentEvent e)
            {
                // Code to be executed when text is inserted
                textChecker();
                
            }
            public void removeUpdate(DocumentEvent e)
            {
                //Code to be executed when text is removed
                textChecker();
            }
            public void changedUpdate(DocumentEvent e)
            {
                //Code to be executed when attributes of the document change
                textChecker();
            }
        });
        
        // Using 'DocumentListener' built-in feature to constantly check
        textPassword.getDocument().addDocumentListener(new DocumentListener()
        {
            public void insertUpdate(DocumentEvent e)
            {
                // Code to be executed when text is inserted
                textChecker();
            }
            public void removeUpdate(DocumentEvent e)
            {
                //Code to be executed when text is removed
                textChecker();
            }
            public void changedUpdate(DocumentEvent e)
            {
                //Code to be executed when attributes of the document change
                textChecker();
            }
            
        });
    }
    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        //textUsername
        
    }//GEN-LAST:event_textUsernameActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        //buttonLogin
        String username = textUsername.getText();
        String password = textPassword.getText();
        boolean credentialsMatch = false;
        String workingDirectory = System.getProperty("user.dir");
        File filepath = new File(workingDirectory + "/src/Admin_Zayed/resources/Accounts.txt");
        
        try 
        {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(",");
                if (parts.length >= 3)
                {
                    String savedUsername = parts[0];
                    String savedPassword = parts[1];
                    String savedRole = parts [2];
                    
                    if(username.equals(savedUsername) && password.equals(savedPassword))
                    {
                        switch(savedRole)
                        {
                            case "Customer":
                                this.dispose();
                                new Yjun.MainPage().setVisible(true);
                                break;
                                
                            case "Vendor":
                                this.dispose();
                                new Vendor_SEPEHR.MainMenu().setVisible(true);
                                break;
                                
                            case "Delivery Runner":
                                this.dispose();
                                new Runner_Ebrahim.RunnerDashboard().setVisible(true);
                                break;
                            
                            case "Admin":
                                this.dispose();
                                new Admin_Zayed.Admin_Menu().setVisible(true);
                                break;
                        }
                        credentialsMatch = true;
                        return;
                    }
                    
                }
            }
            if (!credentialsMatch){
            JOptionPane.showMessageDialog(null, "Invalid username or password");
        }
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Invalid username or password");
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void checkboxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxShowPasswordActionPerformed
       
        if(checkboxShowPassword.isSelected())
        {
            //Shows the password
            textPassword.setEchoChar('\u0000'); 
        }
        else
        {
            //Hides the password
            textPassword.setEchoChar('\u2022');
        }   
        
    }//GEN-LAST:event_checkboxShowPasswordActionPerformed
    
    // Do not touch this
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login_Menu dialog = new Login_Menu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JCheckBox checkboxShowPassword;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserLogin;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
