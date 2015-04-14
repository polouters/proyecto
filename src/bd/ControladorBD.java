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
    
}
