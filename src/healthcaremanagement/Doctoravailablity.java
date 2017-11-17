package healthcaremanagement;
import  java.sql.*;
public class Doctoravailablity extends javax.swing.JFrame implements databseconnection {
     static String username="root";
    static String password="dashan@1999";
    static String path="jdbc:mysql://localhost:3306/sample";
    public Doctoravailablity() {
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
        buttonGroup7 = new javax.swing.ButtonGroup();
        NeuroRB = new javax.swing.JRadioButton();
        PodiaRB = new javax.swing.JRadioButton();
        PhysiRB = new javax.swing.JRadioButton();
        EarRB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        TimingB = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup7.add(NeuroRB);
        NeuroRB.setText("Neurologist");
        NeuroRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeuroRBActionPerformed(evt);
            }
        });

        buttonGroup7.add(PodiaRB);
        PodiaRB.setText("Podiatrist");
        PodiaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PodiaRBActionPerformed(evt);
            }
        });

        buttonGroup7.add(PhysiRB);
        PhysiRB.setText("Physical therapist");
        PhysiRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhysiRBActionPerformed(evt);
            }
        });

        buttonGroup7.add(EarRB);
        EarRB.setText("Ear specilist");
        EarRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EarRBActionPerformed(evt);
            }
        });

        jLabel1.setText("TIMINGS");

        TimingB.setText("SHOW TIMINGS");
        TimingB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimingBActionPerformed(evt);
            }
        });

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        resTA.setColumns(20);
        resTA.setRows(5);
        jScrollPane1.setViewportView(resTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhysiRB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NeuroRB)
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PodiaRB)
                                    .addComponent(EarRB)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TimingB)
                                .addGap(50, 50, 50)
                                .addComponent(jButton2)
                                .addGap(67, 67, 67)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NeuroRB)
                    .addComponent(PodiaRB))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhysiRB)
                    .addComponent(EarRB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimingB)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NeuroRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeuroRBActionPerformed

    }//GEN-LAST:event_NeuroRBActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Studentpage stp=new Studentpage();
        stp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TimingBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimingBActionPerformed
         String doctortyp;
         doctortyp ="";
        if (PhysiRB.isSelected()==true)
           { doctortyp ="";
                doctortyp+="Physical therapist";
                resTA.setText("");
           }
        else if (PodiaRB.isSelected()==true)
           {     doctortyp ="";
               doctortyp+="Podiatrist";
               resTA.setText("");

           }
        else if (EarRB.isSelected()==true)
           { doctortyp ="";
             resTA.setText("");
           doctortyp+="Earspecilist";
           }
        else if (NeuroRB.isSelected()==true)
           { doctortyp ="";
           
            resTA.setText("");
            doctortyp+="Neurologist";
           }   
        System.out.println(doctortyp);
        Connection con = null;
        ResultSet rs;
        try{
            //con = DriverManager.getConnection(path,username,password);
            con=getconnected(path,username,password);
            Statement st = con.createStatement();
            String x = "Select name,timings from doctors where specfications="+"'"+doctortyp+"';";
            rs=st.executeQuery(x);
            while(rs.next()){
                String docname=rs.getString(1);
                String Timing =rs.getString(2);
                resTA.append(docname+"           "+Timing);
                resTA.append("\n");
            }
            System.out.println(x);
            
        }catch(Exception e){
            System.out.println(e);
        }                
    }//GEN-LAST:event_TimingBActionPerformed

    private void PhysiRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhysiRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhysiRBActionPerformed

    private void PodiaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PodiaRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PodiaRBActionPerformed

    private void EarRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EarRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EarRBActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctoravailablity().setVisible(true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EarRB;
    private javax.swing.JRadioButton NeuroRB;
    private javax.swing.JRadioButton PhysiRB;
    private javax.swing.JRadioButton PodiaRB;
    private javax.swing.JButton TimingB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resTA;
    // End of variables declaration//GEN-END:variables
}
