/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author LENOVO
 */
public class FormPenentuJumlahHariGUI extends javax.swing.JFrame {

    /**
     * Creates new form FormPenentuJumlahHariGUI
     */
    public FormPenentuJumlahHariGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTahun = new javax.swing.JLabel();
        labelBulan = new javax.swing.JLabel();
        textTahun = new javax.swing.JTextField();
        textBulan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        labelJumlahHari = new javax.swing.JLabel();
        labelHasil = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        buttomHitung = new javax.swing.JButton();
        buttomHapus = new javax.swing.JButton();
        buttomSimpan = new javax.swing.JButton();
        buttomKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penentu Jumlah Hari");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplikasi Penentu Jumlah Hari"));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        labelTahun.setText("Tahun");

        labelBulan.setText("Bulan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTahun)
                    .addComponent(labelBulan))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textTahun)
                    .addComponent(textBulan, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTahun)
                    .addComponent(textTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBulan)
                    .addComponent(textBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 51));

        labelJumlahHari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelJumlahHari.setText("Jumlah Hari Adalah :");

        labelHasil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelHasil.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelJumlahHari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHasil)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJumlahHari)
                    .addComponent(labelHasil))
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        buttomHitung.setText("Hitung");
        buttomHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomHitungActionPerformed(evt);
            }
        });

        buttomHapus.setText("Hapus");
        buttomHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomHapusActionPerformed(evt);
            }
        });

        buttomSimpan.setText("Simpan");
        buttomSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomSimpanActionPerformed(evt);
            }
        });

        buttomKeluar.setText("Keluar");
        buttomKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttomKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttomHitung)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttomHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttomSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttomKeluar)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttomHitung)
                    .addComponent(buttomHapus)
                    .addComponent(buttomSimpan)
                    .addComponent(buttomKeluar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttomHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomHitungActionPerformed
       hitungHari();
    }//GEN-LAST:event_buttomHitungActionPerformed

    private void buttomSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomSimpanActionPerformed
        prosesSimpan();
    }//GEN-LAST:event_buttomSimpanActionPerformed

    private void buttomHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomHapusActionPerformed
        textTahun.setText("");
        textBulan.setText("");
        labelHasil.setText("0");
        textTahun.requestFocus();
    }//GEN-LAST:event_buttomHapusActionPerformed

    private void buttomKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttomKeluarActionPerformed
        String tanya = "Yakin akan keluar?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya) == JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
        }
    }//GEN-LAST:event_buttomKeluarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttomHapus;
    private javax.swing.JButton buttomHitung;
    private javax.swing.JButton buttomKeluar;
    private javax.swing.JButton buttomSimpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelBulan;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JLabel labelJumlahHari;
    private javax.swing.JLabel labelTahun;
    private javax.swing.JTextField textBulan;
    private javax.swing.JTextField textTahun;
    // End of variables declaration//GEN-END:variables

    private void hitungHari() {
        int tahun = Integer.valueOf(textTahun.getText()); 
        int bulan = Integer.parseInt(textBulan.getText());
        int hari = 0;
        switch(bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                hari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                hari = 30;
                break;
            case 2:
                hari = 28;
                if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
                    hari = 29;
                }
                break;
        }
        labelHasil.setText(hari+"");
        }

    private void prosesSimpan() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("jumlahhari.txt"));
            out.write("Jumlah hari pada tahun "+textTahun.getText()+" dan bulan "+textBulan.getText()+" adalah "+labelHasil.getText());
            out.close();
        } catch (Exception e){
            System.out.println("Error boss, check codingannya!");
        }
    }   
    }

