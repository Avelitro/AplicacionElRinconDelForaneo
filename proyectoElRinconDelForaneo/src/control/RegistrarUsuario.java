/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import entity.usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jose Abel
 */
public class RegistrarUsuario 
{
    private static Statement mStatement;
    private Connection con;
    public Boolean envDataUser(usuario nUsuario) 
    {
        try 
        {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO usuarios VALUES ('" + nUsuario.getIdUsuario() + "','" + nUsuario.getNombres() + "','" 
                    + "','" + nUsuario.getApellidos() + "','" + nUsuario.getCorreo() + "','" + nUsuario.getContrasena() + "','" + nUsuario.getTipoUsuario() + "')");
            return true;
        } 
        catch (SQLException e) 
        {
            System.err.println(e.toString());
            return false;
        } 
    }
}
