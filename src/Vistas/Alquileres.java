/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Enums.TipoAlquiler;
import Enums.TipoCliente;
import accesoDatos.AlquilerData;
import accesoDatos.ClienteData;
import accesoDatos.GaranteData;
import accesoDatos.InmuebleData;
import com.toedter.calendar.JDateChooser;
import entidades.Alquiler;
import entidades.Cliente;
import entidades.Garante;
import entidades.Inmueble;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Nicolás
 */
public class Alquileres extends javax.swing.JInternalFrame {

    AlquilerData alqData = new AlquilerData();
    Alquiler alq = new Alquiler();
    InmuebleData inmData = new InmuebleData();
    Inmueble inm = new Inmueble();
    Cliente cli = new Cliente();
    Garante gar = new Garante();

    public Alquileres() {
        initComponents();
        cargarCombo();
        llenarCliente();
        llenarInmueble();
        llenarGarante();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Iconos/61911070.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel11 = new javax.swing.JLabel();
        jCBTipoAlquiler = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCB_garante = new javax.swing.JComboBox<>();
        jCB_IDinmueble = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jCBIDcliente = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setFrameIcon(null);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha firma");

        jCBTipoAlquiler.setPreferredSize(new java.awt.Dimension(235, 26));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID Cliente");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio inicial");

        jCB_garante.setPreferredSize(new java.awt.Dimension(235, 26));

        jCB_IDinmueble.setPreferredSize(new java.awt.Dimension(235, 26));
        jCB_IDinmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_IDinmuebleActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gastos");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha inicio");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Garante");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clausula");

        jCBIDcliente.setPreferredSize(new java.awt.Dimension(235, 26));
        jCBIDcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBIDclienteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de alquiler");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Deposito");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID inmueble");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha fin");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Alquiler");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCB_IDinmueble, 0, 160, Short.MAX_VALUE)
                            .addComponent(jCBTipoAlquiler, 0, 1, Short.MAX_VALUE)
                            .addComponent(jCBIDcliente, 0, 1, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBGuardar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCB_garante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(169, 169, 169))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipoAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_IDinmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCB_garante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jButton1))
                .addGap(41, 41, 41))
        );

        jCBIDcliente.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_IDinmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_IDinmuebleActionPerformed

    }//GEN-LAST:event_jCB_IDinmuebleActionPerformed

    private void jCBIDclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBIDclienteActionPerformed


    }//GEN-LAST:event_jCBIDclienteActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        if (jCB_IDinmueble.getSelectedItem().equals("") && jCBIDcliente.getSelectedItem().equals("")
                && jDateChooser1.getDate() == null && jDateChooser2.getDate() == null && jCB_garante.getSelectedItem().equals("")
                && jTextField1.getText() == null && jTextField3.getText() == null && jTextField4.getText() == null
                && jTextField5.getText() == null && jDateChooser4.getDate() == null) {

            JOptionPane.showMessageDialog(
                    null,
                    "¡Por favor, complete todos los campos obligatorios!",
                    "Campos Incompletos",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        } else if (jDateChooser1.getDate().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo fecha inicio se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;

        } else if (jDateChooser2.getDate().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo fecha fin se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (jTextField1.getText() == null) {
            JOptionPane.showMessageDialog(null, "El campo precio inicial se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (jTextField3.getText() == null) {
            JOptionPane.showMessageDialog(null, "El campo deposito  se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (jTextField4.getText() == null) {
            JOptionPane.showMessageDialog(null, "El campo gastos se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (jTextField5.getText() == null) {
            JOptionPane.showMessageDialog(null, "El campo clausula se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (jDateChooser4.getDate() == null) {
            JOptionPane.showMessageDialog(null, "El campo fecha firma se encuentra vacio!!.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jCBTipoAlquiler.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione el tipo de alquiler.");
            return;
        }
        if (jCB_IDinmueble.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione el ID del inmueble.");
            return;
        }
        if (jCBIDcliente.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione el ID del cliente.");
            return;

        }
        if (jCB_garante.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccione el garante.");
            return;
        }
        if (!jTextField1.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un precio valido! (solo números).", "Error en precio", JOptionPane.ERROR_MESSAGE);

            return;
        }
        if (!jTextField3.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Ingrese un deposito válido! (solo números).", "Error en deposito", JOptionPane.ERROR_MESSAGE);

            return;
        }
        if (!jTextField4.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Ingrese gastos válidos! (solo números).", "Error en gastos", JOptionPane.ERROR_MESSAGE);

            return;
        }

        if (!jTextField5.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "Ingrese clausulas válidas! (solo letras y espacios).", "Error en clausula", JOptionPane.ERROR_MESSAGE);

            return;
        }

        int resp = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos ingresados?", "Atención!",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (resp == 0) {
            Inmueble inmueble = (Inmueble) jCB_IDinmueble.getSelectedItem();
            Cliente cliente = (Cliente) jCBIDcliente.getSelectedItem();
            Garante garante = (Garante) jCB_garante.getSelectedItem();
            TipoCliente tipoCli = cliente.getTipo();
            TipoAlquiler tipoAlq = (TipoAlquiler) jCBTipoAlquiler.getSelectedItem();
             LocalDate fechaIni = jDateChooser1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFin = jDateChooser2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            double precioEstimativo = 0;
            double deposito = Double.parseDouble(jTextField3.getText());
            double gastos = Double.parseDouble(jTextField4.getText());
            double gastosRecision = 0;
            double precioIni = Double.parseDouble(jTextField1.getText());
            String clausula = jTextField5.getText();
            LocalDate fechaFirma = jDateChooser4.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaRecision = LocalDate.MIN;
            boolean estado = true;
           
            alq = new Alquiler(inmueble, cliente, garante, tipoCli, tipoAlq, fechaIni, fechaFin, precioEstimativo, deposito, gastos, gastosRecision, precioIni, clausula, fechaFirma, fechaRecision, estado);
            alqData.nuevoAlquiler(alq);
            borrar();
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Cliente> jCBIDcliente;
    private javax.swing.JComboBox<TipoAlquiler> jCBTipoAlquiler;
    private javax.swing.JComboBox<Inmueble> jCB_IDinmueble;
    private javax.swing.JComboBox<Garante> jCB_garante;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    public void cargarCombo() {
        jCBTipoAlquiler.addItem(null);
        jCBTipoAlquiler.addItem(TipoAlquiler.COMERCIAL);
        jCBTipoAlquiler.addItem(TipoAlquiler.CORTO_PLAZO);
        jCBTipoAlquiler.addItem(TipoAlquiler.ESTACIONAMIENTO);
        jCBTipoAlquiler.addItem(TipoAlquiler.EVENTOS);
        jCBTipoAlquiler.addItem(TipoAlquiler.LARGO_PLAZO);
        jCBTipoAlquiler.addItem(TipoAlquiler.RESIDENCIAL);
        jCBTipoAlquiler.addItem(TipoAlquiler.VACACIONAL);

    }
     
    private void borrar(){
         jCB_IDinmueble.removeAllItems();
            jCBIDcliente.removeAllItems();
           jCB_garante.removeAllItems();
           jCBTipoAlquiler.removeAllItems();
             jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField1.setText("");
            jTextField5.setText("");
            jDateChooser4.setDate(null);
    }
    
    private void llenarCliente() {
        jCBIDcliente.addItem(null);
        ClienteData cData = new ClienteData();
        for (Cliente c : cData.listarTodosClientesActivos()) {
            jCBIDcliente.addItem(c);
        }

    }

    
    public void llenarInmueble() {
        jCB_IDinmueble.addItem(null);
        InmuebleData inmData = new InmuebleData();
        for (Inmueble i : inmData.buscarPropiedadesAlqVta("alquiler", true)) {
            jCB_IDinmueble.addItem(i);
        }
    }
    private void llenarGarante() {
        jCB_garante.addItem(null);
        GaranteData garData = new GaranteData();
        for (Garante g : garData.ListarTodosGarantes()) {
            jCB_garante.addItem(g);
        }
    }

    public Alquileres( JButton jBGuardar, JComboBox<Cliente> jCBIDcliente, JComboBox<TipoAlquiler> jCBTipoAlquiler, JComboBox<Inmueble> jCB_IDinmueble, JComboBox<Garante> jCB_garante, JDateChooser jDateChooser1, JDateChooser jDateChooser2, JDateChooser jDateChooser4, JLabel jLabel1, JLabel jLabel10, JLabel jLabel11, JLabel jLabel12, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JLabel jLabel9, JTextField jTextField1, JTextField jTextField3, JTextField jTextField4, JTextField jTextField5) {
   
        this.jBGuardar = jBGuardar;
        this.jCBIDcliente = jCBIDcliente;
        this.jCBTipoAlquiler = jCBTipoAlquiler;
        this.jCB_IDinmueble = jCB_IDinmueble;
        this.jCB_garante = jCB_garante;
        this.jDateChooser1 = jDateChooser1;
        this.jDateChooser2 = jDateChooser2;
        this.jDateChooser4 = jDateChooser4;
        this.jLabel1 = jLabel1;
        this.jLabel10 = jLabel10;
        this.jLabel11 = jLabel11;
        this.jLabel12 = jLabel12;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jLabel9 = jLabel9;
        this.jTextField1 = jTextField1;
        this.jTextField3 = jTextField3;
        this.jTextField4 = jTextField4;
        this.jTextField5 = jTextField5;
    }

}
