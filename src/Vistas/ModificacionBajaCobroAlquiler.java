/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Enums.Accesibilidad;
import Enums.MesCorrespondiente;
import Enums.TipoInmueble;
import Enums.Zona;
import static Vistas.Menu.Escritorio;
import accesoDatos.AlquilerData;
import accesoDatos.CobroData;
import entidades.Alquiler;
import entidades.CobroAlquiler;
import entidades.Propietario;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ModificacionBajaCobroAlquiler extends javax.swing.JInternalFrame {

    CobroData coD = new CobroData(); 
    Alquiler alq = new Alquiler();
    AlquilerData alqD = new AlquilerData();
    CobroAlquiler coA = new CobroAlquiler();
    LocalDate fCo; 
    
    public ModificacionBajaCobroAlquiler() {
        initComponents();
       /* cargarComboPropietario();
        cargarComboTipoInmueble();
        cargarComboZona();
        cargarComboAccesibilidad();*/
        
        //seteoInicial();
        //jrbAlquiler.setSelected(true);
        //inm.setAlquilerVenta("Alquiler");
        //jrbDisponible.setSelected(true);
        //inm.setDisponible(true);
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
        jcbAlquiler = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jlIdCobroAlquier = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jdcFechaCobro = new com.toedter.calendar.JDateChooser();
        jcbMesCorrespondiente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfImporte = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtfComision = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfMora = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfNumComprobante = new javax.swing.JTextField();

        setAutoscrolls(true);
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(800, 650));

        jLabel1.setFont(new java.awt.Font("Ebrima", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Modificacion De Cobro de Alquiler");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Alquiler");

        jcbAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlquilerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Fecha Cobro");

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(102, 102, 102));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(102, 102, 102));
        jbGuardar.setText("Modificar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jlIdCobroAlquier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlIdCobroAlquier.setForeground(new java.awt.Color(102, 102, 102));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("ID Cobro Alquiler");

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(102, 102, 102));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcbMesCorrespondiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesCorrespondienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Mes Correspondiente");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Importe");

        jtfImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfImporteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Comision");

        jtfComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfComisionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Mora");

        jtfMora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMoraActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Nro. Comprobante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jtfNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(91, 91, 91)
                                        .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel13)
                                        .addGap(36, 36, 36)
                                        .addComponent(jtfComision, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 49, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jcbAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jcbMesCorrespondiente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaCobro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(jtfMora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel9))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jlIdCobroAlquier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdCobroAlquier, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcFechaCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMesCorrespondiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNumComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlquilerActionPerformed
    }//GEN-LAST:event_jcbAlquilerActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        Escritorio.removeAll();
        Escritorio.repaint();
        ManejoCobroAlquileres mi = new ManejoCobroAlquileres();
        mi.setVisible(true);
        Escritorio.add(mi);
        Escritorio.moveToFront(mi);
        dispose();
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        
        if(jbGuardar.getText().equals("Modificar")){
        jbEliminar.setEnabled(false);
        jbGuardar.setText("Guardar");
        seteoModificacion();
        cargarComboAquiler();
        cargarComboMesCorrespondiente();
        
        }else{
        
        if(jcbAlquiler.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(null, "Debe Cargar un Alquiler");
        return;
        }else{
        alq = (Alquiler)jcbAlquiler.getSelectedItem();
        System.out.println(alq.toString());
        }
        
        
        
        if(jcbMesCorrespondiente.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(null, "Debe Cargar un Tipo el Mes Correspondiente a Cobrar");
        return;
        }else{
         coA.setMesCobro((MesCorrespondiente)jcbMesCorrespondiente.getSelectedItem());
        }
        
        
        try {
                fCo = jdcFechaCobro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            } catch (Exception e) {
                
               JOptionPane.showMessageDialog(null, "Debe Cargar una Fecha Correcta");
            }
       
         
         if(jtfImporte.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe Cargar el Importe del Alquiler");
        return;
        }
         try {
            Double.parseDouble(jtfImporte.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        }
         
         
         if(jtfComision.getText().equals("")){
        jtfComision.setText("0.0");
        return;
        }
         try {
            Double.parseDouble(jtfComision.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        }
         
         
        if(jtfMora.getText().equals("")){
        jtfMora.setText("0.0");
        return;
        } 
        try {
            Double.parseDouble(jtfMora.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        }
        
        
        coA.setIdCobroAlquiler(Integer.parseInt(jlIdCobroAlquier.getText()));
        coA.setAlq(alq);
        coA.setFechaCobro(jdcFechaCobro.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        coA.setMesCobro((MesCorrespondiente)jcbMesCorrespondiente.getSelectedItem());
        coA.setImporte(Double.parseDouble(jtfImporte.getText()));
        coA.setComision(Double.parseDouble(jtfComision.getText()));
        coA.setImporteMora(Double.parseDouble(jtfMora.getText()));
        coA.setNumComprobante(jtfNumComprobante.getText());
         
        
       
        coD.modificarCobroAlquiler(coA);
        
        
       System.out.println(coA.toString());
        
       dispose();
       
        Escritorio.removeAll();
        Escritorio.repaint();
        ManejoCobroAlquileres mi = new ManejoCobroAlquileres();
        mi.setVisible(true);
        Escritorio.add(mi);
        Escritorio.moveToFront(mi);
       
       
       
        
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        int seleccion;
        /*try {
          salida = JOptionPane.showInternalConfirmDialog(null, "Esta Seguro que desea Eliminar la Propieded: " + jlIdInmueble.getText(),"ALERTA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE );  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }*/
        seleccion = JOptionPane.showConfirmDialog(null, "Esta Seguro que Desea Eliminar el Cobro de Alquiler Con ID: " + jlIdCobroAlquier.getText(), "Eliminar Cobro de Alquiler", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (seleccion == 0) {
            coD.eliminarCobroAlquiler(Integer.parseInt(jlIdCobroAlquier.getText()));
            Escritorio.removeAll();
            Escritorio.repaint();
            ManejoCobroAlquileres mi = new ManejoCobroAlquileres();
            mi.setVisible(true);
            Escritorio.add(mi);
            Escritorio.moveToFront(mi);
            dispose();
        } else {
            return;
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jcbMesCorrespondienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesCorrespondienteActionPerformed

    }//GEN-LAST:event_jcbMesCorrespondienteActionPerformed

    private void jtfImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfImporteActionPerformed

    }//GEN-LAST:event_jtfImporteActionPerformed

    private void jtfComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfComisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfComisionActionPerformed

    private void jtfMoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alquiler> jcbAlquiler;
    private javax.swing.JComboBox<MesCorrespondiente> jcbMesCorrespondiente;
    private com.toedter.calendar.JDateChooser jdcFechaCobro;
    private javax.swing.JLabel jlIdCobroAlquier;
    private javax.swing.JTextField jtfComision;
    private javax.swing.JTextField jtfImporte;
    private javax.swing.JTextField jtfMora;
    private javax.swing.JTextField jtfNumComprobante;
    // End of variables declaration//GEN-END:variables


private void cargarComboAquiler() {

    jcbAlquiler.addItem(null);
        for (Alquiler alq : alqD.ListarAlquileresDisp()) {
        jcbAlquiler.addItem(alq);

        }

    }

private void cargarComboMesCorrespondiente() {

jcbMesCorrespondiente.addItem(null);
jcbMesCorrespondiente.addItem(MesCorrespondiente.ENERO);
jcbMesCorrespondiente.addItem(MesCorrespondiente.FEBRERO);
jcbMesCorrespondiente.addItem(MesCorrespondiente.MARZO);
jcbMesCorrespondiente.addItem(MesCorrespondiente.ABRIL);
jcbMesCorrespondiente.addItem(MesCorrespondiente.MAYO);
jcbMesCorrespondiente.addItem(MesCorrespondiente.JUNIO);
jcbMesCorrespondiente.addItem(MesCorrespondiente.JULIO);
jcbMesCorrespondiente.addItem(MesCorrespondiente.AGOSTO);
jcbMesCorrespondiente.addItem(MesCorrespondiente.SEPTIEMBRE);
jcbMesCorrespondiente.addItem(MesCorrespondiente.OCTUBRE);
jcbMesCorrespondiente.addItem(MesCorrespondiente.NOVIEMBRE);
jcbMesCorrespondiente.addItem(MesCorrespondiente.DICIEMBRE);

    }





private void seteoInicial(){
    
    
    jcbAlquiler.setSelectedIndex(-1);
    jdcFechaCobro.setDate(Date.valueOf(LocalDate.now()));
    jdcFechaCobro.setEnabled(false);
    jcbMesCorrespondiente.setSelectedIndex(-1);
    jtfImporte.setText("");
    jtfComision.setText("");
    jtfMora.setText("");
    jtfNumComprobante.setText("");
    
    
}

public void setTextFieldValue(CobroAlquiler in) {//Aca recibe los datos de la tabla
       jlIdCobroAlquier.setText(String.valueOf(in.getIdCobroAlquiler()));
       jlIdCobroAlquier.setEnabled(false);
       jcbAlquiler.addItem(in.getAlq());
       jcbAlquiler.setEnabled(false);
       jdcFechaCobro.setDate(Date.valueOf(in.getFechaCobro()));
       jdcFechaCobro.setEnabled(false);
       jcbMesCorrespondiente.addItem(in.getMesCobro());
       jcbMesCorrespondiente.setEnabled(false);
       jtfImporte.setText(String.valueOf(in.getImporte()));
       jtfImporte.setEnabled(false);
       jtfComision.setText(String.valueOf(in.getComision()));
       jtfComision.setEnabled(false);
       jtfMora.setText(String.valueOf(in.getImporteMora()));
       jtfMora.setEnabled(false);
       jtfNumComprobante.setText(in.getNumComprobante());
       jtfNumComprobante.setEnabled(false);
       
    }

public void seteoModificacion (){
    
     
       jcbAlquiler.setEnabled(true);
      
       jdcFechaCobro.setEnabled(true);
      
       jcbMesCorrespondiente.setEnabled(true);
      
       jtfImporte.setEnabled(true);
      
       jtfComision.setEnabled(true);
      
       jtfMora.setEnabled(true);
      
       jtfNumComprobante.setEnabled(true);
     
    
    }

    


}
