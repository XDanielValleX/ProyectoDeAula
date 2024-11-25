/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model.Alumno;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class AlumnoCrud extends AbstractCrud implements ICrudModel<Alumno> {

    @Override
    protected String getTabla() {
        return "alumnos";
    }
    
    @Override
    protected String[] getColumnas() {
        return new String[]{"codigo_estudiante", "nombres", "apellidos", "email"};
    }
    
    protected Object[] getValues(Alumno alumno) {
        return new Object[]{
            alumno.getCodigoEstudiante(),
            alumno.getNombres(),
            alumno.getApellidos(),
            alumno.getEmail()
        };
    }
    
    @Override
    protected Alumno mapResultSetToEntity(ResultSet rs) throws SQLException {
        Alumno alumno = new Alumno();
        alumno.setCodigoEstudiante(rs.getString("codigo_estudiante"));
        alumno.setNombres(rs.getString("nombres"));
        alumno.setApellidos(rs.getString("apellidos"));
        alumno.setEmail(rs.getString("email"));
        return alumno;
    }
    
    protected String getIdentificador(Alumno alumno) {
        return alumno.getCodigoEstudiante();
    }

    @Override
    protected Object[] getValues(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String getIdentificador(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregar(Alumno objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alumno buscar(String texto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editar(Alumno objeto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}