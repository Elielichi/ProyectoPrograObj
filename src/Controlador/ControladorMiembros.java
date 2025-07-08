/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import proyectoprograobj.Candidato;
import proyectoprograobj.ListaCandidatos;
import proyectoprograobj.ListaMiembros;
import proyectoprograobj.MiembroMesa;

/**
 *
 * @author Usuario
 */
public class ControladorMiembros {
    private ListaMiembros modelo;

    public ControladorMiembros() {
        this.modelo = new ListaMiembros();
    }
    
    public boolean agregarMiembro(MiembroMesa miembro){
        return modelo.agregarMiembro(miembro);
    }
    public MiembroMesa buscarMiembroPorNombre(String nombre) {
        for (MiembroMesa miembro : this.modelo.getListaMiembros()) {
            if (miembro.getNombre().equals(nombre)) {
                return miembro;
            }
        }
        return null; 
    }
    
    public LinkedList<MiembroMesa> getListaMiembros(){
        return this.modelo.getListaMiembros();
    }
    
    private int buscarPorNombre(String nombre){
        int pos = 0;
        for(MiembroMesa miembro: this.modelo.getListaMiembros()){
            if (miembro.getNombre().equals(nombre)){
                return pos;
            }
            pos = pos + 1;
        }
        
        return -1;
    }
    
    public boolean eliminarMiembro(String nombre){
        int pos = buscarPorNombre(nombre);
        if(pos == -1){
            return false;
        }
        return this.modelo.eliminarMiembro(pos);
    }
}
