/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Evaluacion {
    protected String id;
    protected String nombre;
    protected String descripcion;
    protected String tipo;
    protected String semestre;
    protected int numeroPreguntas;
    protected float nota;
    // protected OperacionNota operacionNotas;
    protected Date fecha;
    protected List<Asignatura> asignaturas;

    public Evaluacion(){

    }

    public Evaluacion(String id, String nombre, String descripcion, String tipo, String semestre, int numeroPreguntas, float nota, Date fecha, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.semestre = semestre;
        this.numeroPreguntas = numeroPreguntas;
        this.nota = nota;
        this.fecha = fecha;
        this.asignaturas = asignaturas;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSemestre() {
        return semestre;
    }

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public float getNota() {
        return nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evaluacion{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo + ", semestre=" + semestre + ", numeroPreguntas=" + numeroPreguntas + ", nota=" + nota + ", fecha=" + fecha + ", asignaturas=" + asignaturas + '}';
    }

    
    
}

