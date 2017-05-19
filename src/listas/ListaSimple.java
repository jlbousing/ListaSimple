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
public class ListaSimple {
 
    private Nodo cabeza;

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public ListaSimple(){
        cabeza = null;
    }
    
    
    public void InsertarPrimero(Nodo nuevo){
        
        //PRIMER CASO (LISTA VACIA)
        if(cabeza == null){
            cabeza = nuevo;
        }
        else if(cabeza != null){
           Nodo aux = cabeza; //GUARDAMOS QUIEN ERA CABEZA
           cabeza = nuevo;
           cabeza.setProx(aux);
        }
    }
    
    public void InsertarFinal(Nodo nuevo){
        
        //PRIMER CASO (LISTA VACÍA)
        if(cabeza == null){
            cabeza = nuevo;
        }
        else{
            
            Nodo aux = cabeza;
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
            
            aux.setProx(nuevo); //INSERTAMOS nuevo AL FINAL
        }
    }
    
    public Nodo EliminaP(){
        
        if(cabeza == null){
            return null;
        }
        else if(cabeza.getProx() == null){
            //CASO CUANDO EXISTA UN ELEMENTO
            Nodo aux = cabeza;
            cabeza = null;
            return aux;
        }
        else{
           Nodo aux = cabeza;
           cabeza = cabeza.getProx(); //CABEZA SERA EL SIGUIENTE
           aux.setProx(null);
           return aux;
        }
    }
    
    public Nodo EliminaF(){
        
        if(cabeza == null){
            return null;
        }
        else if(cabeza.getProx() == null){
            Nodo aux = cabeza;
            cabeza = null;
            return aux;
        }
        else{
            
           Nodo aux = cabeza;
           while(aux.getProx().getProx() != null){
               
               aux = aux.getProx();
           }
           
           Nodo aux2 = aux.getProx();
           aux.setProx(null); //SE SACA EL ÚLTIMO DE LA LISTA
           return aux2; //se retorna el nodo eliminado
        }
    }
    
    public void Mostrar(){
        
        Nodo aux = cabeza;
        
        while(aux != null){
            aux.Mostrar();
            aux = aux.getProx();
        }
    }
}
