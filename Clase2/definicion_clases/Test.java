
/**
 * Esta clase es para probar las funcionalidades de las clases definidas
 *
 */
public class Test
{
   public static void main (String args[]){
       //Definición/creación del objeto
       // nombre_clases nombre_objeto;
       Alumno alum1;
       
       // Inicializar el objeto (darle un espacio en memoria)
       // Opcionalmente darle valores iniciales
       //alum1=null;  // Es nada (no tiene espacio en memoria)
       
       //  ... muchas lineas adelante se requiere llenar datos
       alum1= new Alumno(); // asignar espacio de memoria
       
       // recien se puede usar el objeto alum1
       alum1.registrarAlumno(12345, "Tello","Angie",4);
       
       // Mostramos los datos
       alum1.mostrarCarnet();
       
       System.out.println("----------------------------------");
       
       // Probar Curso
       Curso curs1 = new Curso();
       curs1.registrarCurso(0001, "Java I", "25/02/2025");
       curs1.mostrar();
       curs1.modificarFechaInicio("01/02/2025");
       curs1.mostrar();
   }
       
}
