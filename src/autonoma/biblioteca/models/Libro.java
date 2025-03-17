package autonoma.biblioteca.models;

/**
 * Representa un libro en la biblioteca.
 * Contiene un identificador único y un título.
 * 
 * @author truji
 */
public class Libro {
    /**
     * Identificador único del libro.
     */
    private long id;
    
    /**
     * Título del libro.
     */
    private String titulo;
    
    /**
     * Título del libro.
     */
    private Autor autor;
   

    public Libro(long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    

    /**
     * Obtiene el identificador del libro.
     * 
     * @return el identificador del libro.
     */
    public long getId() {
        return id;
    }

    /**
     * Establece el identificador del libro.
     * 
     * @param id el nuevo identificador del libro.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return el título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * 
     * @param titulo el nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
}
