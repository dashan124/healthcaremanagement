package healthcaremanagement;
public class Adminpage extends javax.swing.JFrame {
    public Adminpage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        editB = new javax.swing.JButton();
        AddrecordB = new javax.swing.JButton();
        AdduserB = new javax.swing.JButton();
        appntB = new javax.swing.JButton();
        logoutB = new javax.swing.JButton();
        AdddocB = new javax.swing.JButton();
        newbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(91, 109, 199));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 47, 68));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HEALTH CARE CENTRE NITK");

        editB.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        editB.setText("EDIT TIME TABLE");
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });

        AddrecordB.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        AddrecordB.setText("ADD RECORDS");
        AddrecordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddrecordBActionPerformed(evt);
            }
        });

        AdduserB.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        AdduserB.setText("ADD NEW USER");
        AdduserB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdduserBActionPerformed(evt);
            }
        });

        appntB.setFont(new java.awt.Font("Waree", 0, 18)); // NOI18N
        appntB.setText("APPOINTMENTs");
        appntB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appntBActionPerformed(evt);
            }
        });

        logoutB.setText("LOG OUT");
        logoutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBActionPerformed(evt);
            }
        });

        AdddocB.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        AdddocB.setText("ADD DOCTOR");
        AdddocB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdddocB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdddocBActionPerformed(evt);
            }
        });

        newbutton.setText("jButton1");
        newbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddrecordB, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(AdduserB, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(appntB, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(logoutB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(AdddocB, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editB, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(AddrecordB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdduserB, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(appntB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(AdddocB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(logoutB)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(newbutton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBActionPerformed
      System.exit(0);
    }//GEN-LAST:event_logoutBActionPerformed

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
        Timetableedit ed=new Timetableedit();
        ed.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editBActionPerformed

    private void AddrecordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddrecordBActionPerformed
        Addnewrecords adn=new Addnewrecords();
        adn.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_AddrecordBActionPerformed
    private void AdduserBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdduserBActionPerformed
       Newuseradd adne=new Newuseradd();
        adne.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdduserBActionPerformed

    private void appntBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appntBActionPerformed
        // TODO add your handling code here:
        Allappointments alp=new Allappointments();
        alp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_appntBActionPerformed
    private void AdddocBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdddocBActionPerformed
        // TODO add your handling code here:
        AddDoctors adr=new AddDoctors();
        adr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdddocBActionPerformed

    private void newbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newbuttonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdddocB;
    private javax.swing.JButton AddrecordB;
    private javax.swing.JButton AdduserB;
    private javax.swing.JButton appntB;
    private javax.swing.JButton editB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutB;
    private javax.swing.JButton newbutton;
    // End of variables declaration//GEN-END:variables
}
