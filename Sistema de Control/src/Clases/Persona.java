/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String Cargo;
    private boolean Genero;
    
    public Persona(){
    }

    public Persona(String Nombre, String Apellido_Paterno, String Apellido_Materno, String Cargo, boolean Genero) {
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.Cargo = Cargo;
        this.Genero = Genero;
    }
    
    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido_Paterno
     */
    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    /**
     * @param Apellido_Paterno the Apellido_Paterno to set
     */
    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    /**
     * @return the Apellido_Materno
     */
    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    /**
     * @param Apellido_Materno the Apellido_Materno to set
     */
    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    /**
     * @return the Genero
     */
    public boolean isGenero() {
        return Genero;
    }

    /**
     * @param Genero the Genero to set
     */
    public void setGenero(boolean Genero) {
        this.Genero = Genero;
    }
}
