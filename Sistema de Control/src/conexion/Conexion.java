/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    private String bd = "dbcoesicydet";
    private String login = "usuario";//user
    private String password = "consejo2016";//contraseña :3306
    private String url = "jdbc:mysql://192.168.1.64:3306/" + bd;
    private Connection conn ;
    private Statement sentencia = null;
    private boolean isEmpyConection;
    
    public Conexion(){}
    /**
     *Devuelve la conexion 
     */
    public Connection conctarDB(){
         conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url,login,password);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "problema al conetar"+e);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    /**
     * Este metodo hace la funcion de conectar la base de datos
     */
    public void conectar(){
        try {
            String controlador = "com.mysql.jdbc.Driver";
            Class.forName(controlador).newInstance();
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("Error de controlador posiblemente no tenga esta libreria");
        }
        try {
            String DSN = url;
            String user = login;
            conn =(Connection) DriverManager.getConnection(DSN,user,password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No esta activa la conexion "+e);
        }
        try {
            sentencia = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            //notify.notifyConection("Conexion ", "Conexion exitosa",true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "se produjo un problema al conectar con la base de datos");
            
        }
    }
    
    public void NuevoElemento(){
    }
    public void EditarElemento(){
    }
    public void BorrarElemento(){
    }
    
    /***
     * 
     * @return la conexion en falso o verdadero
     */
    public boolean isEmpyConexion(){
           return isEmpyConection;
    }
    /***
     * 
     * me desconecta de la base de datos
     */
    public void Desconectar(){
        conn = null;
    }
    /***
     * 
     * @return el Statement
     */
    public Statement getStatement(){
        return sentencia;
    }
    /***
     * 
     * @return la Connection
     */
    public Connection getConnection(){
        return  conn;
    }
}
