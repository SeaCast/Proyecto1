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
public class arrayList {
    private int aFirst;
    private int aLast;
    private int aSize;
    private Node array[];

    /**
     * @return the aFirst
     */
    public int getaFirst() {
        return aFirst;
    }

    /**
     * @param aFirst the aFirst to set
     */
    public void setaFirst(int aFirst) {
        this.aFirst = aFirst;
    }

    /**
     * @return the aLast
     */
    public int getaLast() {
        return aLast;
    }

    /**
     * @param aLast the aLast to set
     */
    public void setaLast(int aLast) {
        this.aLast = aLast;
    }

    /**
     * @return the aSize
     */
    public int getaSize() {
        return aSize;
    }

    /**
     * @param aSize the aSize to set
     */
    public void setaSize(int aSize) {
        this.aSize = aSize;
    }

    /**
     * @return the array
     */
    public Node[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(Node[] array) {
        this.array = array;
    }

    /**
     * Crea una nueva lista de arreglos
     * @param max Tamaño del arreglo
     */
    
    public arrayList(int max) {
        this.aFirst = this.aLast = -1;
        this.aSize = 0;
        this.array = new Node[max];
    }
    
    /**
     * Verifica si la lista esta vacia
     * @return estado de la lista si es vacia o no
     */
    
    public boolean isEmpty(){
        return this.aFirst == -1;
    }
    
    /**
     * Vacia la lista
     */
    
    public void Emptylist(){
        this.aFirst = this.aLast = -1;
        this.aSize = 0;
    }
    
    /**
     * Verifica si la lista esta llena
     * @return estado de la lista si esta llena o no
     */
    
    public boolean isFull(){
        return this.aSize == this.array.length;
    }
    
    /**
     * Busca un espacio vacio en la lista
     * @return La ubicacion de un espacio vacio en la lista, si no existe alguno, retorna un indice fuera de la lista
     */
    
    public int searchEmptySlot(){
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i] == null){
                return i;
                }
            }
        return -1;
    }
    
    /**
     * Inserta un nodo al inicio de la lista
     * @param data nodo a insertar
     */
    
    public void insertStart(Node data){
        if(!isFull()){
            int position = searchEmptySlot();
            Node aux = data;
            this.array[position] = aux;
            if(isEmpty()){
                this.array[position].setpNext(-1);
                this.array[position].setpPrev(-1);
                this.aFirst = this.aLast = position;
            }else{
                this.array[position].setpNext(this.aFirst);
                this.aFirst = position;
            }
            this.aSize++;
        }
    }
    
    /**
     * Inserta un nodo al final de la lista
     * @param data nodo a insertar
     */
    
    public void insertEnd(Node data){
        if(!isFull()){
            int position = searchEmptySlot();
            Node aux = data;
            this.array[position] = aux;
            if(isEmpty()){
                this.array[position].setpNext(-1);
                this.array[position].setpPrev(-1);
                this.aFirst = this.aLast = position;
            }else{
                this.array[aLast].setpNext(position);
                this.aLast = position;
            }
            this.aSize++;
        }
    }
    
}
