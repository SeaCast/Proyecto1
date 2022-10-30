/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 */
public class pile {
    private NodeEdge top;
    private NodeEdge base;
    private int pSize;

    /**
     * @return the top
     */
    public NodeEdge getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(NodeEdge top) {
        this.top = top;
    }

    /**
     * @return the base
     */
    public NodeEdge getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(NodeEdge base) {
        this.base = base;
    }

    /**
     * @return the pSize
     */
    public int getpSize() {
        return pSize;
    }

    /**
     * @param pSize the pSize to set
     */
    public void setpSize(int pSize) {
        this.pSize = pSize;
    }
    
    public pile(){
        this.top = this.base = null;
        this.pSize = 0;
    }
    
    public boolean isEmpty(){
        return this.top == null;
    }
    
    public void empty(){
        this.top = this.base = null;
        this.pSize = 0;
    }
    
    public void push(NodeEdge newNode){
        if(this.isEmpty()){
            this.top = this.base = newNode;
        }else{
            newNode.setpEdge(this.top);
            this.top = newNode;
        }
        this.pSize++;
    }
    
    public NodeEdge pop(){
        NodeEdge auxEdge = null;
        if(this.isEmpty()){
            return auxEdge;
        }else if(this.pSize == 1){
            auxEdge = this.getTop();
            this.empty();
        }else{
            auxEdge = this.getTop();
            this.top = this.top.getpEdge();
        }
        this.pSize--;
        return auxEdge;
    }
    
}