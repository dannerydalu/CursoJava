package model;
public class Curso
{
    private int cod_curso;
    private String nomb_curso;
    private String fec_inicio;
    
    // método/operaciones
    public void registrarCurso(int codigo, String nom_c, String fec_inic){
        cod_curso=codigo;
        nomb_curso=nom_c;
        fec_inicio=fec_inic;
    }
    
    public void mostrar(){
        System.out.println("Codigo         :" + cod_curso);
        System.out.println("Nombre         :" +nomb_curso);
        System.out.println("Fecha de inicio:" +fec_inicio);
    }
    
    public void modificarFechaInicio(String nuevaFecha){
        fec_inicio=nuevaFecha;
    }
    
}
