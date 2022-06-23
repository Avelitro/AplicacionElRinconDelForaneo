package entity;

import clases.*;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * Clase Usuario
 * 
 * Contiene informacion de cada usuario
 * @author rheve
 */
public class usuario {
    //Atributos 
    /**
     * Identificador del usuario
     */
    private int idUsuario;
    /**
     * Nombres del usuario
     */
    private String nombres;
    /**
     * Apellidos del usuario
     */
    private String apellidoPaterno;
    private String apellidoMaterno;
    /**
     * Correo del usuario
     */
    private String correo;
    /**
     * Contraseña del usuario
     */
    private String contraseña;
    /**
     * Tipo de usuario
     */
    private String tipoUsuario;
    /**
     * variable para encriptar contraseña
     */
    String secretKey = "contrasena";
    /**
     * Constructor por defecto
     */
    public usuario() {
    }
    //Funciones publicos
    /**
     * 
     * Funcion que retorna el Identificador del usuario
     * @return
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }
    /**
     * Funcion que agrega el Identificador del usuario
     * @param idUsuario 
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    /**
     * Funcion que retorna los nombres del usuario
     * @return 
     */
    public String getNombres() {
        return nombres;
    }
    /**
     * Funcion que agrega los nombres del usuario
     * @param nombres 
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    /**
     * Funcion que retorna los apellidos del usuario
     * @return 
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    /**
     * Funcion que agrega los apellidos al usuario
     * @param apellidoPaterno 
     * @param apellidoMaterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    /**
     * Funcion que retorna el correo del usuario
     * @return 
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Funcion que agrega el correo al usuario
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Funcion que retorna la contraseña del usuario
     * @return 
     */
    public String getContrasena() {
        return contraseña;
    }
    /**
     * Funcion que agrega la contraseña al usuario
     * @param contrasena 
     */
    public void setContrasena(String contrasena) {
        this.contraseña = contrasena;
    }
    /**
     * Funcion que retorna el tipo de usuario
     * @return 
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    /**
     * Funcion que agrega el tipo de usuario al usuario
     * @param tipoUsuario 
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    /**
     * Funcion que encripta la contraseña
     * @param cadena
     * @return 
     */
    public String encriptar(String cadena) {
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al encriptar");
        }
        return encriptacion;
    }
    /**
     * Funcion que desencripta
     * @param cadenaEncriptada
     * @return 
     */
    public String desencriptar(String cadenaEncriptada) {
        String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al desencriptar");
        }
        return desencriptacion;
    }
}
