/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model.Asignatura;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class AsignaturaCrud implements ICrudModel<Asignatura> {

    private HashMap<String, Asignatura> bdAsignatura;


    @Override
    public void agregar(Asignatura objeto) throws Exception {
        try{
            if(bdAsignatura.containsKey(objeto.getNombre())){
                throw new UnsupportedOperationException("// No se encontro el Alumno //");
            }
            bdAsignatura.put(objeto.getNombre(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Asignatura buscar(String nombre) throws Exception{
        try {
            if(!bdAsignatura.containsKey(nombre)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdAsignatura.get(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Asignatura objeto) throws Exception {
        try {
            if(!bdAsignatura.containsKey(objeto.getNombre())){
                throw new Exception("// La Asignatura no esta registrado //");
            }
            bdAsignatura.put(objeto.getNombre(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(String nombre) throws Exception {
        
        try {
            if(!bdAsignatura.containsKey(nombre)){
                throw new Exception("// El Alumno no existe //");
            }
            
            bdAsignatura.remove(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Asignatura> listarTodo() throws Exception {
        List<Asignatura> asignaturas = new ArrayList<>();
        
        try {
            
            if(bdAsignatura.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Asignatura> indentificacion : bdAsignatura.entrySet()){
            
            //String obligatorio = indentificacion.getKey();
            Asignatura alumno = indentificacion.getValue();
            
            asignaturas.add(alumno);
            }
            return asignaturas;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<Asignatura> numeroAsignaturas = listarTodo();
        
        int NumeroAsignaturas = 0;
        
        try {
            NumeroAsignaturas = numeroAsignaturas.size();
                if(NumeroAsignaturas == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroAsignaturas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
