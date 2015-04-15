/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import com.db4o.*;
import javax.swing.JOptionPane;
import uml.*;


/**
 *
 * @author Ruben
 */
public class ControladorBD {
  public static void altaEvento(Evento ev){
  // creamos la base de datos orientada a objeto
      ObjectContainer db=Db4o.openFile("EjerEventos");
      db.store(ev);
      db.close();
       System.out.print("finalizado con exito");
  } 
  public static void bajaEvento(String nombre){
      ObjectContainer db=Db4o.openFile("EjerEventos");
      ObjectSet result=db.queryByExample(new Evento(nombre));
      Evento found=(Evento)result.next();
     if(Controlador.Controlador.confirmarBaja(found)==true){
      db.delete(found);
     
      System.out.println("finalizado con exito");
     }else{
     System.out.println("Se a producido un error, o no a querido elimanar");
     }
  }
  
  public static void modificacionEventos(String nombre){
  ObjectContainer db=Db4o.openFile("EjerEventos");
  ObjectSet result=db.queryByExample(new Evento(nombre));
  Evento found=(Evento)result.next();
  db.close();
  Controlador.Controlador.abrirModifi(found);
  }
  public static void modificacionEv(Evento ev){
  ObjectContainer db=Db4o.openFile("EjerEventos");
  ObjectSet result=db.queryByExample(new Evento(ev.getNombre()));
  Evento found=(Evento)result.next();
   db.delete(found);
  db.store(ev);
  db.close();
  System.out.println("finalizado con exito");
  }
    
}
