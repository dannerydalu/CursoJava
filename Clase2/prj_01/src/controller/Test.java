package controller;
/*import model.Alumno;
import model.Curso;*/
import model.*;
/**
 * Esta clase es para probar las funcionalidades de las clases definidas
 *
 */
public class Test
{
   public static void main (String args[]){
       //Definición/creación del objeto
       // nombre_clases nombre_objeto;
       Alumno alum1,alum2;
       
       // Inicializar el objeto (darle un espacio en memoria)
       // Opcionalmente darle valores iniciales
       //alum1=null;  // Es nada (no tiene espacio en memoria)
       
       //  Asiganr espacio de memoria para alum1 y de paso
       //  poner valores iniciales
       alum1= new Alumno(4444, "Abad", "Ana", 1); // asignar espacio de memoria
       alum2= new Alumno();
       // recien se puede usar el objeto alum1
       //alum1.registrarAlumno(12345, "Tello","Angie",4);
       
       // Mostramos los datos
       alum1.mostrarCarnet();
       
       alum2.registrarAlumno(12345, "Tello", "Angie", 4);
       alum2.mostrarCarnet();
       
       /*System.out.println("----------------------------------");
       
       // Probar Curso
       Curso curs1 = new Curso();
       curs1.registrarCurso(0001, "Java I", "25/02/2025");
       curs1.mostrar();
       curs1.modificarFechaInicio("01/02/2025");
       curs1.mostrar();
       */
   }
       
}
