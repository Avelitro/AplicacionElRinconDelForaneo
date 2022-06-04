/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import entity.usuario;

/**
 *
 * @author rheve
 */
public class DatabaseConnection {
    private Connection con;
    private static Statement mStatement;
    private static ResultSet mResultSet;
    // Conceccion a la base de datos
    public DatabaseConnection() {
        con = null;
        mStatement = null;
        mResultSet = null;
    }

    public boolean Conectar() {
        try {
           //con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/elrincon_delfora", "joseabel1", "12345678");
            con = DriverManager.getConnection("jdbc:mysql://localhost/elrincon_delforaneo","root","");
            return con != null;
        } catch (Exception e) {
            return false;
        }
    }
    public void Desconectar() {
        try {
            this.con.close();
        } catch (Exception e) {
        }
    }
    
    public Boolean createUsuario(usuario nUsuario) {
        try {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO usuarios VALUES ('" + nUsuario.getIdUsuario() + "','" + nUsuario.getNombres() 
                    + "','" + nUsuario.getApellidos() + "','" + nUsuario.getCorreo() + "','" + nUsuario.getContrasena() + "','" + nUsuario.getTipoUsuario() + "')");
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }
        
    }
    
    public usuario getUsuarioByCorreo(String correo) {
        usuario mUsuario = null;
         try {
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM usuarios WHERE correo = '" + correo + "' ");
            while (mResultSet.next()){
                mUsuario = new usuario();
                mUsuario.setIdUsuario(mResultSet.getInt("idUsuario"));
                mUsuario.setNombres(mResultSet.getString("nombres"));
                mUsuario.setApellidos(mResultSet.getString("apellidos"));
                mUsuario.setCorreo(mResultSet.getString("correo"));
                mUsuario.setContrasena(mResultSet.getString("contraseña"));
                mUsuario.setTipoUsuario(mResultSet.getString("tipoUsuario"));
                return mUsuario;
            }
        } catch (SQLException e) {
            return null;
        }
        return mUsuario;
    }
}
