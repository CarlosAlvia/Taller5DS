/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author
 */
class Cita {
   
    protected Date fecha;
    protected boolean pagada;
    protected String registradaPor;
    protected Doctor doctor;
    protected Paciente paciente;

    public Cita(Date fecha, boolean pagada, String registradaPor, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradaPor = registradaPor;
        this.doctor = doctor;
        this.paciente = paciente;
    }
    
    public boolean realizarPago(Pago pago){
        return false;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getRegistradaPor() {
        return registradaPor;
    }

    public void setRegistradaPor(String registradaPor) {
        this.registradaPor = registradaPor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}

