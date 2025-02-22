/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luz Dannery
 */
public class ProductoFarmacia extends Producto {
    private int stock;
    private String date_exp;
    private String presentación;
    public ProductoFarmacia(double precio, String codigo){
        super("Paracetamol");
        this.codigo=codigo;
        this.precio=precio;
        stock=100;
        date_exp="02/2028";
        presentación="Jarabe";
        
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(String date_exp) {
        this.date_exp = date_exp;
    }

    public String getPresentación() {
        return presentación;
    }

    public void setPresentación(String presentación) {
        this.presentación = presentación;
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
        return "ProductoFarmacia{" + "stock=" + stock + ", date_exp=" + date_exp + ", presentaci\u00f3n=" + presentación + super.toString()+'}';
    }
    
}
