package model;

public class Alumno
{
    private int cod_alum;
    private String apellidos;
    private String nombres;
    private String DNI;
    private String especialidad;
    private String fec_nacim;
    private String fec_inscrip;
    private int anio_estudios;
    // Constructores - Inicializadores de los objetos o instancias
    public Alumno (int cod, String ape, String nom,
                                int anio_est){
        cod_alum=cod;
        apellidos=ape;
        nombres=nom;
        anio_estudios=anio_est;
    }
    public Alumno (){
        cod_alum=0;
        apellidos="";
        nombres="";
        anio_estudios=-1;
    }
    // método/operaciones
    public void registrarAlumno(int cod, String ape, String nom,
                                int anio_est){
        cod_alum=cod;
        apellidos=ape;
        nombres=nom;
        anio_estudios=anio_est;
    }
    public int obtenerAnioEstudios(){
        return anio_estudios;
    }
    
    public void mostrarCarnet(){
        System.out.println("----------------------------" );
        System.out.println("Codigo          :" + cod_alum);
        System.out.println("Apellidos       :" +apellidos);
        System.out.println("Nombres         :" +nombres);
        System.out.println("Año de estudios :" +anio_estudios);
    }
    
}
