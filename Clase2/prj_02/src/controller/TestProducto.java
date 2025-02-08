package controller;
import model.Producto;

/**
 *
 * @author Luz Dannery
 */
public class TestProducto {
    public static void main(String[] args) {
        Producto p1=new Producto(12345, "Galletas del Norte", 3.5,150);
        Producto p2=new Producto(1111,"Leche Gloria");
        Producto p3=new Producto();
        // Mostrar p1
        System.out.println("p1 es " +p1);
        //Mostrar p2
        System.out.println("p2 es " +p2);
        //Mostrar p3
        System.out.println("p3 es "+p3);
        
        //Prueba de negocio
        //Para vender producto: debe tener stock, debe tener precio, debe tener código,...
        /*if(p1.getStock()>0){
            System.out.println("El producto "+p1.getNombre()+" SI se puede 9vender");
            
        }else{
            System.out.println("El producto "+p1.getNombre()+" NO se puede vender");
        }
        
        if(p2.getStock()>0){
            System.out.println("El producto "+p2.getNombre()+" SI se puede vender");
            
        }else{
            System.out.println("El producto "+p2.getNombre()+" NO se puede vender");
        }*/
        if(p1.EsVendible()){
            System.out.println("El producto "+p1.getNombre()+" es Vendible");
        }
        if (p1.equals(p2)){
            System.out.println(p1.getNombre()+ " es igual a "+ p2.getNombre());
        }else{
            System.out.println(p1.getNombre()+" es diferente a "+p2.getNombre());
        }
        
        //Comparación por atributos
        Producto p4=new Producto(11111, "Leche Gloria");
        if(p2.equals(p4)){
            System.out.println(p2.getNombre()+" es igual a "+p4.getNombre());
        } else {
            System.out.println(p2.getNombre()+" es diferente a "+p4.getNombre());
        }
        
        // Comparación por sus valores hash
        if (p1.hashCode()==p2.hashCode()){
            System.out.println(p1.getNombre()+ " es igual a "+ p2.getNombre());
        }else{
            System.out.println(p1.getNombre()+" es diferente a "+p2.getNombre());
        }
    }
}
