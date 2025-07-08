/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.LinkedList;
import proyectoprograobj.Candidato;
import proyectoprograobj.Eleccion;
import proyectoprograobj.ListaRegistroVotos;
import proyectoprograobj.RegistroVoto;
import proyectoprograobj.ResumenVotos;

/**
 *
 * @author Usuario
 */
public class ControladorRegistroVotos {
    private ListaRegistroVotos modelo;
    public ControladorRegistroVotos() {
        this.modelo = new ListaRegistroVotos();
    }
    
    public boolean agregarRegistroVoto(RegistroVoto voto){
        return modelo.agregarRegistroVoto(voto);
    }
    
    public LinkedList<RegistroVoto> getListaRegistroVotos(){
        return this.modelo.getListaRegistroVotos();
    }
    
    public LinkedList<RegistroVoto> getRegistrosPorCandidato(Candidato candidato) {
        LinkedList<RegistroVoto> resultados = new LinkedList<>();
        for (RegistroVoto registro : modelo.getListaRegistroVotos()) {
            if (registro.getCandidato().equals(candidato)) {
                resultados.add(registro);
            }
        }
        return resultados;
    }
    
    public int contarVotosValidosPorCandidato(Candidato candidato) {
        int total = 0;
        for (RegistroVoto registrovoto : getRegistrosPorCandidato(candidato)) {
            total = total + registrovoto.getVotosValidos();
        }
        return total;
    }
    
    public boolean existeRegistroParaActa(String numeroActa) {
        for (RegistroVoto registrovoto : modelo.getListaRegistroVotos()) {
            if (registrovoto.getActa().getNumeroActa().equals(numeroActa)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarRegistroPorActa(String numeroActa) {
        int pos = buscarPorNumeroActa(numeroActa);
        if (pos == -1) {
            return false;
        }
        return this.modelo.eliminarRegistroVoto(pos);
    }

    private int buscarPorNumeroActa(String numeroActa) {
        int pos = 0;
        for (RegistroVoto registrovoto : modelo.getListaRegistroVotos()) {
            if (registrovoto.getActa().getNumeroActa().equals(numeroActa)) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    
    public boolean reemplazarRegistro(RegistroVoto nuevoRegistro) {
        LinkedList<RegistroVoto> lista = modelo.getListaRegistroVotos();
        for (int i = 0; i < lista.size(); i++) {
            RegistroVoto actual = lista.get(i);
            if (actual.getActa().getNumeroActa().equals(nuevoRegistro.getActa().getNumeroActa()) &&
                actual.getCandidato().getDni().equals(nuevoRegistro.getCandidato().getDni())) {               
                lista.set(i, nuevoRegistro);
                return true;
            }
        }
        lista.add(nuevoRegistro);
        return true;
    }
    
    
    
    public boolean eliminarRegistroPorActaYCandidato(String numeroActa, String nombreCandidato) {
        int pos = 0;
        for (RegistroVoto registrovoto : modelo.getListaRegistroVotos()) {
            if (registrovoto.getActa().getNumeroActa().equals(numeroActa) &&
                registrovoto.getCandidato().getNombre().equals(nombreCandidato)) {
                return modelo.eliminarRegistroVoto(pos);
            }
            pos++;
        }
        return false;
    }
    
    public RegistroVoto buscarRegistroPorActaYCandidato(String numeroActa, String dniCandidato) {
        for (RegistroVoto registrovoto : modelo.getListaRegistroVotos()) {
            if (registrovoto.getActa().getNumeroActa().equals(numeroActa) &&
                registrovoto.getCandidato().getDni().equals(dniCandidato)) {
                return registrovoto;
            }
        }
        return null;
    }
    
    
    
    public LinkedList<ResumenVotos> generarResumenPorEleccion(String nombreEleccion) {
        LinkedList<ResumenVotos> resumen = new LinkedList<>();
        LinkedList<RegistroVoto> listaRegistroVotos = this.getListaRegistroVotos();

        
        LinkedList<RegistroVoto> registrosFiltrados = new LinkedList<>();
        for (RegistroVoto nuevo : listaRegistroVotos) {
            Eleccion eleccion = nuevo.getCandidato().getEleccion();
            if (eleccion == null || !eleccion.getNombre().equals(nombreEleccion)) {
                continue;
            }         
            RegistroVoto existente = null;
            for (RegistroVoto r : registrosFiltrados) {
                if (
                    r.getActa().getNumeroActa().equals(nuevo.getActa().getNumeroActa()) &&
                    r.getCandidato().getDni().equals(nuevo.getCandidato().getDni())
                ) {
                    existente = r;
                    break;
                }
            }

            
            if (existente != null) {
                registrosFiltrados.remove(existente);
            }

            
            registrosFiltrados.add(nuevo);
        }

        
        for (RegistroVoto registro : registrosFiltrados) {
            ResumenVotos resumenExistente = null;
            for (ResumenVotos r : resumen) {
                if (r.getCandidato().equals(registro.getCandidato())) {
                    resumenExistente = r;
                    break;
                }
            }

            if (resumenExistente == null) {
                resumenExistente = new ResumenVotos(registro.getCandidato());
                resumen.add(resumenExistente);
            }

            resumenExistente.agregarVotos(
                registro.getVotosValidos(),
                registro.getVotosNulos(),
                registro.getVotosBlancos()
            );
        }

        return resumen;
    }

   
   
}
