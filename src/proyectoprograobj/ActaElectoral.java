/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActaElectoral {
    private String titulo; 
    private String fecha;
    private String hora;
    private String lugar;
    private MesaElectoral mesa; 
    
    private String observaciones;
    private String firmaPresidente;
    private String firmaSecretario;
    private String firmaVocal;
    private String selloOficial;
    private String numeroActa;
    private Eleccion eleccion;

    public ActaElectoral(String titulo, String fecha, String hora, String lugar, MesaElectoral mesa,  String observaciones, String selloOficial, String numeroActa, Eleccion eleccion) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.mesa = mesa;    
        this.observaciones = observaciones;
        this.firmaPresidente = mesa.getPresidente().getNombre(); 
        this.firmaSecretario = mesa.getSecretario().getNombre(); 
        this.firmaVocal = mesa.getVocal().getNombre(); 
        this.selloOficial = selloOficial;
        this.numeroActa = numeroActa;
        this.eleccion = eleccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MesaElectoral getMesa() {
        return mesa;
    }

    public void setMesa(MesaElectoral mesa) {
        this.mesa = mesa;
    }

    

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFirmaPresidente() {
        return firmaPresidente;
    }

    public void setFirmaPresidente(String firmaPresidente) {
        this.firmaPresidente = firmaPresidente;
    }

    public String getFirmaSecretario() {
        return firmaSecretario;
    }

    public void setFirmaSecretario(String firmaSecretario) {
        this.firmaSecretario = firmaSecretario;
    }

    public String getFirmaVocal() {
        return firmaVocal;
    }

    public void setFirmaVocal(String firmaVocal) {
        this.firmaVocal = firmaVocal;
    }

    public String getSelloOficial() {
        return selloOficial;
    }

    public void setSelloOficial(String selloOficial) {
        this.selloOficial = selloOficial;
    }

    public String getNumeroActa() {
        return numeroActa;
    }

    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }
    
    
    
   
}
