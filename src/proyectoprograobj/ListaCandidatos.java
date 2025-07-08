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
public class ListaCandidatos {
    private LinkedList<Candidato> listaCandidatos;

    public ListaCandidatos() {
        this.listaCandidatos = new LinkedList();
    }
    
    public boolean agregarCandidato(Candidato candidato){
        listaCandidatos.add(candidato);
        return true;
    }
    
    public boolean eliminarCandidato(int pos){
        listaCandidatos.remove(pos);
        return true;
    }
    
    public LinkedList<Candidato> getListaCandidatos() {
        return new LinkedList<Candidato>(listaCandidatos);
    }
}
