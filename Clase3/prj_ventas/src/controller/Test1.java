package controller;
import model.Cliente;
import model.ClienteJuridico;

/**
 *
 * @author Luz Dannery
 */
public class Test1 {
    public static void main(String[] args) {
        Cliente clien1=new Cliente("Juan",1500);
        System.out.println(clien1);
        
        model.ClienteNatural clienN1=new model.ClienteNatural("12345678", "Ana Abad",
                5000,"Av Lima 123","ana@gmail.com",2015);
        System.out.println(clienN1);
        System.out.println("Antigüedad del cliente natural: "+clienN1.getAntiguedad());
        
        ClienteJuridico clienJ1=new ClienteJuridico("20102030401","Empresa ABC", "Av. Tupac Amaru",
            100000,"empabc@abc.com",2020,"10020030","José Pérez");
        System.out.println(clienJ1);
    }
}
