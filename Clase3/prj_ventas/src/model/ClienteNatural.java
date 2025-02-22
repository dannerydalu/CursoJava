/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luz Dannery
 */
//ClienteNatural es subclase de la superclase Cliente
public class ClienteNatural extends Cliente {
    private String DNI;
    
    public ClienteNatural (String DNI, String nombre, double capacidad_compra){
        super(nombre,capacidad_compra);
        this.DNI=DNI;
    }
    public ClienteNatural(String DNI,String nombre, double capacidad_compra,
            String domicilio, String email, int anio_inscrip){
        super(nombre, capacidad_compra, domicilio, email, anio_inscrip);
        this.DNI=DNI;
    }
    public int getAntiguedad(){
        return 2025-anio_inscrip;
    }

    @Override
    public String toString() {
        return "ClienteNatural{" + "DNI=" + DNI +" "+ super.toString()+ '}';
    }
    
    
}
