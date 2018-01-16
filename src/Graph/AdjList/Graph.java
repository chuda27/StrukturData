/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjList;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author choirulhuda
 */
public class Graph {
    LinkedList<Busur>[] busur;

    public Graph(int jmlSimpul) {
        this.busur = new LinkedList[jmlSimpul];
        for (int i = 0; i < busur.length; i++) {
            busur[i] = new LinkedList<>();
        }
    }
    
    public void addBusur(int source, int dest, int bobot){
        this.busur[source].add(0, new Busur(dest, bobot));
        this.busur[dest].add(0, new Busur(source, bobot));
    }
    
    public void addBusurDirect(int source, int dest, int bobot){
        this.busur[source].add(0, new Busur(dest, bobot));
    }
    
    public List<Busur>[] getBusur(){
        return busur;
    }
    

    @Override
    public String toString() {
        String resut = "";
        for (int i = 1; i < busur.length; i++) {
            resut += i+" => "+busur[i]+"\n";
        }
        return resut; 
    }
    
    
    
    
}
