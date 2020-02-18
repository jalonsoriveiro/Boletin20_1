/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

import java.util.ArrayList;
import meusmetodos.PedirDato;

/**
 *
 * @author jalonsoriveiro
 */
public class Metodos {
    
    public ArrayList<Libro> crearLibro(ArrayList<Libro>listaLibros){       
        
        Libro obx = new Libro(PedirDato.PedirString("Titulo:"),PedirDato.PedirString("autor :"),PedirDato.PedirString("ISBN :"),PedirDato.PedirInt(),PedirDato.PedirInt());        
        if(listaLibros.isEmpty()){        
                listaLibros.add(obx);        
        }else{
            for (Libro i : listaLibros){
               if(i.ISBN == obx.ISBN){
                  i.unidades++;
                }else{
                  listaLibros.add(obx);
                }           
            }
    }
                return listaLibros;   

    }
    //vender ( borrar ) libros
    public void venderLibro(ArrayList<Libro>listaLibros,String libroVende){
    
        for (Libro i : listaLibros){
        if (i.ISBN == libroVende){
            
            if (i.unidades>1){
                i.unidades--;
            }else{
               listaLibros.remove(i);
            }
        
        }
            
        
        }
    
    
    }
       public void salir() {
        System.exit(0);
    }    
    
}
