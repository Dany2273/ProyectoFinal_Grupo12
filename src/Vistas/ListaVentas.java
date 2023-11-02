/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import accesoDatos.ClienteData;
import accesoDatos.PropietarioData;
import accesoDatos.VentaData;
import entidades.Cliente;
import entidades.Conyugue;
import entidades.Escribano;
import entidades.Inmueble;
import entidades.Propietario;
import entidades.Venta;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Compaq
 */
public class ListaVentas extends javax.swing.JInternalFrame {

    Venta ven = new Venta();
    VentaData vData = new VentaData();
    public final DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private final TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
    // Creo un TableCellRenderer anónimo para personalizar la columna de números
    DefaultTableCellRenderer numberRenderer = new DefaultTableCellRenderer() {
        private Format formatter = new DecimalFormat("#,##0", DecimalFormatSymbols.getInstance(Locale.US));

        @Override
        public void setValue(Object value) {
            if (value instanceof Number) {
                value = formatter.format(value);
            }
            super.setValue(value);
        }
    };

    public ListaVentas() {
        initComponents();
        armarCabecera();
        jTabla.setShowGrid(true);//Metodo para que se ven las lines de la tabla
        jTabla.setGridColor(Color.lightGray);//Metodo para cambiar de color las lineas internas
        // Asocia el TableRowSorter al JTable
        jTabla.setRowSorter(sorter);//Metodo para ordenar el contenido de la tabla
        jTabla.getTableHeader().setReorderingAllowed(false);//Metodo para que las columnas permanescan estaticas
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRCliente = new javax.swing.JRadioButton();
        jRPropietario = new javax.swing.JRadioButton();
        jRTodas = new javax.swing.JRadioButton();
        jcCliente = new javax.swing.JComboBox<>();
        jcPropietario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBCancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();

        setFrameIcon(null);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de Ventas.");

        jRCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRCliente.setForeground(new java.awt.Color(255, 255, 255));
        jRCliente.setText("Ventas Por Cliente");
        jRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRClienteActionPerformed(evt);
            }
        });

        jRPropietario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRPropietario.setForeground(new java.awt.Color(255, 255, 255));
        jRPropietario.setText("Ventas Por Propietario");
        jRPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRPropietarioActionPerformed(evt);
            }
        });

        jRTodas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRTodas.setForeground(new java.awt.Color(255, 255, 255));
        jRTodas.setText("Todas las Ventas");
        jRTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRTodasActionPerformed(evt);
            }
        });

        jcCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcClienteItemStateChanged(evt);
            }
        });
        jcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcClienteActionPerformed(evt);
            }
        });

        jcPropietario.setPreferredSize(new java.awt.Dimension(190, 26));
        jcPropietario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcPropietarioItemStateChanged(evt);
            }
        });
        jcPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPropietarioActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clientes:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Propietarios:");

        jBCancelar.setText("Cancelar Venta");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar Venta");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRTodas)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(430, 430, 430))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRCliente)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102)))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBCancelar)
                .addGap(228, 228, 228)
                .addComponent(jButton2)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRCliente)
                    .addComponent(jRPropietario)
                    .addComponent(jRTodas))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jButton2)
                    .addComponent(jBModificar))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRTodasActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        jcCliente.removeAllItems();
        jcCliente.setEnabled(false);
        jcPropietario.removeAllItems();
        jcPropietario.setEnabled(false);
        jRCliente.setSelected(false);
        jRPropietario.setSelected(false);
        if (jRTodas.isSelected()) {

            for (Venta v : vData.obtenerVentas()) {
                System.out.println(v);
                // Asigna el TableCellRenderer a la columna específica 
                jTabla.getColumnModel().getColumn(7).setCellRenderer(numberRenderer);
                String conyugue;
                if (v.getConyugue() == null) {
                    conyugue = "N/A.";
                } else {
                    conyugue = v.getConyugue().toString();
                }
                modelo.addRow(new Object[]{
                    v.getIdVenta(), v.getFecha(), v.getInmueble(), v.getPropietario(),
                    v.getCliente(), conyugue, v.getEscribano(), v.getPrecioVenta(),
                    v.getMoneda(), v.getEstadoEscriturizacion(),v.getDetallesVenta()

                });
            }
            jTabla.repaint();
        }

    }//GEN-LAST:event_jRTodasActionPerformed

    private void jRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRClienteActionPerformed
        // TODO add your handling code here:
        borrarFilas();

        jcCliente.setEnabled(true);
        jRTodas.setSelected(false);

        jcPropietario.setEnabled(false);
        jRPropietario.setSelected(false);
        jcPropietario.removeAllItems();
        llenarCliente();


    }//GEN-LAST:event_jRClienteActionPerformed

    private void jRPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRPropietarioActionPerformed
        // TODO add your handling code here:
        borrarFilas();
        jcCliente.removeAllItems();
        jcPropietario.setEnabled(true);
        jRTodas.setSelected(false);

        jcCliente.setEnabled(false);
        jRCliente.setSelected(false);

        llenarPropietario();
    }//GEN-LAST:event_jRPropietarioActionPerformed

    private void jcClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcClienteItemStateChanged
        // TODO add your handling code here:
        borrarFilas();
        if (jRCliente.isSelected()) {

            if (jcCliente.getSelectedItem() != null) {

                Cliente c = new Cliente();
                c = (Cliente) jcCliente.getSelectedItem();
                for (Venta v : vData.obtenerVentasPorCliente(c.getIdCliente())) {

                    // Asigna el TableCellRenderer a la columna específica 
                    jTabla.getColumnModel().getColumn(7).setCellRenderer(numberRenderer);
                    String conyugue;
                    if (v.getConyugue() == null) {
                        conyugue = "N/A.";
                    } else {
                        conyugue = v.getConyugue().toString();
                    }
                    modelo.addRow(new Object[]{
                        v.getIdVenta(), v.getFecha(), v.getInmueble(), v.getPropietario(),
                        v.getCliente(), conyugue, v.getEscribano(), v.getPrecioVenta(),
                        v.getMoneda(), v.getEstadoEscriturizacion(),v.getDetallesVenta()

                    });
                }

                jTabla.repaint();
            }

        }
    }//GEN-LAST:event_jcClienteItemStateChanged

    private void jcPropietarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcPropietarioItemStateChanged
        // TODO add your handling code here:
        borrarFilas();
        if (jRPropietario.isSelected()) {
            if (jcPropietario.getSelectedItem() != null) {
                Propietario prop = (Propietario) jcPropietario.getSelectedItem();
                int id = prop.getIdPropietario();
                for (Venta v : vData.obtenerVentasPorPropietario(id)) {
                    // Asigna el TableCellRenderer a la columna específica 
                    jTabla.getColumnModel().getColumn(7).setCellRenderer(numberRenderer);
                    String conyugue;
                    if (v.getConyugue() == null) {
                        conyugue = "N/A.";
                    } else {
                        conyugue = v.getConyugue().toString();
                    }
                    modelo.addRow(new Object[]{
                        v.getIdVenta(), v.getFecha(), v.getInmueble(), v.getPropietario(),
                        v.getCliente(), conyugue, v.getEscribano(), v.getPrecioVenta(),
                        v.getMoneda(), v.getEstadoEscriturizacion(),v.getDetallesVenta()

                    });
                }
                jTabla.repaint();
            }

        }
    }//GEN-LAST:event_jcPropietarioItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        int fila = jTabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una Venta de la tabla.", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (fila != -1) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea dar de baja la Venta seleccionada?", "Atención!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (resp == 0) {
                ven = vData.buscarVenta((int) modelo.getValueAt(fila, 0));
                int id = ven.getIdVenta();
                System.out.println(ven);
                vData.eliminarVenta(id);
                
            } 
        }
        modelo.removeRow(fila);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
    if (evt.getClickCount() == 2) {
            int fila = jTabla.getSelectedRow(); // Obtiene la fila seleccionada al hacer doble clic
            if (fila >= 0) {
                ModificarVenta mv = new ModificarVenta(); //Creo un objeto del internalFrame
                Menu.Escritorio.add(mv);//llamo al escritorio del menu y agrego el internal
                mv.toFront();//con este metodo hago que el internal se muestre delante del internal que lo llama
                mv.setVisible(true);//metodo para mostrar el internal 
            }
            if (fila != -1) {
                
                LocalDate fecha =  (LocalDate) jTabla.getValueAt(fila, 1);// creo una variable y e asigno el valor a transferir

                Inmueble in =  (Inmueble) jTabla.getValueAt(fila, 2);
                Propietario pro = (Propietario) jTabla.getValueAt(fila, 3);
                Cliente cli = (Cliente) jTabla.getValueAt(fila, 4);
                Conyugue con = cli.getConyugue();
                Escribano esc = (Escribano) jTabla.getValueAt(fila, 6);
                double pre = (double) jTabla.getValueAt(fila, 7);
                String mon = (String) jTabla.getValueAt(fila, 8);
                String escri = (String) jTabla.getValueAt(fila, 9);
                String deta = (String) jTabla.getValueAt(fila,10);

                // Accede al JInternalFrame " ModificarCliente" y llama al método para establecer el valor en el JTextField
                ModificarVenta modificar = obtenerModificarVentaFrame();//metodo que hace referncia a  ModificarVenta
                if (modificar != null) {
                    modificar.setTextFieldValue(fecha,in,pro,cli,con,esc,pre,mon,escri,deta);//Paso por parametros los datos que va a recibir  ModificarCliente
                }
            }
        }
    }//GEN-LAST:event_jTablaMouseClicked

    private void jcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcClienteActionPerformed

    private void jcPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPropietarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcPropietarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRCliente;
    private javax.swing.JRadioButton jRPropietario;
    private javax.swing.JRadioButton jRTodas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JComboBox<Cliente> jcCliente;
    private javax.swing.JComboBox<Propietario> jcPropietario;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Venta Nro.");
        modelo.addColumn("Fecha");
        modelo.addColumn("Inmueble");
        modelo.addColumn("Propietario");
        modelo.addColumn("Cliente");
        modelo.addColumn("Conyugue");
        modelo.addColumn("Escribano");
        modelo.addColumn("Precio");
        modelo.addColumn("Moneda");
        modelo.addColumn("Escriturización");
        modelo.addColumn("Detalles");
        jTabla.setModel(modelo);
    }

    private void borrarFilas() {
        int f = modelo.getRowCount();
        for (int i = f - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void llenarCliente() {
        jcCliente.addItem(null);
        ClienteData cData = new ClienteData();
        for (Cliente c : cData.listarTodosClientesActivos()) {
            jcCliente.addItem(c);
           
        }
    }

    private void llenarPropietario() {
        jcPropietario.addItem(null);
        PropietarioData pData = new PropietarioData();
        for (Propietario p : pData.listarProTodosActivos()) {
            jcPropietario.addItem(p);
        }
    }
    
     private ModificarVenta obtenerModificarVentaFrame() {
        JInternalFrame[] frames = getDesktopPane().getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame instanceof ModificarVenta) {
                return (ModificarVenta) frame;
            }
        }
        return null; // Devuelve null si no se encuentra el frame "DatosClientes"
    }
    
    int getSelectedRow() {
        int fila = jTabla.getSelectedRow(); //To change body of generated methods, choose Tools | Templates.
        return fila;
    }
}
