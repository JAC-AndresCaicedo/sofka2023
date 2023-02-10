

package Frames;

import javax.swing.JOptionPane;



public class Ventana extends javax.swing.JFrame {

    
    
    public Ventana() {
        
        //inicializo los componentes de la ventana y ubico la ventana en el centro
        initComponents();
        setLocationRelativeTo(null);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        textoLogin = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        botonSalir = new javax.swing.JButton();
        BotonIniciarSeccion = new javax.swing.JButton();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoLogin.setFont(new java.awt.Font("Informal Roman", 2, 60)); // NOI18N
        textoLogin.setForeground(new java.awt.Color(0, 204, 204));
        textoLogin.setText("Login");
        panel1.add(textoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, 60));

        textoUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textoUsuario.setText("Usuario:");
        panel1.add(textoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        textoContraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        textoContraseña.setText("Contraseña:");
        panel1.add(textoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, -1, -1));

        cajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuarioActionPerformed(evt);
            }
        });
        panel1.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 180, -1));
        panel1.add(cajaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 650, 150, -1));

        botonSalir.setBackground(new java.awt.Color(102, 102, 255));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        BotonIniciarSeccion.setBackground(new java.awt.Color(102, 102, 255));
        BotonIniciarSeccion.setText("Iniciar Seccion");
        BotonIniciarSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSeccionActionPerformed(evt);
            }
        });
        panel1.add(BotonIniciarSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, 270, -1));

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.jpg"))); // NOI18N
        panel1.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        
        //cierro la ventana y el programa
        System.exit(0);

        
    }//GEN-LAST:event_botonSalirActionPerformed

    //funcion que me permite abrir la ventana del menu
    public void ingresarMenu(){
        
        Menu m = new Menu();
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        
    }
    
    
    
    
    private void BotonIniciarSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSeccionActionPerformed

        //defino el usuario y la contraseña y procedo a realizar los procedimientos necesarios
        //para corroborar los datos.
        
        String usuarioCorrecto="sofka2023";
        String contrseñaCorrecta="sofka2023";
        
        if(usuarioCorrecto.equals(cajaUsuario.getText())){
            String contraseña="";
            for (int i = 0; i < cajaContraseña.getPassword().length; i++) {
                contraseña+=cajaContraseña.getPassword()[i];
            }
            if(contrseñaCorrecta.equals(contraseña)){
                //JOptionPane.showMessageDialog(null, "Ingresaste al sistema");
                ingresarMenu();
                dispose();
                
                //aqui colocar el menu.
            }
            else{
                JOptionPane.showMessageDialog(null, "Error, contraseña desconocida.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"error, usario desconocido.");
        }
      
    }//GEN-LAST:event_BotonIniciarSeccionActionPerformed

    private void cajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuarioActionPerformed
        
    }//GEN-LAST:event_cajaUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciarSeccion;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel imagenFondo;
    private java.awt.Panel panel1;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoLogin;
    private javax.swing.JLabel textoUsuario;
    // End of variables declaration//GEN-END:variables
}
