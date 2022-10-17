/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 * Clase Nodos, todos sus parametros son genericos para permitir su uso en diversos tipos de listas
 * @author Sebastián
 * @version 16/10/2022
 */
public class Node<T> {
    private T data;
    private Object pNext;
    private Object pPrev;

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
    public Object getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(T pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the pPrevious
     */
    public Object getpPrev() {
        return pPrev;
    }

    /**
     * @param pPrevious the pPrevious to set
     */
    public void setpPrev(T pPrev) {
        this.pPrev = pPrev;
    }
    
    /**
     * Crea un nuevo nodo
     * @param data dato que contiene el nodo
     * @param key variable que determina si el nodo sera utilizado en listas enlazadas o listas de adyacencia
     */
    
    public Node(T data, String key) {
        if(key.contains("L")){
            this.data = data;
            this.pNext = null;
        }else{
            this.data = data;
            this.pNext = this.pPrev = -1;
        }
    }
    
    
    
}
