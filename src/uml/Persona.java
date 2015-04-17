/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.util.ArrayList;

/**
 *
 * @author Ruben
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private Empresa e;
    private ArrayList<Evento> asiste;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, String telefono, Empresa e, ArrayList<Evento> asiste) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.e = e;
        this.asiste = asiste;
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;

    }

    public Empresa getE() {
        return e;
    }

    public void setE(Empresa e) {
        this.e = e;
    }

    public ArrayList<Evento> getAsiste() {
        return asiste;
    }

    public void setAsiste(ArrayList<Evento> asiste) {
        this.asiste = asiste;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
