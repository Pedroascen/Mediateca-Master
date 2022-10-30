/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Ascencio
 */
public class Libro extends Material{
    //atributos
    private int id_libro;
    private String autor;
    private int noPaginas;
    private String editorial;
    private int isbn;
    private int anio;

    //constructor por defecto
    public Libro() {
    }

    public Libro(String codMaterial, String titulo, String autor, int noPaginas, String editorial, int isbn, int anio) {
        super(codMaterial,titulo);
        this.autor = autor;
        this.noPaginas = noPaginas;
        this.editorial = editorial;
        this.isbn = isbn;
        this.anio = anio;
    }

    //getters and setters
    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(int noPaginas) {
        this.noPaginas = noPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
