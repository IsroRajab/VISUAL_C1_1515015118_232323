package POSTTEST2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isro Rajab
 */
public class input extends javax.swing.JFrame {

    /**
     * Creates new form input
     */
    public input() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nik = new javax.swing.JLabel();
        isinik = new javax.swing.JTextField();
        ttl = new javax.swing.JLabel();
        isitempat = new javax.swing.JTextField();
        isitanggal = new javax.swing.JTextField();
        kelamin = new javax.swing.JLabel();
        isilaki = new javax.swing.JRadioButton();
        isicewe = new javax.swing.JRadioButton();
        alamat = new javax.swing.JLabel();
        isialamat = new javax.swing.JTextField();
        rtrw = new javax.swing.JLabel();
        isirt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        isirw = new javax.swing.JTextField();
        kelurahan = new javax.swing.JLabel();
        isikelurahan = new javax.swing.JTextField();
        kecamatan = new javax.swing.JLabel();
        isikecamatan = new javax.swing.JTextField();
        agama = new javax.swing.JLabel();
        isiagama = new javax.swing.JComboBox();
        status = new javax.swing.JLabel();
        isistatus = new javax.swing.JComboBox();
        pekerjaan = new javax.swing.JLabel();
        isipekerjaan = new javax.swing.JTextField();
        warga = new javax.swing.JLabel();
        isiwarga = new javax.swing.JComboBox();
        berlaku = new javax.swing.JLabel();
        isiberlaku = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        darah = new javax.swing.JLabel();
        isidarah = new javax.swing.JComboBox();
        nama = new javax.swing.JLabel();
        isinama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORM KARTU TANDA PENDUDUK");

        jLabel2.setText("SILAHKAN ISI");

        nik.setText("NIK");

        isinik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isinikActionPerformed(evt);
            }
        });

        ttl.setText("Tempat/Tgl Lahir");

        isitanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isitanggalActionPerformed(evt);
            }
        });

        kelamin.setText("Jenis Kelamin");

        buttonGroup1.add(isilaki);
        isilaki.setText("Laki-laki");

        buttonGroup1.add(isicewe);
        isicewe.setText("Perempuan");

        alamat.setText("Alamat");

        isialamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isialamatActionPerformed(evt);
            }
        });

        rtrw.setText("RT / RW");

        jLabel8.setText("/");

        isirw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isirwActionPerformed(evt);
            }
        });

        kelurahan.setText("Kel / Desa");

        kecamatan.setText("Kecamatan");

        isikecamatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isikecamatanActionPerformed(evt);
            }
        });

        agama.setText("Agama ");

        isiagama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--pilih--", "ISLAM", "KRISTEN", "KHATOLIK", "BUDHA", "KONGHUCU" }));

        status.setText("Status Perkawinan");

        isistatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--pilih--", "MENIKAH", "BELUM MENIKAH" }));

        pekerjaan.setText("Pekerjaan");

        warga.setText("Kewarganegaraan");

        isiwarga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--pilih--", "WNI", "WNA" }));

        berlaku.setText("Masa Berlaku");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        darah.setText("Gol. Darah");

        isidarah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--pilih--", "A", "B", "AB", "O" }));
        isidarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isidarahActionPerformed(evt);
            }
        });

        nama.setText("Nama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nik)
                    .addComponent(ttl)
                    .addComponent(alamat)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kelurahan)
                            .addComponent(rtrw)
                            .addComponent(kecamatan)))
                    .addComponent(agama)
                    .addComponent(status)
                    .addComponent(pekerjaan)
                    .addComponent(warga)
                    .addComponent(berlaku)
                    .addComponent(kelamin)
                    .addComponent(nama))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isiberlaku)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isilaki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isicewe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(darah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isidarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(isitempat, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isitanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(isikelurahan)
                    .addComponent(isipekerjaan)
                    .addComponent(isiwarga, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isialamat)
                    .addComponent(isinik)
                    .addComponent(isiagama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isistatus, 0, 279, Short.MAX_VALUE)
                    .addComponent(isikecamatan)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isirt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isirw, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(isinama))
                .addGap(43, 218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nik)
                            .addComponent(isinik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(nama))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(isinama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isitempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isitanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isilaki)
                    .addComponent(isicewe)
                    .addComponent(darah)
                    .addComponent(isidarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelamin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isialamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isirt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(isirw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtrw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isikelurahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelurahan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isikecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kecamatan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isiagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isistatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isipekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pekerjaan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isiwarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warga, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isiberlaku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(berlaku))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isikecamatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isikecamatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isikecamatanActionPerformed

    private void isitanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isitanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isitanggalActionPerformed

    private void isinikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isinikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isinikActionPerformed

    private void isirwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isirwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isirwActionPerformed

    private void isidarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isidarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isidarahActionPerformed

    private void isialamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isialamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isialamatActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nik, nama, ttl, tl, kelamin=null, alamat, rtrw, RW, kelurahan, kecamatan, agama, status, darah, pekerjaan,berlaku, warga;
        nik = isinik.getText();
        nama = isinama.getText();
        ttl = isitempat.getText();
        tl = isitanggal.getText();
        if (isilaki.isSelected())
        {kelamin = isilaki.getText();}
        else if (isicewe.isSelected())
        {kelamin =isicewe.getText();}
        alamat =isialamat.getText();
        rtrw = isirt.getText();
        RW = isirw.getText();
        kelurahan = isikelurahan.getText();
        kecamatan = isikecamatan.getText();
        agama = isiagama.getSelectedItem().toString();
        status = isistatus.getSelectedItem().toString();
        darah = isidarah.getSelectedItem().toString();
        pekerjaan = isipekerjaan.getText();
        warga = isiwarga.getSelectedItem().toString();
        berlaku = isiberlaku.getText();

        output x = new output(nik, nama, ttl, tl, kelamin, alamat, rtrw, RW, kelurahan, kecamatan, agama, status, darah, pekerjaan, warga, berlaku);
        x.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        isinik.setText("");
        isinama.setText("");
        isitempat.setText("");
        isitanggal.setText("");
        buttonGroup1.clearSelection();
        isialamat.setText("");
        isirt.setText("");
        isirw.setText("");
        isikelurahan.setText("");
        isikecamatan.setText("");
        isiagama.setSelectedItem(null);
        isistatus.setSelectedItem(null);
        isidarah.setSelectedItem(null);
        isipekerjaan.setText("");
        isiwarga.setSelectedItem(null);
        isiberlaku.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agama;
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel berlaku;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel darah;
    private javax.swing.JComboBox isiagama;
    private javax.swing.JTextField isialamat;
    private javax.swing.JTextField isiberlaku;
    private javax.swing.JRadioButton isicewe;
    private javax.swing.JComboBox isidarah;
    private javax.swing.JTextField isikecamatan;
    private javax.swing.JTextField isikelurahan;
    private javax.swing.JRadioButton isilaki;
    private javax.swing.JTextField isinama;
    private javax.swing.JTextField isinik;
    private javax.swing.JTextField isipekerjaan;
    private javax.swing.JTextField isirt;
    private javax.swing.JTextField isirw;
    private javax.swing.JComboBox isistatus;
    private javax.swing.JTextField isitanggal;
    private javax.swing.JTextField isitempat;
    private javax.swing.JComboBox isiwarga;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel kecamatan;
    private javax.swing.JLabel kelamin;
    private javax.swing.JLabel kelurahan;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nik;
    private javax.swing.JLabel pekerjaan;
    private javax.swing.JLabel rtrw;
    private javax.swing.JLabel status;
    private javax.swing.JLabel ttl;
    private javax.swing.JLabel warga;
    // End of variables declaration//GEN-END:variables
}
