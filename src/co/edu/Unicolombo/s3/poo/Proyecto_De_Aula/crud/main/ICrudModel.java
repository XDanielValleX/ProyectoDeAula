/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.crud.main;

import java.util.List;

/**
 *
 * @author daniel
 * @param <Clase>
 */
public interface ICrudModel<Clase> {
    
    public void agregar(Clase objeto) throws Exception;
    
    public Clase buscar(String texto) throws Exception;
    
    public void editar(Clase objeto) throws Exception;
    
    public void eliminar(String texto) throws Exception;
    
    public List<Clase> listarTodo() throws Exception;
    
    public int contar() throws Exception;
}
