/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 * @version 19/10/2022
 * @param data Dato del nodo 
 * @param pNext siguiente nodo
 * @param pVert siguiente adyacencia
 * 
 */
public class Node<T> {
    private T data;
    private Node pNext;
    private Node pVert;
    private int adjAmount;

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public Node getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the pVert
     */
    public Node getpVert() {
        return pVert;
    }

    /**
     * @param pVert the pVert to set
     */
    public void setpVert(Node pVert) {
        this.pVert = pVert;
    }

    /**
     * Constructor del nodo
     * @param data Dato a ingresar
     */
    
    public Node(T data) {
        this.data = data;
        this.pNext = null;
        this.pVert = null;
        this.adjAmount = 0;
    }    

    /**
     * @return the adjAmount
     */
    public int getAdjAmount() {
        return adjAmount;
    }

    /**
     * @param adjAmount the adjAmount to set
     */
    public void setAdjAmount(int adjAmount) {
        this.adjAmount = adjAmount;
    }
    
    
}
