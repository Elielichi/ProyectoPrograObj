/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class ListaElecciones {
    private LinkedList<Eleccion> listaElecciones;

    public ListaElecciones() {
        this.listaElecciones = new LinkedList();
    }
    
    public boolean agregarEleccion(Eleccion eleccion){
        listaElecciones.add(eleccion);
        return true;
    }
    
    public boolean eliminarEleccion(int pos){
        listaElecciones.remove(pos);
        return true;
    }
    
    public LinkedList<Eleccion> getListaElecciones() {
        return new LinkedList<Eleccion>(listaElecciones);
    }
}
