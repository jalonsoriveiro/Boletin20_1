/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

import meusmetodos.PedirDato;

/**
 *
 * @author jalonsoriveiro
 */
public class Metodos {
    
    public Libro crearXogador(){
       
        Libro xog = new Libro(PedirDato.PedirString("Titulo:"),PedirDato.PedirString("autor :"),PedirDato.PedirString("ISBN :"),PedirDato.PedirInt(),PedirDato.PedirInt());
        
        return xog;            
    }

    
    
}
