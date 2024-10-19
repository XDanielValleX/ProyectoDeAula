/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Grupo;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;

/**
 *
 * @author daniel
 */
public class GrupoCrud implements ICrudModel<Grupo> {

    private HashMap<String, Grupo> bdGrupo;


    @Override
    public void agregar(Grupo objeto) throws Exception {
        try{
            if(bdGrupo.containsKey(objeto.getNombre())){
                throw new UnsupportedOperationException("// No se encontro el Grupo //");
            }
            bdGrupo.put(objeto.getNombre(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Grupo buscar(String nombre) throws Exception{
        try {
            if(!bdGrupo.containsKey(nombre)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdGrupo.get(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Grupo objeto) throws Exception {
        try {
            if(!bdGrupo.containsKey(objeto.getNombre())){
                throw new Exception("// El Grupo no esta registrado //");
            }
            bdGrupo.put(objeto.getNombre(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void eliminar(String nombre) throws Exception {
        
        try {
            if(!bdGrupo.containsKey(nombre)){
                throw new Exception("// El Grupo no existe //");
            }
            
            bdGrupo.remove(nombre);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Grupo> listarTodo() throws Exception {
        List<Grupo> grupos = new ArrayList<>();
        
        try {
            
            if(bdGrupo.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Grupo> indentificacion : bdGrupo.entrySet()){
            
            //String obligatorio = indentificacion.getKey();
            Grupo grupo = indentificacion.getValue();
            
            grupos.add(grupo);
            }
            return grupos;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<Grupo> numeroGrupos = listarTodo();
        
        int NumeroGrupos = 0;
        
        try {
            NumeroGrupos = numeroGrupos.size();
                if(NumeroGrupos == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroGrupos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
