/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Enums.TipoCliente;
import static Vistas.Menu.Escritorio;
import accesoDatos.PropietarioData;
import entidades.Propietario;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Miki
 */
public class NuevoPropietario extends javax.swing.JInternalFrame {
    Propietario pro = new Propietario();
    PropietarioData pData = new PropietarioData();

    /**
     * Creates new form NuevoPropietario
     */
    public NuevoPropietario() {
        initComponents();
        jT_Cc.setEnabled(false);
        jT_Ciudad.setEnabled(false);
        jT_CodPo.setEnabled(false);
        jT_Dni.setEnabled(false);
        jT_Dom.setEnabled(false);
        jT_Lugar.setEnabled(false);
        jT_Mail.setEnabled(false);
        jT_Nombre.setEnabled(false);
        jT_Tel.setEnabled(false);
        jR_Fisi.setSelected(false);
        jR_Juri.setSelected(false);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
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
        jLabel1 = new javax.swing.JLabel();
        jL_Nombre = new javax.swing.JLabel();
        jT_Nombre = new javax.swing.JTextField();
        jL_Dni = new javax.swing.JLabel();
        jT_Dni = new javax.swing.JTextField();
        jL_Cc = new javax.swing.JLabel();
        jT_Cc = new javax.swing.JTextField();
        jL_Lugar = new javax.swing.JLabel();
        jT_Lugar = new javax.swing.JTextField();
        jL_Domi = new javax.swing.JLabel();
        jT_Dom = new javax.swing.JTextField();
        jL_Ciudad = new javax.swing.JLabel();
        jT_Ciudad = new javax.swing.JTextField();
        jL_CodPo = new javax.swing.JLabel();
        jT_CodPo = new javax.swing.JTextField();
        jL_Tel = new javax.swing.JLabel();
        jT_Tel = new javax.swing.JTextField();
        jL_Mail = new javax.swing.JLabel();
        jT_Mail = new javax.swing.JTextField();
        jB_Guardar = new javax.swing.JButton();
        jR_Juri = new javax.swing.JRadioButton();
        jR_Fisi = new javax.swing.JRadioButton();
        jB_Salir = new javax.swing.JButton();

        setClosable(true);
        setFrameIcon(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Propietario");

        jL_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jL_Nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jL_Nombre.setText("Nombre/R.Social:");

        jT_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NombreActionPerformed(evt);
            }
        });

        jL_Dni.setBackground(new java.awt.Color(255, 255, 255));
        jL_Dni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Dni.setForeground(new java.awt.Color(255, 255, 255));
        jL_Dni.setText("DNI:");

        jL_Cc.setBackground(new java.awt.Color(255, 255, 255));
        jL_Cc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Cc.setForeground(new java.awt.Color(255, 255, 255));
        jL_Cc.setText("CUIL/CUIT:");

        jL_Lugar.setBackground(new java.awt.Color(255, 255, 255));
        jL_Lugar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Lugar.setForeground(new java.awt.Color(255, 255, 255));
        jL_Lugar.setText("Trabajo:");

        jL_Domi.setBackground(new java.awt.Color(255, 255, 255));
        jL_Domi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Domi.setForeground(new java.awt.Color(255, 255, 255));
        jL_Domi.setText("Domicilio:");

        jL_Ciudad.setBackground(new java.awt.Color(255, 255, 255));
        jL_Ciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        jL_Ciudad.setText("Ciudad:");

        jL_CodPo.setBackground(new java.awt.Color(255, 255, 255));
        jL_CodPo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_CodPo.setForeground(new java.awt.Color(255, 255, 255));
        jL_CodPo.setText("Cod.Postal:");

        jL_Tel.setBackground(new java.awt.Color(255, 255, 255));
        jL_Tel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Tel.setForeground(new java.awt.Color(255, 255, 255));
        jL_Tel.setText("Telefono:");

        jL_Mail.setBackground(new java.awt.Color(255, 255, 255));
        jL_Mail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jL_Mail.setForeground(new java.awt.Color(255, 255, 255));
        jL_Mail.setText("Mail:");

        jB_Guardar.setText("Guardar");
        jB_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarActionPerformed(evt);
            }
        });

        jR_Juri.setForeground(new java.awt.Color(255, 255, 255));
        jR_Juri.setText("Juridica");
        jR_Juri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_JuriActionPerformed(evt);
            }
        });

        jR_Fisi.setForeground(new java.awt.Color(255, 255, 255));
        jR_Fisi.setText("Fisica");
        jR_Fisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_FisiActionPerformed(evt);
            }
        });

        jB_Salir.setText("Salir");
        jB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jR_Juri)
                    .addComponent(jL_Dni)
                    .addComponent(jL_Nombre)
                    .addComponent(jL_Cc)
                    .addComponent(jL_Lugar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jT_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Cc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jR_Fisi)
                                .addGap(50, 50, 50)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jL_Domi)
                                .addGap(41, 41, 41)
                                .addComponent(jT_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jL_Ciudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jT_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jL_CodPo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jT_CodPo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jL_Tel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jT_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jL_Mail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jT_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_Salir)
                        .addGap(147, 147, 147)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jR_Fisi)
                        .addComponent(jR_Juri))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jT_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_Domi)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Nombre)
                    .addComponent(jT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Ciudad)
                    .addComponent(jT_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Dni)
                    .addComponent(jT_CodPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_CodPo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Cc)
                    .addComponent(jT_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Tel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Lugar)
                    .addComponent(jL_Mail)
                    .addComponent(jT_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Salir)
                    .addComponent(jB_Guardar))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NombreActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jT_NombreActionPerformed

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
        // TODO add your handling code here:
        Long cu;
        Propietarios mpropp = new Propietarios();
        
        int contador = 0;//el contador lo uso para mostrar el mensaje de "no se ha seleccionado un tipo de persona" 1 sola vez, despues no lo muestra pero se ppnen los jr en setenable false

        try {
            if (jR_Juri.isSelected()) {
                if ((jT_Cc.getText().equals("")) || (jT_Ciudad.getText().equals("")) || (jT_CodPo.getText().equals("")) || (jT_Dom.getText().equals("")) || (jT_Lugar.getText().equals("")) || (jT_Mail.getText().equals("")) || (jT_Nombre.getText().equals("")) || (jT_Tel.getText().equals(""))) {
                    JOptionPane.showMessageDialog(this, "Hay campos vacios");
                } else {
                    if (jT_Cc.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Ingrese el Cuil/Cuit");
                        jL_Cc.setForeground(Color.RED);
                    } else {
                        if (!jT_Cc.getText().matches("[0-9]+")) {
                            JOptionPane.showMessageDialog(this, "Ingrese solo numeros para Cuil/Cuit");
                            jL_Cc.setForeground(Color.RED);
                            jT_Cc.setText("");
                        } else {

                            pro.setCuilCuit(Long.parseLong(jT_Cc.getText()));//parseo

                            cu = Long.parseLong(jT_Cc.getText());
                            jL_Cc.setForeground(Color.getHSBColor(187, 187, 187));

                            Propietario pro2 = pData.buscarProPorCuilC(cu);//cu es el cuil

                            if (pro2 == null) {//si no existe un propietario entonces lo crea

                                pro.setTipo(TipoCliente.PERSONA_JURIDICA);
                                pro.setNombre(jT_Nombre.getText());
                                pro.setLugarTrabajo(jT_Lugar.getText());
                                pro.setDomicilio(jT_Dom.getText());
                                pro.setCiudad(jT_Ciudad.getText());
                                pro.setCodigoPostal(jT_CodPo.getText());
                                pro.setTelefono(jT_Tel.getText());
                                pro.setMail(jT_Mail.getText());
                                pro.setEstado(true);
//desde aca
                                pData.agregarPropietarioPJ(pro);
                                mpropp.setjurifisi(true);
                                

                                jR_Fisi.setSelected(false);
                                jR_Juri.setSelected(false);
                                contador = 1;

                                System.out.println(pro.getNombre());
                                jT_Nombre.setText("");
                                jT_Dni.setText("");
                                jT_Cc.setText("");
                                jT_Lugar.setText("");
                                jT_Dom.setText("");
                                jT_Ciudad.setText("");
                                jT_CodPo.setText("");
                                jT_Tel.setText("");
                                jT_Mail.setText("");
                                
                                
//hasta aca anda bien en el else

                            } else {
                                JOptionPane.showMessageDialog(this, "Ya existe un Propietario con ese Cuil/Cuit");
                                jT_Cc.setText("");

                            }

                        }

                    }

                }

            }
            if (jR_Fisi.isSelected()) {
                if ((jT_Dni.getText().equals("")) || (jT_Cc.getText().equals("")) || (jT_Ciudad.getText().equals("")) || (jT_CodPo.getText().equals("")) || (jT_Dom.getText().equals("")) || (jT_Lugar.getText().equals("")) || (jT_Mail.getText().equals("")) || (jT_Nombre.getText().equals("")) || (jT_Tel.getText().equals(""))) {
                    JOptionPane.showMessageDialog(this, "Hay campos vacios");
                } else {
                    if (jT_Dni.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Ingrese el Dni");
                        jL_Dni.setForeground(Color.RED);
                    } else {
                        if (!jT_Dni.getText().matches("[0-9]+")) {
                            JOptionPane.showMessageDialog(this, "Ingrese solo numeros para Dni");
                            jL_Dni.setForeground(Color.RED);
                            jT_Dni.setText("");

                        } else {
                            if (Integer.parseInt(jT_Dni.getText()) == 0) {//si el dni ingresado es 0
                                JOptionPane.showMessageDialog(this, "Ingrese un dni valido");
                                jT_Dni.setText("");//vacia dni
                                jL_Dni.setForeground(Color.RED);//cambia a rojo
                            } //comparar dnis
                            else {
                                int dniBuscar = Integer.parseInt(jT_Dni.getText());
                                Propietario pro3 = pData.buscarProPorDni(dniBuscar);
                                if (pro3 == null) {
                                    pro.setDni(Integer.parseInt(jT_Dni.getText()));
                                    jL_Dni.setForeground(Color.getHSBColor(187, 187, 187));
                                } else {
                                    JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese dni");
                                    jT_Dni.setText("");
                                    jL_Dni.setForeground(Color.RED);
                                }

                            }

                            if (jT_Cc.getText().equals("")) {
                                JOptionPane.showMessageDialog(this, "Ingrese el Cuil/Cuit");
                                jL_Cc.setForeground(Color.RED);
                            } else {
                                if (!jT_Cc.getText().matches("[0-9]+")) {
                                    JOptionPane.showMessageDialog(this, "Ingrese solo numeros para Cuil/Cuit");
                                    jL_Cc.setForeground(Color.RED);
                                    jT_Cc.setText("");
                                } else {
                                    
                                    pro.setCuilCuit(Long.parseLong(jT_Cc.getText()));//parseo

                                    cu = Long.parseLong(jT_Cc.getText());
                                    jL_Cc.setForeground(Color.getHSBColor(187, 187, 187));

                                    Propietario pro2 = pData.buscarProPorCuilC(cu);//cu es el cuil

                                    if (pro2 == null) {//si no existe un propietario entonces lo crea

                                        pro.setTipo(TipoCliente.PERSONA_FISICA);
                                        pro.setNombre(jT_Nombre.getText());
                                        pro.setLugarTrabajo(jT_Lugar.getText());
                                        pro.setDomicilio(jT_Dom.getText());
                                        pro.setCiudad(jT_Ciudad.getText());
                                        pro.setCodigoPostal(jT_CodPo.getText());
                                        pro.setTelefono(jT_Tel.getText());
                                        pro.setMail(jT_Mail.getText());
                                        pro.setEstado(true);
//desde aca
                                        pData.agregarPropietarioPF(pro);
                                        mpropp.setjurifisi(false);

                                        jR_Fisi.setSelected(false);
                                        jR_Juri.setSelected(false);
                                        contador = 1;

                                        System.out.println(pro.getNombre());
                                        jT_Nombre.setText("");
                                        jT_Dni.setText("");
                                        jT_Cc.setText("");
                                        jT_Lugar.setText("");
                                        jT_Dom.setText("");
                                        jT_Ciudad.setText("");
                                        jT_CodPo.setText("");
                                        jT_Tel.setText("");
                                        jT_Mail.setText("");
//hasta aca anda bien en el else

                                    } else {
                                        JOptionPane.showMessageDialog(this, "Ya existe un Propietario con ese Cuil/Cuit");
                                        jT_Cc.setText("");
                                        jL_Cc.setForeground(Color.RED);

                                    }
                                }

                            }

                        }

                    }
                    

                }

            }
            if (!jR_Fisi.isSelected() && !jR_Juri.isSelected()) {
                        if (contador == 0) {
                            JOptionPane.showMessageDialog(this, "No ha seleccionado un Tipo de Persona");
                        }

                    }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "hay un error jajaj");
        }
    }//GEN-LAST:event_jB_GuardarActionPerformed

    private void jR_JuriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_JuriActionPerformed
        // TODO add your handling code here:
        jR_Fisi.setSelected(false);
        if (jT_Dni.isEnabled()) {
            jT_Dni.setEnabled(false);
        }

        System.out.println("juri");
        jT_Cc.setEnabled(true);
        jT_Ciudad.setEnabled(true);
        jT_CodPo.setEnabled(true);
        jT_Dom.setEnabled(true);
        jT_Lugar.setEnabled(true);
        jT_Mail.setEnabled(true);
        jT_Nombre.setEnabled(true);
        jT_Tel.setEnabled(true);

    }//GEN-LAST:event_jR_JuriActionPerformed

    private void jR_FisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_FisiActionPerformed
        // TODO add your handling code here:
        jR_Juri.setSelected(false);
        System.out.println("fisi");
        jT_Cc.setEnabled(true);
        jT_Ciudad.setEnabled(true);
        jT_CodPo.setEnabled(true);
        jT_Dni.setEnabled(true);
        jT_Dom.setEnabled(true);
        jT_Lugar.setEnabled(true);
        jT_Mail.setEnabled(true);
        jT_Nombre.setEnabled(true);
        jT_Tel.setEnabled(true);
    }//GEN-LAST:event_jR_FisiActionPerformed

    private void jB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
//        Propietarios mpropp = new Propietarios();
//        Menu.Escritorio.add(mpropp);
//                mpropp.toFront();
//                mpropp.setVisible(true);
    }//GEN-LAST:event_jB_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Salir;
    private javax.swing.JLabel jL_Cc;
    private javax.swing.JLabel jL_Ciudad;
    private javax.swing.JLabel jL_CodPo;
    private javax.swing.JLabel jL_Dni;
    private javax.swing.JLabel jL_Domi;
    private javax.swing.JLabel jL_Lugar;
    private javax.swing.JLabel jL_Mail;
    private javax.swing.JLabel jL_Nombre;
    private javax.swing.JLabel jL_Tel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jR_Fisi;
    private javax.swing.JRadioButton jR_Juri;
    private javax.swing.JTextField jT_Cc;
    private javax.swing.JTextField jT_Ciudad;
    private javax.swing.JTextField jT_CodPo;
    private javax.swing.JTextField jT_Dni;
    private javax.swing.JTextField jT_Dom;
    private javax.swing.JTextField jT_Lugar;
    private javax.swing.JTextField jT_Mail;
    private javax.swing.JTextField jT_Nombre;
    private javax.swing.JTextField jT_Tel;
    // End of variables declaration//GEN-END:variables
}
