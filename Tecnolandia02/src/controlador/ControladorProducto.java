/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Producto;
import modelo.Usuario;

/**
 *
 * @author Ivnn
 */
public class ControladorProducto {
    
    public boolean agregarProducto (Producto producto)
    {
        try {
            
            Conexion con = new Conexion ();
            Connection cnt = con.obtenerConexion();
            
            String consulta = "INSERT INTO productos (codigo,descripcion,precio,stock_minimo,stock_actual,tipo_Producto) VALUES(?,?,?,?,?,?)";
            
            PreparedStatement ps = cnt.prepareStatement(consulta);
            
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getPrecio());
            ps.setInt(4, producto.getStockMinimo());
            ps.setInt(5, producto.getStockActual());
            ps.setString(6, producto.getTipoProducto());
            
            
            ps.executeUpdate(); //actualiza los datos de la tabla
            ps.close();
            cnt.close();
            
            return true;
            
            
        } catch (SQLException e) {
            
            System.out.println("Error bd: "+e.getMessage());
            return false;
     }
    
    }

    public Producto buscarProductoPorCodigo (int codigo) 
   {
       Producto producto = new Producto ();

        try {

            Conexion con = new Conexion ();
            Connection cnt = con.obtenerConexion();

            String consulta = "SELECT codigo,descripcion,precio,stock_minimo,stock_actual,tipo_producto FROM productos WHERE codigo =?";
            PreparedStatement ps = cnt.prepareStatement(consulta);
            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                producto.setCodigo(rs.getInt("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStockMinimo(rs.getInt("stock_minimo"));
                producto.setStockActual(rs.getInt("stock_actual"));
                producto.setTipoProducto(rs.getString("tipo_producto"));

            }
            rs.close();
            ps.close();
            cnt.close();

        } catch (SQLException e) {

            System.out.println("Error bd: "+e.getMessage());

        }
        return producto; 
    }
    
    
    public boolean actualizar (Producto producto)
    {
        try {

            Conexion con = new Conexion ();
            Connection cnt = con.obtenerConexion();
            String consulta = "UPDATE productos SET codigo = ?,descripcion = ?,precio = ?,stock_minimo = ?,stock_actual = ?,tipo_producto = ? WHERE codigo =?";
            PreparedStatement ps = cnt.prepareStatement(consulta);

            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getDescripcion());
            ps.setInt(3, producto.getPrecio());
            ps.setInt(4, producto.getStockMinimo());
            ps.setInt(5, producto.getStockActual());
            ps.setString(6, producto.getTipoProducto());
            ps.setInt(7, producto.getCodigo());

            ps.executeUpdate(); //actualiza los datos de la tabla
            ps.close();
            cnt.close();

            return true;


        } catch (SQLException e) {

            System.out.println("Error bd: "+e.getMessage());
            return false;
        }
    }
    
       public boolean eliminar(int codigo)
    {
         try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
            String consulta = "DELETE FROM productos WHERE codigo = ?";
            PreparedStatement ps = cnt.prepareStatement(consulta);

            ps.setInt(1, codigo);
            
            ps.executeUpdate();
            ps.close();
            cnt.close();
            return true;
            
        } catch (SQLException e) {
            
            System.out.println("Error bd: "+ e.getMessage());
            return false;
        }
    }
       
       
       public ArrayList<Producto> traerTodo()
    {
    
        ArrayList<Producto> productos = new ArrayList<>();
        
         Conexion con = new Conexion();
        Connection cnx = con.obtenerConexion();
        
        String consulta = "SELECT codigo,descripcion,precio,stock_minimo,stock_actual,tipo_producto FROM productos";
        
        try {
             PreparedStatement ps = cnx.prepareStatement(consulta);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next())
             {
             
                 Producto l = new Producto();
                 
                 l.setCodigo(rs.getInt("codigo"));
                 l.setDescripcion(rs.getString("descripcion"));
                 l.setPrecio(rs.getInt("precio"));
                 l.setStockMinimo(rs.getInt("stock_minimo"));
                 l.setStockActual(rs.getInt("stock_actual"));
                 l.setTipoProducto(rs.getString("tipo_producto"));
                 
           
                 
                 productos.add(l); //AGREGAR EL LIBRO A LA COLECCION.
               
             }
             rs.close();
             ps.close();
             cnx.close();
             
        } catch (Exception ex) {
            System.out.println("ERROR SQL"+ex.getMessage());
            
        }
        
        
        return productos;
        
    }
 
       
       

       
       
       
       
}
