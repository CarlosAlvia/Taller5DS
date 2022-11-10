/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author
 */
class Medicamento {
    
    protected String medicina;
    protected String dosis;
    protected String observaciones;
    protected int cantidadTotsl;
    protected String unidad;

    public Medicamento(String medicina, String dosis, String observaciones, int cantidadTotsl, String unidad) {
        this.medicina = medicina;
        this.dosis = dosis;
        this.observaciones = observaciones;
        this.cantidadTotsl = cantidadTotsl;
        this.unidad = unidad;
    }

    public String getMedicina() {
        return medicina;
    }

    public void setMedicina(String medicina) {
        this.medicina = medicina;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCantidadTotsl() {
        return cantidadTotsl;
    }

    public void setCantidadTotsl(int cantidadTotsl) {
        this.cantidadTotsl = cantidadTotsl;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
    
}
