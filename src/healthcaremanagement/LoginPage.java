package healthcaremanagement;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
public class LoginPage extends javax.swing.JFrame implements databseconnection{
   static String username="root";
    static String password="dashan@1999";
    static String path="jdbc:mysql://localhost:3306/sample"; 
    public LoginPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        psswdPF = new javax.swing.JPasswordField();
        LoginB = new javax.swing.JButton();
        adloginRB = new javax.swing.JRadioButton();
        stloginRB = new javax.swing.JRadioButton();
        ClearB = new javax.swing.JButton();
        ExitB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN PAGE");

        jLabel2.setText("Username :");

        jLabel3.setText("Password :");

        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        LoginB.setText("Login");
        LoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });

        buttonGroup1.add(adloginRB);
        adloginRB.setText("Admin Login");
        adloginRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adloginRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(stloginRB);
        stloginRB.setText("Student Login");
        stloginRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stloginRBActionPerformed(evt);
            }
        });

        ClearB.setText("Clear");
        ClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBActionPerformed(evt);
            }
        });

        ExitB.setText("exit");
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(adloginRB)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(LoginB)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stloginRB)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ExitB)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(psswdPF)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(ClearB))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psswdPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adloginRB)
                            .addComponent(stloginRB))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginB)
                    .addComponent(ClearB)
                    .addComponent(ExitB))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adloginRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adloginRBActionPerformed
           if (adloginRB.isSelected()==true)
           { usernameTF.setText("");
             psswdPF.setText("");
           }
    }//GEN-LAST:event_adloginRBActionPerformed

    private void stloginRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stloginRBActionPerformed
     if (stloginRB.isSelected()==true)
           {   usernameTF.setText("");
               psswdPF.setText("");
           }
    }//GEN-LAST:event_stloginRBActionPerformed

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBActionPerformed
        String adusername="admin";
        String adpswd = "admin123";
        String enteredusername = usernameTF.getText();
        String enteredpassword = new String(psswdPF.getPassword()); 
        System.out.println(enteredpassword);
        System.out.println(enteredusername);
        if(adloginRB.isSelected()==true){
            if(enteredusername.equals(adusername)&&enteredpassword.equals(adpswd))
            {      Adminpage frame3=new Adminpage();
                   frame3.setVisible(true);
                   this.setVisible(false);
            }else
            {JOptionPane.showMessageDialog(null, "Enter credentials  are wrong");
             usernameTF.setText("");
             psswdPF.setText("");
            }}
        else
        {  Connection con=null;
        ResultSet rs=null;
        int w = 0;
        String sql="Select count(*) from students where username="+"'"+enteredusername+"'"+ "and password="+"'"+enteredpassword+"'";
        try{           con=getconnected(path,username,password);
            System.out.println("Database connected");
            Statement st= con.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
              w=rs.getInt(1);
            }
            if(w==0){
                JOptionPane.showMessageDialog(null,"Entered creadentials are wrong");
                usernameTF.setText("");
                psswdPF.setText("");
            }
            else{
                Studentpage frame = new Studentpage();
                this.setVisible(false);
                frame.setVisible(true);
            }      
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_LoginBActionPerformed

    private void ClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBActionPerformed
        buttonGroup1.clearSelection();
        usernameTF.setText("");
        psswdPF.setText("");
    }//GEN-LAST:event_ClearBActionPerformed

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
    System.exit(0);
    }//GEN-LAST:event_ExitBActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed

    }//GEN-LAST:event_usernameTFActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
public Connection getconnected(String path,String username,String password){
    Connection x=null;
    try{ x=DriverManager.getConnection(path,username,password);
        return x;
    }catch(Exception e){
        System.out.println(e);
    }throw new UnsupportedOperationException("Not supported yet");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearB;
    private javax.swing.JButton ExitB;
    private javax.swing.JButton LoginB;
    private javax.swing.JRadioButton adloginRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField psswdPF;
    private javax.swing.JRadioButton stloginRB;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
