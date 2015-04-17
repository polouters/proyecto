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
public class Empresa {
  private String Nombre;
  private ArrayList<Persona> empleados;

    public Empresa() {
    }

    public Empresa(String Nombre, ArrayList<Persona> empleados) {
        this.Nombre = Nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Persona> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Persona> empleados) {
        this.empleados = empleados;
    }
  
    
}
