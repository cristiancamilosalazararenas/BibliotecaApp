
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

//Clase Autor

/**
 * Modelo que permite representar a una clase llamada Autor
 *
 * @author Cristian Camilo Salazar Arenas
 * @version 1.1, 11/03/2025
 * @since 1.0
 */

public class Autor extends Persona{
    
    /**
     * Nombre del editorial asociado con el autor
     */
    
    private String editorial;
    
    /**
     * Nombre de la profesión del autor
     */
    private String profesion;
    
    //Método constructor
    
    /**
     * Este es el método constructor de la clase llamada Autor
     * 
     * @param       nombre                  Nombre del autor
     * @param       documentoIdentidad      Documento de identidad del autor      
     * @param       correoElectronico       Correo electrónico del autor
     * @param       editorial               Editorial asociada con el autor
     * @param       profesion               Profesión del autor
     * @since       1.0
     */

    public Autor(String nombre, String documentoIdentidad, String correoElectronico, String editorial, String profesion) {
        super(nombre, documentoIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
    public Autor(String nombre, String editorial){
        super(nombre, "N/A", "N/A");
        this.editorial = editorial;
    }
    //Métodos de acceso
    
    /**
     * Accede al nombre de la editorial del autor
     * 
     * @return Retorna el nombre de la editorial  
     * @since 1.0
     */

    public String getEditorial() {
        return editorial;
    }
    
    /**
     * Establece el nombre de la editorial del autor si no está vacío
     * Si el nombre de la editorial está vacío, no se realiza ningún cambio
     * 
     * @param       editorial       Nombre de la editorial
     * @implNote    Este método no lanza una excepción, pero ignora valores vacíos
     * @since       1.0
     */

    public void setEditorial(String editorial) {
        if (!editorial.isEmpty()){
            this.editorial = editorial;
        }
    }
    
    /**
     * Accede a la profesión del autor
     * 
     * @return Retorna la profesión del autor
     * @since 1.0
     */

    public String getProfesion() {
        return profesion;
    }
    
    /**
     * Establece el nombre de la profesión del autor si no está vacío
     * Si el nombre de la profesión está vacío, no se realiza ningún cambio
     * 
     * @param       profesion       Nombre de la profesión
     * @implNote    Este método no lanza una excepción, pero ignora valores vacíos
     * @since 1.0
     */
    
    public void setProfesion(String profesion) {
        if (!profesion.isEmpty()){
            this.profesion = profesion;
        }
    }   
}
