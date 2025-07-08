/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograobj;

/**
 *
 * @author Usuario
 */
public class MiembroMesa extends Persona{
    private String rol;
    

    public MiembroMesa(String rol, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.rol = rol;
        
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMiembroMesa -> " + 
                "\nRol que ejerce: " + rol;
    }
    
    
}
