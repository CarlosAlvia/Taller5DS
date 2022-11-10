/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;
import java.util.PriorityQueue;

/**
 *
 * @author 
 */
public class Secretaria extends Persona{
    
    protected Doctor doctor;

    public Secretaria(Doctor doctor, String usuario, String clave, String Nombre, String Apellido, String Cedula, String direccion, Date fechaNac) {
        super(usuario, clave, Nombre, Apellido, Cedula, direccion, fechaNac);
        this.doctor = doctor;
    }
    
    public boolean verificarCita(Cita cita){
        return false;
    }
    
    public void agendarCita(Paciente paciente,Doctor doctor,Date fecha,float Costo){
        //...
    }
    
}
