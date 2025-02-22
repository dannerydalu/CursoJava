/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luz Dannery
 */
public class ClienteJuridico extends Cliente {
    private String RUC;
    private String DNI_repre_legal;
    private String nombres_repre_legal;

    public ClienteJuridico(String RUC, String razon_social, String domicilio,
            double capacidad_compra, String email, int anio_inscrip, 
            String DNI_repre_legal, String nombres_repre_legal) {
        super(razon_social, capacidad_compra, domicilio, email, anio_inscrip);
        this.RUC = RUC;
        this.DNI_repre_legal = DNI_repre_legal;
        this.nombres_repre_legal = nombres_repre_legal;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" + "RUC=" + RUC + ", DNI_repre_legal=" +
                DNI_repre_legal + ", nombres_repre_legal=" +
                nombres_repre_legal + ", "+super.toString() +'}';
    }
    
}
