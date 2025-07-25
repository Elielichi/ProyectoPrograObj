/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

/**
 *
 * @author Usuario
 */
public class PartidoPolitico {
    private String nombre;
    private String sigla;
    
    private String representante;

    public PartidoPolitico(String nombre, String sigla, String representante) {
        this.nombre = nombre;
        this.sigla = sigla;
        
        this.representante = representante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

  

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "\nPartido politico ->" + 
                "\nNombre: " + nombre + 
                "\nSigla: " + sigla + 
                
                "\nRepresentante: " + representante;
    }

    
    
}
