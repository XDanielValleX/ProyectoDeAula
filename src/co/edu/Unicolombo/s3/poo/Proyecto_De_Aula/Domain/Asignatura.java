/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain;

/**
 *
 * @author daniel
 */
public class Asignatura {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private int creditosAcademicos;
    private int añoAcademico;
    private String semestre;
    private String horarioClases;
    private Evaluacion evaluaciones;
    private Grupo grupos;
    private Alumno alumnos;
    
    public Asignatura(){
        
        
    }
    
    public Asignatura(String codigo, String nombre, String descripcion, int creditosAcademicos, int añoAcademico, String semestre, String horarioClases, Evaluacion evaluaciones, Grupo grupos, Alumno aloumnos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creditosAcademicos = creditosAcademicos;
        this.semestre = semestre;
        this.horarioClases = horarioClases;
        this.evaluaciones = evaluaciones;
        this.grupos = grupos;
        this.alumnos = aloumnos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCreditosAcademicos() {
        return creditosAcademicos;
    }

    public int getAñoAcademico() {
        return añoAcademico;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getHorarioClases() {
        return horarioClases;
    }

    public Evaluacion getEvaluaciones() {
        return evaluaciones;
    }

    public Grupo getGrupos() {
        return grupos;
    }

    public Alumno getAlumnos() {
        return alumnos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCreditosAcademicos(int creditosAcademicos) {
        this.creditosAcademicos = creditosAcademicos;
    }

    public void setAñoAcademico(int añoAcademico) {
        this.añoAcademico = añoAcademico;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setHorarioClases(String horarioClases) {
        this.horarioClases = horarioClases;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", creditosAcademicos=" + creditosAcademicos + ", a\u00f1oAcademico=" + añoAcademico + ", semestre=" + semestre + ", horarioClases=" + horarioClases + ", evaluaciones=" + evaluaciones + ", grupos=" + grupos + ", alumnos=" + alumnos + '}';
    }

    
    
}
