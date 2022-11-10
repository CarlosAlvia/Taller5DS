/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author
 */
public class Administrador extends Persona{
    protected java.util.Collection registradoPor = new java.util.TreeSet();

    public Administrador(String usuario, String clave, String Nombre, String Apellido, String Cedula, String direccion, Date fechaNac) {
        super(usuario, clave, Nombre, Apellido, Cedula, direccion, fechaNac);
    }
    
    public boolean Registrar_Usuario(Persona persona){
        return false;
    }
    
    public void Asiganr_Rol(Persona persona){}

    public Collection getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(Collection registradoPor) {
        this.registradoPor = registradoPor;
    } 
    
}
