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
public class ListaPartPoliticos {
    private LinkedList<PartidoPolitico> listaPartidos;

    public ListaPartPoliticos() {
        this.listaPartidos = new LinkedList();
    }
    
    public boolean agregarPartido(PartidoPolitico partido){
        listaPartidos.add(partido);
        return true;
    }
    
    public boolean eliminarPartido(int pos){
        listaPartidos.remove(pos);
        return true;
    }

    public LinkedList<PartidoPolitico> getListaPartidos() {
        return new LinkedList<PartidoPolitico>(listaPartidos);
    }
    
    
}
