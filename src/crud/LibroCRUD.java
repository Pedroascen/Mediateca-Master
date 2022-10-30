/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import data.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ascencio
 */
public class LibroCRUD {
    //invocacion de procedimientos almacenados en bd mysql
    private final String SQL_DELETE
            = "DELETE FROM libro WHERE codigoMaterialL=?";
    
    //metodos para insertar y actualizar
    public int insert(String codMaterial, String titulo, String autor, String npaginas, String editorial, String isbn, String anio){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        int rows = 0;//registra no de registros afectados
        try {
            conn = Conection.getConnection();
            //llamada al procedimiento almacenado
            stmt = conn.prepareStatement("call new_upd_libro('"+codMaterial+"','"+titulo+"','"+autor+"','"+npaginas+"','"+editorial+"','"+isbn+"','"+anio+"');");
           
            //System.out.println(codMaterial+" "+titulo+" "+autor+" "+String.valueOf(npaginas)+" "+editorial+" "+" "+String.valueOf(isbn)+" "+String.valueOf(anio));
            System.out.println("Ejecutando query.");
            rows = stmt.executeUpdate();//no registros afectados
            System.out.println("No Registros afectados: "+rows);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally{
            Conection.close(stmt);
            Conection.close(conn);
        }       
    return rows;
    }
}
