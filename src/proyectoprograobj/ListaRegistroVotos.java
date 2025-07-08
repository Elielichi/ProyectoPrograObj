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
public class ListaRegistroVotos {
    private LinkedList<RegistroVoto> listaRegistroVotos;

    public ListaRegistroVotos() {
        this.listaRegistroVotos = new LinkedList();
    }
    
    public boolean agregarRegistroVoto(RegistroVoto voto){
        listaRegistroVotos.add(voto);
        return true;
    }
    
    public boolean eliminarRegistroVoto(int pos){
        listaRegistroVotos.remove(pos);
        return true;
    }
    
    public LinkedList<RegistroVoto> getListaRegistroVotos() {
        return listaRegistroVotos;
    }
}
