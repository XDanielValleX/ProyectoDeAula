/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model.Profesor;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author daniel
 */
public class ProfesorCrud extends AbstractCrud<Profesor> {
    @Override
    protected String getTabla() {
        return "profesores";
    }

    @Override
   protected String[] getColumnas() {
        return new String[]{"id", "nombres", "apellidos", "especialidad"};
    }

    /**
     *
     * @param profesor
     * @return
     */
    @Override
    protected Object[] getValues(Profesor profesor) {
        return new Object[]{
            profesor.getID(),
            profesor.getNombres(),
            profesor.getApellidos(),
        };
    }

    @Override
   protected Profesor mapResultSetToEntity(ResultSet rs) throws SQLException {
        Profesor profesor = new Profesor();
        profesor.setID(rs.getString("id"));
        profesor.setNombres(rs.getString("nombres"));
        profesor.setApellidos(rs.getString("apellidos"));
        return profesor;
    }

    @Override
   protected String getIdentificador(Profesor profesor) {
        return profesor.getID();
    }
}

