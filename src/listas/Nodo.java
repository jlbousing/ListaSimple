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
public class Nodo {
    
    private int data;
    private Nodo prox;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setProx(Nodo prox) {
        this.prox = prox;
    }
    
    public Nodo(int data){
        this.data = data;
        prox = null;
    }
    
    public void Mostrar(){
        System.out.print(data);
    }
}
