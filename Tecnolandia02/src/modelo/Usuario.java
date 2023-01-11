
package modelo;


public class Usuario {
    
    private String correo, clave;
    private int idUsuario;

    public Usuario() {
    }

    public Usuario(String correo, String clave, int idUsuario) {
        this.correo = correo;
        this.clave = clave;
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

   
  
    
    
}
