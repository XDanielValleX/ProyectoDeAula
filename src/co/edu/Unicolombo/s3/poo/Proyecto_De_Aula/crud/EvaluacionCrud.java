/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Evaluacion;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class EvaluacionCrud implements ICrudModel<Evaluacion> {

    private HashMap<String, Evaluacion> bdEvaluacion;


    @Override
    public void agregar(Evaluacion objeto) throws Exception {
        try{
            if(bdEvaluacion.containsKey(objeto.getNombre())){
                throw new UnsupportedOperationException("// No se encontro la Evaluacion //");
            }
            bdEvaluacion.put(objeto.getNombre(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Evaluacion buscar(String nombre) throws Exception{
        try {
            if(!bdEvaluacion.containsKey(nombre)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdEvaluacion.get(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Evaluacion objeto) throws Exception {
        try {
            if(!bdEvaluacion.containsKey(objeto.getNombre())){
                throw new Exception("// La Evaluacion no esta registrada //");
            }
            bdEvaluacion.put(objeto.getNombre(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(String nombre) throws Exception {
        
        try {
            if(!bdEvaluacion.containsKey(nombre)){
                throw new Exception("// El Alumno no existe //");
            }
            
            bdEvaluacion.remove(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Evaluacion> listarTodo() throws Exception {
        List<Evaluacion> evaluaciones = new ArrayList<>();
        
        try {
            
            if(bdEvaluacion.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Evaluacion> indentificacion : bdEvaluacion.entrySet()){
            
            //String obligatorio = indentificacion.getKey();
            Evaluacion alumno = indentificacion.getValue();
            
            evaluaciones.add(alumno);
            }
            return evaluaciones;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<Evaluacion> numeroEvaluaciones = listarTodo();
        
        int NumeroEvaluaciones = 0;
        
        try {
            NumeroEvaluaciones = numeroEvaluaciones.size();
                if(NumeroEvaluaciones == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroEvaluaciones;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}