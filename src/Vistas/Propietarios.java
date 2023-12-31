/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Enums.TipoCliente;
import accesoDatos.PropietarioData;
import entidades.Propietario;
import java.awt.Graphics;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;



public class Propietarios extends javax.swing.JInternalFrame {

int idd;
int aver;
int contF=0;
int contJ=0;
private int ajustar =0;
private int modifi =0;

 int juriCon=0;
         int fisiCon=0;
boolean tab;
private boolean jurifisi;
    Propietario pro = new Propietario();
    
    PropietarioData proData = new PropietarioData();
    DefaultTableModel tablita = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tablita);
    public Propietarios (){
        initComponents();
        cabecera();
        llenarCombo();
         jL_Solo.setVisible(false);
        
         
        
        jTable1.setRowSorter(sorter);
        jTable1.setShowGrid(true);
        jButton_Eliminar.setEnabled(false);
        jTable1.getColumnModel().getColumn(0).setMinWidth(10);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        
        
        
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(62);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(62);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(17);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(15);
        
        jTable1.getColumnModel().getColumn(8).setMinWidth(45);
        jTable1.getColumnModel().getColumn(8).setMaxWidth(45);
        jTable1.getColumnModel().getColumn(8).setPreferredWidth(45);
        jTable1.getColumnModel().getColumn(9).setPreferredWidth(15);
        jTable1.getColumnModel().getColumn(10).setPreferredWidth(20);
        
        jTable1.getColumnModel().getColumn(11).setMinWidth(10);
        jTable1.getColumnModel().getColumn(11).setMaxWidth(30);
        jTable1.getColumnModel().getColumn(11).setPreferredWidth(30);

        
        
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
                g.drawImage(image, 0, 0,getWidth(),getHeight(),this);
            }
        }
        ;
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jB_Activos = new javax.swing.JButton();
        jB_Inactivos = new javax.swing.JButton();
        jRadio_Juridicos = new javax.swing.JRadioButton();
        jRadio_Fisicos = new javax.swing.JRadioButton();
        jCombo_buscar = new javax.swing.JComboBox<>();
        jLabel_BuscarPro = new javax.swing.JLabel();
        jTextField_Buscar = new javax.swing.JTextField();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel_Ver = new javax.swing.JLabel();
        jButton_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jL_Solo = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setClosable(true);
        setFrameIcon(null);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1060, 600));
        setRequestFocusEnabled(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(740, 439));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jB_Activos.setText("Activos");
        jB_Activos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jB_ActivosFocusGained(evt);
            }
        });
        jB_Activos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ActivosActionPerformed(evt);
            }
        });

        jB_Inactivos.setText("Inactivos");
        jB_Inactivos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jB_InactivosFocusGained(evt);
            }
        });
        jB_Inactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_InactivosActionPerformed(evt);
            }
        });

        jRadio_Juridicos.setText("Juridicos");
        jRadio_Juridicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_JuridicosActionPerformed(evt);
            }
        });

        jRadio_Fisicos.setText("Fisicos");
        jRadio_Fisicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_FisicosActionPerformed(evt);
            }
        });

        jCombo_buscar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombo_buscarItemStateChanged(evt);
            }
        });
        jCombo_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_buscarActionPerformed(evt);
            }
        });

        jLabel_BuscarPro.setText("Buscar Propietario por :");

        jTextField_Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_BuscarFocusGained(evt);
            }
        });
        jTextField_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BuscarActionPerformed(evt);
            }
        });
        jTextField_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_BuscarKeyReleased(evt);
            }
        });

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jLabel_Ver.setText("Ver:");

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jLabel1.setText("(Doble click para modificar Propietario seleccionado.)");

        jL_Solo.setText("(Solo numeros por favor.)");

        jRadioButton1.setText("Fisicos/Juridicos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(396, 396, 396))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(jL_Solo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_BuscarPro)
                                .addGap(37, 37, 37)
                                .addComponent(jCombo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Ver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadio_Fisicos)
                                        .addGap(6, 6, 6)
                                        .addComponent(jRadio_Juridicos)
                                        .addGap(6, 6, 6)
                                        .addComponent(jB_Activos)
                                        .addGap(6, 6, 6)
                                        .addComponent(jB_Inactivos)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Salir)
                            .addComponent(jButton_Eliminar))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_Activos)
                            .addComponent(jB_Inactivos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadio_Fisicos)
                                        .addComponent(jLabel_Ver))
                                    .addComponent(jRadio_Juridicos))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_BuscarPro)
                            .addComponent(jCombo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jL_Solo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Eliminar)
                        .addGap(217, 217, 217)
                        .addComponent(jButton_Salir)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_ActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ActivosActionPerformed
        // TODO add your handling code here:
        jTextField_Buscar.setText("");
        if (!(jRadio_Fisicos.isSelected() || jRadio_Juridicos.isSelected() || jRadioButton1.isSelected())){
            
            JOptionPane.showMessageDialog(this, "seleccione un tipo de persona");
            idd=0;
        }
        limpiarTabla();
        if(jRadio_Fisicos.isSelected()){
            mostrarfa();
        }
        if(jRadio_Juridicos.isSelected()){
            mostrarja();
        }
        if (jRadioButton1.isSelected()) {
            borrarFilas();
           mostrarfa();
           mostrarja();
        }
       
        
    }//GEN-LAST:event_jB_ActivosActionPerformed

    private void jCombo_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_buscarActionPerformed
        // TODO add your handling code here:
         if (jCombo_buscar.getSelectedItem().equals("Nombre")) {

           
            
            jTextField_Buscar.setText("Ingrese Nombre");
            jL_Solo.setVisible(false);
            
            }
         else if (jCombo_buscar.getSelectedItem().equals("Cuil/Cuit")) {
            jTextField_Buscar.setText("Ingrese Cuil/Cuit");
            jL_Solo.setVisible(true);
        } 
        

         else if (jCombo_buscar.getSelectedIndex() == 0) {

//            borrarFilas();
//            borrar();
//            bloquear();

        }
    }//GEN-LAST:event_jCombo_buscarActionPerformed

    private void jB_InactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_InactivosActionPerformed
        // TODO add your handling code here:
        jTextField_Buscar.setText("");
        if (!(jRadio_Fisicos.isSelected() || jRadio_Juridicos.isSelected() || jRadioButton1.isSelected())){
            
            JOptionPane.showMessageDialog(this, "seleccione un tipo de persona");
            idd=0;
        }
        limpiarTabla();
        if(jRadio_Fisicos.isSelected()){
            mostrarfi();
        }
        if(jRadio_Juridicos.isSelected()){
            mostrarji();
        }
        if (jRadioButton1.isSelected()) {
            borrarFilas();
            mostrarfi();
            mostrarji();
        }

    }//GEN-LAST:event_jB_InactivosActionPerformed

    private void jRadio_FisicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_FisicosActionPerformed
        // TODO add your handling code here:
        jRadio_Fisicos.setSelected(true);
        contF=1;
        borrarFilas();
        jRadio_Juridicos.setSelected(false);
        jRadioButton1.setSelected(false);
        mostrarft();
    }//GEN-LAST:event_jRadio_FisicosActionPerformed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1FocusGained

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //para elegir la fila de propietario a editar o modificar
        
        
        ModificarPropietario mProp = new ModificarPropietario();//crea la siguiente vista
        if (evt.getClickCount() == 2) {
            int fila = jTable1.getSelectedRow(); // Obtiene la fila seleccionada al hacer doble clic
            if (fila >= 0) {

               Menu.Escritorio.add(mProp);//menu original
  //                Main.jDesktopPane1.add(mProp);
                mProp.toFront();
                mProp.setVisible(true);
            }
            if (fila != -1) {

                idd = ((Integer) tablita.getValueAt(fila, 0));
                mProp.setNombre((String) tablita.getValueAt(fila, 2));
                mProp.setDni((Integer) tablita.getValueAt(fila, 3));// esta linea obtiene el dni de la tabla 
                mProp.setCuil((Long) tablita.getValueAt(fila, 4));
                mProp.setLugar((String) tablita.getValueAt(fila, 5));
                mProp.setDomicilio((String) tablita.getValueAt(fila, 6));
                mProp.setCiudad((String) tablita.getValueAt(fila, 7));
                mProp.setCod((String) tablita.getValueAt(fila, 8));
                mProp.setTel((String) tablita.getValueAt(fila, 9));
                mProp.setMail((String) tablita.getValueAt(fila, 10));
                mProp.setId((Integer) tablita.getValueAt(fila, 0));
                mProp.setTipo((Enums.TipoCliente) tablita.getValueAt(fila, 1));
                mProp.setEstado((boolean) tablita.getValueAt(fila, 11));
                dispose();//a ver si anda

            }
        } else {
            int fila = jTable1.getSelectedRow();
            idd = ((Integer) tablita.getValueAt(fila, 0));
            tab = ((boolean) tablita.getValueAt(fila, 11));
            if (tab) {
                jButton_Eliminar.setEnabled(true);
            } else {
                jButton_Eliminar.setEnabled(false);
            }
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jCombo_buscarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombo_buscarItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo_buscarItemStateChanged

    private void jTextField_BuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_BuscarFocusGained
        // TODO add your handling code here:
        if (jTextField_Buscar.getText().equals("Ingrese Nombre")) {
            jTextField_Buscar.setText("");
        }
        if (jTextField_Buscar.getText().equalsIgnoreCase("Ingrese Cuil/Cuit")) {
            jTextField_Buscar.setText("");
        }
    }//GEN-LAST:event_jTextField_BuscarFocusGained

    private void jTextField_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BuscarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField_BuscarActionPerformed

    private void jTextField_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BuscarKeyReleased
        // TODO add your handling code here:
         if (jCombo_buscar.getSelectedItem().equals("Nombre")) {
            borrarFilas();//gracias robotito me re salvaste
            

            for (Propietario pro : proData.listarProTodos()) {
                if (pro.getNombre().toLowerCase().startsWith(jTextField_Buscar.getText().toLowerCase())) {
                    
                    tablita.addRow(new Object[]{
                        pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
                    
                    
                }
            }

            if (jTextField_Buscar.getText().equals("")) {
                borrarFilas();
            }
        }
          if (jCombo_buscar.getSelectedItem().equals("Cuil/Cuit")) {
            borrarFilas();//gracias robotito me re salvaste
            
            

            for (Propietario pro : proData.listarProTodos()) {
                if (String.valueOf(pro.getCuilCuit()).startsWith(jTextField_Buscar.getText())) {
                    
                    tablita.addRow(new Object[]{
                        pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
                    
                    
                }
            }

            if (jTextField_Buscar.getText().equals("")) {
                borrarFilas();
            }
        }
         

         
         

    }//GEN-LAST:event_jTextField_BuscarKeyReleased

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
        // TODO add your handling code here:
        if (idd <= 0) {
            JOptionPane.showMessageDialog(this, "seleccione un propietario de la lista");
        } else {
            if (jRadio_Fisicos.isSelected()) {
                proData.eliminarPropietario(idd);
                borrarFilas();
                mostrarfa();
            } else {
                if (jRadio_Juridicos.isSelected()) {
                    proData.eliminarPropietario(idd);
                    borrarFilas();
                    mostrarja();
                }
                if (jRadioButton1.isSelected()) {
                    proData.eliminarPropietario(idd);
                    borrarFilas();
                    mostrarft();
                    mostrarjt();
                }

            }

        }

        idd = 0;
        
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void jB_ActivosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jB_ActivosFocusGained

        // TODO add your handling code here:
        System.out.println("activos");
    }//GEN-LAST:event_jB_ActivosFocusGained

    private void jB_InactivosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jB_InactivosFocusGained
        // TODO add your handling code here:
        System.out.println("inactivos");
    }//GEN-LAST:event_jB_InactivosFocusGained

    private void jRadio_JuridicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_JuridicosActionPerformed
        // TODO add your handling code here:
        jRadio_Juridicos.setSelected(true);
        borrarFilas();
        jRadio_Fisicos.setSelected(false);
        jRadioButton1.setSelected(false);
        mostrarjt();
       
    }//GEN-LAST:event_jRadio_JuridicosActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        mostrarft();
        mostrarjt();
        jRadioButton1.setSelected(true);
        jRadio_Fisicos.setSelected(false);
        jRadio_Juridicos.setSelected(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Activos;
    private javax.swing.JButton jB_Inactivos;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JComboBox<String> jCombo_buscar;
    private javax.swing.JLabel jL_Solo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_BuscarPro;
    private javax.swing.JLabel jLabel_Ver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadio_Fisicos;
    private javax.swing.JRadioButton jRadio_Juridicos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Buscar;
    // End of variables declaration//GEN-END:variables


    private void cabecera() {
        tablita.addColumn("Id");
        tablita.addColumn("Tipo");
        tablita.addColumn("Nombre");
        tablita.addColumn("Dni");
        tablita.addColumn("Cuil/Cuit");
        tablita.addColumn("Lugar de Trabajo");
        tablita.addColumn("Domicilio");
        tablita.addColumn("Ciudad");
        tablita.addColumn("Cod-Postal");
        tablita.addColumn("Tel");
        tablita.addColumn("Mail");
        tablita.addColumn("Estado");
        jTable1.setModel(tablita);
    }
    private void limpiarTabla(){
        int f = tablita.getRowCount();
        for (int i = f - 1; i >= 0; i--) {
            tablita.removeRow(i);
        }
    }
    public void setjurifisi(boolean jurifisi){
         this.jurifisi = jurifisi;
         if (jurifisi) {
             tablita.fireTableDataChanged();
             
             System.out.println("juridicoos");
         }else{
             limpiarTabla();
             tablita.fireTableDataChanged();
             
             System.out.println("fisicoos");
         }
     }
     public void mostrarfa() {

        for (Propietario pro : proData.listarProFisicosA()) {
            String Estado = pro.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
        }
    }


    public void mostrarfi() {

         for (Propietario pro : proData.listarProFisicosI()) {
            String Estado = pro.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
        }
    }
    public void mostrarft() {

         for (Propietario pro : proData.listarProFisicosT()) {
            String Estado = pro.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
        }
    }
    public void mostrarja() {

        for (Propietario pro : proData.listarProJuridicosA()) {
            String Estado = pro.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
        }
    }
    public void mostrarji() {

        for (Propietario pro : proData.listarProJuridicosI()) {
            String Estado = pro.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
        }
    }
    public void mostrarjt() {

        for (Propietario pro : proData.listarProJuridicosT()) {
            String Estado = pro.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
            });
        }
    }
   
     private void llenarCombo() {
        jCombo_buscar.addItem("");
        jCombo_buscar.addItem("Nombre");
        jCombo_buscar.addItem("Cuil/Cuit");
        
    }
     private void obtenerPorNombre(){
           char letra;
            if (!jTextField_Buscar.getText().equals("")) {
                letra = jTextField_Buscar.getText().toUpperCase().charAt(0); // Obtener la primera letra ingresada
                // Llamar al método en AlumnoData para obtener alumnos activos que comienzan con la letra ingresada
                List<Propietario> propietarios = proData.listarTodosPorNombre(letra);
                
                // Actualizar la tabla con los resultados obtenidos
                for (Propietario pro : propietarios) {
                    
                    tablita.addRow(new Object[]{
                         pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
                    });
                }
            
        } else {
            if (!jTextField_Buscar.getText().equals("")) {
                letra = jTextField_Buscar.getText().toUpperCase().charAt(0); // Obtener la primera letra ingresada
                // Llamar al método en AlumnoData para obtener alumnos activos que comienzan con la letra ingresada
                // Mostrar todos los alumnos cuando el botón esté deseleccionado
                for (Propietario pro : proData.listarTodosPorNombre(letra)) {
                    
                    tablita.addRow(new Object[]{
                        pro.getIdPropietario(),pro.getTipo(),pro.getNombre(),pro.getDni(),pro.getCuilCuit(),pro.getLugarTrabajo(),pro.getDomicilio(),pro.getCiudad(),pro.getCodigoPostal(),pro.getTelefono(),pro.getMail(),pro.isEstado()
                    });
                }
            }

        }
     }
     private void borrarFilas() {
        int f = tablita.getRowCount();
        for (int i = f - 1; i >= 0; i--) {
            tablita.removeRow(i);
        }
    }

     private boolean modificarHabilitado = false;
     public void setajustar(int ajustar){
         this.ajustar= ajustar;
         if (ajustar==1) {
             borrarFilas();
             jRadio_Fisicos.setSelected(true);
             mostrarft();
             
         }else{
              borrarFilas();
             jRadio_Juridicos.setSelected(true);
            mostrarjt();
             
         }
         
     }
     public void setmod(int modifi){
         this.modifi =modifi;
         if (modifi==1) {
             borrarFilas();
             jRadio_Fisicos.setSelected(true);
             mostrarft();
         }else{
             if (modifi==2) {
                 borrarFilas();
                 jRadio_Juridicos.setSelected(true);
                 mostrarjt();
             }
         }
         
     }
     
     
}
