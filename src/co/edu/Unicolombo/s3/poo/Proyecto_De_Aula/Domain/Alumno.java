
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain;

public class Alumno extends Usuario {
    private String codigoEstudiante;
    private String semestre;
    private Grupo grupos;
    
    public Alumno(){
       
    }

    public Alumno(String numeroMatricula, String semestre, Grupo grupos) {
        this.codigoEstudiante = numeroMatricula;
        this.semestre = semestre;
        this.grupos = grupos;
    }

    
    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public String getSemestre() {
        return semestre;
    }

    public Grupo getGrupos() {
        return grupos;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setGrupos(Grupo grupos) {
        this.grupos = grupos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de matrícula: " + codigoEstudiante);
        System.out.println("Semestre: " + semestre);
    }
}