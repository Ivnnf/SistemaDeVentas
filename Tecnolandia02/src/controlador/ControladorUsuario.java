/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Usuario;
import java.sql.*;


/**
 *
 * @author Ivnn
 */
public class ControladorUsuario {
    
     public boolean agregar(Usuario usuario)
    {
    
        try {
            
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
            
            String consulta = "INSERT INTO usuario(correo, clave) VALUES(?,?)";
            PreparedStatement ps = cnt.prepareStatement(consulta);
            ps.setString(1, usuario.getCorreo());
            ps.setString(2, usuario.getClave());
            
            ps.executeUpdate();
            ps.close();
            cnt.close();
            
            return true;
            
        } catch (SQLException e) {
            
            System.out.println("Error bd: "+ e.getMessage());
            return false;
        }
    
    }
    
     public Usuario validarUsuario (String correo, String clave)
        {
            Usuario usuario = new Usuario (); 
        try {

            Conexion con = new Conexion ();
            Connection cnt = con.obtenerConexion();

            String consulta = "SELECT Correo, Clave FROM usuario where Correo = ? and Clave = ?";
            PreparedStatement ps = cnt.prepareStatement(consulta);
            ps.setString(1, correo); 
            ps.setString(2, clave); 

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                usuario.setCorreo(rs.getString("Correo"));
                usuario.setClave(rs.getString("Clave"));
            }

            rs.close(); 
            ps.close();
            cnt.close();

          


        } catch (SQLException e) {

            System.out.println("Error bd: "+e.getMessage());
           
        }
            return usuario;

        }
     
   
     
     
}
