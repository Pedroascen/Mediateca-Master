/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.mediateca;

import controller.MaterialController;
import entity.Material;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ascencio
 */
public class Tablas {

    //instancias
    MaterialController metodo = new MaterialController();
    //se setean los datos
    public String[][] obtenerDatos() {
        //bonones de acciones
        JButton btn1 = new JButton("Modificar");
        btn1.setName("m");
        JButton btn2 = new JButton("Eliminar");
        btn2.setName("e");
        
        //* Se agregó defaultablemodel de swing para llamar la vista y el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel)Inicio.tblMostrar.getModel();
            ArrayList<Material> materiales = metodo.listarMateriales();
            String codTipo="";
            String unidadesDipo="";
            for (Material material : materiales) {
                codTipo= material.getCodMaterial();
                unidadesDipo = String.valueOf(material.getUnidadesDispo());
                model.addRow(new Object[]{material.getCodMaterial(), material.getTitulo(),codTipo,unidadesDipo,btn1,btn2});
            //System.out.println(material.getCodMaterial() + " ," + material.getTitulo() + " ," + material.getCodTipoMaterial() + " ," + material.getUnidadesDispo() + " ,");
            }
        return null;
    }
    //crea y muestra tabla
    public void ver_tabla(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());
        
        DefaultTableModel d = new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                    "Codigo Interno", "Titulo", "Codigo Tipo", "Unidades Dispo", "Modificar", "Eliminar"
                }
        ) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(d);
        tabla.setRowHeight(25);
    }

}
