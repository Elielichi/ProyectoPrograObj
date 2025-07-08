/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import proyectoprograobj.Eleccion;
import proyectoprograobj.ListaElecciones;

/**
 *
 * @author Usuario
 */
public class ControladorElecciones {
    private ListaElecciones modelo;

    public ControladorElecciones() {
        this.modelo = new ListaElecciones();
    }
    
    public boolean agregarEleccion(Eleccion eleccion){
        return modelo.agregarEleccion(eleccion);
    }
    
    public LinkedList<Eleccion> getListaElecciones(){
        return this.modelo.getListaElecciones();
    }
    
    public Eleccion buscarEleccionPorNombre(String nombre) {
        for (Eleccion eleccion : this.modelo.getListaElecciones()) {
            if (eleccion.getNombre().equals(nombre)) {
                return eleccion;
            }
        }
        return null; 
    }
    
    private int buscarPorNombre(String nombre){
        int pos = 0;
        for(Eleccion eleccion: this.modelo.getListaElecciones()){
            if (eleccion.getNombre().equals(nombre)){
                return pos;
            }
            pos = pos + 1;
        }
        
        return -1;
    }
    
    public boolean eliminarEleccion(String nombre){
        int pos = buscarPorNombre(nombre);
        if(pos == -1){
            return false;
        }
        return this.modelo.eliminarEleccion(pos);
    }
}
