package healthcaremanagement;
import static healthcaremanagement.Showdoctors.path;
import java.sql.*;
import javax.swing.*;
 public class Allappointments extends javax.swing.JFrame implements databseconnection{
     static String username="root";
    static String password="dashan@1999";
    static String path="jdbc:mysql://localhost:3306/sample"; 
    public Allappointments() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowAptB = new javax.swing.JButton();
        BackB = new javax.swing.JButton();
        DelB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        apTa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ShowAptB.setText("SHOW APPOINTMENTS");
        ShowAptB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAptBActionPerformed(evt);
            }
        });

        BackB.setText("BACK");
        BackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBActionPerformed(evt);
            }
        });

        DelB.setText("DELETE ");
        DelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HEALTH CARE CENTRE NITK");

        apTa.setColumns(20);
        apTa.setRows(5);
        jScrollPane1.setViewportView(apTa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ShowAptB, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(BackB, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DelB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackB, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(ShowAptB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBActionPerformed
        // TODO add your handling code here:
        Adminpage admp=new Adminpage();
        admp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBActionPerformed

    private void ShowAptBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAptBActionPerformed
        apTa.setText("");
        Connection con = null;
        ResultSet rs;
        try{
          con=getconnected(path,username,password);
            Statement st = con.createStatement();
            String x = "Select * from appointments;";
            rs=st.executeQuery(x);
            while(rs.next()){
                int id1=Integer.parseInt(rs.getString(1));
                String names =rs.getString(2);
                String doctorty=rs.getString(3);
                String username12=rs.getString(4);
                apTa.append(id1+"    "+names+"     "+doctorty+"     "+username12+"   ");
                apTa.append("\n");
            }
            System.out.println(x);      
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ShowAptBActionPerformed

    private void DelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBActionPerformed
          Deleteappoint dlp=new Deleteappoint();
          dlp.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_DelBActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allappointments().setVisible(true);
            }     });
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackB;
    private javax.swing.JButton DelB;
    private javax.swing.JButton ShowAptB;
    private javax.swing.JTextArea apTa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
