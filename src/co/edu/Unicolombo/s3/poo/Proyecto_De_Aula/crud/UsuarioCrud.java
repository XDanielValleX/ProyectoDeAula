/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Usuario;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main.ICrudModel;
/**
 *
 * @author daniel
 */
public class UsuarioCrud implements ICrudModel<Usuario> {

    private HashMap<String, Usuario> bdUsuarios;

    @Override
    public void agregar(Usuario objeto) throws Exception {
        try{
            if(bdUsuarios.containsKey(objeto.getID())){
                throw new UnsupportedOperationException("// No se encontro el Usuario //");
            }
            bdUsuarios.put(objeto.getID(), objeto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Usuario buscar(String dni) throws Exception {
        try {
            if(!bdUsuarios.containsKey(dni)){
                throw new UnsupportedOperationException("// No existe //");
            }
            return bdUsuarios.get(dni);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void editar(Usuario objeto) throws Exception {
        try {
            if(!bdUsuarios.containsKey(objeto.getID())){
                throw new Exception("// El Usuario no esta registrado //");
            }
            bdUsuarios.put(objeto.getNombres(), objeto);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(String dni) throws Exception {
        
        try {
            if(!bdUsuarios.containsKey(dni)){
                throw new Exception("// El Usuario no existe //");
            }
            
            bdUsuarios.remove(dni);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Usuario> listarTodo() throws Exception {
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            
            if(bdUsuarios.isEmpty()){
                
            throw new Exception("// No hay elementos //");
                
            }
            for(Map.Entry<String, Usuario> indentificacion : bdUsuarios.entrySet()){
            
            // String obligatorio = indentificacion.getKey();
            Usuario usuario = indentificacion.getValue();
            
            usuarios.add(usuario);
            }
            return usuarios;
        
        } catch (Exception e){
            
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public int contar() throws Exception {
        List<Usuario> numeroUsuarios = listarTodo();
        
        int NumeroUsuarios = 0;
        
        try {
            NumeroUsuarios = numeroUsuarios.size();
                if(NumeroUsuarios == 0){
            
            throw new Exception("// No hay elementos //");
            }
                return NumeroUsuarios;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
