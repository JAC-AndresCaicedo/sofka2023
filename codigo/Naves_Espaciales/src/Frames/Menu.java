
package Frames;


public class Menu extends javax.swing.JFrame {

   
    public Menu() {
        
        //inicializo los componentes de la ventana y defino la transparencia de los botones
        initComponents();
        TransparenciaBotones();
        
    }
    
    //funcion que me permite volver transparentes los botones.
    private void TransparenciaBotones(){
        BNave_robotica.setOpaque(false);
        BNave_robotica.setContentAreaFilled(false);
        BNave_robotica.setBorderPainted(false);
        BNave_exploradora.setOpaque(false);
        BNave_exploradora.setContentAreaFilled(false);
        BNave_exploradora.setBorderPainted(false);
        BNave_tripulada.setOpaque(false);
        BNave_tripulada.setContentAreaFilled(false);
        BNave_tripulada.setBorderPainted(false);
        BVehiculo_lancera.setOpaque(false);
        BVehiculo_lancera.setContentAreaFilled(false);
        BVehiculo_lancera.setBorderPainted(false);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        BVehiculo_lancera = new javax.swing.JButton();
        BNave_robotica = new javax.swing.JButton();
        BNave_tripulada = new javax.swing.JButton();
        BNave_exploradora = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        LNave_Tripulada = new javax.swing.JLabel();
        LNave_Exploradora = new javax.swing.JLabel();
        LVehiculo_lancera = new javax.swing.JLabel();
        LNave_robotica = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(770, 481));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(0, 204, 255));
        titulo.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 255, 255));
        titulo.setText("Menu");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        BVehiculo_lancera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MNlanceraFF.png"))); // NOI18N
        BVehiculo_lancera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVehiculo_lanceraActionPerformed(evt);
            }
        });
        jPanel1.add(BVehiculo_lancera, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 180, 140));

        BNave_robotica.setForeground(new java.awt.Color(204, 0, 0));
        BNave_robotica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MNroboticaF.png"))); // NOI18N
        BNave_robotica.setBorder(null);
        BNave_robotica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNave_roboticaActionPerformed(evt);
            }
        });
        jPanel1.add(BNave_robotica, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 180, 140));

        BNave_tripulada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MNTRIPULADAF.png"))); // NOI18N
        BNave_tripulada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNave_tripuladaActionPerformed(evt);
            }
        });
        jPanel1.add(BNave_tripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 180, 140));

        BNave_exploradora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MNExploradoraF.png"))); // NOI18N
        BNave_exploradora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNave_exploradoraActionPerformed(evt);
            }
        });
        jPanel1.add(BNave_exploradora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 180, 140));

        BSalir.setBackground(new java.awt.Color(102, 0, 0));
        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        LNave_Tripulada.setFont(new java.awt.Font("Malgun Gothic Semilight", 2, 18)); // NOI18N
        LNave_Tripulada.setForeground(new java.awt.Color(51, 255, 204));
        LNave_Tripulada.setText("Nave Tripulada");
        jPanel1.add(LNave_Tripulada, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, -1));

        LNave_Exploradora.setFont(new java.awt.Font("Malgun Gothic Semilight", 2, 18)); // NOI18N
        LNave_Exploradora.setForeground(new java.awt.Color(51, 255, 204));
        LNave_Exploradora.setText("Nave Exploradora");
        jPanel1.add(LNave_Exploradora, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        LVehiculo_lancera.setFont(new java.awt.Font("Malgun Gothic Semilight", 2, 18)); // NOI18N
        LVehiculo_lancera.setForeground(new java.awt.Color(0, 0, 0));
        LVehiculo_lancera.setText("Vehiculo Lancera");
        jPanel1.add(LVehiculo_lancera, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        LNave_robotica.setFont(new java.awt.Font("Malgun Gothic Semilight", 2, 18)); // NOI18N
        LNave_robotica.setForeground(new java.awt.Color(51, 255, 204));
        LNave_robotica.setText("Nave Robotica");
        jPanel1.add(LNave_robotica, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2F.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 770, 481));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 481));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVehiculo_lanceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVehiculo_lanceraActionPerformed
   
        //llamo la ventana de la nave lancera y cierro inmediatamente la ventana actual
        Fnave_lancera M = new Fnave_lancera();
        M.setVisible(true);
        M.setResizable(false);
        M.setLocationRelativeTo(null);

        dispose();
        

    }//GEN-LAST:event_BVehiculo_lanceraActionPerformed

    private void BNave_roboticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNave_roboticaActionPerformed

        //llamo la ventana de la nave robotica y cierro inmediatamente la ventana actual
        FNave_robotica M = new FNave_robotica();
        M.setVisible(true);
        M.setResizable(false);
        M.setLocationRelativeTo(null);

        dispose();



        
    }//GEN-LAST:event_BNave_roboticaActionPerformed

    private void BNave_tripuladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNave_tripuladaActionPerformed
     
        //llamo la ventana de la nave tripulada y cierro inmediatamente la ventana actual
        Fnave_tripulada M = new Fnave_tripulada();
        M.setVisible(true);
        M.setResizable(false);
        M.setLocationRelativeTo(null);

        dispose();
        


    }//GEN-LAST:event_BNave_tripuladaActionPerformed

    private void BNave_exploradoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNave_exploradoraActionPerformed
    
        //llamo la ventana de la nave exploradora y cierro inmediatamente la ventana actual
        FNave_exploradora M = new FNave_exploradora();
        M.setVisible(true);
        M.setResizable(false);
        M.setLocationRelativeTo(null);

        dispose();

        
        
    }//GEN-LAST:event_BNave_exploradoraActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed

        //cierro el programa 
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_BSalirActionPerformed

    
    //ejecuto la ventana en general
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNave_exploradora;
    private javax.swing.JButton BNave_robotica;
    private javax.swing.JButton BNave_tripulada;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BVehiculo_lancera;
    private javax.swing.JLabel LNave_Exploradora;
    private javax.swing.JLabel LNave_Tripulada;
    private javax.swing.JLabel LNave_robotica;
    private javax.swing.JLabel LVehiculo_lancera;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
