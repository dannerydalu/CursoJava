/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;

/**
 *
 * @author Luz Dannery
 */
public class Test {
     static void tpro(Producto prod){
        System.out.println("Tipo de producto: "+prod);
        
    }
    public static void main(String[] args) {
        
        //Producto product1=new ProductoFarmacia(10,"A001");
        //System.out.println(product1);
        Producto prod1=new ProductoFarmacia(100,"A001");
        tpro(prod1);
        Producto prod2=new ProductoFerreteria(1,"B001");
        tpro(prod2);
        Producto prod3=new PlatoRestaurante(40,"C001");
        tpro(prod3);
    }
    
}
