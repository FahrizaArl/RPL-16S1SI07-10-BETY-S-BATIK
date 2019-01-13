
package betybatik.view;

import betybatik.engine.conn_service;
import java.security.SecureRandom;
import java.sql.Connection;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import betybatik.engine.App_Engine;
import static betybatik.engine.App_Engine.randomString;
public class FrmAdminDataMember extends javax.swing.JFrame {
    
       int i = 6;//Inisialisasi secara Global batas karakter ID Member sepanjang 6 karakter
              App_Engine ae = new App_Engine();
    public FrmAdminDataMember() {
        initComponents();
        txtMemId.setEnabled(false);//untuk mendisable textbox ID Member
        load_table();
        clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMemNama = new javax.swing.JTextField();
        txtMemAlamat = new javax.swing.JTextField();
        txtMemTelpon = new javax.swing.JTextField();
        btnMemOk = new javax.swing.JButton();
        btnMemUpdate = new javax.swing.JButton();
        txtMemId = new javax.swing.JTextField();
        btnMemClear = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMember.getTableHeader().setReorderingAllowed(false);
        tblMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMember);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pendaftaran Member"));

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("No Telepon");

        txtMemAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemAlamatActionPerformed(evt);
            }
        });

        txtMemTelpon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMemTelponKeyTyped(evt);
            }
        });

        btnMemOk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMemOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/betybatik/image/01.png"))); // NOI18N
        btnMemOk.setText("Tambah member");
        btnMemOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemOkActionPerformed(evt);
            }
        });

        btnMemUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMemUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/betybatik/image/02.png"))); // NOI18N
        btnMemUpdate.setText("Simpan");
        btnMemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemUpdateActionPerformed(evt);
            }
        });

        txtMemId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemIdActionPerformed(evt);
            }
        });

        btnMemClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/betybatik/image/08.png"))); // NOI18N
        btnMemClear.setText("Besihkan");
        btnMemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemClearActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/betybatik/image/05.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Member");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMemNama)
                    .addComponent(txtMemAlamat)
                    .addComponent(txtMemTelpon)
                    .addComponent(txtMemId)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMemOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMemClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMemUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMemNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMemAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMemTelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMemOk)
                    .addComponent(btnMemUpdate))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMemClear)
                    .addComponent(btnHapus))
                .addGap(7, 7, 7))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Data Member");

        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/betybatik/image/Close-icon.png"))); // NOI18N
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/betybatik/image/icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(btnBatal))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMemOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemOkActionPerformed
       String rid ="BT"+randomString(ae.RandomId, i);//Inisialisasi untuk membuat Random ID Member
       JOptionPane.showMessageDialog(null,"Nama :"+txtMemNama.getText()+"\nAlamat :"+txtMemAlamat.getText()+"\nNo Telepon :"+txtMemTelpon.getText()+"\nID :"+rid,"Selamat Bergabung,"+txtMemNama.getText(),JOptionPane.PLAIN_MESSAGE);//Menampilkan bahwa member baru telah terdaftar
                 try {
            String sql = "INSERT INTO member VALUES ('"+rid+"','"+txtMemNama.getText()+"','"+txtMemAlamat.getText()+"','"+txtMemTelpon.getText()+"')";
            java.sql.Connection conn=(Connection)conn_service.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
         load_table();
         clear();
    }//GEN-LAST:event_btnMemOkActionPerformed

    private void txtMemTelponKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMemTelponKeyTyped
                    char c=evt.getKeyChar();
        if((!Character.isDigit(c)))//Membatasi pengetikan hanya untuk numeric
        {evt.consume();}
       
    }//GEN-LAST:event_txtMemTelponKeyTyped

    private void btnMemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemUpdateActionPerformed
                try {
          String sql ="UPDATE member SET Nama_Member = '"+txtMemNama.getText()+"', alamat= '"+txtMemAlamat.getText()+"', no_hp  = '"+txtMemTelpon.getText()+"'WHERE id_member = '"+txtMemId.getText()+"'";//Fungsi untuk update data member
           java.sql.Connection conn=(Connection)conn_service.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data diUpdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
        clear();
    }//GEN-LAST:event_btnMemUpdateActionPerformed

    private void tblMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberMouseClicked
        int baris = tblMember.rowAtPoint(evt.getPoint());//Fungsi untuk sinkronisasi letak data di form dengan database
               
         String idMem = tblMember.getValueAt(baris, 1).toString();
        txtMemId.setText(idMem);
        
        String nama =tblMember.getValueAt(baris, 2).toString();
        txtMemNama.setText(nama);
        
        String alamat = tblMember.getValueAt(baris, 3).toString();
        txtMemAlamat.setText(alamat);
        
        String no_hp = tblMember.getValueAt(baris, 4).toString();
        txtMemTelpon.setText(no_hp);
 
    }//GEN-LAST:event_tblMemberMouseClicked

    private void btnMemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemClearActionPerformed
     clear();//Fungsi hapus isian di formulir
    }//GEN-LAST:event_btnMemClearActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
                   try {
            String sql ="delete from member where id_member='"+txtMemId.getText()+"'";//Fungsi untuk menghapus data member
            java.sql.Connection conn=(Connection)conn_service.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data dihapus !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        clear(); 
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
             new MainMenu_Admin().setVisible(true);
        this.dispose();//Menutup Form ini
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtMemAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemAlamatActionPerformed

    private void txtMemIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemIdActionPerformed

 private void load_table(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Id");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("No Telepon");
      try {
             int no=1;
            String sql = "select * from member";
            java.sql.Connection conn=(Connection)conn_service.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            tblMember.setModel(model);
        } catch (Exception e) {
        }
 }
     private void clear(){
    txtMemNama.setText(null);
    txtMemAlamat.setText(null);
    txtMemTelpon.setText(null);
    txtMemId.setText(null);
    }
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
            java.util.logging.Logger.getLogger(FrmAdminDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminDataMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminDataMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnMemClear;
    private javax.swing.JButton btnMemOk;
    private javax.swing.JButton btnMemUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMember;
    private javax.swing.JTextField txtMemAlamat;
    private javax.swing.JTextField txtMemId;
    private javax.swing.JTextField txtMemNama;
    private javax.swing.JTextField txtMemTelpon;
    // End of variables declaration//GEN-END:variables
}
