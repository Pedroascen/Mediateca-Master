/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import crud.LibroCRUD;
import crud.MaterialCRUD;
import entity.Libro;
import entity.Material;
import java.util.ArrayList;

/**
 *
 * @author Ascencio
 */
public class LibroController {
    //instancia a la clase con los metodos cruds
    LibroCRUD librocrud = new LibroCRUD();
    MaterialCRUD materialcrud = new MaterialCRUD();
    //metodo para guardar
    public boolean guardar_actualizar(String codMaterial,String titulo, String autor, int noPaginas, String editorial, int isbn, int anio){
         //instanciamos la clase libro
        Libro lb = new Libro();
        //seteamos los datos
        lb.setCodMaterial(codMaterial);
        lb.setTitulo(titulo);
        lb.setAutor(autor);
        lb.setNoPaginas(noPaginas);
        lb.setEditorial(editorial);
        lb.setIsbn(isbn);
        lb.setAnio(anio);
        //conversion de datos
        String codigo = codMaterial; String npaginas = String.valueOf(noPaginas); 
        String Isbn = String.valueOf(isbn); String Anio = String.valueOf(anio);
        try {
            librocrud.insert(codigo,titulo,autor,npaginas,editorial,Isbn,Anio);
        } catch (Exception e) {
            System.out.println("Error al intentar guardar libro: "+e);
            return false;
        }
        return true;
    }
    
    //Listar libros con codigoMaterial
    public ArrayList<Material> listarLibros(String codigoMaterial){
        ArrayList<Material> materiales = materialcrud.listarPorCodigo(codigoMaterial);
        System.out.println(materiales);
        return materiales;
    }
    
    
}
