
package model;

/**
 *
 * @author Luz Dannery
 */
public class ProductoFerreteria extends Producto{
    private int stock;
    private String size;
    public ProductoFerreteria(double precio, String codigo){
        super("Clavos");
        this.codigo=codigo;
        this.precio=precio;
        stock=400;
        size="1/2 plg";
        
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoFerreteria{" + "stock=" + stock + ", size=" + size + super.toString()+'}';
    }
    
}
