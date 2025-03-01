package model;

import java.util.ArrayList;

/**
 *
 * @author Luz Dannery
 */
public class Viaje {

    private String cod_viaje;
    private String origen;
    private String destino;
    private ArrayList<Conductor> conductor;
    private ArrayList<Pasajero> pasajero;

    public Viaje(String cod_viaje, String origen, String destino) {
        this.cod_viaje = cod_viaje;
        this.origen = origen;
        this.destino = destino;
        this.conductor = new ArrayList<>();
        this.pasajero = new ArrayList<>();
    }

    public void addConductor(Conductor c) {
        conductor.add(c);
    }

    public void addPasajero(Pasajero p) {
        pasajero.add(p);
    }

    public void mostrarConductores() {
        for (Conductor c1 : conductor) {
            System.out.println(c1);
        }

        /**
         *
         */
    }
    public void mostrarPasajero() {
        for (Pasajero p1 : pasajero){
            System.out.println(p1);
        }
    }

    @Override
    public String toString() {
        return "Viaje{" + "cod_viaje=" + cod_viaje + ", origen=" + origen + ", destino=" + destino + ", conductor=" + conductor + ", pasajero=" + pasajero + '}';
    }
    
}
