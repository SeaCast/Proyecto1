/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 */
public class NodeEdge<T> {
    private T data;
    private NodeEdge pEdge;
    private String eTag;

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
     * @return the eNext
     */
    public NodeEdge getpEdge() {
        return pEdge;
    }

    /**
     * @param eNext the eNext to set
     */
    public void setpEdge(NodeEdge pEdge) {
        this.pEdge = pEdge;
    }

    /**
     * @return the eTag
     */
    public String geteTag() {
        return eTag;
    }

    public NodeEdge(T data) {
        this.data = data;
        this.pEdge = null;
        this.eTag = null;
    }
    
    
    
}
