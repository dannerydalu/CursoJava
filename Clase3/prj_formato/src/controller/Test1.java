
package controller;
import model.*;

/**
 *
 * @author Luz Dannery
 */
public class Test1 {
    static void pagar(FormaPago pago){
        System.out.println("Forma de pago: "+pago);
        if(pago instanceof TarjetaCredito){
            System.out.println("Pedir el n�mero de tarjeta y numero de cuotas");
        }else if(pago instanceof Yape){
            System.out.println("Indicar numero de telefono");
        }
    }
    public static void main(String[] args) {
        //En el proceso de venta
        FormaPago pago1=new Efectivo(150);
        pagar(pago1);
        
        pago1=new TarjetaCredito(529.90);
        pagar(pago1);
        
        pago1=new Yape(2.5);
        pagar(pago1);
    }
}
