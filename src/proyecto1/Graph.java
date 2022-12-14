/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
import java.util.Random;
import Interfaces.MainMenu;
/**
 *
 * @author Sebastián, Yargen
 * @version 30/10/2022
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
        for (int i = 0; i < this.rows - 2; i++) {
            Vertex vertAux = this.vertexs.searchVertex((char)(i+66));
            for (int j=0; j < this.columns - 2; j++){
                int random = (rnd.nextInt(this.columns - 2));
                addEdge((char)vertAux.getData(), ((char)(random + 66)));
            }
        }
        if(this.rows < this.columns){
            for(int i = this.rows; i < this.vertexs.getlSize(); i++){
                columnLower(i, 0, 'R');}  
        }else if(this.columns < this.rows){
            for(int i = 0; i < this.vertexs.getlSize() - 2; i++){
                columnLower(i, this.columns - 1, 'C');
                for(int j = this.columns; j < this.vertexs.getlSize(); j++){
                    columnLower(i, j, 'C');
                }
            }
        }
    }
    
    public void columnLower(int origin, int target, char key){
        if(key == 'R'){
            Vertex toClean = this.vertexs.searchVertex((char) (66 + origin - 2));
            toClean.cleanRow();
        }else{  
            if(edgeExists((char) (66 + origin), (char) (65 + target))){
                Vertex toClean = this.vertexs.searchVertex((char) (66 + origin));
                toClean.removeColumn((char) (65 + target));
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
            Vertex aux = new Vertex(key);
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
            Vertex vert = this.vertexs.getlFirst();
            NodeEdge aux = vert.getpFirst();
            for(int i = 0; i < this.vertexs.getlSize(); i++){
                data += vert.getData();
                while(aux != null){
                    data += " --> " + aux.getData();
                    aux = aux.getpEdge();}
                vert = vert.getvNext();
                if(vert != null){
                    aux = vert.getpFirst();}
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
        Vertex vert = this.vertexs.searchVertex(origin);
        NodeEdge aux = vert.getpFirst();
        while(aux != null){
            if((char) aux.getData() == target){
                return true;
            }else{
                aux = aux.getpEdge();}
        }
        return false;}
    
    public NodeEdge searchEdge(char origin, char target){
        Vertex vert = this.vertexs.searchVertex(origin);
        NodeEdge aux = vert.getpFirst();
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
            Vertex vert = this.vertexs.searchVertex(origin);
            NodeEdge auxEdge = vert.getpFirst();
            if(!edgeExists(origin, target)){
                NodeEdge aux = new NodeEdge(target, origin);
                vert.setAdjAmount(vert.getAdjAmount() + 1);
                
                if(auxEdge == null){
                    vert.insertEdge(aux);
                }else{
                    while(auxEdge.getpEdge() != null){
                        auxEdge = auxEdge.getpEdge();}
                    vert.insertEdge(aux);}
                addEdge(target, origin);
                }
            }
    }
    
    public NodeEdge searchEntrance(char tag){
        Vertex auxVert = this.vertexs.getlFirst();
        for(int i = 0; i < this.vertexs.getlSize(); i++){
            NodeEdge auxEdge = auxVert.getpFirst();
            for(int j = 0; j < auxVert.getAdjAmount(); j++){
                if(auxEdge.geteTag() == 'E'){
                    return auxEdge;}
                auxEdge = auxEdge.getpEdge();
                }
            auxVert = auxVert.getvNext();
        }
        return null;}
    
//    /**
//     * 
//     * @param entrance Vertice entrada
//     * @return si se encontro la salida
//     */
//    
//    public boolean breadthFS(NodeEdge entrance){
//        Queue edgeQueue = new Queue();
//        NodeVertexs auxVert = this.vertexs.searchVertex((char) entrance.getData());
//        NodeEdge auxEdge = auxVert.getpEdge();
//        boolean foundExit = false;
//        for(int i = 0; i < (auxVert.getAdjAmount() - 1); i++){
//            edgeQueue.enqueue(auxEdge);
//            auxEdge = auxEdge.getpEdge();
//        }
//         
//        while(!edgeQueue.isEmpty()){
//            auxEdge = edgeQueue.dequeue();
//            auxEdge = this.searchEdge(auxEdge.geteOrigin(), (char) auxEdge.getData());
//            if(auxEdge.geteTag() == 'S'){
//                foundExit = true;
//                return foundExit;
//            }else if(auxEdge.geteTag() == 'V' || auxEdge.geteTag() == 'E'){
//                continue;
//            }else{
//                auxEdge.seteTag('V');
//                auxVert = this.vertexs.searchVertex((char) auxEdge.getData());
//                auxEdge = auxVert.getpEdge();
//                for(int i = 0; i < auxVert.getAdjAmount(); i++){
//                    if(auxEdge.geteTag() != 'V'){
//                        edgeQueue.enqueue(auxEdge);}
//                    auxEdge = auxEdge.getpEdge();}
//            }
//        }
//        return foundExit;}
    
    
}

