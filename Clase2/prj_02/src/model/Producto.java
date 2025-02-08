package model;

import java.util.Objects;

/**
 *
 * @author Luz Dannery
 */
public class Producto {

    private int cod_prod;
    private String nombre;
    private Double precio;
    private int stock;

    //Constructor
    public Producto(int cod_prod, String nombre, Double precio, int stock) {
        if (cod_prod == 0) {
            this.cod_prod = cod_prod;
        } else {
            System.out.println("");
        }

        this.nombre = nombre; //this es una referencia a la clase en curso
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
        this.stock = stock;
    }

    // sobrecarga
    public Producto(int cod_prod, String nombre) {
        this.cod_prod = cod_prod;
        this.nombre = nombre; //this es una referencia a la clase en curso
        this.precio = 0.0;
        this.stock = 0;
    }

    public boolean EsVendible() {
        boolean esVendible = true;
        if (cod_prod == 0 || nombre.equals("SIN NOMBRE") || stock == 0 || precio == 0) {
            esVendible = false;
        }
        return esVendible;
    }

    //constructor vacio
    public Producto() {
        this.cod_prod = 0;
        this.nombre = "SIN NOMBRE"; //this es una referencia a la clase en curso
        this.precio = 0.0;
        this.stock = 0;
    }

    // Método para obtener (get) el código del producto
    public int getCod_prod() {
        return cod_prod;
    }

    //Método para guardar/asignar (set) el codigo del producto
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    //Para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_prod=" + cod_prod + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    

    @Override

    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.cod_prod;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.cod_prod != other.cod_prod) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
}
