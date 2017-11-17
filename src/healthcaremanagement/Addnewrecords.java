package healthcaremanagement;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
public class Addnewrecords extends javax.swing.JFrame implements databseconnection,Check{
    static String username="root";
    static String password="dashan@1999";
    static String path="jdbc:mysql://localhost:3306/sample";
    public Addnewrecords() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AdrecB = new javax.swing.JButton();
        BackB = new javax.swing.JButton();
        UsernameTF = new javax.swing.JTextField();
        RecordsTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HEALTH CARE CENTRE NITK");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER NAME");

        jLabel3.setText("RECORDS ");

        AdrecB.setText("ADD RECORD");
        AdrecB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdrecBActionPerformed(evt);
            }
        });

        BackB.setText("BACK");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        UsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTFActionPerformed(evt);
            }
        });

        RecordsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordsTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AdrecB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(BackB, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RecordsTF)
                            .addComponent(UsernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecordsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdrecB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        Adminpage nwd=new Adminpage();
        nwd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBActionPerformed

    private void AdrecBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdrecBActionPerformed
        if(Empty(UsernameTF.getText())||(Empty(RecordsTF.getText()))){
             JOptionPane.showMessageDialog(null, "CAN NOT BE BLANK");
             UsernameTF.setText("");
             RecordsTF.setText("");
        }
        else{
        String stuser=UsernameTF.getText();
        String record=RecordsTF.getText();
        
        Connection con=null;
        try{con=getconnected(path,username,password);
            Statement st = con.createStatement();
            String x ="Update students set prevoius_records="+"'"+record+"'"+"where username="+"'"+stuser+"';";
            System.out.println(x);
            st.executeUpdate(x);
        JOptionPane.showMessageDialog (null, "Records added successfully", "Attention", JOptionPane.INFORMATION_MESSAGE);        
        }catch(Exception e){
            System.out.println(e);
        }
        }        
    }//GEN-LAST:event_AdrecBActionPerformed

    private void UsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTFActionPerformed
 
        String enteredusername = UsernameTF.getText();
     
    }//GEN-LAST:event_UsernameTFActionPerformed

    private void RecordsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordsTFActionPerformed
        String records=RecordsTF.getText();
    }//GEN-LAST:event_RecordsTFActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addnewrecords().setVisible(true);
            }
        });
    }
public Connection getconnected(String path,String username,String password){
    Connection x=null;
    try{
        x=DriverManager.getConnection(path,username,password);
        return x;
    }catch(Exception e){
        System.out.println(e);
    }
    throw new UnsupportedOperationException("Not supported yet");
}
 public  boolean Empty(String string){
     if(string.isEmpty()){
         return true;
     }
     else{
         return false;
     }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdrecB;
    private javax.swing.JButton BackB;
    private javax.swing.JTextField RecordsTF;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
