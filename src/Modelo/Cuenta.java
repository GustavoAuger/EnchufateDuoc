/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author carlos
 */
public class Cuenta {
    
    private String cod_cuenta, cuenta, contrasena, nombre, apellidos;


    public Cuenta() {
    }

    public Cuenta(String cod_cuenta,String cuenta, String contrasena,  String nombre, String apellidos) {
        this.cod_cuenta = cod_cuenta;
        this.cuenta = cuenta;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public String getCod_cuenta() {
        return cod_cuenta;
    }

    public void setCod_cuenta(String cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }





    
    
}

