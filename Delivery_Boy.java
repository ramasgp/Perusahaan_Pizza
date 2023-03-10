/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basisdatagemink;

import static basisdatagemink.Pesanan.getJasperReport;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Rama
 */
public class Delivery_Boy extends javax.swing.JFrame {

    /**
     * Creates new form Delivery_Boy
     */
    public Delivery_Boy() {
        initComponents();
        setLocationRelativeTo(null);
        table();
        Kosongkan_Form();
    }
    
    
    
    public void search(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Delivery Boy");
        tbl.addColumn("Nama Lengkap");
        tbl.addColumn("No Handphone");
        tbl.addColumn("No Plat Kendaraan");
        
        try{
            String sql = "SELECT *  FROM Delivery_Boy WHERE Id_dboy like '%"+txtCari.getText()+"%' OR Nama_dboy like '%"+txtCari.getText()+"%' OR No_telpdboy like '%"+txtCari.getText()+"%' OR Plat_kendaraan like '%"+txtCari.getText()+"%'";
            Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("Id_dboy"),
                    as.getString("Nama_dboy"),
                    as.getString("No_telpdboy"),
                    as.getString("Plat_kendaraan")
                });
                tblDboy.setModel(tbl);
            }
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditemukan");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }
    public void Kosongkan_Form(){
        txtIddboy.setText(null);
        txtNama.setText(null);
        txtNohp.setText(null);
        txtNoplat.setText(null);
    }
    
    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Delivery Boy");
        tbl.addColumn("Nama Lengkap");
        tbl.addColumn("No Handphone");
        tbl.addColumn("No Plat Kendaraan");

        try {
            String sql = "SELECT * FROM Delivery_Boy";
            java.sql.Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("Id_dboy"),
                    as.getString("Nama_dboy"),
                    as.getString("No_telpdboy"),
                    as.getString("Plat_kendaraan")
                });
                tblDboy.setModel(tbl);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDboy = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIddboy = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNohp = new javax.swing.JTextField();
        txtNoplat = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnTampilkan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDboy.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDboy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDboyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDboy);

        jLabel1.setText("ID Delivery Boy");

        jLabel2.setText("Nama Lengkap");

        jLabel3.setText("No Handphone");

        jLabel4.setText("No Plat Kendaraan");

        txtIddboy.setText("Tidak perlu diisi");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIddboy, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNama)
                            .addComponent(txtNohp)
                            .addComponent(txtNoplat)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit)
                            .addComponent(btnKembali))
                        .addGap(35, 35, 35)
                        .addComponent(btnTampilkan)
                        .addGap(41, 41, 41)
                        .addComponent(btnEdit)
                        .addGap(40, 40, 40)
                        .addComponent(btnHapus)
                        .addGap(32, 32, 32)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIddboy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(txtNohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoplat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnTampilkan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnKembali)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        dispose();
        new Admin_Page().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tblDboyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDboyMouseClicked
        try{
            int baris = tblDboy.rowAtPoint(evt.getPoint());
            String Id_dboy = tblDboy.getValueAt(baris, 0).toString();
            txtIddboy.setText(Id_dboy);
            String Nama_lengkap = tblDboy.getValueAt(baris, 1).toString();
            txtNama.setText(Nama_lengkap);
            String No_telp = tblDboy.getValueAt(baris, 2).toString();
            txtNohp.setText(No_telp);
            String Plat = tblDboy.getValueAt(baris, 3).toString();
            txtNoplat.setText(Plat);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }    
    }//GEN-LAST:event_tblDboyMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try{
            String sql = "INSERT INTO Delivery_Boy VALUES ('"+txtNama.getText()+"','"+txtNohp.getText()+"','"+txtNoplat.getText()+"')";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanActionPerformed
        try{
            String sql = "SELECT * FROM Delivery_Boy WHERE Nama_dboy = '"+txtNama.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
        
        table();
        Kosongkan_Form();
    }//GEN-LAST:event_btnTampilkanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try{
            String sql = "UPDATE Delivery_Boy SET Nama_dboy = '"+txtNama.getText()+"',No_telpdboy = '"+txtNohp.getText()+"',Plat_kendaraan = '"+txtNoplat.getText()+"' WHERE Id_dboy = '"+txtIddboy.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil diedit");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            String sql = "DELETE FROM Delivery_Boy WHERE Id_dboy = '"+txtIddboy.getText()+"'";
            Connection con = (Connection)Connect.Connection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        search();
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(Delivery_Boy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delivery_Boy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delivery_Boy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delivery_Boy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delivery_Boy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDboy;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIddboy;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNohp;
    private javax.swing.JTextField txtNoplat;
    // End of variables declaration//GEN-END:variables
}
