/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 * Clase de listas enlazadas
 * @author Sebastián
 * @version 24/10/2022
 * @param lFirst Primer valor de la lista
 * @param lLast Ultimo valor de la lista
 * @param lSize Tamaño actual de la lista
 * @param lMax Tamaño maximo de la lista, depende de la cantidad de vertices a utilizar
 * 
 */
public class linkList {
    private Vertex lFirst;
    private Vertex lLast;
    private int lSize;
    private int lMax;

    /**
     * @return the lFirst
     */
    public Vertex getlFirst() {
        return lFirst;
    }

    /**
     * @param lFirst the lFirst to set
     */
    public void setlFirst(Vertex lFirst) {
        this.lFirst = lFirst;
    }

    /**
     * @return the lLast
     */
    public Vertex getlLast() {
        return lLast;
    }

    /**
     * @param lLast the lLast to set
     */
    public void setlLast(Vertex lLast) {
        this.lLast = lLast;
    }

    /**
     * @return the lSize
     */
    public int getlSize() {
        return lSize;
    }

    /**
     * @param lSize the lSize to set
     */
    public void setlSize(int lSize) {
        this.lSize = lSize;
    }

    /**
     * @return the lMax
     */
    public int getlMax() {
        return lMax;
    }

    /**
     * @param lMax the lMax to set
     */
    public void setlMax(int lMax) {
        this.lMax = lMax;
    }
    
    /**
     * Constructor de la lista, inicia vacio excepto por el parametro max
     * @param max 
     */
    
    public linkList(int max) {
        this.lFirst = this.lLast = null;
        this.lSize = 0;
        this.lMax = max;
    }
    
    /**
     * Verificacion de vacio
     * @return Retorna el estado de la lista, si es vacia o no
     */
    
    public boolean isEmpty(){
        return this.lFirst == null;
    }
    
    /**
     * Funcion que vacia la lista
     */
    
    public void emptyList(){
        this.lFirst = this.lLast = null;
        this.lSize = 0;
    }
    
    /**
     * Inserta un elemento al inicio de la lista
     * @param data Nodo a insertar
     */
    
    public void insertStart(Vertex data){
        if(isEmpty()){
            this.lFirst = this.lLast = data;
        }else{
            data.setvNext(this.lFirst);
            this.lFirst = data;
        }
        this.lSize++;
    }
    
    /**
     * Inserta un elemento al final de la lista
     * @param data Nodo a insertar
     */
    
    public void insertEnd(Vertex data){
        if(isEmpty()){
            this.lFirst = this.lLast = data;
        }else{
            this.lLast.setvNext(data);
            this.lLast = data;
        }
        this.lSize++;
    }
    
    /**
     * Elimina el elemento al inicio de la lista
     * @return elemento elminado
     */
    
    public Vertex delStart(){
        if(!isEmpty()){
            Vertex aux = this.lFirst;
            this.lFirst = this.lFirst.getvNext();
            return aux;
        }else{
            return null;
        }
    }
 
    /**
     * Elimina el elemento al final de la lista
     * @return elemento eliminado
     */
    
    public Vertex delEnd(){
        if(!isEmpty()){
            Vertex aux = this.lFirst;
            Vertex previousLast = this.lLast;
            for(int i = 0; i < this.lSize - 1; i++){
                aux = aux.getvNext();
            }
            aux.setvNext(null);
            this.lLast = aux;
            return previousLast;
        }else{
            return null;
        }   
    }

    /**
     * Busca la posicion del vertice en la lista
     * @param Target Vertice a buscar
     * @return Direccion del nodo buscado, sera null si no existe
     */
    
    public Vertex searchVertex(char Target){
        if(!isEmpty()){
            Vertex aux = this.lFirst;
            for(int i = 0; i < this.lSize; i++){
                if((char) aux.getData() == Target){
                    return aux;
            }else{
                aux = aux.getvNext();}
            }
        return null;}
        
    return null;}
}

