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
import entity.establecimiento;
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
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (nombres,apellidoPaterno,apellidoMaterno,correo,contraseña,tipoUsuario) VALUES ('"  + nUsuario.getNombres() 
                    + "','" + nUsuario.getApellidoPaterno() + "','" + nUsuario.getApellidoMaterno() + "','" + nUsuario.getCorreo() + "','" + nUsuario.getContrasena() + "','" + nUsuario.getTipoUsuario() + "')",Statement.RETURN_GENERATED_KEYS);
            
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
    public Boolean createEstablecimiento(long idUsuario) {
        try {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO establecimientos (idUsuario,nombreEstablecimiento,direccion,telefono) VALUES ('" + idUsuario + "','','','0')");
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
    //Actualizar informacion del vendedor
    public Boolean actualizarVendedor(String nombreEstablecimiento, String direccion, long telefono,long id) {
        try {
            mStatement = con.createStatement();
            mStatement.execute("UPDATE establecimientos set nombreEstablecimiento='"+nombreEstablecimiento+"',direccion='" +direccion+"',telefono='"+telefono+"' WHERE idEstablecimiento='"+id+"' ");
            return true;
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }
    }
    
    // Listar platillos que son validos de un establecimiento
    public ArrayList<Platillos> listarPlatillosValidos(long idEstablecimiento){
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
                if(platillo.getValidado() == 1){
                    platillos.add(platillo);
                }
            }
            return platillos;
        } catch (SQLException e){
            return null;
        }
    }
    // Crear reservación
    public long createReservacion(long idUsuario,String token) {
        try {
            mStatement = con.createStatement();
            PreparedStatement ps = con.prepareStatement("INSERT INTO reservaciones (idUsuario,token) VALUES ('"  + idUsuario+ "','" + token + "')",Statement.RETURN_GENERATED_KEYS);
            
            int status = ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (!rs.next()) throw new RuntimeException("no devolvió el ID");
                int idReservacion = rs.getInt(1);
                return idReservacion;
            }
            
        } catch (SQLException e) {
            System.err.println(e.toString());
            return 0;
        }
    }
    public void createReservacionPlatillo(long idReservacion,long idPlatillo, int cantidad) {
        try {
            mStatement = con.createStatement();
            mStatement.execute("INSERT INTO reservacionesplatillos  VALUES ('"  + idReservacion + "','" + idPlatillo + "','" + cantidad + "')");
            
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }
    public boolean existeToken(String token) {
        int id=0;
         try {
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM reservaciones WHERE token = '" + token + "' ");
            while (mResultSet.next()){
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }
    
        public ArrayList<establecimiento> listEstablecimiento(){
        ArrayList <establecimiento> listEstablecimientos = new ArrayList<>();
        try{
            mStatement = con.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM establecimientos");
            while(mResultSet.next()){
                establecimiento establecimientos = new establecimiento();
                establecimientos.setIdEstablecimiento(mResultSet.getLong("idEstablecimiento"));
                establecimientos.setIdUsuario(mResultSet.getLong("idUsuario"));
                establecimientos.setDireccion(mResultSet.getString("direccion"));
                establecimientos.setNombreEstablecimiento(mResultSet.getString("nombreEstablecimiento"));
                establecimientos.setTelefono(mResultSet.getLong("telefono"));
                
                listEstablecimientos.add(establecimientos);
            }
            return listEstablecimientos;
        }catch(SQLException e){
            System.err.println(e.toString());
            return null;
        }
        
    }
}