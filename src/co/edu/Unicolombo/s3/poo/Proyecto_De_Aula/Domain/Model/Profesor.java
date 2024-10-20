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
public class Profesor extends Usuario {
    private String departamentoAcademico;
    private String cargo;
    private Date fechaInicioContrato;
    private Date fechaFinContrato;
    private List<Asignatura> AsociadasAsi;
    
    public Profesor(){
    
}

    public Profesor(String departamentoAcademico, String cargo, Date fechaInicioContrato, Date fechaFinContrato, List<Asignatura> AsociadasAsi) {
        this.departamentoAcademico = departamentoAcademico;
        this.cargo = cargo;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.AsociadasAsi = AsociadasAsi;
    }

    public String getDepartamentoAcademico() {
        return departamentoAcademico;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public List<Asignatura> getAsociadasAsi() {
        return this.AsociadasAsi;
    }

    public void setDepartamentoAcademico(String departamentoAcademico) {
        this.departamentoAcademico = departamentoAcademico;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamentoAcademico=" + departamentoAcademico + ", cargo=" + cargo + ", fechaInicioContrato=" + fechaInicioContrato + ", fechaFinContrato=" + fechaFinContrato + ", AsociadasAsi=" + AsociadasAsi + '}';
    }
    
}


    /*
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento académico: " + departamentoAcademico);
        System.out.println("Cargo: " + cargo);
    }
}
*/