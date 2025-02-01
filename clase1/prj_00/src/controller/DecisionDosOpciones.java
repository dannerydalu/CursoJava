package controller;

/**
 *
 * @author Alumno
 */
public class DecisionDosOpciones {

    public static void main(String[] args) {
        double nota = 25;
        if (nota > 20 || nota < 0) {
            System.out.println("Calificacion INVALIDA");
        } else if (nota >= 14 && nota <= 20) {
            System.out.println("Aprobado con " + nota);
        } else if (nota < 14 && nota > 10) {
            System.out.println("PARA SUSTITUTORIO " + nota);
        } else {
            System.out.println("DESAPROBADO con " + nota);
        }

    }

}
