/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import clases.*;
/**
 *
 * @author Jose Abel
 */
public class establecimiento {
    long idEstablecimiento;
    long idUsuario;
    String direccion;
    String nombreEstablecimiento;
    long telefono;
    String correoEstablecimiento;
    public void setIdEstablecimiento(long idEstablecimiento){
        this.idEstablecimiento = idEstablecimiento;
    }
    
    public void setIdUsuario(long idUsuario){
        this.idUsuario = idUsuario;
    }	
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }	
    
    public void setNombreEstablecimiento(String nombre){
        this.nombreEstablecimiento = nombre;
    }
    
    public void setTelefono(long telefono){
        this.telefono = telefono;
    }
    
    public long getIdEstablecimiento(){
        return this.idEstablecimiento;
    }
    
    public long getIdUsuario(){
        return this.idUsuario;
    }
    
    public String getDireccion(){
        return this.direccion;
    }	
    
    public String getNombreEstablecimiento(){
        return this.nombreEstablecimiento;
    }
    
    public long getTelefono(){
       return this.telefono; 
    }
    
    public void setCorreoEstablecimiento(String correo)
    {
        this.correoEstablecimiento=correo;
    }
    public String getCorreoEstablecimiento()
    {
        return this.correoEstablecimiento;
    }
    
    
}
