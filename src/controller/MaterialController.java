/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import crud.MaterialCRUD;
import entity.Material;
import java.util.ArrayList;

/**
 *
 * @author Ascencio
 */
public class MaterialController {
    //instancias
    MaterialCRUD materialcrud = new MaterialCRUD();
    //listar materiales
    public ArrayList<Material> listarMateriales(){
        ArrayList<Material> materiales = materialcrud.listarMateriales();
        return materiales;
    }
}
