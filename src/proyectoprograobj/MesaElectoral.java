/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

/**
 *
 * @author Usuario
 */
public class MesaElectoral {
    private String idMesa;
    private MiembroMesa presidente;
    private MiembroMesa secretario;
    private MiembroMesa vocal;
    private Eleccion eleccion;

    public MesaElectoral(String idMesa) {
        this.idMesa = idMesa;
    }

    public MesaElectoral(String idMesa, MiembroMesa presidente, MiembroMesa secretario, MiembroMesa vocal, Eleccion eleccion) {
        this.idMesa = idMesa;
        this.presidente = presidente;
        this.secretario = secretario;
        this.vocal = vocal;
        this.eleccion = eleccion;
    }
    
    

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        this.idMesa = idMesa;
    }

    public MiembroMesa getPresidente() {
        return presidente;
    }

    public void setPresidente(MiembroMesa presidente) {
        this.presidente = presidente;
    }

    public MiembroMesa getSecretario() {
        return secretario;
    }

    public void setSecretario(MiembroMesa secretario) {
        this.secretario = secretario;
    }

    public MiembroMesa getVocal() {
        return vocal;
    }

    public void setVocal(MiembroMesa vocal) {
        this.vocal = vocal;
    }

    public Eleccion getEleccion() {
        return eleccion;
    }

    public void setEleccion(Eleccion eleccion) {
        this.eleccion = eleccion;
    }
    
    
       
}
