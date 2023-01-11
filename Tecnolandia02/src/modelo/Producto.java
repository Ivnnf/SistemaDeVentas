
package modelo;

import com.mysql.cj.conf.PropertyKey;


public class Producto implements ITecnolandia{
    
    private int codigo,precio,stockMinimo,stockActual;
    private String descripcion, tipoProducto;

    public Producto() {
    }

    public Producto(int codigo, int precio, int stockMinimo, int stockActual, String descripcion, String tipoProducto) {
        this.codigo = codigo;
        this.precio = precio;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
        this.descripcion = descripcion;
        this.tipoProducto = tipoProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public int CalcularDescuento() {
        
       int total=0;
        if("Celular".equals(tipoProducto))
        {
        
            total = (int) (this.precio*(double)dcto_celular);
        
        }
        else if("Computador".equals(tipoProducto))
        {
        
            total = (int) (this.precio*(double)dcto_computador);
        
        }
        else if("Consola".equals(tipoProducto))
        {
        
            total = (int) (this.precio*(double)dcto_consola);
        
        }
        return total;
        
    }
    
    
    
    
    
    
}
