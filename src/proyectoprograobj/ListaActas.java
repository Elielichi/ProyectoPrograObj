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
public class ListaActas {
    private LinkedList<ActaElectoral> listaActas;

    public ListaActas() {
        this.listaActas = new LinkedList();
    }
    
    public boolean agregarActa(ActaElectoral acta){
        listaActas.add(acta);
        return true;
    }
    
    public boolean eliminarActa(int pos){
        listaActas.remove(pos);
        return true;
    }
    
    public LinkedList<ActaElectoral> getListaActas() {
        return new LinkedList<ActaElectoral>(listaActas);
    }
    
    
}
