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
public class Articulo {
   private String NombreArticulo; 
   private String Serie; 
   private String Fecha_adquisicion; 
   private String Area; 
   private String CategoriaArticulo; 

    public Articulo() {
    }

    public Articulo(String NombreArticulo, String Serie, String Fecha_adquisicion, String Area, String CategoriaArticulo) {
        this.NombreArticulo = NombreArticulo;
        this.Serie = Serie;
        this.Fecha_adquisicion = Fecha_adquisicion;
        this.Area = Area;
        this.CategoriaArticulo = CategoriaArticulo;
    }

    /**
     * @return the NombreArticulo
     */
    public String getNombreArticulo() {
        return NombreArticulo;
    }

    /**
     * @param NombreArticulo the NombreArticulo to set
     */
    public void setNombreArticulo(String NombreArticulo) {
        this.NombreArticulo = NombreArticulo;
    }

    /**
     * @return the Serie
     */
    public String getSerie() {
        return Serie;
    }

    /**
     * @param Serie the Serie to set
     */
    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    /**
     * @return the Fecha_adquisicion
     */
    public String getFecha_adquisicion() {
        return Fecha_adquisicion;
    }

    /**
     * @param Fecha_adquisicion the Fecha_adquisicion to set
     */
    public void setFecha_adquisicion(String Fecha_adquisicion) {
        this.Fecha_adquisicion = Fecha_adquisicion;
    }

    /**
     * @return the Area
     */
    public String getArea() {
        return Area;
    }

    /**
     * @param Area the Area to set
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * @return the CategoriaArticulo
     */
    public String getCategoriaArticulo() {
        return CategoriaArticulo;
    }

    /**
     * @param CategoriaArticulo the CategoriaArticulo to set
     */
    public void setCategoriaArticulo(String CategoriaArticulo) {
        this.CategoriaArticulo = CategoriaArticulo;
    }
   
   
}
