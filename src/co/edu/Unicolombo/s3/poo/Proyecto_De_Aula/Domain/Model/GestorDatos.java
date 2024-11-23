/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Domain.Model;

/**
 *
 * @author daniel
 */
import java.util.ArrayList;

public class GestorDatos {
    private ArrayList<DatosListener> listeners = new ArrayList<>();
    
    // Método para agregar un listener
    public void agregarListener(DatosListener listener) {
        listeners.add(listener);
    }

    // Método para notificar a todos los listeners
    public void notificarCambios() {
        for (DatosListener listener : listeners) {
            listener.onDatosCambiados();
        }
    }

    public interface DatosListener {
        void onDatosCambiados();
    }
}