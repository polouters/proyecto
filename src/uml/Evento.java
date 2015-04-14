/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ruben
 */
public class Evento {
    private String nombre;
    private String lugar;
    private String fecha;
    private String horai;
    private String horaf;
    private int asis;

    public Evento() {
    }

    public Evento(String nombre, String lugar, String fecha, String horai, String horaf, int asis) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horai = horai;
        this.horaf = horaf;
        this.asis = asis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHorai() {
        return horai;
    }

    public void setHorai(String horai) {
        this.horai = horai;
    }

    public String getHoraf() {
        return horaf;
    }

    public void setHoraf(String horaf) {
        this.horaf = horaf;
    }

    public int getAsis() {
        return asis;
    }

    public void setAsis(int asis) {
        this.asis = asis;
    }

}
