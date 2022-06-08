/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import clases.DatabaseConnection;
/**
 *
 * @author Jose Abel
 */
public class Platillos {
    private long idPlatillo;
    private String nombrePlatillo;
    private String descripcion;
    private float precio;
    private long idEstablecimiento;
    private int validado;
    private DatabaseConnection servicio;

    public Platillos(DatabaseConnection servicio) {
        this.servicio = servicio;
    }
    public Platillos()
    {
        
    }

    public long getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(long idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public long getIdEstablecimiento() {
        return idEstablecimiento;
    }

    public void setIdEstablecimiento(long idEstablecimiento) {
        this.idEstablecimiento = idEstablecimiento;
    }
    public Boolean crearPlatillo(Platillos platillo){
        return servicio.crearPlatillo(platillo);
    }
    public void setValidado(int validado){
        this.validado = validado;
    }
    public int getValidado(){
        return this.validado;
    }
}
