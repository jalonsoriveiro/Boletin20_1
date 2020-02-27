/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

import static java.lang.Integer.compare;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.*;
import java.util.Comparator;
import meusmetodos.PedirDato;

/**
 *
 * @author jalonsoriveiro
 */
public class Metodos {
    
    public Libro crearLibro(ArrayList<Libro>listaLibros){                                    
        Libro obx = new Libro(PedirDato.PedirString("Titulo:"),PedirDato.PedirString("autor :"),PedirDato.PedirString("ISBN :"),PedirDato.PedirInt(),PedirDato.PedirInt());        
        if(listaLibros.isEmpty()){        
                listaLibros.add(obx);        
        }else{
            for (Libro i : listaLibros){
               if(!i.ISBN.equals(obx.ISBN)){
                   i.unidades++;
               }else{
                   listaLibros.add(obx);                   
               }           
            }
    }
                return obx;   

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
    
    public void ordenar(ArrayList<Libro> lista){                    
         Collections.sort(lista);         
            for (Libro i : lista){                
                System.out.println(i);                
            } 
    }

    public void consultarLibro(ArrayList<Libro> lista, String ISBN){
    
     for (Libro i : lista){                
                if (i.ISBN == null ? ISBN == null : i.ISBN.equals(ISBN)){                    
                    System.out.println(i);
                }             
            } 
    }
    
       public void salir() {
        System.exit(0);
    }    
    
}
