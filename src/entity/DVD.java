/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Time;

/**
 *
 * @author Ascencio
 */
public class DVD extends Material{
    //atribustos
    private int id_dvd;
    private String director;
    private Time duracion;
    private String genero;

    //constructores
    public DVD() {
    }

    public DVD(String codMaterial, String titulo, int codTipoMaterial, String director, Time duracion, String genero) {
        super(codMaterial,titulo);
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }

    //getters and setters
    public int getId_dvd() {
        return id_dvd;
    }

    public void setId_dvd(int id_dvd) {
        this.id_dvd = id_dvd;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
