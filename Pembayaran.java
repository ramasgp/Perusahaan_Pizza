/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basisdatagemink;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Rama
 */
public class Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        initComponents();
        setLocationRelativeTo(null);
        table();
        Kosongkan_Form();
    }
    
    public void Kosongkan_Form(){
        txtIdpem.setText(null);
        txtMetode.setText(null);
    }
    
    public void search(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Pembayaran");
        tbl.addColumn("Metode Pembayaran");
        
        try{
            String sql = "SELECT *  FROM Pembayaran WHERE Id_pembayaran like '%"+txtCari.getText()+"%' OR Metode_pembayaran like '%"+txtCari.getText()+"%'";
            Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("Id_pembayaran"),
                    as.getString("Metode_pembayaran")
                });
                tblPem.setModel(tbl);
            }
            
            JOptionPane.showMessageDialog(null, "Data berhasil ditemukan");

        }catch(HeadlessException | SQLException e){
            //JOptionPane.showMessageDialog(null,  e.getMessage());
        }  
    }
    
    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Pembayaran");
        tbl.addColumn("Metode Pembayaran");
        
        try {
            String sql = "SELECT * FROM Pembayaran";
            java.sql.Connection con = (Connection)Connect.Connection();
            java.sql.ResultSet as = con.createStatement().executeQuery(sql);
            
            while(as.next()){
                tbl.addRow(new Object[] {
                    as.getString("Id_pembayaran"),
                    as.getString("Metode_pembayaran")
                });
                tblPem.setModel(tbl);
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
        tblPem = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIdpem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMetode = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnTampilkan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPem.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPem);

        jLabel1.setText("ID Pembayaran");

        jLabel2.setText("Metode Pembayaran");

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMetode)
                            .addComponent(txtIdpem)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnTampilkan)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdpem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPemMouseClicked
        try{
            int baris = tblPem.rowAtPoint(evt.getPoint());
            String Id_pem = tblPem.getValueAt(baris, 0).toString();
            txtIdpem.setText(Id_pem);
            String Metode = tblPem.getValueAt(baris, 1).toString();
            txtMetode.setText(Metode);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }
    }//GEN-LAST:event_tblPemMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try{
            String sql = "INSERT INTO Pembayaran VALUES ('"+txtMetode.getText()+"')";
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
            String sql = "SELECT * FROM Pembayaran WHERE Metode_pembayaran = '"+txtMetode.getText()+"'";
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
            String sql = "UPDATE Pembayaran SET Metode_pembayaran = '"+txtMetode.getText()+"'";
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
            String sql = "DELETE FROM Pembayaran WHERE Id_pembayaran = '"+txtIdpem.getText()+"'";
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

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        dispose();
        new Admin_Page().setVisible(true);
    }//GEN-LAST:event_btnKembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPem;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdpem;
    private javax.swing.JTextField txtMetode;
    // End of variables declaration//GEN-END:variables
}
