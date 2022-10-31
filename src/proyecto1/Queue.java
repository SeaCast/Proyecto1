/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 */
public class Queue {
    private NodeEdge head;
    private NodeEdge tail;
    private int qSize;

    /**
     * @return the head
     */
    public NodeEdge getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(NodeEdge head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public NodeEdge getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(NodeEdge tail) {
        this.tail = tail;
    }

    /**
     * @return the qSize
     */
    public int getqSize() {
        return qSize;
    }

    /**
     * @param qSize the qSize to set
     */
    public void setqSize(int qSize) {
        this.qSize = qSize;
    }
    
    public Queue(){
        this.head = this.tail = null;
        this.qSize = 0;
    }
    
    public boolean isEmpty(){
        return head == null;}
    
    public void empty(){
        this.head = this.tail = null;
        this.qSize = 0;
        }
    
    public void enqueue(NodeEdge newNode){
        NodeEdge auxEdge = new NodeEdge(newNode.getData(), newNode.geteOrigin());
        auxEdge.seteTag(newNode.geteTag());
        if(this.isEmpty()){
            this.head = this.tail = auxEdge;
        }else{
            this.tail.setpEdge(auxEdge);
            this.tail = auxEdge;
            }
        this.qSize++;
    }
    
    public NodeEdge dequeue(){
        NodeEdge auxEdge = null;
        if(this.isEmpty()){
           return auxEdge;     
        }else if(this.qSize == 1){
            auxEdge = this.getHead();
            this.empty();
        }else{
            auxEdge = this.getHead();
            this.head = this.head.getpEdge();
        }
        this.qSize--;
        return auxEdge;
    }
      
}
