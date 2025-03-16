package autonoma.biblioteca.main;

// @author vanes

import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.models.Libro;
import autonoma.biblioteca.models.Autor;

import autonoma.biblioteca.views.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaMain {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        VentanaPrincipal ventana = new VentanaPrincipal(biblioteca);
        ventana.setVisible(true);
    }
}
