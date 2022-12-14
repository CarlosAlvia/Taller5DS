/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author
 */
class HistoriaClinica {
    
    protected int nro;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> alergias;
    protected ArrayList<String> otros;

    public HistoriaClinica(int nro, ArrayList<String> enfermedades, ArrayList<String> alergias, ArrayList<String> otros) {
        this.nro = nro;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otros = otros;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<String> getOtros() {
        return otros;
    }

    public void setOtros(ArrayList<String> otros) {
        this.otros = otros;
    }
    
    
    
}
