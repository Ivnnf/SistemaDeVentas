/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Ivnn
 */
public class MenuProductos extends javax.swing.JFrame {

    /**
     * Creates new form MenuProductos
     */
    public MenuProductos() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mni_agregar = new javax.swing.JMenuItem();
        mni_modificar = new javax.swing.JMenuItem();
        mni_buscarproductos = new javax.swing.JMenuItem();
        mni_venta = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        mni_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setText("Menú");

        mni_agregar.setText("Agregar");
        mni_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_agregarActionPerformed(evt);
            }
        });
        menu.add(mni_agregar);

        mni_modificar.setText("Modificar y Eliminar");
        mni_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_modificarActionPerformed(evt);
            }
        });
        menu.add(mni_modificar);

        mni_buscarproductos.setText("Listar Productos");
        mni_buscarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_buscarproductosActionPerformed(evt);
            }
        });
        menu.add(mni_buscarproductos);

        mni_venta.setText("Venta");
        mni_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_ventaActionPerformed(evt);
            }
        });
        menu.add(mni_venta);

        jMenuBar1.add(menu);

        salir.setText("Salir");

        mni_Salir.setText("Salir");
        mni_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_SalirActionPerformed(evt);
            }
        });
        salir.add(mni_Salir);

        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_agregarActionPerformed
        AgregarProducto cl = new AgregarProducto();
        cl.setVisible(true);
        
        
    }//GEN-LAST:event_mni_agregarActionPerformed

    private void mni_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_modificarActionPerformed
        // TODO add your handling code here:
        EditarProducto ep = new EditarProducto();
        ep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mni_modificarActionPerformed

    private void mni_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mni_SalirActionPerformed

    private void mni_buscarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_buscarproductosActionPerformed
        // TODO add your handling code here:
        VerProductos cl = new VerProductos();
        cl.setVisible(true);
    }//GEN-LAST:event_mni_buscarproductosActionPerformed

    private void mni_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_ventaActionPerformed
        // TODO add your handling code here:
        Venta cl = new Venta();
        cl.setVisible(true);
    }//GEN-LAST:event_mni_ventaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem mni_Salir;
    private javax.swing.JMenuItem mni_agregar;
    private javax.swing.JMenuItem mni_buscarproductos;
    private javax.swing.JMenuItem mni_modificar;
    private javax.swing.JMenuItem mni_venta;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
