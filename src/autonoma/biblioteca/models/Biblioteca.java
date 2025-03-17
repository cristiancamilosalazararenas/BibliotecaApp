package autonoma.biblioteca.models;

/**
 * Clase Biblioteca
 * 
 * @author Vanessa Toro
 * @version 20250316
 * @since 1.0
 */
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    /**
     * Constructor de la clase Biblioteca
     * Inicializa la lista de libros
     */
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    /**
     * Muestra todos los libros disponibles en la biblioteca
     * 
     * @return String con los detalles de los libros o un mensaje indicando que no hay libros
     */
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca";
        }
        String librosS = "";
        
        for (int i = 0; i < this.libros.size(); i++) {
            Libro libroS = this.libros.get(i);
            librosS += libroS.getTitulo() + "\n " + libroS.getId() + "\n "+ libroS.getAutor().getNombre() +"\n"+ libroS.getAutor().getEditorial()+ "\n";
        }
        return librosS;
    }

    /**
     * Agrega un nuevo libro a la biblioteca
     * 
     * @param libro Libro a agregar
     * @return true si se agrego correctamente, false en caso contrario
     */
    public boolean agregarLibro(Libro libro) {
        return this.libros.add(libro);
    }

    /**
     * Busca un libro en la biblioteca por su id
     * 
     * @param id Identificador del libro
     * @return El libro encontrado o null si no existe
     */
    public Libro buscarLibro(long id) {
        for (int i = 0; i < libros.size(); i++) {
            if (this.libros.get(i).getId() == id) {
                return this.libros.get(i);
            }
        }
        return null;
    }

    /**
     * Actualiza un libro existente en la biblioteca
     * 
     * @param id Identificador del libro a actualizar
     * @param libro Nuevo libro con la informacion nueva
     * @return true si se actualizo correctamente, false si el libro no existe
     */
    public boolean actualizarLibro(long id, Libro libro) {
        for (int i = 0; i < this.libros.size(); i++) {
            if (this.libros.get(i).getId() == id) {
                this.libros.set(i, libro);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un libro de la biblioteca por su id
     * 
     * @param id Identificador del libro a eliminar
     * @return true si se elimino correctamente, false si el libro no existe
     */
    public boolean eliminarLibro(long id) {
        for (int i = 0; i < this.libros.size(); i++) {
            if (this.libros.get(i).getId() == id) {
                this.libros.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Ordena y devuelve la lista de libros en orden alfabetico segun su título.
     * 
     * @return ArrayList de libros ordenados alfabeticamente
     */
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