/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import proyectoprograobj.Candidato;
import proyectoprograobj.ListaCandidatos;
import proyectoprograobj.ListaPartPoliticos;
import proyectoprograobj.PartidoPolitico;

/**
 *
 * @author Usuario
 */
public class ControladorCandidatos {
    private ListaCandidatos modelo;

    public ControladorCandidatos() {
        this.modelo = new ListaCandidatos();
        
    }
    
    public boolean agregarCandidato(Candidato candidato){
        return modelo.agregarCandidato(candidato);
    }
    
    public LinkedList<Candidato> getListaCandidatos(){
        return this.modelo.getListaCandidatos();
    }
    
    private int buscarPorNombre(String nombre){
        int pos = 0;
        for(Candidato candidato: this.modelo.getListaCandidatos()){
            if (candidato.getNombre().equals(nombre)){
                return pos;
            }
            pos = pos + 1;
        }
        
        return -1;
    }
    
    public Candidato buscarCandidatoPorNombre(String nombre) {
        for (Candidato candidato : this.modelo.getListaCandidatos()) {
            if (candidato.getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                return candidato;
            }
        }
        return null; 
    }
    
    public boolean eliminarCandidato(String nombre){
        int pos = buscarPorNombre(nombre);
        if(pos == -1){
            return false;
        }
        return this.modelo.eliminarCandidato(pos);
    }
    
    
}
