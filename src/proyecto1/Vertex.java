/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 */
public class Vertex<T> {
    private T data;
    private NodeEdge pFirst;
    private NodeEdge pLast;
    private int adjAmount;
    private Vertex vNext;

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
     * @return the pFirst
     */
    public NodeEdge getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodeEdge pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodeEdge getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodeEdge pLast) {
        this.pLast = pLast;
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

    /**
     * @return the vNext
     */
    public Vertex getvNext() {
        return vNext;
    }

    /**
     * @param vNext the vNext to set
     */
    public void setvNext(Vertex vNext) {
        this.vNext = vNext;
    }
    
    public Vertex(T data){
        this.data = data;
        this.pFirst = null;
        this.pLast = null;
        this.vNext = null;
        this.adjAmount = 0;
        
    }
    
    public boolean isEmpty(){
        return pFirst == null;
    }
    
    public void insertEdge(NodeEdge data){
        if(isEmpty()){
            this.pFirst = this.pLast = data;
        }else{
            this.pLast.setpEdge(data);
            this.pLast = data;
        }
    }
    
    public void cleanRow(){
        if(!isEmpty()){
        this.adjAmount = 0;
        this.pFirst = this.pLast = null;
        }
    }
    
    public NodeEdge searchPrevious(char data){
        if(!isEmpty()){
            NodeEdge aux = this.pFirst;
            while(aux.getpEdge() != null){
                if((char) aux.getpEdge().getData() == data){
                    return aux;
                }
                aux = aux.getpEdge();
            }
            }
        return null;}
    
    public void removeColumn(char data){
        if(!isEmpty()){
            if((char) this.pFirst.getData() == data){
                this.pFirst = this.pLast = null;
                this.adjAmount = 0;
            }else{
                NodeEdge aux = searchPrevious(data);   
                NodeEdge toRemove = aux.getpEdge();
                aux.setpEdge(toRemove.getpEdge());
            }
        }
    }
}
