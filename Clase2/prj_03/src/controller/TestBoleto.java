
package controller;
import model.Boleto;

/**
 *
 * @author Luz Dannery
 */
public class TestBoleto {
    public static void main(String[] args) {
        Boleto b1=new Boleto("LIMA","TRUJILLO");
        System.out.println(b1);
        Boleto b2=new Boleto("ICA","AREQUIPA");
        System.out.println(b2);
        Boleto b3=new Boleto("TACNA","MOQUEGUA");
        System.out.println(b3);
    }
}
