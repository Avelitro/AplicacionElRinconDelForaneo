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
import entity.Platillos;
import java.sql.PreparedStatement;
import java.util.ArrayList;


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
    
    public int createUsuario(usuario nUsuario) {
        try {
            mStatement = con.createStatement();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (nombres,apellidoPaterno,apellidoMaterno,correo,contraseña,tipoUsuario) VALUES ('" + "','" + nUsuario.getNombres() 
                    + "','" + nUsuario.getApellidoPaterno()+ "','" + nUsuario.getApellidoMaterno()+ "','" + nUsuario.getCorreo() + "','" + nUsuario.getContrasena() + "','" + nUsuario.getTipoUsuario() + "')",Statement.RETURN_GENERATED_KEYS);
            
            int status = ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (!rs.next()) throw new RuntimeException("no devolvió el ID");
                int idUsuario = rs.getInt(1);
                return idUsuario;
            }
            
        } catch (SQLException e) {
            System.err.println(e.toString());
            return 0;
        }
        
    }
    //Consulta para crear Establecimiento
    public Boolean createEstablecimiento(int idUsuario) {
        try {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO establecimientos VALUES ('','"+idUsuario+"','','','')");
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
                // mUsuario.setApellidos(mResultSet.getString("apellidos"));
                mUsuario.setCorreo(mResultSet.getString("correo"));
                mUsuario.setContrasena(mResultSet.getString("contraseña"));
                mUsuario.setTipoUsuario(mResultSet.getString("tipoUsuario"));
                return mUsuario;
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
            return null;
        }
        return mUsuario;
    }
    //Consulta para que nos regrese el id del Usuario
    public int getIdUsuario(String correo) {
        int id=0;
         try {
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT idUsuario FROM usuarios WHERE correo = '" + correo + "' ");
            while (mResultSet.next()){
                id=mResultSet.getInt("idUsuario");
            }
        } catch (SQLException e) {
            return id;
        }
        return id;
    }
    
    public Boolean createMenu(int idEstablecimiento) {
        try {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO menu VALUES ('','"+idEstablecimiento+"')");
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }
    }
    
    //Consulta para que nos regresa un establecimiento
    public long getEstablecimientoByUsuario(long idUsuario) {
        long idEstablecimiento=0;
         try {
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM establecimientos WHERE idUsuario = '" + idUsuario + "' ");
            while (mResultSet.next()){
                idEstablecimiento=mResultSet.getLong("idEstablecimiento");
            }
        } catch (SQLException e) {
            return 0;
        }
        return idEstablecimiento;
    }
    
    public Boolean crearPlatillo(Platillos platillo) {
        int aux=0;
        try {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO platillos VALUES ('" + platillo.getIdPlatillo()+ "','" + platillo.getNombrePlatillo()
                    + "','" + platillo.getDescripcion()+ "','" + platillo.getPrecio()+ "','" + platillo.getIdEstablecimiento()+ "','" + aux + "')");
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }
    }
    
    public ArrayList<Platillos> recibirPlatillos(long idEstablecimiento){
        ArrayList<Platillos> platillos = new ArrayList<>();   
        System.out.println("Tamaño "+idEstablecimiento);
        try{
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM platillos WHERE idEstablecimiento = '" + idEstablecimiento + "' ");
            
            while(mResultSet.next()){
                Platillos platillo = new Platillos();
                platillo.setIdPlatillo(mResultSet.getLong("idPlatillo"));
                platillo.setNombrePlatillo(mResultSet.getString("nombrePlatillo"));
                platillo.setDescripcion(mResultSet.getString("descripcion"));
                platillo.setPrecio(mResultSet.getFloat("precio"));
                platillo.setIdEstablecimiento(mResultSet.getLong("idEstablecimiento"));
                platillo.setValidado(mResultSet.getInt("validado"));
                platillos.add(platillo);
            }
            
            return platillos;
        } catch (SQLException e){
            return null;
        }
        //return platillos;
    }
    
    public boolean modificarMenu(long idPlatillo,int valor){
        //System.out.println("\n"+idPlatillo +"  "+valor);
        try{
            mStatement.executeUpdate("UPDATE platillos SET validado = ' "+ valor +" ' WHERE platillos.idPlatillo = ' "+idPlatillo+" ' ");
            return true;
        } catch (SQLException e){
            System.err.println(e.toString());
            return false;
        }
        
    }
    
    public int marcadorChecbox(long idPlatillo){
        int validez = -1;
        try{
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT validado FROM `platillos` WHERE idPlatillo = '"+idPlatillo+"' ");
            while(mResultSet.next())
                validez = mResultSet.getInt("validado");
        } catch(SQLException e){
            System.err.println(e.toString());
            return -1;
        }
        
        return validez;
    }
    
    public ArrayList<String> getEstablecimiento(long idEstablecimiento){
        ArrayList<String> establecimiento = new ArrayList<>();  
        try{
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT nombreEstablecimiento,direccion,telefono FROM establecimientos WHERE idEstablecimiento = '" + idEstablecimiento + "' ");
            
            while(mResultSet.next()){
                establecimiento.add(mResultSet.getString("nombreEstablecimiento"));
                establecimiento.add(mResultSet.getString("direccion"));
                establecimiento.add(mResultSet.getString("telefono"));
            }
            return establecimiento;
        } catch (SQLException e){
            return null;
        }
        //return platillos;
    }
    
    //Listar platillos

    public boolean eliminarPlatillo(long idPlatillo){
        try{
            mStatement.executeUpdate("DELETE FROM platillos WHERE idPlatillo = '" + idPlatillo + "' ");
            return true;
       }catch(SQLException e){
           System.err.println(e.toString());
            return false;
        }
    }
}


