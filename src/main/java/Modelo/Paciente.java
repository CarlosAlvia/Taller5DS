/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author juand
 */
class Paciente extends Persona{
    protected String email;
    protected HistoriaClinica historiaClinica;
    protected Cita cita;
    protected java.util.Collection recetas;

    public Paciente(String email, String usuario, String clave, String Nombre, String Apellido, String Cedula, int Edad, String direccion, Date fechaNac) {
        super(usuario, clave, Nombre, Apellido, Cedula, direccion, fechaNac);
        this.email = email;
        this.historiaClinica = new HistoriaClinica(0, null, null, null);
        this.recetas = new java.util.TreeSet();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Collection getRecetas() {
        return recetas;
    }

    public void setRecetas(Collection recetas) {
        this.recetas = recetas;
    }
    
    
}
