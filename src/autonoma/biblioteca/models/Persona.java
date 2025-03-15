package autonoma.biblioteca.models;

//Clase abstracta Persona

/**
 * Modelo que permite representar a una clase abstracta llamada Persona
 *
 * @author Cristian Camilo Salazar Arenas
 * @version 1.1, 11/03/2025
 * @since 1.0
 */

public abstract class Persona {
    
    //Atributos

    /**
     *Nombre de la persona
     */
    
    protected String nombre;
    
    /**
     *Cédula de ciudadania de la persona
     */
    
    protected String documentoIdentidad;
    
    /**
     *Correo electrónico de la persona
     */
    
    protected String correoElectronico;
    
    //Método constructor

    /**
     * Este es el método constructor de la clase abstracta llamada Persona
     *
     * @param     nombre                 Nombre de la persona
     * @param     documentoIdentidad     Documento de identidad de la persona
     * @param     correoElectronico      Correo electrónico de la persona
     * @since 1.0
     */

    protected Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }
    
    //Métodos de acceso
    
    /** 
     * Accede al nombre de la persona
     * 
     * @return retorna el nombre de la persona
     * @since 1.0
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /** 
     * Establece el nombre de la persona si no está vacío
     * Si el nombre está vacío, no se realiza ningún cambio
     * 
     * @param        nombre      Nombre de la persona
     * @implNote     Este método no lanza una excepción, pero ignora valores vacíos
     * @since 1.0
     */

    public void setNombre(String nombre) {
        if (!nombre.isEmpty()){
            this.nombre = nombre;
        } //En el interfaz escribir "Por favor, escriba un nombre"
    }
    
    /**
     * Accede al documento de identidad de la persona.
     * 
     * @return retorna el documento de identidad de la persona
     * @since 1.0
     */
    
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    
    /**
     * Establece el documento de identidad de la persona si no está vacío
     * Si el documento de identidad está vacío, no se realiza ningún cambio
     * 
     * @param        documentoIdentidad      Documento de identidad de la persona
     * @implNote     Este método no lanza una excepción, pero ignora valores vacíos
     * @since 1.0
     */

    public void setDocumentoIdentidad(String documentoIdentidad) {
        if(!documentoIdentidad.isEmpty()){
            this.documentoIdentidad = documentoIdentidad;
        }
    }
    
    /**
     * Accede al correo electrónico de la persona
     * 
     * @return retorna el correo electrónico de la persona
     * @since 1.0
     */

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    /** 
     * Establece el correo electrónico de la persona si no está vació
     * Si el correo electrónico está vacío, no se realiza ningún cambio
     * 
     * @param        correoElectronico      Correo electrónico de la persona
     * @implNote     Este método no lanza una excepción, pero ignora valores vacíos
     * @since 1.0
     */

    public void setCorreoElectronico(String correoElectronico) {
        if(!correoElectronico.isEmpty()){
            this.correoElectronico = correoElectronico;
        }
    }   
}
