/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import com.db4o.*;
import com.db4o.query.Query;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.*;

/**
 *
 * @author Ruben
 */
public class ControladorBD {

    public static boolean altaEvento(Evento ev) {
  // creamos la base de datos orientada a objeto
        //rebision pre alta
        ObjectContainer db = Db4o.openFile("EjerEvente");
        Evento e = new Evento(ev.getNombre());
        ObjectSet result = db.queryByExample(e);
        System.out.print(result.hasNext());
        while (result.hasNext()) {
            db.close();
            return false;
        }
        db.close();
        return true;

    }

    public static void alta(Evento ev) {
        //alta
        ObjectContainer db = Db4o.openFile("EjerEvente");
        db.store(ev);
        db.close();
        System.out.print("finalizado con exito");
    }

    public static void bajaEvento(String nombre) {
        ObjectContainer db = Db4o.openFile("EjerEvente");
        ObjectSet result = db.queryByExample(new Evento(nombre));
        Evento found = (Evento) result.next();
        if (Controlador.Controlador.confirmarBaja(found) == true) {
            db.delete(found);

            System.out.println("finalizado con exito");
        } else {
            
            System.out.println("Se a producido un error, o no a querido elimanar");
        }
        db.close();
    }

    public static void modificacionEventos(String nombre) {
        ObjectContainer db = Db4o.openFile("EjerEvente");
        ObjectSet result = db.queryByExample(new Evento(nombre));
        Evento found = (Evento) result.next();
        db.close();
        Controlador.Controlador.abrirModifi(found);
    }

    public static void modificacionEv(Evento ev) {
        ObjectContainer db = Db4o.openFile("EjerEvente");
        ObjectSet result = db.queryByExample(new Evento(ev.getNombre()));
        Evento found = (Evento) result.next();
        db.delete(found);
        db.store(ev);
        db.close();
        System.out.println("finalizado con exito");
    }

    public static ArrayList<Evento> generarListado() {
        ArrayList<Evento> Listado = new ArrayList();

        ObjectContainer db = Db4o.openFile("EjerEvente");

        Query query = db.query();
        query.constrain(Evento.class);
        ObjectSet result = query.execute();
        while (result.hasNext()) {
            Evento found = (Evento) result.next();
            Listado.add(found);
        }
        db.close();
        return Listado;

    }

    public static Evento listadoRellenar(String nombre) {
        ObjectContainer db = Db4o.openFile("EjerEvente");
        ObjectSet result = db.queryByExample(new Evento(nombre));
        Evento found = (Evento) result.next();
        db.close();
        return found;
    }

}
