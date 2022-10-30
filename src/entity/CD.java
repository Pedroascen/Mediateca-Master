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
public class CD extends Material{
    
    //atributos
    private int id_cd;
    private String artista;
    private String genero;
    private Time duracion;
    private int noCanciones;

    //constructores
    public CD() {
    }

    public CD(String codMaterial, String titulo, String artista, String genero, Time duracion, int noCanciones) {
        super(codMaterial, titulo);
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.noCanciones = noCanciones;
    }

    //getters and setters
    public int getId_cd() {
        return id_cd;
    }

    public void setId_cd(int id_cd) {
        this.id_cd = id_cd;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        //LocalTime t = LocalTime.parse( "17:40" ) ;
        this.duracion = duracion;
    }

    public int getNoCanciones() {
        return noCanciones;
    }

    public void setNoCanciones(int noCanciones) {
        this.noCanciones = noCanciones;
    }

}
