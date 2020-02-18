/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

/**
 *
 * @author jalonsoriveiro
 */
public class Libro {
    
    String titulo = null;
    String autor  = null;
    String ISBN   = null;
    float prezo   = 0;
    int unidades  = 0;

    public Libro() {
    }
     public Libro(String tiutlo,String autor,String ISBN, float prezo , int unidades) {
         
         this.titulo = titulo;
         this.autor = autor;
         this.ISBN = ISBN;
         this.prezo = prezo;
         this.unidades = unidades;
                          
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", unidades=" + unidades + '}';
    }
    
    
}
