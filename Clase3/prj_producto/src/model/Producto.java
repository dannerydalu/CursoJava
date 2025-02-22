
package model;


public abstract class Producto {
    protected String codigo;
    protected double precio;
    protected String name_product;
    
    public Producto(String name_producto){
        this.name_product=name_producto;
        precio=0.0;
        codigo="";
        
    }

    @Override
    public String toString() {
        return " Producto{" + "codigo=" + codigo + ", precio=" + precio + ", name_product=" + name_product + '}';
    }

   
    
    
}
