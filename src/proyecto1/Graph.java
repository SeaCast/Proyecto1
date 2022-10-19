/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Sebastián
 * @version 19/10/2022
 * @param vertexs Lista enlazada que contiene los vertices, adicionalmente cada vertice apuntara a sus adyacencias
 * @param rows filas que tendra el laberinto
 * @param columns columnas que tendra el laberinto
 * 
 */
public class Graph {
    private linkList vertexs;
    private int rows;
    private int columns;

    /**
     * @return the vertexs
     */
    public linkList getVertexs() {
        return vertexs;
    }

    /**
     * @param vertexs the vertexs to set
     */
    public void setVertexs(linkList vertexs) {
        this.vertexs = vertexs;
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * Constructor del grafo
     * @param rows filas que tendra el laberinto
     * @param columns columnas que tendra el laberinto
     * Se llama a addVertex para automaticamente rellenar la lista con los vertices segun la cantidad necesaria
     */
    
    public Graph(int rows, int columns) {
        if(rows > columns){
            this.vertexs = new linkList(rows);
        }else{
            this.vertexs = new linkList(columns);
        }
        this.rows = rows;
        this.columns = columns;
        addVertex();
    }
    
    /**
     * Insertar vertices, se inserta la cantidad necesaria de vertices
     */
    
    public void addVertex(){
        for(int i = 0; i < this.vertexs.getlMax(); i++){
            char key = (char) (i + 65);
            Node aux = new Node(key);
            this.vertexs.insertEnd(aux);
        }
    }
        
    /**
     * Imprimir grafo
     * @return String que contendra cada vertice con sus caminos correspondientes
     */
    
    public String printGraph(){
        if(!this.vertexs.isEmpty()){
            String data = "";
            Node vert = this.vertexs.getlFirst();
            Node aux = vert.getpNext();
            for(int i = 0; i < this.vertexs.getlSize(); i++){
                data += vert.getData();
                while(aux != null){
                    data += " --> " + aux.getData();
                    aux = aux.getpNext();}
                vert = vert.getpVert();
                if(vert != null){
                    aux = vert.getpNext();}
                data += "\n";
                }
            return data;
        }else{
            return "El grafo esta vacio";}
    }
        
    /**
     * Verificacion de la existencia de una arista
     * @param origin Vertice origen
     * @param target Vertice al que apunta el origen
     * @return la existencia de la arista
     */
    
    public boolean edgeExists(char origin, char target){
        Node vert = this.vertexs.searchVertex(origin);
        while(vert.getpNext() != null){
            vert = vert.getpNext();
            if((char) vert.getData() == target){
                return true;}
        }
        return false;}
    
    /**
     * Insertar arista/adyacencia
     * @param origin El vertice de origen
     * @param target El vertice que apuntara el origen
     */
    
    public void addEdge(char origin, char target){
        if(!this.vertexs.isEmpty()){
            Node aux = new Node(target);
            Node vert = this.vertexs.searchVertex(origin);
            while(vert.getpNext() != null){
                vert = vert.getpNext();}
            vert.setpNext(aux);
        }
    }
}


