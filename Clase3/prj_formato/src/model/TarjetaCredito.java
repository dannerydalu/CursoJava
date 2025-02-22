/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luz Dannery
 */
public class TarjetaCredito extends FormaPago {
    private int cantCuotas;
    private String nro_tarjeta;
    public TarjetaCredito(double monto){
        super("Tarjeta de Crédito");
        cantCuotas=1;
        nro_tarjeta="";
        this.monto=monto;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    

    
    
}
