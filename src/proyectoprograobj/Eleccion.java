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
public class Eleccion {
    private String nombre;
    private String tipo;
    private String fecha;
    private LinkedList<Candidato> candidatos;

    public Eleccion(String nombre, String tipo, String fecha) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.candidatos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public LinkedList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(LinkedList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    
       
    
}
