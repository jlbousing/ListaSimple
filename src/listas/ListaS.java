/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

/**
 *
 * @author Sony
 */
public class ListaS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple ls = new ListaSimple();
        
        ls.InsertarFinal(new Nodo(1));
        ls.InsertarFinal(new Nodo(2));
        ls.InsertarFinal(new Nodo(3));
        ls.InsertarFinal(new Nodo(4));
        ls.InsertarFinal(new Nodo(5));
        
        ls.Mostrar();
        
        ls.EliminaF();
        System.out.println("");
        ls.Mostrar();
    }
    
}
