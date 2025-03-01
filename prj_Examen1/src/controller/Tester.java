
package controller;

import model.*;

/**
 *
 * @author Luz Dannery
 */
public class Tester {
    /*static void tpers(Persona pers){
            System.out.println("Tipo de persona es un "+pers);
            
    }*/
    public static void main(String[] args) {
        Conductor pers1=new Conductor("2222345","0000111","Luis");
        Pasajero pers2=new Pasajero("A001","71486258","Lolita");
        //tpers(pers1);
        //tpers(pers2);
        Viaje trip=new Viaje("PeruNorte001","Lima","Barranca");
        trip.addConductor(pers1);
        trip.addPasajero(pers2);
        trip.addPasajero(new Pasajero("B001","12569034","Lucia"));
        System.out.println(trip);
        trip.mostrarConductores();
        trip.mostrarPasajero();
        
    }
}
