/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Enums.Accesibilidad;
import Enums.TipoInmueble;
import Enums.Zona;
import accesoDatos.InmuebleData;
import accesoDatos.PropietarioData;
import entidades.Inmueble;
import entidades.Propietario;
import javax.swing.JOptionPane;


public class AltaInmueble extends javax.swing.JInternalFrame {

    InmuebleData iDa = new InmuebleData(); 
    Inmueble inm = new Inmueble();
    PropietarioData pDa = new PropietarioData();
    Propietario prop = new Propietario();
    
    public AltaInmueble() {
        initComponents();
        cargarComboPropietario();
        cargarComboTipoInmueble();
        cargarComboZona();
        cargarComboAccesibilidad();
        seteoInicial();
        jrbAlquiler.setSelected(true);
        inm.setAlquilerVenta("Alquiler");
        jrbDisponible.setSelected(true);
        inm.setDisponible(true);
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
        jcbPropietario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbTipoInmueble = new javax.swing.JComboBox<>();
        jrbAlquiler = new javax.swing.JRadioButton();
        jrbVenta = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtfDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbZona = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtfSuperficie = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfAmbientes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfDormitorios = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfBaños = new javax.swing.JTextField();
        jrbPatio = new javax.swing.JRadioButton();
        jrbCochera = new javax.swing.JRadioButton();
        jrbQuincho = new javax.swing.JRadioButton();
        jrbPileta = new javax.swing.JRadioButton();
        jrbMascotas = new javax.swing.JRadioButton();
        jrbNiños = new javax.swing.JRadioButton();
        jrbDisponible = new javax.swing.JRadioButton();
        jbSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescripcion = new javax.swing.JTextArea();
        jbGuardar = new javax.swing.JButton();
        jcbAccesibilidad = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();

        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(750, 650));

        jLabel1.setFont(new java.awt.Font("Ebrima", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Alta Inmueble");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Propietario");

        jcbPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPropietarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Tipo de Propiedad");

        jcbTipoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoInmuebleActionPerformed(evt);
            }
        });

        jrbAlquiler.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbAlquiler.setForeground(new java.awt.Color(102, 102, 102));
        jrbAlquiler.setText("Alquiler");
        jrbAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAlquilerActionPerformed(evt);
            }
        });

        jrbVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbVenta.setForeground(new java.awt.Color(102, 102, 102));
        jrbVenta.setText("Venta");
        jrbVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbVentaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Direccion:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Zona");

        jcbZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbZonaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Superficie");

        jtfSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSuperficieActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Accesibilidad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Ambientes");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Dormitorios");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Baños");

        jrbPatio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbPatio.setForeground(new java.awt.Color(102, 102, 102));
        jrbPatio.setText("Patio");

        jrbCochera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbCochera.setForeground(new java.awt.Color(102, 102, 102));
        jrbCochera.setText("Cochera");

        jrbQuincho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbQuincho.setForeground(new java.awt.Color(102, 102, 102));
        jrbQuincho.setText("Quincho");

        jrbPileta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbPileta.setForeground(new java.awt.Color(102, 102, 102));
        jrbPileta.setText("Pileta");

        jrbMascotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbMascotas.setForeground(new java.awt.Color(102, 102, 102));
        jrbMascotas.setText("Mascotas");

        jrbNiños.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbNiños.setForeground(new java.awt.Color(102, 102, 102));
        jrbNiños.setText("Niños");

        jrbDisponible.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbDisponible.setForeground(new java.awt.Color(102, 102, 102));
        jrbDisponible.setText("Disponible");
        jrbDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDisponibleActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(102, 102, 102));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Descripcion");

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtaDescripcion);

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(102, 102, 102));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jcbAccesibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAccesibilidadActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Precio");

        jtfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jcbPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jrbAlquiler)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jrbVenta)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfSuperficie)
                                    .addGap(55, 55, 55)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(570, 570, 570))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcbAccesibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jcbTipoInmueble, 0, 220, Short.MAX_VALUE)
                                                .addComponent(jcbZona, 0, 220, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfBaños, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jrbPatio)
                .addGap(30, 30, 30)
                .addComponent(jrbCochera)
                .addGap(30, 30, 30)
                .addComponent(jrbQuincho)
                .addGap(30, 30, 30)
                .addComponent(jrbPileta)
                .addGap(30, 30, 30)
                .addComponent(jrbMascotas)
                .addGap(30, 30, 30)
                .addComponent(jrbNiños)
                .addGap(30, 30, 30)
                .addComponent(jrbDisponible)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbAlquiler)
                    .addComponent(jrbVenta)
                    .addComponent(jcbAccesibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDormitorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfBaños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbPatio)
                    .addComponent(jrbCochera)
                    .addComponent(jrbQuincho)
                    .addComponent(jrbPileta)
                    .addComponent(jrbMascotas)
                    .addComponent(jrbNiños)
                    .addComponent(jrbDisponible))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPropietarioActionPerformed
    }//GEN-LAST:event_jcbPropietarioActionPerformed

    private void jcbTipoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoInmuebleActionPerformed
    }//GEN-LAST:event_jcbTipoInmuebleActionPerformed

    private void jrbVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbVentaActionPerformed
     if(jrbVenta.isSelected()){
         inm.setAlquilerVenta("Venta");
         jrbAlquiler.setSelected(false);
     }else{
         inm.setAlquilerVenta("Alquiler");
         jrbAlquiler.setSelected(true);
     }
        System.out.println(inm.getAlquilerVenta());
    }//GEN-LAST:event_jrbVentaActionPerformed

    private void jrbAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAlquilerActionPerformed
     if(jrbAlquiler.isSelected()){
         inm.setAlquilerVenta("Alquiler");
         jrbVenta.setSelected(false);
     
     }else{
         inm.setAlquilerVenta("Venta");
         jrbVenta.setSelected(true);
     
     }
     System.out.println(inm.getAlquilerVenta());
    }//GEN-LAST:event_jrbAlquilerActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        if(jcbPropietario.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(null, "Debe Cargar un Propietario");
        return;
        }else{
        prop = (Propietario)jcbPropietario.getSelectedItem();
        System.out.println(prop.toString());
        }
        
        
        
        if(jcbTipoInmueble.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(null, "Debe Cargar un Tipo de Inmueble");
        return;
        }else{
         inm.setTipo((TipoInmueble)jcbTipoInmueble.getSelectedItem());
        }
        
        if(jtfDireccion.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe Cargar una Direccion");
        return;
        }
        
        if(jcbZona.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(null, "Debe Cargar una Zona");
        return;
        }else{
         inm.setZona((Zona)jcbZona.getSelectedItem());
        }
        
        if(jtfSuperficie.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe Cargar una Superficie");
        return;
        }
         try {
            Integer.parseInt(jtfSuperficie.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        }
        
        if(jcbAccesibilidad.getSelectedIndex() == -1){
        JOptionPane.showMessageDialog(null, "Debe Cargar un Tipo de Accesibilidad");
        return;
        }else{
         inm.setAccesibilidad((Accesibilidad)jcbAccesibilidad.getSelectedItem());
        } 
        
        if(jtfAmbientes.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe Cargar la Cantidad de Ambientes");
        return;
        }
         try {
            Integer.parseInt(jtfAmbientes.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        } 
        
         if(jtfDormitorios.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe Cargar la Cantidad de Dormitorios");
        return;
        }
         try {
            Integer.parseInt(jtfDormitorios.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        }
        
        if(jtfBaños.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe Cargar la Cantidad de Baños");
        return;
        }
         try {
            Integer.parseInt(jtfBaños.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        }
         
         if(jtfPrecio.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe Cargar el Precio de la Propiedad");
        return;
        }
         try {
            Double.parseDouble(jtfPrecio.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Numero Valido");
            return;
        }
         
        inm.setProp(prop);
        inm.setDireccion(jtfDireccion.getText());
        inm.setDescripcion(jtaDescripcion.getText());
        inm.setSuperficie(Integer.parseInt(jtfSuperficie.getText()));
        inm.setPrecioTasado(Double.parseDouble(jtfPrecio.getText()));
        inm.setAmbientes(Integer.parseInt(jtfAmbientes.getText()));
        inm.setDormitorios(Integer.parseInt(jtfDormitorios.getText()));
        inm.setBaños(Integer.parseInt(jtfBaños.getText()));
        inm.setPatio(jrbPatio.isSelected());
        inm.setCochera(jrbCochera.isSelected());
        inm.setQuincho(jrbQuincho.isSelected());
        inm.setPileta(jrbPileta.isSelected());
        inm.setMascotas(jrbMascotas.isSelected());
        inm.setNiños(jrbNiños.isSelected());
        inm.setDisponible(jrbDisponible.isSelected());
        try {
        iDa.agregarInmueble(inm);    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Pudo Cargar la Propiedad");
        }
        
       seteoInicial();

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbZonaActionPerformed
    }//GEN-LAST:event_jcbZonaActionPerformed

    private void jtfSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSuperficieActionPerformed

    }//GEN-LAST:event_jtfSuperficieActionPerformed

    private void jcbAccesibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAccesibilidadActionPerformed
    }//GEN-LAST:event_jcbAccesibilidadActionPerformed

    private void jrbDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDisponibleActionPerformed
       if(jrbDisponible.isSelected() == false){
           inm.setDisponible(false);
       }else{
           inm.setDisponible(true);
       }
        System.out.println(inm.isDisponible());
    }//GEN-LAST:event_jrbDisponibleActionPerformed

    private void jtfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Accesibilidad> jcbAccesibilidad;
    private javax.swing.JComboBox<Propietario> jcbPropietario;
    private javax.swing.JComboBox<TipoInmueble> jcbTipoInmueble;
    private javax.swing.JComboBox<Zona> jcbZona;
    private javax.swing.JRadioButton jrbAlquiler;
    private javax.swing.JRadioButton jrbCochera;
    private javax.swing.JRadioButton jrbDisponible;
    private javax.swing.JRadioButton jrbMascotas;
    private javax.swing.JRadioButton jrbNiños;
    private javax.swing.JRadioButton jrbPatio;
    private javax.swing.JRadioButton jrbPileta;
    private javax.swing.JRadioButton jrbQuincho;
    private javax.swing.JRadioButton jrbVenta;
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField jtfAmbientes;
    private javax.swing.JTextField jtfBaños;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDormitorios;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfSuperficie;
    // End of variables declaration//GEN-END:variables


private void cargarComboPropietario() {

    jcbPropietario.addItem(null);
        for (Propietario prop : pDa.listarProTodos()) {
        jcbPropietario.addItem(prop);

        }

    }

private void cargarComboTipoInmueble() {

    jcbTipoInmueble.addItem(null);
    jcbTipoInmueble.addItem(TipoInmueble.CASA);
    jcbTipoInmueble.addItem(TipoInmueble.DEPARTAMENTO);
    jcbTipoInmueble.addItem(TipoInmueble.DUPLEX);
    jcbTipoInmueble.addItem(TipoInmueble.GALPON);
    jcbTipoInmueble.addItem(TipoInmueble.LOCAL);
    jcbTipoInmueble.addItem(TipoInmueble.LOTE);
    jcbTipoInmueble.addItem(TipoInmueble.MONOAMBIENTE);
    jcbTipoInmueble.addItem(TipoInmueble.OFICINA);
    jcbTipoInmueble.addItem(TipoInmueble.QUINTA);
    jcbTipoInmueble.addItem(TipoInmueble.TERRENO);

    }


private void cargarComboZona() {
jcbZona.addItem(null);
jcbZona.addItem(Zona.RESIDENCIAL);
jcbZona.addItem(Zona.COMERCIAL);
jcbZona.addItem(Zona.INDUSTRIAL);
jcbZona.addItem(Zona.TURISTICA);
jcbZona.addItem(Zona.DE_RECREACION);
jcbZona.addItem(Zona.EDUCATIVA);
jcbZona.addItem(Zona.HISTÓRICA);
jcbZona.addItem(Zona.RURAL);


}

private void cargarComboAccesibilidad(){
jcbAccesibilidad.addItem(null);
jcbAccesibilidad.addItem(Accesibilidad.ESTANDAR);
jcbAccesibilidad.addItem(Accesibilidad.ESCALERAS);
jcbAccesibilidad.addItem(Accesibilidad.RAMPA_ACCESO);
jcbAccesibilidad.addItem(Accesibilidad.ASENSOR);

}

private void seteoInicial(){
    
    jcbAccesibilidad.setSelectedIndex(-1);
    jcbPropietario.setSelectedIndex(-1);
    jcbTipoInmueble.setSelectedIndex(-1);
    jcbZona.setSelectedIndex(-1);
    jrbAlquiler.setSelected(true);
    jrbVenta.setSelected(false);
    jrbCochera.setSelected(false);
    jrbDisponible.setSelected(true);
    jrbMascotas.setSelected(false);
    jrbNiños.setSelected(false);
    jrbPatio.setSelected(false);
    jrbPileta.setSelected(false);
    jrbQuincho.setSelected(false);
    
    jtaDescripcion.setText("");
    jtfAmbientes.setText("");
    jtfBaños.setText("");
    jtfDireccion.setText("");
    jtfDormitorios.setText("");
    jtfPrecio.setText("");
    jtfSuperficie.setText("");

}

}