/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import proyectoprograobj.ListaPartPoliticos;
import proyectoprograobj.PartidoPolitico;

/**
 *
 * @author Usuario
 */
public class ControladorPartPoliticos {
    private ListaPartPoliticos modelo;

    public ControladorPartPoliticos() {
        this.modelo = new ListaPartPoliticos();
    }
    
    public boolean agregarPartPolitico(PartidoPolitico partido){
        return modelo.agregarPartido(partido);
    }
    
    public LinkedList<PartidoPolitico> getListaPartidos(){
        return this.modelo.getListaPartidos();
    }
    
    public PartidoPolitico buscarPartidoPorNombre(String nombre) {
        for (PartidoPolitico partido : this.modelo.getListaPartidos()) {
            if (partido.getNombre().equals(nombre)) {
                return partido;
            }
        }
        return null; 
    }
    
    private int buscarPorNombre(String nombre){
        int pos = 0;
        for(PartidoPolitico partido: this.modelo.getListaPartidos()){
            if (partido.getNombre().equals(nombre)){
                return pos;
            }
            pos = pos + 1;
        }
        
        return -1;
    }
    
    public boolean eliminarPartido(String nombre){
        int pos = buscarPorNombre(nombre);
        if(pos == -1){
            return false;
        }
        return this.modelo.eliminarPartido(pos);
    }
}
