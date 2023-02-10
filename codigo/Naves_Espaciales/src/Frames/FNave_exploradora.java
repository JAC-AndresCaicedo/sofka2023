



package Frames;

//llamamos la libreria de coneccion con la base de datos
import com.mysql.jdbc.Connection;

//importamos las librerias necesarias para el frame
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import Clases.Nave_exploradora;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

//importamos los objetos que nos permiten manipular la base de datos
import java.sql.PreparedStatement;
import java.sql.ResultSet;





public class FNave_exploradora extends javax.swing.JFrame {
    
    //creamos el objeto de manipulacion de modelotabla
    private DefaultTableModel modelotabla = new DefaultTableModel();
    
    //almacenamos los datos primordiales para hacer la coneccion con la base de datos
    public static final String URL="jdbc:mysql://localhost:3309/naves_espaciales?autoReconnect=true&useSSL=false";
    public static final String usuario="root";
    public static final String contraseña="andres";
    PreparedStatement ps;
    ResultSet rs;
    
    
    
    
    public FNave_exploradora() {
        
        //defino la localizacion de la ventana y el modelo de la tabla.
        setLocationRelativeTo(null);
        agragarModeloTabla();
        
        //inicializo los componentes de la ventana y cargo los datos de la base de datos
        initComponents();
        cargarF();
    }
    
    //defino el modelo de la tabla
    private void agragarModeloTabla(){
        modelotabla.addColumn("Indentificador");
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("VelocidadMaxima");
        modelotabla.addColumn("CapacidadCarga");
        modelotabla.addColumn("SistemaDePropulsion");
        modelotabla.addColumn("tipoNave");
        modelotabla.addColumn("numeroHerramientas");
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        BEliminar = new javax.swing.JButton();
        BCargar = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        BInsertar = new javax.swing.JButton();
        BMenu = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        BBuscar = new javax.swing.JButton();
        CNombre = new javax.swing.JTextField();
        CVelocidadMaxima = new javax.swing.JTextField();
        CSistemaDePropulsion = new javax.swing.JTextField();
        CCapacidadCarga = new javax.swing.JTextField();
        CTipoNave = new javax.swing.JTextField();
        CNumeroHerramientas = new javax.swing.JTextField();
        CBuscar = new javax.swing.JTextField();
        LTitulo = new javax.swing.JLabel();
        LNombre = new javax.swing.JLabel();
        LVelosidadMaxima = new javax.swing.JLabel();
        LSistemaDePropulsion = new javax.swing.JLabel();
        LCapacidadCarga = new javax.swing.JLabel();
        LTipoNave = new javax.swing.JLabel();
        LNumeroHerramientas = new javax.swing.JLabel();
        LBuscar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TTabla = new javax.swing.JTable();
        LFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BEliminar.setBackground(new java.awt.Color(204, 102, 0));
        BEliminar.setForeground(new java.awt.Color(0, 0, 0));
        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        Panel.add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        BCargar.setBackground(new java.awt.Color(204, 102, 0));
        BCargar.setForeground(new java.awt.Color(0, 0, 0));
        BCargar.setText("Cargar");
        BCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCargarActionPerformed(evt);
            }
        });
        Panel.add(BCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 80, -1));

        BModificar.setBackground(new java.awt.Color(204, 102, 0));
        BModificar.setForeground(new java.awt.Color(0, 0, 0));
        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });
        Panel.add(BModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        BInsertar.setBackground(new java.awt.Color(204, 102, 0));
        BInsertar.setForeground(new java.awt.Color(0, 0, 0));
        BInsertar.setText("Insertar");
        BInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarActionPerformed(evt);
            }
        });
        Panel.add(BInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        BMenu.setBackground(new java.awt.Color(0, 153, 255));
        BMenu.setText("Menu");
        BMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMenuActionPerformed(evt);
            }
        });
        Panel.add(BMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, -1));

        BSalir.setBackground(new java.awt.Color(102, 0, 0));
        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        Panel.add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        BBuscar.setText("Buscar");
        BBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarActionPerformed(evt);
            }
        });
        Panel.add(BBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, -1, -1));
        Panel.add(CNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, -1));
        Panel.add(CVelocidadMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 130, -1));

        CSistemaDePropulsion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSistemaDePropulsionActionPerformed(evt);
            }
        });
        Panel.add(CSistemaDePropulsion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 130, -1));

        CCapacidadCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCapacidadCargaActionPerformed(evt);
            }
        });
        Panel.add(CCapacidadCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, -1));
        Panel.add(CTipoNave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 90, -1));
        Panel.add(CNumeroHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, -1));
        Panel.add(CBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 110, -1));

        LTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LTitulo.setForeground(new java.awt.Color(153, 0, 51));
        LTitulo.setText("Nave Exploradora");
        Panel.add(LTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        LNombre.setForeground(new java.awt.Color(255, 255, 255));
        LNombre.setText("Nombre:");
        Panel.add(LNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        LVelosidadMaxima.setForeground(new java.awt.Color(255, 255, 255));
        LVelosidadMaxima.setText("VelocidadMaxima:");
        Panel.add(LVelosidadMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        LSistemaDePropulsion.setForeground(new java.awt.Color(255, 255, 255));
        LSistemaDePropulsion.setText("SistemaDePropulsion:");
        Panel.add(LSistemaDePropulsion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        LCapacidadCarga.setForeground(new java.awt.Color(255, 255, 255));
        LCapacidadCarga.setText("CapacidadCarga:");
        Panel.add(LCapacidadCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        LTipoNave.setForeground(new java.awt.Color(255, 255, 255));
        LTipoNave.setText("TipoNave:");
        Panel.add(LTipoNave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        LNumeroHerramientas.setForeground(new java.awt.Color(255, 255, 255));
        LNumeroHerramientas.setText("NHerramientas:");
        Panel.add(LNumeroHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        LBuscar.setForeground(new java.awt.Color(255, 255, 255));
        LBuscar.setText("Escriba el nombre:");
        Panel.add(LBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        TTabla.setModel(modelotabla);
        jScrollPane1.setViewportView(TTabla);

        Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 690, 190));

        LFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoV1F.jpg"))); // NOI18N
        Panel.add(LFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCargarActionPerformed

        
        cargarF();
        refrescar();
        dispose();
       
    }//GEN-LAST:event_BCargarActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed

        
        //realizo los procedimientos necesarios para modificar una tupla en la base de datos segun el nombre.
        
        Connection conexion=null;
        
        try {
            
            conexion=getConnection();
            ps = conexion.prepareStatement("update nave_exploradora set nombre=?,velocidadMaxima=?,capacidadCarga=?,sistemaDePropulsion=?,tipoNave=?,numeroHerramientas=? where nombre=?");
           
            //ps.setInt(0,Integer.parseInt(CajaIdentificador.getText())); no se agrega ya que en mysql lo coloca automaticamente.
            ps.setString(1,CNombre.getText());
            ps.setInt(2,Integer.parseInt(CVelocidadMaxima.getText()));
            ps.setInt(3,Integer.parseInt(CCapacidadCarga.getText()));
            ps.setString(4,CSistemaDePropulsion.getText());
            ps.setString(5,CTipoNave.getText());
            ps.setInt(6,Integer.parseInt(CNumeroHerramientas.getText()));
            ps.setString(7,CNombre.getText());
           
            
            int resultado =ps.executeUpdate(); //ejecutamos la modificacion

            if(resultado > 0){
                JOptionPane.showMessageDialog(null,"Registro Modificado.");
            }
            else{
               JOptionPane.showMessageDialog(null,"Error al modificar.");  
            }
            
            conexion.close();
            
            
             
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Registro fallido.");
        }
        



        
    }//GEN-LAST:event_BModificarActionPerformed

    private void BMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMenuActionPerformed
        
        
        //llamo la ventana menu y cierro inmediatamente la ventana actual
        Menu M = new Menu();
        M.setVisible(true);
        M.setResizable(false);
        M.setLocationRelativeTo(null);

        dispose();


       
    }//GEN-LAST:event_BMenuActionPerformed

    private void CSistemaDePropulsionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSistemaDePropulsionActionPerformed
        
    }//GEN-LAST:event_CSistemaDePropulsionActionPerformed

    private void CCapacidadCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCapacidadCargaActionPerformed
        
    }//GEN-LAST:event_CCapacidadCargaActionPerformed

    private void BInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarActionPerformed

        
        //realizo los procedimientos necesarios para insertar una nueva tupla en la base de datos
        verificacionDeDatos();
        Connection conexion=null;
        
        try {
            
            conexion=getConnection();
            ps = conexion.prepareStatement("insert into nave_exploradora (nombre,velocidadMaxima,capacidadCarga,sistemaDePropulsion,tipoNave,numeroHerramientas) values(?,?,?,?,?,?)");
            JOptionPane.showMessageDialog(null,"Registro en camino 2.");
            //ps.setInt(0,Integer.parseInt(CajaIdentificador.getText())); no se agrega ya que en mysql lo coloca automaticamente.
            ps.setString(1,CNombre.getText());
            ps.setInt(2,Integer.parseInt(CVelocidadMaxima.getText()));
            ps.setInt(3,Integer.parseInt(CCapacidadCarga.getText()));
            ps.setString(4,CSistemaDePropulsion.getText());
            ps.setString(5,CTipoNave.getText());
            ps.setInt(6,Integer.parseInt(CNumeroHerramientas.getText()));
                 
            
            int resultado =ps.executeUpdate(); //ejecutamos la insercion dentro de la base de datos

            if(resultado > 0){
                JOptionPane.showMessageDialog(null,"Registro Insertado.");
                limpiarCajas();
                TTabla.updateUI();
            }
            else{
               JOptionPane.showMessageDialog(null,"Error al ingresar registro");  
            }
            
            conexion.close();
            
             
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Registro fallido.");
        }
 
    }//GEN-LAST:event_BInsertarActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed

        //cierra el programa directamente
        dispose();
        
    }//GEN-LAST:event_BSalirActionPerformed

    private void BBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarActionPerformed

        //realiza la busqueda de una tubla dentro de la base de datos por el nombre,
        //carga la primera ocurrencia en las cajas de cada atributo.
        
        Connection conexion = null;
        try {
            
            conexion=getConnection();
            ps=conexion.prepareStatement("select * from nave_exploradora where nombre=?");
            ps.setString(1,CBuscar.getText());
            rs= ps.executeQuery();
            
            if(rs.next()){
                //CajaIdentificador.setText(String.valueOf(rs.getString("Identificador")));
                CNombre.setText(rs.getString("nombre"));
                CVelocidadMaxima.setText(String.valueOf(rs.getString("velocidadMaxima")));
                CCapacidadCarga.setText(String.valueOf(rs.getString("capacidadCarga")));
                CSistemaDePropulsion.setText(rs.getString("sistemaDePropulsion"));
                CTipoNave.setText(rs.getString("tipoNave"));
                CNumeroHerramientas.setText(String.valueOf(rs.getString("numeroHerramientas")));
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe una nave con ese nombre.");
            }
            
            conexion.close();
            
        } catch (Exception e) {
            System.err.println("error, "+e);
        }

    }//GEN-LAST:event_BBuscarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed

        //busca una tupla en la base de datos por el nombre y elimina la primera courrencia
        //de la base de datos.
        Connection conexion=null;
        
        try {
            
            conexion=getConnection();
            ps = conexion.prepareStatement("delete from nave_exploradora where nombre=?");
            ps.setString(1,CNombre.getText());
            
            int resultado =ps.executeUpdate(); //ejecutamos y eliminamos

            if(resultado > 0){
                JOptionPane.showMessageDialog(null,"Registro Eliminado.");
                limpiarCajas();
            }
            else{
               JOptionPane.showMessageDialog(null,"Error al Eliminar.");  
            }
            
            conexion.close();
            
            
        } catch (Exception e) {
        }


    }//GEN-LAST:event_BEliminarActionPerformed
    
    //elimina los valores escritos en las cajas de entrada.
    public void limpiarCajas(){
        CBuscar.setText(null);
        CNombre.setText(null);
        CVelocidadMaxima.setText(null);
        CCapacidadCarga.setText(null);
        CSistemaDePropulsion.setText(null);
        CTipoNave.setText(null);
        CNumeroHerramientas.setText(null);
    
    }
     
    
    //fucion que permite traer los datos de la base de datos y mostrarlos en 
    //la tabla de la ventana.
    private void cargarF(){
        
        
        ps = null;
        rs = null;
        
        try {
            
            Connection conexion = getConnection();
            
            ps = conexion.prepareStatement("select * from nave_exploradora");
            rs = ps.executeQuery();
             
            while(rs.next()){
                
                Object Fila []= new Object[7];
                
                for (int i = 0; i < 7; i++) {
                    
                    Fila[i]=rs.getObject(i+1);
                    
                }      
                modelotabla.addRow(Fila);
                
            }
            
        } catch (Exception e) {
            System.err.println("Error, "+ e);
        }
     }
    
    //actualiza los datos de la ventana recargando dicha ventana.
    public void refrescar(){
        FNave_exploradora M = new FNave_exploradora();
        M.setVisible(true);
        M.setResizable(false);
        M.setLocationRelativeTo(null);
     }
    
    //utilizando la clase propia del frame, verificamos los datos de entrada utilizando el objeto de la clase. 
    public void verificacionDeDatos(){
        
        try {
           
            Nave_exploradora CL= new Nave_exploradora( CNombre.getText(),Integer.parseInt(CVelocidadMaxima.getText()),Integer.parseInt(CCapacidadCarga.getText()), 
                    CSistemaDePropulsion.getText(),CTipoNave.getText(),Integer.parseInt(CNumeroHerramientas.getText()));
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, verifique que todos los datos ingresados sean correctos");
            
        }
       
    }
     
    //Es la funcion mas importante, ya que con esta funcion conectamos la aplicacion java con la base de datos MySQL.
    public Connection getConnection(){
        Connection Conexion=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Conexion=(Connection)DriverManager.getConnection(URL,usuario,contraseña);
            //JOptionPane.showMessageDialog(null, "conexion exitosa");
            
            
        } catch (Exception e) {
            System.err.println("Error, "+e);
        }
        
        return Conexion;
    }
     
     
    
    
    
    
   //Ejecutamos la ventana en general
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
            java.util.logging.Logger.getLogger(FNave_exploradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FNave_exploradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FNave_exploradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FNave_exploradora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FNave_exploradora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BCargar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BInsertar;
    private javax.swing.JButton BMenu;
    private javax.swing.JButton BModificar;
    private javax.swing.JButton BSalir;
    private javax.swing.JTextField CBuscar;
    private javax.swing.JTextField CCapacidadCarga;
    private javax.swing.JTextField CNombre;
    private javax.swing.JTextField CNumeroHerramientas;
    private javax.swing.JTextField CSistemaDePropulsion;
    private javax.swing.JTextField CTipoNave;
    private javax.swing.JTextField CVelocidadMaxima;
    private javax.swing.JLabel LBuscar;
    private javax.swing.JLabel LCapacidadCarga;
    private javax.swing.JLabel LFondo;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LNumeroHerramientas;
    private javax.swing.JLabel LSistemaDePropulsion;
    private javax.swing.JLabel LTipoNave;
    private javax.swing.JLabel LTitulo;
    private javax.swing.JLabel LVelosidadMaxima;
    private javax.swing.JPanel Panel;
    private javax.swing.JTable TTabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
