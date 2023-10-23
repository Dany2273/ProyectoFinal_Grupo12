/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Enums.TipoCliente;
import accesoDatos.PropietarioData;
import entidades.Propietario;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Miki
 */
public class ModificarPropietario extends javax.swing.JInternalFrame {
    Propietario pro = new Propietario();
    PropietarioData proData = new PropietarioData();
    private Enums.TipoCliente tipo;
    private String nombre;
    private int dni;
    private Long cuil;
    private String lugar;
    private String domicilio;
    private String ciudad;
    private String cod;
    private String tel;
    private String mail;
    private int id;
    private boolean estado;


    /**
     * Creates new form NuevoPropietario
     */
    public ModificarPropietario() {
        initComponents();
        jT_Dni.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jB_Modificar = new javax.swing.JButton();
        jB_Reactivar = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Modificar Propietario");

        jL_Nombre.setText("Nombre/RazónSocial");

        jT_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NombreActionPerformed(evt);
            }
        });

        jL_Dni.setText("Dni");

        jL_Cc.setText("Cuil/Cuit");

        jL_Lugar.setText("Lugar/Trabajo");

        jL_Domi.setText("Domicilio");

        jL_Ciudad.setText("Ciudad");

        jL_CodPo.setText("CodPostal");

        jL_Tel.setText("Tel");

        jL_Mail.setText("Mail");

        jB_Modificar.setText("Guardar");
        jB_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ModificarActionPerformed(evt);
            }
        });

        jB_Reactivar.setText("Reactivar");
        jB_Reactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ReactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jL_Nombre)
                        .addComponent(jL_Dni)
                        .addComponent(jL_Cc)
                        .addComponent(jL_Lugar)
                        .addComponent(jL_Domi)
                        .addComponent(jL_Ciudad)
                        .addComponent(jL_CodPo)
                        .addComponent(jL_Tel)
                        .addComponent(jL_Mail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jB_Modificar)
                        .addGap(39, 39, 39)))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jT_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_CodPo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_Cc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jB_Reactivar))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_Nombre)
                    .addComponent(jT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_Dni)
                    .addComponent(jT_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jT_Cc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Cc))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jT_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_Lugar))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_Domi)
                    .addComponent(jT_Dom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_Ciudad)
                    .addComponent(jT_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jT_CodPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_CodPo))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_Tel)
                    .addComponent(jT_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_Mail)
                    .addComponent(jT_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Modificar)
                    .addComponent(jB_Reactivar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NombreActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jT_NombreActionPerformed

    private void jB_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ModificarActionPerformed
        // TODO add your handling code here:
        //empecemos de nuevo
        Long cu;//variable para guardar un numero para buscar pro por cuil
        if (tipo.equals(TipoCliente.PERSONA_FISICA)) {
            if ((jT_Dni.getText().equals("")) || (jT_Cc.getText().equals("")) || (jT_Ciudad.getText().equals("")) || (jT_CodPo.getText().equals("")) || (jT_Dom.getText().equals("")) || (jT_Lugar.getText().equals("")) || (jT_Mail.getText().equals("")) || (jT_Nombre.getText().equals("")) || (jT_Tel.getText().equals(""))) {
                JOptionPane.showMessageDialog(this, "Hay campos vacios");
            } else {
                if (jT_Dni.getText().equals("")) {//si es igual a nada escrito
                    JOptionPane.showMessageDialog(this, "Ingrese el Dni");
                    jL_Dni.setForeground(Color.RED);//cambia a rojo el color del jl dni
                } else {
                    if (!jT_Dni.getText().matches("[0-9]+")) {//si lo ingresado es diferente a numeros
                        JOptionPane.showMessageDialog(this, "Ingrese solo numeros para Dni");
                        jL_Dni.setForeground(Color.RED);//cambia color a dni    
                        jT_Dni.setText("");//vaica el jt dni

                    } else {
                        if (Integer.parseInt(jT_Dni.getText()) == 0) {//si el dni ingresado es 0
                            JOptionPane.showMessageDialog(this, "Ingrese un dni valido");
                            jT_Dni.setText("");//vacia dni
                            jL_Dni.setForeground(Color.RED);//cambia a rojo
                        } else {
                            int dniBuscar = Integer.parseInt(jT_Dni.getText()); //se crea y se guarda el num d dni para buscar propietario por dni
                            Propietario pro2 = proData.buscarProPorDni(dniBuscar);//busco por dni a un propietario si es que existe
                            if (dni == Integer.parseInt(jT_Dni.getText()) || pro2 == null) {
                                //dni=1 jt =1 entra al if.  si no hay pro con ese dni entonces tmb entra la if  
                                pro.setDni(Integer.parseInt(jT_Dni.getText()));//asigna el dni
                                jL_Dni.setForeground(Color.getHSBColor(187, 187, 187));//vuelve al color original
                                if (jT_Cc.getText().equals("")) {//si cuil es igual a nada
                                    JOptionPane.showMessageDialog(this, "Ingrese el Cuil/Cuit");
                                    jL_Cc.setForeground(Color.RED);//cambia color
                                } else {
                                    if (!jT_Cc.getText().matches("[0-9]+")) {//si no son solo numeros ingresados
                                        JOptionPane.showMessageDialog(this, "Ingrese solo numeros para Cuil/Cuit");
                                        jL_Cc.setForeground(Color.RED);//cambia a rojo
                                        jT_Cc.setText("");//vacia jt cc
                                    } else {

                                        cu = Long.parseLong(jT_Cc.getText());//guardo el valor del cuil en la variable long cu
                                        jL_Cc.setForeground(Color.getHSBColor(187, 187, 187));//vuelve al color original

                                        Propietario pro3 = proData.buscarProPorCuilC(cu);//cu es el cuil y busca a un propietario

                                        if (cuil == Long.parseLong(jT_Cc.getText()) || pro3 == null) {//si cuil es = al cuil sin modificar o si pro3 es nullo

                                            pro.setCuilCuit(Long.parseLong(jT_Cc.getText()));//parseo y seteo
                                            pro.setIdPropietario(id);
                                            System.out.println(pro.getCuilCuit());
                                            pro.setTipo(TipoCliente.PERSONA_FISICA);
                                            pro.setNombre(jT_Nombre.getText());
                                            pro.setLugarTrabajo(jT_Lugar.getText());
                                            pro.setDomicilio(jT_Dom.getText());
                                            pro.setCiudad(jT_Ciudad.getText());
                                            pro.setCodigoPostal(jT_CodPo.getText());
                                            pro.setTelefono(jT_Tel.getText());
                                            pro.setMail(jT_Mail.getText());
                                            proData.modificarPropietarioPF(pro);//modifica persona
                                            dispose();//cierre

                                        } else {
                                            if (pro3.getCuilCuit() == Long.parseLong(jT_Cc.getText())) {//si el cuil del propietario que nos dio la busqueda por cuil es = al cuil ingresado por el usuario
                                                JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese Cuil/Cuit");
                                                jT_Cc.setText("");//vacia jt cc
                                                jL_Cc.setForeground(Color.RED);//cambia a rojo jl cc
                                            }

                                        }

                                    }

                                }

                            } else {
                                if (pro2.getDni() == Integer.parseInt(jT_Dni.getText())) {//si el dni obtenido del propietario q nos dio busqda por dni es = al dni ingresado por el usuario
                                    JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese dni");
                                    jL_Dni.setForeground(Color.RED);//cambia a rojo jl
                                } else {
                                    pro.setDni(Integer.parseInt(jT_Dni.getText()));//setea el dni
                                    jL_Dni.setForeground(Color.getHSBColor(187, 187, 187));//vuelve a color original
                                }
                            }

                        }

                    }
                }
            }
        } else {
            //(jT_Dni.getText().equals("")) || se lo saq porq dni esta deshabilitado
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

                        cu = Long.parseLong(jT_Cc.getText());
                        jL_Cc.setForeground(Color.getHSBColor(187, 187, 187));

                        Propietario pro3 = proData.buscarProPorCuilC(cu);//cu es el cuil

                        if (cuil == Long.parseLong(jT_Cc.getText()) || pro3 == null) {

                            pro.setCuilCuit(Long.parseLong(jT_Cc.getText()));//parseo
                            pro.setIdPropietario(id);
                            System.out.println(pro.getCuilCuit());
                            pro.setTipo(TipoCliente.PERSONA_JURIDICA);
                            pro.setNombre(jT_Nombre.getText());
                            pro.setLugarTrabajo(jT_Lugar.getText());
                            pro.setDomicilio(jT_Dom.getText());
                            pro.setCiudad(jT_Ciudad.getText());
                            pro.setCodigoPostal(jT_CodPo.getText());
                            pro.setTelefono(jT_Tel.getText());
                            pro.setMail(jT_Mail.getText());
                            proData.modificarPropietarioPJ(pro);
                            dispose();

                        } else {
                            if (pro3.getCuilCuit() == Long.parseLong(jT_Cc.getText())) {
                                JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese Cuil/Cuit");
                                jL_Cc.setForeground(Color.RED);
                                jT_Cc.setText("");
                            }

                        }

                    }

                }

            }

        }


    }//GEN-LAST:event_jB_ModificarActionPerformed

    private void jB_ReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ReactivarActionPerformed
        // TODO add your handling code here:
        proData.reactivarPropietario(id);
        dispose();
        
    }//GEN-LAST:event_jB_ReactivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Modificar;
    private javax.swing.JButton jB_Reactivar;
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
public void setTipo (Enums.TipoCliente tipo){
    this.tipo = tipo;
    //el if hace q se habilite o no el campo dni
      if (tipo.equals(TipoCliente.PERSONA_JURIDICA)) {
            jT_Dni.setEnabled(false);
           
        }else{
            System.out.println("es fisica");
           jT_Dni.setEnabled(true);
        }
}
public void setNombre(String nombre){
    this.nombre = nombre;
    jT_Nombre.setText(nombre);
    
}
public void setDni(int dni){
    this.dni = dni;
    jT_Dni.setText(dni+"");
}
public void setCuil(long cuil){
    this.cuil = cuil;
    jT_Cc.setText(cuil+"");
}
public void setLugar(String lugar){
    this.lugar = lugar;
    jT_Lugar.setText(lugar);
}
public void setDomicilio(String domicilio){
    this.domicilio = domicilio;
    jT_Dom.setText(domicilio);
}
public void setCiudad(String ciudad){
    this.ciudad = ciudad;
    jT_Ciudad.setText(ciudad);
    
}
public void setCod(String cod){
    this.cod = cod;
    jT_CodPo.setText(cod);
}
public void setTel(String tel){
    this.tel = tel;
    jT_Tel.setText(tel);
    
}
public void setMail(String mail){
    this.mail = mail;
    jT_Mail.setText(mail);
}
public void setId(int id){
    
    this.id = id;
    
}
public void setEstado(boolean estado){
    this.estado = estado;
    if (estado) {
        jB_Reactivar.setEnabled(false);
        System.out.println("es activo");
    }else{
        jB_Reactivar.setEnabled(true);
        System.out.println("es inactivo");
    }
}


}

