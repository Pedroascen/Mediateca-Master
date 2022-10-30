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
public class Material {
    //atributos
    private String codMaterial;
    private String titulo;
    private int codTipoMaterial;
    private int unidadesDispo;

    //construct por defecto
    public Material() {
    }

    public Material(String codMaterial, String titulo) {
        this.codMaterial = codMaterial;
        this.titulo = titulo;
    }

    //getters and setters
    public String getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public int getCodTipoMaterial() {
        return codTipoMaterial;
    }

    public void setCodTipoMaterial(int codTipoMaterial) {
        this.codTipoMaterial = codTipoMaterial;
    }

    public int getUnidadesDispo() {
        return unidadesDispo;
    }

    public void setUnidadesDispo(int unidadesDispo) {
        this.unidadesDispo = unidadesDispo;
    }
}
