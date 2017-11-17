package healthcaremanagement;
import static healthcaremanagement.PreviousRecords.path;
import java.sql.*;
import javax.swing.JOptionPane;
public class Studentpage extends javax.swing.JFrame implements databseconnection{
    static String username="root";
     static String password="dashan@1999";
     static String path="jdbc:mysql://localhost:3306/sample";
    public Studentpage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        docappB = new javax.swing.JButton();
        docavB = new javax.swing.JButton();
        PRTF = new javax.swing.JButton();
        ShowDoccB = new javax.swing.JButton();
        LogoutB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(50, 125, 185));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.yellow);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HEALTH CARE CENTRE NITK");

        docappB.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        docappB.setText("APPOINTMENT");
        docappB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docappBActionPerformed(evt);
            }
        });

        docavB.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        docavB.setText("DOCTOR'S  AVAILIBLITY");
        docavB.setActionCommand("DOCTOR'S AVAILIBLITY");
        docavB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docavBActionPerformed(evt);
            }
        });

        PRTF.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        PRTF.setText("PREVOIUS RECORD");
        PRTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRTFActionPerformed(evt);
            }
        });

        ShowDoccB.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        ShowDoccB.setText("SHOW ALL DOCTORS");
        ShowDoccB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDoccBActionPerformed(evt);
            }
        });

        LogoutB.setText("LOG OUT");
        LogoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(docappB, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PRTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(docavB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowDoccB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(LogoutB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(docappB, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(docavB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRTF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowDoccB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(LogoutB)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docavBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docavBActionPerformed
      Doctoravailablity dav=new Doctoravailablity();
        dav.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_docavBActionPerformed

    private void ShowDoccBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDoccBActionPerformed
        Showdoctors stds=new Showdoctors();
        stds.setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_ShowDoccBActionPerformed

    private void docappBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docappBActionPerformed
        Appointment ap=new Appointment();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_docappBActionPerformed

    private void LogoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBActionPerformed
      System.exit(0);
    }//GEN-LAST:event_LogoutBActionPerformed

    private void PRTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRTFActionPerformed
        PreviousRecords prs=new PreviousRecords();
        prs.setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_PRTFActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentpage().setVisible(true);
}        });
    }
public Connection getconnected(String path,String username,String password){
    Connection x=null;
    try{x=DriverManager.getConnection(path,username,password);
        return x;
    }catch(Exception e){
        System.out.println(e);
    }
    throw new UnsupportedOperationException("Not supported yet");
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutB;
    private javax.swing.JButton PRTF;
    private javax.swing.JButton ShowDoccB;
    private javax.swing.JButton docappB;
    private javax.swing.JButton docavB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}

