package pkgfinal;

import javax.swing.JOptionPane;
import static pkgfinal.mainScreen.userList;

public class Login extends javax.swing.JFrame {

    public static User loggedInUser;
    boolean logIn;
    PatientListScreen listScreen;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        uName_Lbl = new javax.swing.JLabel();
        pWord_Lbl = new javax.swing.JLabel();
        uNameInput = new javax.swing.JTextField();
        login_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFocusCycleRoot(true);

        uName_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uName_Lbl.setText("Username: ");

        pWord_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pWord_Lbl.setText("Password: ");

        uNameInput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        uNameInput.setMinimumSize(new java.awt.Dimension(6, 20));
        uNameInput.setPreferredSize(new java.awt.Dimension(6, 20));
        uNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameInputActionPerformed(evt);
            }
        });

        login_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Medical Records Program ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(login_button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(pWord_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(uName_Lbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uName_Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pWord_Lbl)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login_button)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameInputActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
       
       
       if(uNameInput.getText()!=null)
       {
           logIn = checkUserList(uNameInput.getText());
        
           if(logIn)
           {
               listScreen=new PatientListScreen(loggedInUser);
               listScreen.setVisible(true);              
               this.setVisible(false);
           }
       }
       
       
    }//GEN-LAST:event_login_buttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel pWord_Lbl;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JTextField uNameInput;
    private javax.swing.JLabel uName_Lbl;
    // End of variables declaration//GEN-END:variables

    private boolean checkUserList(String userName) {

        String pass=new String(passInput.getPassword());
        boolean userCorr=false;
        
        for(User u : userList)
        {
            if (userName.equals(u.username))
            {
                userCorr=true;
                
                if (pass.equals(u.password))
                {                 
                    logIn=true;
                    loggedInUser=u;
                    
                    break;
                }
                else break;             
            }         
        } 
        
        if(userCorr && !logIn)
            JOptionPane.showMessageDialog(this, "Incorrect Password");
        else if (!userCorr)
            JOptionPane.showMessageDialog(this, "User Not Found");
    
        return logIn;
    }
}
