/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import java.sql.ResultSet;
import java.sql.SQLException;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model.Profesor;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class ProfesorCrud extends AbstractCrud implements ICrudModel<Profesor> {
 protected String getTabla() {
        return "profesores";
    }
    
    @Override
    protected String[] getColumnas() {
        return new String[]{"id", "nombres", "apellidos", "especialidad"};
    }
    
    protected Object[] getValues(Profesor profesor) {
        return new Object[]{
            profesor.getID(),
            profesor.getNombres(),
            profesor.getApellidos(),
            profesor.getEspecialidad()
        };
    }
    
    @Override
    protected Profesor mapResultSetToEntity(ResultSet rs) throws SQLException {
        Profesor profesor = new Profesor();
        profesor.setID(rs.getString("id"));
        profesor.setNombres(rs.getString("nombres"));
        profesor.setApellidos(rs.getString("apellidos"));
        profesor.setEspecialidad(rs.getString("especialidad"));
        return profesor;
    }
    }
   