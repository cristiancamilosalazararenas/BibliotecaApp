/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 *
 * Modelo que permite representar a una persona
 * @author Cristian Camilo Salazar Arenas
 * @since 20250311
 * @version 24
 */
public class Persona {
    /////////////////////////////////////////
    //////Atributos
    /**
    * Nombre de la persona
    */
    private String nombre;
    /**
    * Cédula de ciudadania de la persona
    */
    private String domuentoIdentidad;
    /**
    * Email de la persona
    */
    private String correoElectronico;
    
    
    ////////////////////////////////////////////////////////////////
    ///Método constructor

    public Persona(String nombre, String domuentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.domuentoIdentidad = domuentoIdentidad;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomuentoIdentidad() {
        return domuentoIdentidad;
    }

    public void setDomuentoIdentidad(String domuentoIdentidad) {
        this.domuentoIdentidad = domuentoIdentidad;
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
