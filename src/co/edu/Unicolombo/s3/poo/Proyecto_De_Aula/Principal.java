package co.edu.Unicolombo.s3.poo.Proyecto_De_Aula;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.VentanaPrincipalLogIn;
import co.edu.Unicolombo.s3.poo.Proyecto_De_Aula.Gui.PantallaDeCarga;

public class Principal {


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            PantallaDeCarga pantalla = new PantallaDeCarga();
            pantalla.setVisible(true);
            pantalla.iniciarCarga();
        });
    }
}
