/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 * Clase grafos, crea grafos utilizando listas de adyacencia
 * @author Sebastián
 * @version 16/10/2022
 */
public class Graph {
    private arrayList vertexs;
    private int rows;
    private int columns;

    /**
     * @return the vertexs
     */
    public arrayList getVertexs() {
        return vertexs;
    }

    /**
     * @param vertexs the vertexs to set
     */
    public void setVertexs(arrayList vertexs) {
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
     * Crea un nuevo grafo
     * @param rows la cantidad de filas que tendra el grafo
     * @param columns la cantidad de columnas que tendra el grafo
     */
    
    public Graph(int rows, int columns) {
        if(rows > columns){
            this.vertexs = new arrayList(rows);
        }else{
            this.vertexs = new arrayList (columns);
        }
        this.rows = rows;
        this.columns = columns;
        addVertex();
    }
    
    /**
     * Añade vertices automaticamente al grafo segun la cantidad de filas o columnas, la que sea mas grande
     */
    
    public void addVertex(){
        for(int i = 0; i < this.vertexs.getArray().length; i++){
            char key = (char) (i + 65);
            Node aux = new Node(key, "L");
            linkList auxList = new linkList();
            auxList.insertStart(aux);
            Node auxArray = new Node(auxList, "A");
            vertexs.insertEnd(auxArray);
        }
    }
    
    /**
     * Muestra los vertices del grafo pero sin sus adyacencias
     */
    
    public void printGraph(){
        int i = this.vertexs.getaFirst();
        while(i != -1){
            linkList aux = linkList.class.cast(this.vertexs.getArray()[i].getData());
            System.out.println(aux.getlFirst().getData());
            i = (int) this.vertexs.getArray()[i].getpNext();
        }
    }
    
    /**
     * Verifica la existencia de una adyacencia
     * @param vertex Lista de adyacencia para el vertice seleccionado
     * @param target vertice a verificar si es adyacente
     * @return Retorna si ya existe la adyacencia
     */
    
    public boolean edgeExists(linkList vertex, int target){
        Node aux = Node.class.cast(vertex.getlFirst());
        char auxChar = (char) (target + 65);
        for(int i = 0; i < vertex.getlSize(); i++){
            if((char)aux.getData() == auxChar){
                return true;
                }
            aux = Node.class.cast(aux.getpNext());
            }
        return false;}
    
    /**
     * Inserta una adyacencia al vertice seleccionado
     * @param origin vertice al cual se le insertara la adyacencia o arista
     * @param target vertice a insertar para adyacencia
     */
    
    public void addEdge(int origin, int target){
        linkList aux = linkList.class.cast(this.vertexs.getArray()[origin].getData());
        char key = (char) (target + 65);
        Node auxNode = new Node(key, "L");
        if(!edgeExists(aux, target)){
            aux.insertEnd(auxNode);
        }else{
            System.out.println("Ya existe la arista");}
        }
    }
    

