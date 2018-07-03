/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mujigue.view;

import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mujigue.app.App;
import mujigue.config.PelangganTableModel;
import mujigue.controller.WaitingListController;
import mujigue.model.Pelanggan;

/**
 *
 * @author herma
 */
public class WaitingListForm extends javax.swing.JInternalFrame {

    private final WaitingListController controller = new WaitingListController(this);

    public WaitingListForm() {

        initComponents();
        controller.showData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnTambahAntrian = new javax.swing.JButton();
        btnEditAntrian = new javax.swing.JButton();
        btnHapusAntrian = new javax.swing.JButton();
        btnInfokanPel = new javax.swing.JButton();
        btnCloseWLForm = new javax.swing.JButton();
        btnRefreshWL = new javax.swing.JButton();
        edtNamaPel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtNoPel = new javax.swing.JTextField();
        edtTotalPel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnResetWL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWaitingList = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("DAFTAR WAITING LIST");
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        jLabel2.setText("MUJIGUE RESTAURANT");
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Form"));

        btnTambahAntrian.setText("Tambah Antrian");
        btnTambahAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahAntrianActionPerformed(evt);
            }
        });

        btnEditAntrian.setText("Ubah Data");
        btnEditAntrian.setEnabled(false);
        btnEditAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditAntrianActionPerformed(evt);
            }
        });

        btnHapusAntrian.setText("Hapus Data");
        btnHapusAntrian.setEnabled(false);
        btnHapusAntrian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusAntrianActionPerformed(evt);
            }
        });

        btnInfokanPel.setText("Infokan Pelanggan");
        btnInfokanPel.setEnabled(false);
        btnInfokanPel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfokanPelActionPerformed(evt);
            }
        });

        btnCloseWLForm.setText("Close");
        btnCloseWLForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseWLFormActionPerformed(evt);
            }
        });

        btnRefreshWL.setText("Refresh Data");
        btnRefreshWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshWLActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Pelanggan : ");

        jLabel4.setText("Nomor Handphone :");

        jLabel6.setText("Total Pelanggan :");

        btnResetWL.setText("Reset Data");
        btnResetWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetWLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtNoPel)
                    .addComponent(edtTotalPel)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(edtNamaPel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTambahAntrian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfokanPel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnEditAntrian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHapusAntrian, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnCloseWLForm, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnRefreshWL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnResetWL)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNamaPel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtNoPel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtTotalPel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnResetWL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefreshWL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambahAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapusAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInfokanPel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseWLForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblWaitingList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblWaitingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWaitingListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWaitingList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahAntrianActionPerformed
        // TODO add your handling code here:
        Pelanggan p = new Pelanggan();
        p.setNamaPelanggan(edtNamaPel.getText().toString().trim());
        p.setNoTelp(edtNoPel.getText().toString().trim());
        p.setTotalPelanggan(Integer.parseInt(edtTotalPel.getText().toString().trim()));
        controller.savePelanggan();
    }//GEN-LAST:event_btnTambahAntrianActionPerformed

    private void tblWaitingListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWaitingListMouseClicked
        try {
            // TODO add your handling code here:
            controller.getPelannggan();
        } catch (ParseException ex) {
            Logger.getLogger(WaitingListForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblWaitingListMouseClicked

    private void btnResetWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetWLActionPerformed
        // TODO add your handling code here:
        controller.resetform();

    }//GEN-LAST:event_btnResetWLActionPerformed

    private void btnHapusAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusAntrianActionPerformed
        // TODO add your handling code here:
        controller.deletePelanggan();
    }//GEN-LAST:event_btnHapusAntrianActionPerformed

    private void btnEditAntrianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditAntrianActionPerformed
        // TODO add your handling code here:
        controller.editPelanggan();
    }//GEN-LAST:event_btnEditAntrianActionPerformed

    private void btnRefreshWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshWLActionPerformed
        // TODO add your handling code here:
        controller.showData();
    }//GEN-LAST:event_btnRefreshWLActionPerformed

    private void btnCloseWLFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseWLFormActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_btnCloseWLFormActionPerformed

    private void btnInfokanPelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfokanPelActionPerformed
        // TODO add your handling code here:
        controller.infokanPelanggan();
    }//GEN-LAST:event_btnInfokanPelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseWLForm;
    private javax.swing.JButton btnEditAntrian;
    private javax.swing.JButton btnHapusAntrian;
    private javax.swing.JButton btnInfokanPel;
    private javax.swing.JButton btnRefreshWL;
    private javax.swing.JButton btnResetWL;
    private javax.swing.JButton btnTambahAntrian;
    private javax.swing.JTextField edtNamaPel;
    private javax.swing.JTextField edtNoPel;
    private javax.swing.JTextField edtTotalPel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWaitingList;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the btnCloseWLForm
     */
    public javax.swing.JButton getBtnCloseWLForm() {
        return btnCloseWLForm;
    }

    /**
     * @param btnCloseWLForm the btnCloseWLForm to set
     */
    public void setBtnCloseWLForm(javax.swing.JButton btnCloseWLForm) {
        this.btnCloseWLForm = btnCloseWLForm;
    }

    /**
     * @return the btnEditAntrian
     */
    public javax.swing.JButton getBtnEditAntrian() {
        return btnEditAntrian;
    }

    /**
     * @param btnEditAntrian the btnEditAntrian to set
     */
    public void setBtnEditAntrian(javax.swing.JButton btnEditAntrian) {
        this.btnEditAntrian = btnEditAntrian;
    }

    /**
     * @return the btnHapusAntrian
     */
    public javax.swing.JButton getBtnHapusAntrian() {
        return btnHapusAntrian;
    }

    /**
     * @param btnHapusAntrian the btnHapusAntrian to set
     */
    public void setBtnHapusAntrian(javax.swing.JButton btnHapusAntrian) {
        this.btnHapusAntrian = btnHapusAntrian;
    }

    /**
     * @return the btnInfokanPel
     */
    public javax.swing.JButton getBtnInfokanPel() {
        return btnInfokanPel;
    }

    /**
     * @param btnInfokanPel the btnInfokanPel to set
     */
    public void setBtnInfokanPel(javax.swing.JButton btnInfokanPel) {
        this.btnInfokanPel = btnInfokanPel;
    }

    /**
     * @return the btnRefreshWL
     */
    public javax.swing.JButton getBtnRefreshWL() {
        return btnRefreshWL;
    }

    /**
     * @param btnRefreshWL the btnRefreshWL to set
     */
    public void setBtnRefreshWL(javax.swing.JButton btnRefreshWL) {
        this.btnRefreshWL = btnRefreshWL;
    }

    /**
     * @return the btnTambahAntrian
     */
    public javax.swing.JButton getBtnTambahAntrian() {
        return btnTambahAntrian;
    }

    /**
     * @param btnTambahAntrian the btnTambahAntrian to set
     */
    public void setBtnTambahAntrian(javax.swing.JButton btnTambahAntrian) {
        this.btnTambahAntrian = btnTambahAntrian;
    }

    /**
     * @return the edtNamaPel
     */
    public javax.swing.JTextField getEdtNamaPel() {
        return edtNamaPel;
    }

    /**
     * @param edtNamaPel the edtNamaPel to set
     */
    public void setEdtNamaPel(javax.swing.JTextField edtNamaPel) {
        this.edtNamaPel = edtNamaPel;
    }

    /**
     * @return the edtNoPel
     */
    public javax.swing.JTextField getEdtNoPel() {
        return edtNoPel;
    }

    /**
     * @param edtNoPel the edtNoPel to set
     */
    public void setEdtNoPel(javax.swing.JTextField edtNoPel) {
        this.edtNoPel = edtNoPel;
    }

    /**
     * @return the edtTotalPel
     */
    public javax.swing.JTextField getEdtTotalPel() {
        return edtTotalPel;
    }

    /**
     * @param edtTotalPel the edtTotalPel to set
     */
    public void setEdtTotalPel(javax.swing.JTextField edtTotalPel) {
        this.edtTotalPel = edtTotalPel;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the tblWaitingList
     */
    public javax.swing.JTable getTblWaitingList() {
        return tblWaitingList;
    }

    /**
     * @param tblWaitingList the tblWaitingList to set
     */
    public void setTblWaitingList(javax.swing.JTable tblWaitingList) {
        this.tblWaitingList = tblWaitingList;
    }

}