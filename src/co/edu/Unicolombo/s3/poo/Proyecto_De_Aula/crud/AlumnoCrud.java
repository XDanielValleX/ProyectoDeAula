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
public class AlumnoCrud implements ICrudModel<Alumno> {

    private HashMap<String, Alumno> bdAlumno;

    @Override
    public void agregar(Alumno objeto) throws Exception {
        try{
            if(bdAlumno.containsKey(objeto.getCodigoEstudiante())){
                throw new UnsupportedOperationException("// No se encontro el Alumno //");
            }
            bdAlumno.put(objeto.getCodigoEstudiante(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Alumno buscar(String numeroMatricula) throws Exception{
        try {
            if(!bdAlumno.containsKey(numeroMatricula)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdAlumno.get(numeroMatricula);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Alumno objeto) throws Exception {
        try {
            if(!bdAlumno.containsKey(objeto.getCodigoEstudiante())){
                throw new Exception("// El Alumno no esta registrado //");
            }
            bdAlumno.put(objeto.getCodigoEstudiante(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void eliminar(String numeroMatricula) throws Exception {
        
        try {
            if(!bdAlumno.containsKey(numeroMatricula)){
                throw new Exception("// El Alumno no existe //");
            }
            
            bdAlumno.remove(numeroMatricula);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }



    @Override
    public List<Alumno> listarTodo() throws Exception {
        List<Alumno> alumnos = new ArrayList<>();
        
        try {
            
            if(bdAlumno.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Alumno> indentificacion : bdAlumno.entrySet()){
            
            //String obligatorio = indentificacion.getKey();
            Alumno alumno = indentificacion.getValue();
            
            alumnos.add(alumno);
            }
            return alumnos;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }


    @Override
    public int contar() throws Exception {
        List<Alumno> numeroAlumnos = listarTodo();
        
        int NumeroAlumnos = 0;
        
        try {
            NumeroAlumnos = numeroAlumnos.size();
                if(NumeroAlumnos == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroAlumnos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}