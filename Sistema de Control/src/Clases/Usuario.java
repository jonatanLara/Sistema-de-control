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
public class Usuario extends Persona{
    private String Nombre_de_Usuario;
    private String Contrasena;
    private String Nive;
    
    public Usuario(){
    }
    
    public Usuario(String Nombre_de_Usuario, String Contrasena, String Nive) {
        this.Nombre_de_Usuario = Nombre_de_Usuario;
        this.Contrasena = Contrasena;
        this.Nive = Nive;
    }

    /**
     * @return the Nombre_de_Usuario
     */
    public String getNombre_de_Usuario() {
        return Nombre_de_Usuario;
    }

    /**
     * @param Nombre_de_Usuario the Nombre_de_Usuario to set
     */
    public void setNombre_de_Usuario(String Nombre_de_Usuario) {
        this.Nombre_de_Usuario = Nombre_de_Usuario;
    }

    /**
     * @return the Contrasena
     */
    public String getContrasena() {
        return Contrasena;
    }

    /**
     * @param Contrasena the Contrasena to set
     */
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    /**
     * @return the Nive
     */
    public String getNive() {
        return Nive;
    }

    /**
     * @param Nive the Nive to set
     */
    public void setNive(String Nive) {
        this.Nive = Nive;
    }
    
    
    public void Nuevo_usuario(){
    }
    public void Editar_Usuario(){
    }
    public void EliminarUsuario(){
    }
    
}
