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
public class Oficio {
    private String Fecha;
    private String Emisor;
    private String Receptor;
    private String Usuario;
    private String Descripcion;
    private String Oficio;

    public Oficio() {
    }

    public Oficio(String Fecha, String Emisor, String Receptor, String Usuario, String Descripcion, String Oficio) {
        this.Fecha = Fecha;
        this.Emisor = Emisor;
        this.Receptor = Receptor;
        this.Usuario = Usuario;
        this.Descripcion = Descripcion;
        this.Oficio = Oficio;
    }

    /**
     * @return the Fecha
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Emisor
     */
    public String getEmisor() {
        return Emisor;
    }

    /**
     * @param Emisor the Emisor to set
     */
    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    /**
     * @return the Receptor
     */
    public String getReceptor() {
        return Receptor;
    }

    /**
     * @param Receptor the Receptor to set
     */
    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Oficio
     */
    public String getOficio() {
        return Oficio;
    }

    /**
     * @param Oficio the Oficio to set
     */
    public void setOficio(String Oficio) {
        this.Oficio = Oficio;
    }
    
    public void CrearOficio(){
    }
    public void EliminarOficio(){
    }
    public void ArchivoOficio(){
    }
}
