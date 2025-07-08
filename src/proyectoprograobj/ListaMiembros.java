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
public class ListaMiembros {
    private LinkedList<MiembroMesa> listaMiembros;

    public ListaMiembros() {
        this.listaMiembros = new LinkedList();
    }
    
    public boolean agregarMiembro(MiembroMesa miembro){
        listaMiembros.add(miembro);
        return true;
    }
    
    public boolean eliminarMiembro(int pos){
        listaMiembros.remove(pos);
        return true;
    }
    
    public LinkedList<MiembroMesa> getListaMiembros() {
        return new LinkedList<MiembroMesa>(listaMiembros);
    }
    
}
