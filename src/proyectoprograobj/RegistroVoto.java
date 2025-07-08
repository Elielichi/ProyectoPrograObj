/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

/**
 *
 * @author Usuario
 */
public class RegistroVoto {
    private ActaElectoral acta;
    private Candidato candidato;
    private int votosValidos;
    private int votosNulos;
    private int votosBlancos;

    public RegistroVoto(ActaElectoral acta, Candidato candidato, int votosValidos, int votosNulos, int votosBlancos) {
        this.acta = acta;
        this.candidato = candidato;
        this.votosValidos = votosValidos;
        this.votosNulos = votosNulos;
        this.votosBlancos = votosBlancos;
    }

    public ActaElectoral getActa() {
        return acta;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public int getVotosValidos() {
        return votosValidos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }
    
    
}
