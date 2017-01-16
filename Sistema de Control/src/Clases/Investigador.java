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
public class Investigador extends Persona{
    private String ESNI;
    private String Correo;
    private String Direccion;
    private String Telefono;
    private String Campo;//Campo de estudio
    public void Investigador(){
    }

    public Investigador(String ESNI, String Correo, String Direccion, String Telefono, String Campo) {
        this.ESNI = ESNI;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Campo = Campo;
    }

    /**
     * @return the ESNI
     */
    public String getESNI() {
        return ESNI;
    }

    /**
     * @param ESNI the ESNI to set
     */
    public void setESNI(String ESNI) {
        this.ESNI = ESNI;
    }

    /**
     * @return the Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo the Correo to set
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Campo
     */
    public String getCampo() {
        return Campo;
    }

    /**
     * @param Campo the Campo to set
     */
    public void setCampo(String Campo) {
        this.Campo = Campo;
    }
    
    public void NuevoInvestigador(){
    }
    public void EditarInvestigador(){
    }
    public void EliminarInvestigador(){
    }
}
