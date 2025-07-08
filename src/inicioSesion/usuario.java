/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicioSesion;

/**
 *
 * @author Admin
 */
public class usuario {
    private String nombre;
    private String contraseña;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    public boolean revisarUsuario(String ingresoUsuario, String ingresoCont){
        boolean valor = false;
        if(this.nombre.equals(ingresoUsuario)){
            if(this.contraseña.equals(ingresoCont)){
            valor = true;
            }
        }
        return valor;
    }
    
}
