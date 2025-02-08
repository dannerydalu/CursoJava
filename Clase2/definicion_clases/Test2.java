

public class Test2
{
    // instance variables - replace the example below with your own
    public static void main (String args[]){
        Curso curs1;
        curs1= new Curso();
        
        curs1.registrarCurso(1201,"Java I","01/02/2025");
       
       // Mostramos los datos
        curs1.mostrar();
        curs1.modificarFechaInicio("08/02/2025");
        curs1.mostrar();
    }
}
