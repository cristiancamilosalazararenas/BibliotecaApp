package autonoma.biblioteca.models;


///Clase abstracta
/**
 * Modelo que permite representar a una clase abstracta llamada Persona
 *
 * @author Cristian Camilo Salazar Arenas
 * @version 1.0.0
 * @since 20250311
 */

abstract class Persona {
    
    ///Atributos
    /**
    *Nombre de la persona
    */
    private String nombre;
    /**
    *Cédula de ciudadania de la persona
    */
    private String documentoIdentidad;
    /**
    *Correo electrónico de la persona
    */
    private String correoElectronico;
    
    
    
    ///Método constructor
    /**
    * Este es el método constructor de la clase abstracta llamada Persona.
    *
    * @param     nombre                 Nombre de la persona
    * @param     documentoIdentidad     Documento de identidad de la persona
    * @param     correoElectronico      Correo electrónico de la persona
    * @exception ArithmeticException
    *            Si el segundo operando es <pre>0</pre>
    * @see       java.lang.Character#charValue()
    */

    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    //////////////////////
    ///Métodos de acceso
}
