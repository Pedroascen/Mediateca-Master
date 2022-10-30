/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Ascencio
 */
public class Revista extends Material {

    //atributos
    private int id_revista;
    private String editorial;
    private String periodicidad;
    private Date fechaPublicacion;

    //constructores
    public Revista() {
    }

    public Revista(String codMaterial, String titulo, int codTipoMaterial, String editorial, String periodicidad, Date fechaPublicacion) {
        super(codMaterial, titulo);
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPublicacion = fechaPublicacion;
    }

    //getters and setters
    public int getId_revista() {
        return id_revista;
    }

    public void setId_revista(int id_revista) {
        this.id_revista = id_revista;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
