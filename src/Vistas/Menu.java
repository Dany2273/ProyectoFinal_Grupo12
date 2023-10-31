/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Compaq
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
//       this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        // Establece el estado extendido del JFrame para que se maximice en ambas dimensiones (pantalla completa)
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        nuevoInmueble = new javax.swing.JButton();
        nuevoAlquiler = new javax.swing.JButton();
        nuevaVenta = new javax.swing.JButton();
        nuevoPropietario = new javax.swing.JButton();
        nuevoCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Iconos/12.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        Escritorio = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Iconos/12.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        datosClientes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        datosPropietarios = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        datosVentas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        datosAlquiler = new javax.swing.JMenuItem();
        nuevoGarante = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        datosInmuebles = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        nuevoInmueble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/inmueble.png"))); // NOI18N
        nuevoInmueble.setText("Nuevo Inmueble");
        nuevoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoInmuebleActionPerformed(evt);
            }
        });

        nuevoAlquiler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevoalquiler.png"))); // NOI18N
        nuevoAlquiler.setText("Nuevo Alquiler");
        nuevoAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAlquilerActionPerformed(evt);
            }
        });

        nuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nuevaventa.png"))); // NOI18N
        nuevaVenta.setText("Nueva Venta");
        nuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentaActionPerformed(evt);
            }
        });

        nuevoPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/propietario.png"))); // NOI18N
        nuevoPropietario.setText("Nuevo Propietario");
        nuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoPropietarioActionPerformed(evt);
            }
        });

        nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Image20231011120834.png"))); // NOI18N
        nuevoCliente.setText("Nuevo Cliente");
        nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevoCliente)
                    .addComponent(nuevoPropietario)
                    .addComponent(nuevaVenta)
                    .addComponent(nuevoAlquiler)
                    .addComponent(nuevoInmueble))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(nuevoCliente)
                .addGap(18, 18, 18)
                .addComponent(nuevoPropietario)
                .addGap(18, 18, 18)
                .addComponent(nuevaVenta)
                .addGap(18, 18, 18)
                .addComponent(nuevoAlquiler)
                .addGap(18, 18, 18)
                .addComponent(nuevoInmueble)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenu3.setText("Clientes");

        datosClientes.setText("Datos Clientes");
        datosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosClientesActionPerformed(evt);
            }
        });
        jMenu3.add(datosClientes);

        jMenuBar3.add(jMenu3);

        jMenu5.setText("Propietarios");

        datosPropietarios.setText("Datos Propietarios");
        datosPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosPropietariosActionPerformed(evt);
            }
        });
        jMenu5.add(datosPropietarios);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Ventas");

        datosVentas.setText("Datos Ventas");
        datosVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosVentasActionPerformed(evt);
            }
        });
        jMenu6.add(datosVentas);

        jMenuBar3.add(jMenu6);

        jMenu7.setText("Alquileres");

        datosAlquiler.setText("Datos Alquileres");
        datosAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosAlquilerActionPerformed(evt);
            }
        });
        jMenu7.add(datosAlquiler);

        nuevoGarante.setText("Nuevo Garante");
        nuevoGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoGaranteActionPerformed(evt);
            }
        });
        jMenu7.add(nuevoGarante);

        jMenuBar3.add(jMenu7);

        jMenu8.setText("Inmuebles");

        datosInmuebles.setText("Datos Inmuebles");
        datosInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosInmueblesActionPerformed(evt);
            }
        });
        jMenu8.add(datosInmuebles);

        jMenuBar3.add(jMenu8);

        jMenu4.setText("Salir");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar3.add(jMenu4);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoInmuebleActionPerformed
        // TODO add your handling code here:
           Escritorio.removeAll();
        Escritorio.repaint();
        AltaInmueble ventas = new AltaInmueble();
        ventas.setVisible(true);
        int x = (getWidth() - ventas.getWidth()) / 3;
        int y = (getHeight() - ventas.getHeight()) / 3;
        ventas.setLocation(x, y);
        Escritorio.add(ventas);
        Escritorio.moveToFront(ventas);
        
    }//GEN-LAST:event_nuevoInmuebleActionPerformed

    private void nuevoAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAlquilerActionPerformed
        // TODO add your handling code here:
          Escritorio.removeAll();
        Escritorio.repaint();
        Alquileres ventas = new Alquileres();
        ventas.setVisible(true);
        int x = (getWidth() - ventas.getWidth()) / 3;
        int y = (getHeight() - ventas.getHeight()) / 3;
        ventas.setLocation(x, y);
        Escritorio.add(ventas);
        Escritorio.moveToFront(ventas);
    }//GEN-LAST:event_nuevoAlquilerActionPerformed

    private void nuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaVentaActionPerformed
        // TODO add your handling code here:
         Escritorio.removeAll();
        Escritorio.repaint();
        Ventas ventas = new Ventas();
        ventas.setVisible(true);
        int x = (getWidth() - ventas.getWidth()) / 3;
        int y = (getHeight() - ventas.getHeight()) / 3;
        ventas.setLocation(x, y);
        Escritorio.add(ventas);
        Escritorio.moveToFront(ventas);
    }//GEN-LAST:event_nuevaVentaActionPerformed

    private void nuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoPropietarioActionPerformed
        // TODO add your handling code here:

        Escritorio.removeAll();
        Escritorio.repaint();
        NuevoPropietario Nprop = new NuevoPropietario();
        Nprop.setVisible(true);
        int x = (getWidth() - Nprop.getWidth()) / 3;
        int y = (getHeight() - Nprop.getHeight()) / 3;
        Nprop.setLocation(x, y);
        Escritorio.add(Nprop);
        Escritorio.moveToFront(Nprop);
        //        Escritorio.removeAll();
        //        Escritorio.repaint();
        //        Propietarios prop = new Propietarios();
        //        prop.setVisible(true);
        //        int x = (getWidth() - prop.getWidth()) / 3;
        //        int y = (getHeight() - prop.getHeight()) / 3;
        //        prop.setLocation(x, y);
        //        Escritorio.add(prop);
        //        Escritorio.moveToFront(prop);
    }//GEN-LAST:event_nuevoPropietarioActionPerformed

    private void nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteActionPerformed
        // TODO add your handling code here:

        Escritorio.removeAll();
        Escritorio.repaint();
        AltaClientes cli = new AltaClientes();
        cli.setVisible(true);
        int x = (getWidth() - cli.getWidth()) / 3;
        int y = (getHeight() - cli.getHeight()) / 3;
        cli.setLocation(x, y);
        Escritorio.add(cli);
        Escritorio.moveToFront(cli);
    }//GEN-LAST:event_nuevoClienteActionPerformed

    private void datosVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosVentasActionPerformed
        // TODO add your handling code here:
       Escritorio.removeAll();
        Escritorio.repaint();
        ListaVentas cli = new ListaVentas();
        cli.setVisible(true);
        int x = (getWidth() - cli.getWidth()) / 3;
        int y = (getHeight() - cli.getHeight()) / 3;
        cli.setLocation(x, y);
        Escritorio.add(cli);
        Escritorio.moveToFront(cli);
    }//GEN-LAST:event_datosVentasActionPerformed

    private void datosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosClientesActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        DatosClientes dc = new DatosClientes();
        dc.setVisible(true);
        Escritorio.add(dc);
        Escritorio.moveToFront(dc);
    }//GEN-LAST:event_datosClientesActionPerformed

    private void datosPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosPropietariosActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        Propietarios dp = new Propietarios();
        dp.setVisible(true);
        Escritorio.add(dp);
        Escritorio.moveToFront(dp);

    }//GEN-LAST:event_datosPropietariosActionPerformed

    private void datosAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosAlquilerActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        ListarAlquileres alq = new ListarAlquileres();
        alq.setVisible(true);
        int x = (getWidth() - alq.getWidth()) / 3;
        int y = (getHeight() - alq.getHeight()) / 3;
        alq.setLocation(x, y);
        Escritorio.add(alq);
        Escritorio.moveToFront(alq);
    }//GEN-LAST:event_datosAlquilerActionPerformed

    private void datosInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosInmueblesActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        ManejoInmuebles cli = new ManejoInmuebles();
        cli.setVisible(true);
        int x = (getWidth() - cli.getWidth()) / 3;
        int y = (getHeight() - cli.getHeight()) / 3;
        cli.setLocation(x, y);
        Escritorio.add(cli);
        Escritorio.moveToFront(cli);
    }//GEN-LAST:event_datosInmueblesActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void nuevoGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoGaranteActionPerformed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        AltaGarante cli = new AltaGarante();
        cli.setVisible(true);
        int x = (getWidth() - cli.getWidth()) / 3;
        int y = (getHeight() - cli.getHeight()) / 3;
        cli.setLocation(x, y);
        Escritorio.add(cli);
        Escritorio.moveToFront(cli);
    }//GEN-LAST:event_nuevoGaranteActionPerformed

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
            FlatVuesionIJTheme.setup();
            UIManager.put("Button.arc", 999);
            UIManager.put("Component.arc", 999);
            UIManager.put("ProgressBar.arc", 999);
            UIManager.put("TextComponent.arc", 999);
            UIManager.put("Component.arrowType", "triangle");
            UIManager.put("Component.focusWidth", 1);
            UIManager.put("Component.innerFocusWidth", 1);
            UIManager.put("Button.innerFocusWidth", 1);
            UIManager.put( "TabbedPane.tabSeparatorsFullHeight", true );
            UIManager.put( "TabbedPane.selectedBackground", Color.white );
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem datosAlquiler;
    private javax.swing.JMenuItem datosClientes;
    private javax.swing.JMenuItem datosInmuebles;
    private javax.swing.JMenuItem datosPropietarios;
    private javax.swing.JMenuItem datosVentas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nuevaVenta;
    private javax.swing.JButton nuevoAlquiler;
    private javax.swing.JButton nuevoCliente;
    private javax.swing.JMenuItem nuevoGarante;
    private javax.swing.JButton nuevoInmueble;
    private javax.swing.JButton nuevoPropietario;
    // End of variables declaration//GEN-END:variables
}
