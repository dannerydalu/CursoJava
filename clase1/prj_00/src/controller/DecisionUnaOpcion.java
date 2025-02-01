package controller;

/**
 *
 * @author Alumno
 */
public class DecisionUnaOpcion {

    public static void main(String[] args) {
        //Determinar si un año es bisiesto
        // el año debe ser multiplo de 4 pero
        // no de 100, pero sì de 400
        int anio = 2000;
        boolean r = anio % 4 == 0 && 
                anio % 100 != 0 ||
                anio%400==0;
        if (r==true){
            System.out.println(anio +" es bisiesto");
        }
    }

}
