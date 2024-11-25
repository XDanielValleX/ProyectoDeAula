/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model.Alumno;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author daniel
 */
public class AlumnoCrud extends AbstractCrud<Alumno> {
    
    protected String getTabla() {
        return "alumnos";
    }
    

   protected String[] getColumnas() {
        return new String[]{"codigo_estudiante", "nombres", "apellidos", "email"};
    }

 

    @Override
     protected Object[] getValues(Alumno alumno) {
        return new Object[]{
            alumno.getCodigoEstudiante(),
            alumno.getNombres(),
            alumno.getApellidos(),
            alumno.getEmail()
        };
    }

    protected Alumno mapResultSetToEntity(ResultSet rs) throws SQLException {
        Alumno alumno = new Alumno();
        alumno.setCodigoEstudiante(rs.getString("codigo_estudiante"));
        alumno.setNombres(rs.getString("nombres"));
        alumno.setApellidos(rs.getString("apellidos"));
        alumno.setEmail(rs.getString("email"));
        return alumno;
    }
    @Override
     protected String getIdentificador(Alumno alumno) {
        return alumno.getCodigoEstudiante();
    }
} 