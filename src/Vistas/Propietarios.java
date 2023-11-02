/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import accesoDatos.PropietarioData;
import entidades.Propietario;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
//import Vistas.Main;


public class Propietarios extends javax.swing.JInternalFrame {

int idd;
int aver;
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
        jB_Todos = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();

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

        jB_Todos.setText("Todos");
        jB_Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_TodosActionPerformed(evt);
            }
        });

        jRadio_Juridicos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadio_Juridicos.setForeground(new java.awt.Color(255, 255, 255));
        jRadio_Juridicos.setText("Juridicos");
        jRadio_Juridicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadio_JuridicosActionPerformed(evt);
            }
        });

        jRadio_Fisicos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadio_Fisicos.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel_BuscarPro.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_BuscarPro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_BuscarPro.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BuscarPro.setText("Buscar por :");

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

        jLabel_Ver.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Ver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Ver.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ver.setText("Ver:");

        jButton_Salir.setText("Salir");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jLabel1.setText("(Doble click para modificar Propietario seleccionado.)");

        jL_Solo.setBackground(new java.awt.Color(255, 255, 255));
        jL_Solo.setForeground(new java.awt.Color(255, 255, 255));
        jL_Solo.setText("(Solo numeros por favor.)");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos Propietarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_BuscarPro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCombo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(jB_Activos)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB_Inactivos)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB_Todos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_Eliminar)
                                        .addGap(59, 59, 59)
                                        .addComponent(jButton_Salir))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(jLabel_Ver)
                                .addGap(18, 18, 18)
                                .addComponent(jRadio_Fisicos)
                                .addGap(43, 43, 43)
                                .addComponent(jRadio_Juridicos))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jL_Solo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel2)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadio_Juridicos)
                    .addComponent(jRadio_Fisicos)
                    .addComponent(jLabel_Ver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Activos)
                    .addComponent(jB_Inactivos)
                    .addComponent(jB_Todos)
                    .addComponent(jLabel_BuscarPro)
                    .addComponent(jCombo_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Salir)
                    .addComponent(jButton_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Solo)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_ActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ActivosActionPerformed
        // TODO add your handling code here:
        jTextField_Buscar.setText("");
        if (!(jRadio_Fisicos.isSelected() || jRadio_Juridicos.isSelected())){
            
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
        if (!(jRadio_Fisicos.isSelected() || jRadio_Juridicos.isSelected())){
            
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

    }//GEN-LAST:event_jB_InactivosActionPerformed

    private void jRadio_FisicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadio_FisicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadio_FisicosActionPerformed

    private void jB_TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_TodosActionPerformed
        // TODO add your handling code here:
        jTextField_Buscar.setText("");
        if (!(jRadio_Fisicos.isSelected() || jRadio_Juridicos.isSelected())){
            
            JOptionPane.showMessageDialog(this, "seleccione un tipo de persona");
            idd=0;
        }
        limpiarTabla();
        if(jRadio_Fisicos.isSelected()){
            mostrarft();
        }
        if(jRadio_Juridicos.isSelected()){
            mostrarjt();
        }

    }//GEN-LAST:event_jB_TodosActionPerformed

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
//                  Main.jDesktopPane1.add(mProp);
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
            

            for (Propietario pro8 : proData.listarProTodos()) {
                if (pro8.getNombre().toLowerCase().startsWith(jTextField_Buscar.getText().toLowerCase())) {
                    
                    tablita.addRow(new Object[]{
                        pro8.getIdPropietario(),pro8.getTipo(),pro8.getNombre(),pro8.getDni(),pro8.getCuilCuit(),pro8.getLugarTrabajo(),pro8.getDomicilio(),pro8.getCiudad(),pro8.getCodigoPostal(),pro8.getTelefono(),pro8.getMail(),pro8.isEstado()
            });
                    
                    
                }
            }

            if (jTextField_Buscar.getText().equals("")) {
                borrarFilas();
            }
        }
          if (jCombo_buscar.getSelectedItem().equals("Cuil/Cuit")) {
            borrarFilas();//gracias robotito me re salvaste
            
            

            for (Propietario pro7 : proData.listarProTodos()) {
                if (String.valueOf(pro7.getCuilCuit()).startsWith(jTextField_Buscar.getText())) {
                    
                    tablita.addRow(new Object[]{
                        pro7.getIdPropietario(),pro7.getTipo(),pro7.getNombre(),pro7.getDni(),pro7.getCuilCuit(),pro7.getLugarTrabajo(),
                        pro7.getDomicilio(),pro7.getCiudad(),pro7.getCodigoPostal(),pro7.getTelefono(),pro7.getMail(),pro7.isEstado()
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
        if(idd<=0){
            JOptionPane.showMessageDialog(this, "seleccione un propietario de la lista");
        }else{
           proData.eliminarPropietario(idd); 
           
        }
        idd=0;
        
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
        
       
    }//GEN-LAST:event_jRadio_JuridicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Activos;
    private javax.swing.JButton jB_Inactivos;
    private javax.swing.JButton jB_Todos;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JComboBox<String> jCombo_buscar;
    private javax.swing.JLabel jL_Solo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_BuscarPro;
    private javax.swing.JLabel jLabel_Ver;
    private javax.swing.JPanel jPanel1;
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

        for (Propietario pro1 : proData.listarProFisicosA()) {
            String Estado = pro1.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro1.getIdPropietario(),pro1.getTipo(),pro1.getNombre(),pro1.getDni(),pro1.getCuilCuit(),pro1.getLugarTrabajo(),pro1.getDomicilio(),
                pro1.getCiudad(),pro1.getCodigoPostal(),pro1.getTelefono(),pro1.getMail(),Estado
            });
        }
    }


    public void mostrarfi() {

         for (Propietario pro2 : proData.listarProFisicosI()) {
            String Estado = pro2.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro2.getIdPropietario(),pro2.getTipo(),pro2.getNombre(),pro2.getDni(),pro2.getCuilCuit(),pro2.getLugarTrabajo(),pro2.getDomicilio(),
                pro2.getCiudad(),pro2.getCodigoPostal(),pro2.getTelefono(),pro2.getMail(),Estado
            });
        }
    }
    public void mostrarft() {

         for (Propietario pro3 : proData.listarProFisicosT()) {
            String Estado = pro3.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro3.getIdPropietario(),pro3.getTipo(),pro3.getNombre(),pro3.getDni(),pro3.getCuilCuit(),pro3.getLugarTrabajo(),pro3.getDomicilio(),
                pro3.getCiudad(),pro3.getCodigoPostal(),pro3.getTelefono(),pro3.getMail(),Estado
            });
        }
    }
    public void mostrarja() {

        for (Propietario pro4 : proData.listarProJuridicosA()) {
            String Estado = pro4.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro4.getIdPropietario(),pro4.getTipo(),pro4.getNombre(),pro4.getDni(),pro4.getCuilCuit(),pro4.getLugarTrabajo(),pro4.getDomicilio(),
                pro4.getCiudad(),pro4.getCodigoPostal(),pro4.getTelefono(),pro4.getMail(),Estado
            });
        }
    }
    public void mostrarji() {

        for (Propietario pro5 : proData.listarProJuridicosI()) {
            String Estado = pro5.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro5.getIdPropietario(),pro5.getTipo(),pro5.getNombre(),pro5.getDni(),pro5.getCuilCuit(),pro5.getLugarTrabajo(),pro5.getDomicilio(),
                pro5.getCiudad(),pro5.getCodigoPostal(),pro5.getTelefono(),pro5.getMail(),Estado
            });
        }
    }
    public void mostrarjt() {

        for (Propietario pro6 : proData.listarProJuridicosT()) {
            String Estado = pro6.isEstado()? "Activo" : "Inactivo"; // Convierte true en "Activas" y false en "Inactivas" preguntar a daniel q onda jajaj
            tablita.addRow(new Object[]{
                pro6.getIdPropietario(),pro6.getTipo(),pro6.getNombre(),pro6.getDni(),pro6.getCuilCuit(),pro6.getLugarTrabajo(),pro6.getDomicilio(),
                pro6.getCiudad(),pro6.getCodigoPostal(),pro6.getTelefono(),pro6.getMail(),Estado
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
     
     
}
