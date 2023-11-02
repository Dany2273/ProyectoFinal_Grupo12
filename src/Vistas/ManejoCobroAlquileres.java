/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import accesoDatos.AlquilerData;
import accesoDatos.CobroData;
import accesoDatos.InmuebleData;
import entidades.Alquiler;
import entidades.CobroAlquiler;
import entidades.Inmueble;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Usuario
 */
public class ManejoCobroAlquileres extends javax.swing.JInternalFrame {

    AlquilerData alqD = new AlquilerData(); 
    Alquiler al = new Alquiler();
    CobroData cDa = new CobroData();
    CobroAlquiler ca = new CobroAlquiler();
    
    public final DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private final TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
    
    public ManejoCobroAlquileres() {
        initComponents();
        cargarComboAquiler();
        seteoInicial();
        armarCabecera();
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
        jLabel3 = new javax.swing.JLabel();
        jcbAlquiler = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jdcFechaI = new com.toedter.calendar.JDateChooser();
        jdcFechaF = new com.toedter.calendar.JDateChooser();

        setAutoscrolls(true);
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1050, 850));

        jLabel1.setFont(new java.awt.Font("Ebrima", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Busqueda Inmuebles");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ID Alquiler");

        jcbAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlquilerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Superficie");

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(102, 102, 102));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Hasta");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Cobros de Alquiler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jcbAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jdcFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel15)
                                .addGap(70, 70, 70)
                                .addComponent(jdcFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlquilerActionPerformed
    }//GEN-LAST:event_jcbAlquilerActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        LocalDate fechaI, fechaF;
        
        
        modelo.setRowCount(0);
        
       
            try {
                fechaI = jdcFechaI.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } catch (Exception e) {
                
               jdcFechaI.setDate(Date.valueOf("1000-01-01"));
               fechaI = jdcFechaI.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            }
        
        try {
               fechaF =  jdcFechaF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } catch (Exception e) {
               jdcFechaF.setDate(Date.valueOf("2999-12-31"));
               fechaF =  jdcFechaF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            }
        
        
       try {
            for (CobroAlquiler cal : cDa.buscarcCobroMotor(((Alquiler)jcbAlquiler.getSelectedItem()).getIdAlquiler(), fechaI, fechaF)) {
                modelo.addRow(new Object[]{
                    cal.getIdCobroAlquiler(), cal.getAlq().getIdAlquiler(), cal.getFechaCobro(), cal.getMesCobro(), cal.getImporte(), cal.getComision(), cal.getImporteMora(), cal.getNumComprobante()
                });
                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Pudieron Cargar los Cobros de Alquileres");
        }

        seteoInicial();
        
        

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    CobroAlquiler in = new CobroAlquiler();
    CobroData inD = new CobroData();
        if (evt.getClickCount() == 2) {
            int fila = jTable1.getSelectedRow(); // Obtiene la fila seleccionada al hacer doble clic
            if (fila >= 0) {
                ModificacionBajaCobroAlquiler mbi= new ModificacionBajaCobroAlquiler(); //Creo un objeto del internalFrame
                Menu.Escritorio.add(mbi);//llamo al escritorio del menu y agrego el internal
                mbi.toFront();//con este metodo hago que el internal se muestre delante del internal que lo llama
                mbi.setVisible(true);//metodo para mostrar el internal 
                this.setVisible(false);
            }
            if (fila != -1) {
                int idCobroAlquiler = (int) jTable1.getValueAt(fila, 0); // creo una variable y e asigno el valor a transferir
                in = inD.buscarCobroIdCobro(idCobroAlquiler);
                }
                

                // Accede al JInternalFrame " ModificarCliente" y llama al método para establecer el valor en el JTextField
                ModificacionBajaCobroAlquiler cobroAlquiler = obtenerModificarFrame();//metodo que hace referncia a  ModificarCliente
                 
                if (cobroAlquiler != null) {
                   cobroAlquiler.setTextFieldValue(in);//Paso por parametros los datos que va a recibir  ModificarCliente
                }
            }
        
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alquiler> jcbAlquiler;
    private com.toedter.calendar.JDateChooser jdcFechaF;
    private com.toedter.calendar.JDateChooser jdcFechaI;
    // End of variables declaration//GEN-END:variables




private void cargarComboAquiler() {

    jcbAlquiler.addItem(null);
        for (Alquiler alq : alqD.ListarAlquileresDisp()) {
        jcbAlquiler.addItem(alq);

        }

    }






private void seteoInicial(){
    
    
    jcbAlquiler.setSelectedIndex(-1);
    
    
}


private void armarCabecera() {

        modelo.addColumn("ID Cobro");
        modelo.addColumn("ID Alquiler");
        modelo.addColumn("Fecha Cobro");
        modelo.addColumn("Mes Corresp.");
        modelo.addColumn("Importe");
        modelo.addColumn("Comision");
        modelo.addColumn("Imp. Mora");
        modelo.addColumn("Comprobante");
      
        
        jTable1.setModel(modelo);
    }

private ModificacionBajaCobroAlquiler obtenerModificarFrame() {
        JInternalFrame[] frames = getDesktopPane().getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame instanceof ModificacionBajaCobroAlquiler) {
                return (ModificacionBajaCobroAlquiler) frame;
            }
        }
        return null; // Devuelve null si no se encuentra el frame "AltaClientes"
    }

    int getSelectedRow() {
        int fila = jTable1.getSelectedRow(); //To change body of generated methods, choose Tools | Templates.
        return fila;
    }

}
