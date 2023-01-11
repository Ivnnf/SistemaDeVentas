/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;



import controlador.ControladorProducto;
import javax.swing.JOptionPane;
import modelo.Producto;


/**
 *
 * @author imagi
 */
public class EditarProducto extends javax.swing.JFrame {

    /**
     * Creates new form EditarProducto
     */
    public EditarProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_codigo_producto = new javax.swing.JLabel();
        txt_codigo_producto = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        lbl_descripcion = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        lbl_stock_minimo = new javax.swing.JLabel();
        lbl_stock_actual = new javax.swing.JLabel();
        lbl_tipo_producto = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_stock_minimo = new javax.swing.JTextField();
        txt_stock_actual = new javax.swing.JTextField();
        txt_tipo_producto = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_codigo_producto.setText("Código Producto");

        txt_codigo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigo_productoActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        lbl_descripcion.setText("Descripción");

        lbl_precio.setText("Precio de venta");

        lbl_stock_minimo.setText("Stock mínimo");

        lbl_stock_actual.setText("Stock actual");

        lbl_tipo_producto.setText("Tipo de producto");

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Editar Producto");

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tipo_producto)
                            .addComponent(lbl_stock_actual)
                            .addComponent(lbl_stock_minimo)
                            .addComponent(lbl_precio)
                            .addComponent(lbl_descripcion)
                            .addComponent(lbl_codigo_producto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_descripcion)
                            .addComponent(txt_stock_minimo)
                            .addComponent(txt_precio)
                            .addComponent(txt_stock_actual)
                            .addComponent(txt_tipo_producto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(btn_buscar)))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo_producto)
                    .addComponent(txt_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_descripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_precio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_precio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_stock_minimo)
                            .addComponent(txt_stock_minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_stock_actual)
                            .addComponent(txt_stock_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipo_producto)
                            .addComponent(txt_tipo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_volver)
                    .addComponent(btn_eliminar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        
          //obtener campos ingresados por el usuario
        int codigo = Integer.parseInt(txt_codigo_producto.getText());
        String descripcion = txt_descripcion.getText();
        int precio = Integer.parseInt(txt_precio.getText());
        int stock_actual = Integer.parseInt(txt_stock_actual.getText());
        int stock_minimo = Integer.parseInt(txt_stock_minimo.getText());
        String tipo_Producto = txt_tipo_producto.getText();

        //instanciar controlador
        ControladorProducto cl = new ControladorProducto();
        Producto producto = new Producto(codigo, precio, stock_minimo, stock_actual, descripcion, tipo_Producto);
        cl.actualizar(producto);
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
      //obtener rut ingresado
        int codigo = Integer.parseInt(txt_codigo_producto.getText());
   
        //llamar a controlador
    
        ControladorProducto cl = new ControladorProducto();

        //llamar a metodo buscar usuario
        Producto prod = cl.buscarProductoPorCodigo(codigo);
        if (String.valueOf(prod.getCodigo())!=null)
        {
            txt_codigo_producto.setText(String.valueOf(prod.getCodigo()));
            txt_descripcion.setText(prod.getDescripcion());
            txt_precio.setText(String.valueOf(prod.getPrecio()));
            txt_stock_actual.setText(String.valueOf(prod.getStockActual()));
            txt_stock_minimo.setText(String.valueOf(prod.getStockMinimo()));
            txt_tipo_producto.setText(prod.getTipoProducto());
        }
        
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
        MenuProductos au = new MenuProductos();
        au.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_volverActionPerformed

    private void txt_codigo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigo_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigo_productoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        ControladorProducto cl = new ControladorProducto();
        int codigo = Integer.valueOf(txt_codigo_producto.getText());
        cl.eliminar(codigo);
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_codigo_producto;
    private javax.swing.JLabel lbl_descripcion;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_stock_actual;
    private javax.swing.JLabel lbl_stock_minimo;
    private javax.swing.JLabel lbl_tipo_producto;
    private javax.swing.JTextField txt_codigo_producto;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_stock_actual;
    private javax.swing.JTextField txt_stock_minimo;
    private javax.swing.JTextField txt_tipo_producto;
    // End of variables declaration//GEN-END:variables
}