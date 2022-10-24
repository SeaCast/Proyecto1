/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 * @version 24/10/2022
 * @param data Dato del nodo 
 * @param pNext siguiente nodo
 * @param pVert siguiente adyacencia
 * 
 */
public class NodeVertexs<T> {
    private T data;
    private NodeVertexs pNext;
    private NodeEdge pEdge;
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
    public NodeVertexs getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodeVertexs pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the pVert
     */
    public NodeEdge getpEdge() {
        return pEdge;
    }

    /**
     * @param pVert the pVert to set
     */
    public void setpEdge(NodeEdge pEdge) {
        this.pEdge = pEdge;
    }

    /**
     * Constructor del nodo
     * @param data Dato a ingresar
     */
    
    public NodeVertexs(T data) {
        this.data = data;
        this.pNext = null;
        this.pEdge = null;
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
