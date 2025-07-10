/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicioSesion;
import proyectoprograobj.Persona;
/**
 *
 * @author Admin
 */
public class usuario extends Persona{
    private String IDusuario;
    private String contraseña;

    public usuario(String IDuser, String contraseña, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.IDusuario = IDuser;
        this.contraseña = contraseña;
    }

    public String getIDuser() {
        return IDusuario;
    }

    public void setIDuser(String IDuser) {
        this.IDusuario = IDuser;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
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
