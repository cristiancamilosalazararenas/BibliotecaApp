package autonoma.biblioteca.models;

// @author vanes

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    
    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca";
        }
        String librosS = "";

        for (int i = 0; i < this.libros.size(); i++) {
            Libro libroS = this.libros.get(i);
            librosS += "Nombre: " + libroS.getTitulo() + "\n"
                    + "Id: " + libroS.getId() + "\n";
        }
        return librosS;
    }

    
    public boolean agregarLibro(Libro libro){ //Se recibe como párametro un libro
        return this.libros.add(libro);
    }
    
    public Libro buscarLibro(long id){
        for (int i=0; i< libros.size();i++){
            if (this.libros.get(i).getId() == id){
                return this.libros.get(i);              
            }
        }
        return null; 
    }
    
    public boolean actualizarLibro(long id ,Libro libro){
        for (int i=0; i< this.libros.size();i++){
            if (this.libros.get(i).getId() == id){
                this.libros.set(i, libro);
                return true;              
            }
        }
        return false;
    }
    
    public boolean eliminarLibro(long id){
        for (int i = 0; i < this.libros.size(); i++) {
            if (this.libros.get(i).getId() == id){
                this.libros.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        int n = librosOrdenados.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (librosOrdenados.get(j).getTitulo().compareToIgnoreCase(librosOrdenados.get(j + 1).getTitulo()) > 0) {
                    Libro temp = librosOrdenados.get(j);
                    librosOrdenados.set(j, librosOrdenados.get(j + 1));
                    librosOrdenados.set(j + 1, temp);
                }
            }
        }
        return librosOrdenados;
    }
}
