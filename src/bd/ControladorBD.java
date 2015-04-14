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
      JOptionPane.showMessageDialog(null,"Evento dado de alta con exito");
  } 
  public static void bajaEvento(String nombre){
      ObjectContainer db=Db4o.openFile("EjerEventos");
      ObjectSet result=db.queryByExample(new Evento(nombre));
      Evento found=(Evento)result.next();
     
      if(JOptionPane.showConfirmDialog(null,"Esta seguro que desea dar de baja"
             + "este evento: \n"+found.getNombre()+" \n"+found.getLugar()+""
             + "\n"+found.getHorai()+"\n"+found.getHoraf()+"\n"+found.getFecha())==0) {
      db.delete(found);
      }else{
          JOptionPane.showMessageDialog(null,"Se a producido un error");
      }
     
  }
    
}
