/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author gauge
 */
public class Asignaturas {
    private String cod_asignatura, nombre;

    public Asignaturas(String cod_asignatura, String nombre) {
        this.cod_asignatura = cod_asignatura;
        this.nombre = nombre;
    }

    public String getCod_asignatura() {
        return cod_asignatura;
    }

    public void setCod_asignatura(String cod_asignatura) {
        this.cod_asignatura = cod_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      
}
