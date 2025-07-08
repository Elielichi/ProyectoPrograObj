/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

/**
 *
 * @author Usuario
 */
public class Candidato extends Persona{
    private PartidoPolitico partido;
    private String dni;
    private Eleccion eleccion;
    

    public Candidato(PartidoPolitico partido,  String nombre, String apellidos, String dni) {
        super(nombre, apellidos);
        this.partido = partido;
        this.dni = dni;
        this.eleccion = null;
    }

    public Candidato(PartidoPolitico partido, String dni, Eleccion eleccion, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.partido = partido;
        this.dni = dni;
        this.eleccion = eleccion;
    }
    
    

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }
    
    
    

    @Override
    public String toString() {
        return super.toString() +
                "\nCandidato ->" + 
                "\nPartido político el cual pertenece: " + partido.toString();
    }
        
                
    
      
}
