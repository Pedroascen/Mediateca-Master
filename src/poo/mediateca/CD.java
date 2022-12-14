/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.mediateca;

/**
 *
 * @author Jazmine
 */
public class CD extends javax.swing.JFrame {

    /**
     * Creates new form CD
     */
    public CD() {
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
        lblAgregarCD = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        iconCD = new javax.swing.JLabel();
        txtArtistaCD = new javax.swing.JTextField();
        lblTituloCD = new javax.swing.JLabel();
        txtTituloCD = new javax.swing.JTextField();
        lblArtistaCD = new javax.swing.JLabel();
        lblGeneroCD = new javax.swing.JLabel();
        txtGeneroCD = new javax.swing.JTextField();
        lblDuracionCD = new javax.swing.JLabel();
        txtDuracionCD = new javax.swing.JTextField();
        lblNumCanciones = new javax.swing.JLabel();
        txtNumCanciones = new javax.swing.JTextField();
        lblNumCanciones1 = new javax.swing.JLabel();
        txtNumCanciones1 = new javax.swing.JTextField();
        btnGuardarCD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(74, 49, 77));

        lblAgregarCD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblAgregarCD.setForeground(new java.awt.Color(255, 255, 255));
        lblAgregarCD.setText("Agregar nuevo CD");

        iconCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cd_50px.png"))); // NOI18N

        txtArtistaCD.setColumns(2);
        txtArtistaCD.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtArtistaCD.setBorder(null);
        txtArtistaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtistaCDActionPerformed(evt);
            }
        });

        lblTituloCD.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTituloCD.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCD.setText("T??tulo:");

        txtTituloCD.setColumns(1);
        txtTituloCD.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTituloCD.setBorder(null);
        txtTituloCD.setMargin(new java.awt.Insets(4, 2, 2, 4));
        txtTituloCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloCDActionPerformed(evt);
            }
        });

        lblArtistaCD.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblArtistaCD.setForeground(new java.awt.Color(255, 255, 255));
        lblArtistaCD.setText("Artista:");

        lblGeneroCD.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblGeneroCD.setForeground(new java.awt.Color(255, 255, 255));
        lblGeneroCD.setText("G??nero:");

        txtGeneroCD.setColumns(2);
        txtGeneroCD.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtGeneroCD.setBorder(null);
        txtGeneroCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroCDActionPerformed(evt);
            }
        });

        lblDuracionCD.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblDuracionCD.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracionCD.setText("Duraci??n:");

        txtDuracionCD.setColumns(2);
        txtDuracionCD.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDuracionCD.setBorder(null);
        txtDuracionCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionCDActionPerformed(evt);
            }
        });

        lblNumCanciones.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNumCanciones.setForeground(new java.awt.Color(255, 255, 255));
        lblNumCanciones.setText("N??mero de canciones:");

        txtNumCanciones.setColumns(2);
        txtNumCanciones.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNumCanciones.setBorder(null);
        txtNumCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCancionesActionPerformed(evt);
            }
        });
        txtNumCanciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCancionesKeyTyped(evt);
            }
        });

        lblNumCanciones1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNumCanciones1.setForeground(new java.awt.Color(255, 255, 255));
        lblNumCanciones1.setText("Unidades disponibles:");

        txtNumCanciones1.setColumns(2);
        txtNumCanciones1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNumCanciones1.setBorder(null);
        txtNumCanciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumCanciones1ActionPerformed(evt);
            }
        });
        txtNumCanciones1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCanciones1KeyTyped(evt);
            }
        });

        btnGuardarCD.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnGuardarCD.setText("Guardar");
        btnGuardarCD.setBorder(null);
        btnGuardarCD.setOpaque(false);
        btnGuardarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAgregarCD)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(iconCD)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTituloCD)
                                            .addComponent(lblArtistaCD))
                                        .addGap(14, 14, 14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblGeneroCD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtArtistaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTituloCD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGeneroCD, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDuracionCD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDuracionCD, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNumCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardarCD, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumCanciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumCanciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblAgregarCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconCD)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloCD)
                    .addComponent(txtTituloCD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArtistaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArtistaCD))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroCD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGeneroCD))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracionCD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuracionCD))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumCanciones))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumCanciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumCanciones1))
                .addGap(35, 35, 35)
                .addComponent(btnGuardarCD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtArtistaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtistaCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtistaCDActionPerformed

    private void txtTituloCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloCDActionPerformed

    private void txtGeneroCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroCDActionPerformed

    private void txtDuracionCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionCDActionPerformed

    private void txtNumCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCancionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCancionesActionPerformed

    private void txtNumCanciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumCanciones1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCanciones1ActionPerformed

    private void btnGuardarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCDActionPerformed

    private void txtNumCancionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCancionesKeyTyped
        // TODO add your handling code here:
         //Validaci??n para admitir solamente n??meros
        char c = evt.getKeyChar();
            if(Character.isAlphabetic(c)){
                evt.consume();
                }
    }//GEN-LAST:event_txtNumCancionesKeyTyped

    private void txtNumCanciones1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCanciones1KeyTyped
        // TODO add your handling code here:
         //Validaci??n para admitir solamente n??meros
        char c = evt.getKeyChar();
            if(Character.isAlphabetic(c)){
                evt.consume();
                }
    }//GEN-LAST:event_txtNumCanciones1KeyTyped

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
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCD;
    private javax.swing.JLabel iconCD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAgregarCD;
    private javax.swing.JLabel lblArtistaCD;
    private javax.swing.JLabel lblDuracionCD;
    private javax.swing.JLabel lblGeneroCD;
    private javax.swing.JLabel lblNumCanciones;
    private javax.swing.JLabel lblNumCanciones1;
    private javax.swing.JLabel lblTituloCD;
    public static javax.swing.JTextField txtArtistaCD;
    public static javax.swing.JTextField txtDuracionCD;
    public static javax.swing.JTextField txtGeneroCD;
    public static javax.swing.JTextField txtNumCanciones;
    public static javax.swing.JTextField txtNumCanciones1;
    public static javax.swing.JTextField txtTituloCD;
    // End of variables declaration//GEN-END:variables
}
