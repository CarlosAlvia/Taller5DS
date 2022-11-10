/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected java.util.Collection areas = new java.util.TreeSet();
    protected String Especialidad;
    protected ArrayList<Cita> citasPendientes;
    protected Secretaria secretaria;

    public Doctor(int regDoctor, Collection area, String Especialidad, String usuario, String clave, String Nombre, String Apellido, String Cedula, String direccion, Date fechaNac) {
        super(usuario, clave, Nombre, Apellido, Cedula, direccion, fechaNac);
        this.regDoctor = regDoctor;
        this.areas = area;
        this.Especialidad = Especialidad;
    }
    
    public void recetar(Receta receta){
    }
    
    
    public void  agregarPlanNut(Receta receta,PlanNutricional plan_n){
        
     }
    
    public void imprimirReceta(Receta receta){}
    
    public void registraSecretaria(){}

    public int getRegDoctor() {
        return regDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public ArrayList<Cita> getCitasPendientes() {
        return citasPendientes;
    }

    public void setCitasPendientes(ArrayList<Cita> citasPendientes) {
        this.citasPendientes = citasPendientes;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public Collection getAreas() {
        return areas;
    }

    public void setAreas(Collection areas) {
        this.areas = areas;
    }
}
