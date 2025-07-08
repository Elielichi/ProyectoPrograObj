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
public class ListaMesas {
    private LinkedList<MesaElectoral> listaMesas;

    public ListaMesas() {
        this.listaMesas = new LinkedList();
    }
    
    public boolean agregarMesa(MesaElectoral mesa){
        listaMesas.add(mesa);
        return true;
    }
    
    public boolean eliminarMesa(int pos){
        listaMesas.remove(pos);
        return true;
    }
    
    public LinkedList<MesaElectoral> getListaMesas() {
        return new LinkedList<MesaElectoral>(listaMesas);
    }
    
    
}
