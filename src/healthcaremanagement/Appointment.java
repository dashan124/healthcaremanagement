package healthcaremanagement;
import static healthcaremanagement.LoginPage.path;
import java.sql.*;
import javax.swing.*;
public class Appointment extends javax.swing.JFrame implements databseconnection,Check{
     static String username="root";
    static String password="dashan@1999";
    static String path="jdbc:mysql://localhost:3306/sample";
    public Appointment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        NeurologistRB = new javax.swing.JRadioButton();
        PodiatristRB = new javax.swing.JRadioButton();
        PhysicalRB = new javax.swing.JRadioButton();
        EarspecRB = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        STname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        UsernameTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IdTF = new javax.swing.JTextField();
        OKB = new javax.swing.JButton();
        ClearB = new javax.swing.JButton();
        BackB = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HEALTH CARE CENTRE NITK");

        buttonGroup1.add(NeurologistRB);
        NeurologistRB.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        NeurologistRB.setText("Neurologist");
        NeurologistRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeurologistRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(PodiatristRB);
        PodiatristRB.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        PodiatristRB.setText("Podiatrist");
        PodiatristRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PodiatristRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(PhysicalRB);
        PhysicalRB.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        PhysicalRB.setText("Physical therapist");
        PhysicalRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhysicalRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(EarspecRB);
        EarspecRB.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        EarspecRB.setText("Ear specilist");
        EarspecRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EarspecRBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel2.setText("STUDENT NAME");

        STname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STnameActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("USERNAME");

        UsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTFActionPerformed(evt);
            }
        });

        jLabel4.setText("ID");

        IdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTFActionPerformed(evt);
            }
        });

        OKB.setText("OK");
        OKB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBActionPerformed(evt);
            }
        });

        ClearB.setText("CLEAR");
        ClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBActionPerformed(evt);
            }
        });

        BackB.setText("BACK");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhysicalRB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NeurologistRB, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EarspecRB)
                            .addComponent(PodiatristRB))
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UsernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(IdTF)
                            .addComponent(STname)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(OKB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(ClearB)
                                .addGap(42, 42, 42)
                                .addComponent(BackB)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PodiatristRB)
                    .addComponent(NeurologistRB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhysicalRB)
                    .addComponent(EarspecRB))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(STname))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClearB)
                    .addComponent(OKB)
                    .addComponent(BackB))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NeurologistRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeurologistRBActionPerformed
    }//GEN-LAST:event_NeurologistRBActionPerformed

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        // go back
        Studentpage stp=new Studentpage();
        stp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBActionPerformed

    private void ClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBActionPerformed
        // TODO add your handling code here:
         buttonGroup1.clearSelection();
       STname.setText("");
        UsernameTF.setText("");
       IdTF.setText("");
    }//GEN-LAST:event_ClearBActionPerformed

    private void STnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STnameActionPerformed

    private void UsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTFActionPerformed

    private void PodiatristRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PodiatristRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PodiatristRBActionPerformed

    private void PhysicalRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhysicalRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhysicalRBActionPerformed

    private void EarspecRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EarspecRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EarspecRBActionPerformed

    private void IdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTFActionPerformed

    private void OKBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBActionPerformed
        // TODO add your handling code here:
        if(Empty(UsernameTF.getText())||Empty(STname.getText())||Empty(IdTF.getText())){
             JOptionPane.showMessageDialog(null, "CAN NOT BE BLANK");
             buttonGroup1.clearSelection();
       STname.setText("");
        UsernameTF.setText("");
       IdTF.setText("");
        }
        else{
        String doctortype;
         doctortype ="";
        if (PhysicalRB.isSelected()==true)
           {
                doctortype ="";
                doctortype+="Physical therapist";
           }
        else if (PodiatristRB.isSelected()==true)
           {     doctortype ="";
               doctortype+="Podiatrist";
           }
        else if (EarspecRB.isSelected()==true)
           { doctortype ="";
                doctortype+="Earspecilist";
           }
        else if (NeurologistRB.isSelected()==true)
           { doctortype ="";
               doctortype+="Neurologist";
           }
        
        String stusername=UsernameTF.getText();
        System.out.println(username);
        String studentname=STname.getText();
        System.out.println(studentname);
        int id =Integer.parseInt(IdTF.getText().toString());
        System.out.println(id); 
        System.out.println(doctortype);
        Connection con = null;
        ResultSet rs;
        try{
            //con = DriverManager.getConnection(path,username,password);
            con=getconnected(path,username,password);
            Statement st = con.createStatement();
            String x = "Insert into appointments values ("+id+","+"'"+studentname+"'"+","+"'"+doctortype+"'"+","+"'"+stusername+"'"+");";
            System.out.println(x);
            st.executeUpdate(x);
            JOptionPane.showMessageDialog (null, "appointment succcessfull", "appointmentstatus", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_OKBActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
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
    private javax.swing.JButton BackB;
    private javax.swing.JButton ClearB;
    private javax.swing.JRadioButton EarspecRB;
    private javax.swing.JTextField IdTF;
    private javax.swing.JRadioButton NeurologistRB;
    private javax.swing.JButton OKB;
    private javax.swing.JRadioButton PhysicalRB;
    private javax.swing.JRadioButton PodiatristRB;
    private javax.swing.JTextField STname;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
