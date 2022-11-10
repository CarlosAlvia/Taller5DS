/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 
 */
class Receta {
    
    protected Date fecha;
    protected Paciente paciente;
    protected java.util.Collection medicamentos;
    protected PlanNutricional planNut;
    protected Doctor doctor;

    public Receta(Date fecha, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.paciente = paciente;
        this.doctor = doctor;
        this.planNut = new PlanNutricional(null);
        this.medicamentos = new java.util.TreeSet();
    }    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Collection getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Collection medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public PlanNutricional getPlanNut() {
        return planNut;
    }

    public void setPlanNut(PlanNutricional planNut) {
        this.planNut = planNut;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
   
}
