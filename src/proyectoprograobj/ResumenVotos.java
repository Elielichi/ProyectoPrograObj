/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

/**
 *
 * @author Usuario
 */
public class ResumenVotos {
    private Candidato candidato;
    private int votosEfectivos;
    private int votosNulos;
    private int votosBlancos;
    private int total = 0;

    
    public ResumenVotos(Candidato candidato) {
        this.candidato = candidato;
    }
    
    public void agregarVotos(int efectivos, int nulos, int blancos) {
        this.votosEfectivos = this.votosEfectivos + efectivos;
        this.votosNulos = this.votosNulos + nulos;
        this.votosBlancos = this.votosBlancos + blancos;
    }
    
    public Candidato getCandidato() {
        return candidato;
    }

    public int getVotosEfectivos() {
        return votosEfectivos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }

    public int getTotal() {
        return votosEfectivos + votosNulos + votosBlancos;
    }
}
