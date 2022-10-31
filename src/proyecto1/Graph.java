/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
import java.util.Random;
/**
 *
 * @author Sebastián, Yargen
 * @version 28/10/2022
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
     * Constructor del laberinto
     * @param rows filas que tendra el laberinto
     * @param columns columnas que tendra el laberinto
     * Se llama a addVertex para automaticamente rellenar la lista con los vertices segun la cantidad necesaria
     */
    
    public void createLabyrinth(int rows, int columns) {
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
     * Conecta los vertices generados en el grafo de manera aleatoria
     */ 
    
    public void randomizeEdges(){
        Random rnd = new Random();
        for (int i = 0; i < this.vertexs.getlSize(); i++) {
            NodeVertexs nodoaux = this.vertexs.searchVertex((char)(i+65));
            for (int j=0; j < this.vertexs.getlSize(); j++){
                int random = (rnd.nextInt(this.vertexs.getlSize()));
                addEdge((char)nodoaux.getData(), ((char)(random + 65)));
            }
        }
    }
    
    /**
     * Constructor del grafo
     * Solo lo inicia
     */
    
    public Graph(){
        this.vertexs = null;
        this.rows = this.columns = 0;
    }
    

    /**
     * Constructor del MST
     * @param graph el grafo aleatorio
     * @param V filas (o vertices) que tendra el laberinto
     */
    
    public void primMST(Graph graph , int V)
    {
        //Arreglo para construir MST
        int parent[] = new int[V];
 
        // Valores de las aristas
        int key[] = new int[V];
 
        // Los vertices ya recorridos
        Boolean mstSet[] = new Boolean[V];
 
        // Se inicializan todas las aristas a infinito para conseguir las adyacentes
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
 
        // Se incluye primero la primera arista en el MST
        key[0] = 0; //Se hace 0 para tomarlo de primero
        parent[0] = -1; // Primer nodo siempre es el comienzo de MST
 
        // MST siempre tendra Rows de vertices (V)
        for (int count = 0; count < V - 1; count++) {
         
            int u = 0;
 
            // Se toma el vertice para el MST
            mstSet[u] = true;
 
            // Se consideran ahora los vertices que no estan en MST y son adyacentes
            for (int v = 0; v < V; v++)
 
                if (graph.getRows() != 0 && mstSet[v] == false
                    && graph.getColumns() < key[v]) {
                    parent[v] = u;
                    this.vertexs.insertEnd(this.vertexs.searchVertex((char)(u+65)));
                    this.vertexs.delStart();
                }
        }
    }
    
    
    public void addVertex(){
        for(int i = 0; i < this.vertexs.getlMax(); i++){
            char key = (char) (i + 65);
            NodeVertexs aux = new NodeVertexs(key);
            this.vertexs.insertEnd(aux);
        }
    }
        
    
    /**
     * Verifica si el grafo esta vacio
     * @return estado del grafo
     */
    
    public boolean isEmpty(){
        return this.vertexs == null;}
    
    /**
     * Vaciar grafo
     */
    
    public void empty(){
        if(!this.isEmpty()){
            this.rows = this.columns = 0;
            this.vertexs = null;
        }
    }
    
    /**
     * Imprimir grafo
     * @return String que contendra cada vertice con sus caminos correspondientes
     */
    
    public String printGraph(){
        if(!this.vertexs.isEmpty()){
            String data = "";
            NodeVertexs vert = this.vertexs.getlFirst();
            NodeEdge aux = vert.getpEdge();
            for(int i = 0; i < this.vertexs.getlSize(); i++){
                data += vert.getData();
                while(aux != null){
                    data += " --> " + aux.getData();
                    aux = aux.getpEdge();}
                vert = vert.getpNext();
                if(vert != null){
                    aux = vert.getpEdge();}
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
        NodeVertexs vert = this.vertexs.searchVertex(origin);
        NodeEdge aux = vert.getpEdge();
        while(aux != null){
            if((char) aux.getData() == target){
                return true;
            }else{
                aux = aux.getpEdge();}
        }
        return false;}
    
    public NodeEdge searchEdge(char origin, char target){
        NodeVertexs vert = this.vertexs.searchVertex(origin);
        NodeEdge aux = vert.getpEdge();
        while(aux != null){
            if((char) aux.getData() == target){
                return aux;
            }else{
                aux = aux.getpEdge();}
        }
        return null;}
    
    /**
     * Insertar arista/adyacencia
     * @param origin El vertice de origen
     * @param target El vertice que apuntara el origen
     */
    
    public void addEdge(char origin, char target){
        if(!this.vertexs.isEmpty()){
            NodeVertexs vert = this.vertexs.searchVertex(origin);
            NodeEdge auxEdge = vert.getpEdge();
            if(!edgeExists(origin, target)){
                NodeEdge aux = new NodeEdge(target);
                vert.setAdjAmount(vert.getAdjAmount() + 1);
                
                if(auxEdge == null){
                    vert.setpEdge(aux);
                }else{
                    while(auxEdge.getpEdge() != null){
                        auxEdge = auxEdge.getpEdge();}
                    auxEdge.setpEdge(aux);}
                addEdge(target, origin);}
                }
            }
}
