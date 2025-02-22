
package model;

/**
 *
 * @author Luz Dannery
 */
public class PlatoRestaurante extends Producto {
    private String disponibilidad;
    private String termino;
    public PlatoRestaurante(double precio,String codigo){
        super("Lomo fino saltado");
        this.codigo=codigo;
        this.precio=precio;
        disponibilidad="Si";
        termino="medio";
        
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
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
        return "PlatoRestaurante{" + "disponibilidad=" + 
                disponibilidad + ", termino=" + termino + super.toString() +'}';
    }
    
}
