/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import data.Conection;
import entity.Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rocio Abrego
 */
public class MaterialCRUD {
     //creacion de sentencias e invocacion de procedimientos almacenados en mysql
    private final String SQL_SELECT
            = "SELECT * FROM material;";
    
    //metodo para obtener listado de materiales
    public ArrayList<Material> listarMateriales(){
    //se inicializan los componenetes de la conexion
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Material material = null;
        ArrayList<Material> materiales = new ArrayList<>();
        
        try {
            conn = Conection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){
            String codMaterial = rs.getString(1);
            String titulo = rs.getString(2);
            int codTipoMaterial = rs.getInt(3);
            int unidadesDispo = rs.getInt(4);
            
            material = new Material();
            material.setCodMaterial(codMaterial);
            material.setTitulo(titulo);
            material.setCodTipoMaterial(codTipoMaterial);
            material.setUnidadesDispo(unidadesDispo);
            
            materiales.add(material);
            
            }
        }  catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }
        return materiales;
    }
    
    public ArrayList<Material> listarPorCodigo(String codigoMaterial){
        //se inicializan los componenetes de la conexion
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Material material = null;
        ArrayList<Material> materiales = new ArrayList<>();
        
        try {
            conn = Conection.getConnection();
            stmt = conn.prepareStatement("call mediateca.get_materiales('"+codigoMaterial+"');");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            String codMaterial = rs.getString(1);
            String titulo = rs.getString(2);
            int codTipoMaterial = rs.getInt(3);
            int unidadesDispo = rs.getInt(4);
            
            material = new Material();
            material.setCodMaterial(codMaterial);
            material.setTitulo(titulo);
            material.setCodTipoMaterial(codTipoMaterial);
            material.setUnidadesDispo(unidadesDispo);
            
            materiales.add(material);
            
            }
        }  catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conection.close(rs);
            Conection.close(stmt);
            Conection.close(conn);
        }
        return materiales;
    }
}
