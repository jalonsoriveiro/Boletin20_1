/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jalonsoriveiro
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            ArrayList<Libro>listaLibros = new ArrayList();

        Metodos obx = new Metodos();
        
        
        
        
        
        int option;
       
        do{
             
         option = Integer.parseInt(JOptionPane.showInputDialog("Que quieres hacer \n "
                + "1) Añadir Libro \n"
                + "2) Ordenar \n"
                + "6) Salir"));
            
            switch(option){
                case 1:                                        
                    listaLibros.add(obx.crearLibro(listaLibros));                    
                    break;
                case 2:
                     obx.ordenar(listaLibros);
                    break;
                case 3:
                    String isbn = JOptionPane.showInputDialog("Que libro quieres consultar");
                    obx.consultarLibro(listaLibros, isbn);
                    break;
                case 4:
                     isbn = JOptionPane.showInputDialog("Que libro quieres");
                    obx.venderLibro(listaLibros, isbn);
                    break;
                case 6:
                    obx.salir();
                }
        }while(6 !=option);
       
    }
    
}
