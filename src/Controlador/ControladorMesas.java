/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import proyectoprograobj.ListaMesas;
import proyectoprograobj.MesaElectoral;

/**
 *
 * @author Usuario
 */
public class ControladorMesas {
    private ListaMesas modelo;

    public ControladorMesas() {
        this.modelo = new ListaMesas();
    }
    
    public boolean agregarMesa(MesaElectoral mesa){
        return modelo.agregarMesa(mesa);
    }
    
    public LinkedList<MesaElectoral> getListaMesas(){
        return this.modelo.getListaMesas();
    }
    
    private int buscarPorId(String id){
        int pos = 0;
        for(MesaElectoral mesa: this.modelo.getListaMesas()){
            if (mesa.getIdMesa().equals(id)){
                return pos;
            }
            pos = pos + 1;
        }
        
        return -1;
    }
    
    public MesaElectoral buscarMesaPorId(String nombre) {
        for (MesaElectoral mesa : this.modelo.getListaMesas()) {
            if (mesa.getIdMesa().equals(nombre)) {
                return mesa;
            }
        }
        return null; 
    }
    
    public boolean eliminarMesa(String id){
        int pos = buscarPorId(id);
        if(pos == -1){
            return false;
        }
        return this.modelo.eliminarMesa(pos);
    }
    
}
