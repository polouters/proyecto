/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import bd.ControladorBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.Evento;
import vista.*;

/**
 *
 * @author Ruben
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static principal v1 = new principal();
    public static Ventana1 v2 ;
    public static altaPersona v3;
    public static Ventana3 v4;
    public static modificacion v5;
    
    public static void main(String[] args) {
        // TODO code application logic here
        v1.setVisible(true);
        
    }
    // diversas ejecuciones
    public static void añadirEventoBD(Evento e){
        ControladorBD.altaEvento(e);
    }
    public static void bajaBD(String nombre){
        ControladorBD.bajaEvento(nombre);
    }
    public static boolean confirmarBaja(Evento found){
    if(JOptionPane.showConfirmDialog(null,"Esta seguro que desea dar de baja"
             + "este evento: \n"+found.getNombre()+" \n"+found.getLugar()+""
             + "\n"+found.getHorai()+"\n"+found.getHoraf()+"\n"+found.getFecha())==0) {
      return true;
      
      }else{
      return false;
      }
    }
    public static void modificarBD(String nombre){
    ControladorBD.modificacionEventos(nombre);
    }
    public static void abrirModifi(Evento ev){
    v5 = new modificacion(ev);
    v5.setVisible(true);
    }
    public static void cerrarModifi(Evento ev){
        v1= new principal();
        v1.setVisible(true);
        v5.dispose();
        ControladorBD.modificacionEv(ev);
    }
// abir ventanas
    
    public static void abrir_alta(){
        v1.dispose();
        v2 = new Ventana1();
        v2.setVisible(true);
    }
    public static void abrir_altaPersona(){
        v1.dispose();
        v3 = new altaPersona();
        v3.setVisible(true);
    }public static void abrir_listado(){
        v1.dispose();
        v4 = new Ventana3();
        v4.setVisible(true);
    }
    
    // Atras de Ventanas
  
    public static void atras_altaPersona(){
        v3.dispose();
        v1 = new principal();
        v1.setVisible(true);
    }
    public static void atras_alta(){
    v2.dispose();
    v1= new principal();
    v1.setVisible(true);
    }
    public static void atras_modifi(){
    v5.dispose();
    v1= new principal();
    v1.setVisible(true);
    }
    public static void atras_listado(){
        v4.dispose();
        v1 = new principal();
        v1.setVisible(true);
    }
    
    
    
}
