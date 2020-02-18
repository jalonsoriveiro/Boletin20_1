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
        int option = Integer.parseInt(JOptionPane.showInputDialog("Que quieres hacer \n "
                + "1) Añadir Libro \n"
                + "6) Salir"));
            
        do{
            switch(option){
                case 1:
                    listaLibros = obx.crearLibro(listaLibros);
                    break;
                case 6:
                    obx.salir();
                }
        }while(6 !=option);
    }
    
}
