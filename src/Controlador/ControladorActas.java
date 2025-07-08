/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import proyectoprograobj.ActaElectoral;
import proyectoprograobj.Candidato;
import proyectoprograobj.ListaActas;

/**
 *
 * @author Usuario
 */
public class ControladorActas {
    private ListaActas modelo;

    public ControladorActas() {
        this.modelo = new ListaActas();
    }
    
    public boolean agregarActa(ActaElectoral acta){
        return modelo.agregarActa(acta);
    }
    
    public LinkedList<ActaElectoral> getListaActas(){
        return this.modelo.getListaActas();
    }
    
    private int buscarPorNumeroActa(String numero){
        int pos = 0;
        for(ActaElectoral acta: this.modelo.getListaActas()){
            if (acta.getNumeroActa().equals(numero)){
                return pos;
            }
            pos = pos + 1;
        }
        
        return -1;
    }
    
    public ActaElectoral buscarActaPorNumActa(String nombre) {
        for (ActaElectoral acta : this.modelo.getListaActas()) {
            if (acta.getNumeroActa().equals(nombre)) {
                return acta;
            }
        }
        return null; 
    }
    
    public boolean eliminarActa(String numero){
        int pos = buscarPorNumeroActa(numero);
        if(pos == -1){
            return false;
        }
        return this.modelo.eliminarActa(pos);
    }
    
    
}
