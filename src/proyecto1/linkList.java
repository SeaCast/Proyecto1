/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 * @version 16/10/2022
 */
public class linkList {
    private Node lFirst;
    private Node lLast;
    private int lSize;

    /**
     * @return the lFirst
     */
    public Node getlFirst() {
        return lFirst;
    }

    /**
     * @param lFirst the lFirst to set
     */
    public void setlFirst(Node lFirst) {
        this.lFirst = lFirst;
    }

    /**
     * @return the lLast
     */
    public Node getlLast() {
        return lLast;
    }

    /**
     * @param lLast the lLast to set
     */
    public void setlLast(Node lLast) {
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

    public linkList() {
        this.lFirst = this.lLast = null;
        this.lSize = 0;
    }
    
    /**
     * Verifica si la lista esta vacia
     * @return el estado de la lista, si es vacia o no
     */
    
    public boolean isEmpty(){
        return this.lFirst == null;
    }
    
    /**
     * Vacia la lista
     */
    
    public void emptyList(){
        this.lFirst = this.lLast = null;
        this.lSize = 0;
    }
    
    /**
     * Inserta un nodo al inicio de la lista
     * @param data nodo a insertar
     */
    
    public void insertStart(Node data){
        if(isEmpty()){
            this.lFirst = this.lLast = data;
        }else{
            data.setpNext(this.lFirst);
            this.lFirst = data;
        }
        this.lSize++;
    }
    
    /**
     * Inseta un nodo al final de la lista
     * @param data nodo a insertar
     */
    
    public void insertEnd(Node data){
        if(isEmpty()){
            this.lFirst = this.lLast = data;
        }else{
            this.lLast.setpNext(data);
            this.lLast = data;
        }
        this.lSize++;
    }
    
    /**
     * Borra el nodo al inicio de la lista
     * @return el nodo borrado
     */
    
    public Node delStart(){
        if(!isEmpty()){
            Node aux = this.lFirst;
            this.lFirst = Node.class.cast(this.lFirst.getpNext());
            return aux;
        }else{
            return null;
        }
    }
 
    /**
     * Borra el nodo al final de la lista
     * @return el nodo borrado
     */
    
    public Node delEnd(){
        if(!isEmpty()){
            Node aux = this.lFirst;
            Node previousLast = this.lLast;
            for(int i = 0; i < this.lSize - 1; i++){
                aux = Node.class.cast(aux.getpNext());
            }
            aux.setpNext(null);
            this.lLast = aux;
            return previousLast;
        }else{
            return null;
        }   
    }
    
}
