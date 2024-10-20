/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model.Profesor;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class ProfesorCrud implements ICrudModel<Profesor> {

    private HashMap<String, Profesor> bdProfesor;


    @Override
    public void agregar(Profesor objeto) throws Exception {
        try{
            if(bdProfesor.containsKey(objeto.getID())){
                throw new UnsupportedOperationException("// No se encontro el Profesor //");
            }
            bdProfesor.put(objeto.getID(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Profesor buscar(String dni) throws Exception{
        try {
            if(!bdProfesor.containsKey(dni)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdProfesor.get(dni);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Profesor objeto) throws Exception {
        try {
            if(!bdProfesor.containsKey(objeto.getNombres())){
                throw new Exception("// El Profesor no esta registrado //");
            }
            bdProfesor.put(objeto.getNombres(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(String dni) throws Exception {
        
        try {
            if(!bdProfesor.containsKey(dni)){
                throw new Exception("// El Profesor no existe //");
            }
            
            bdProfesor.remove(dni);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Profesor> listarTodo() throws Exception {
        List<Profesor> profesores = new ArrayList<>();
        
        try {
            
            if(bdProfesor.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Profesor> indentificacion : bdProfesor.entrySet()){
            
            // String obligatorio = indentificacion.getKey();
            Profesor profesor = indentificacion.getValue();
            
            profesores.add(profesor);
            }
            return profesores;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<Profesor> numeroProfesores = listarTodo();
        
        int NumeroProfesores = 0;
        
        try {
            NumeroProfesores = numeroProfesores.size();
                if(NumeroProfesores == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroProfesores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
