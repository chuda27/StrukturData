/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
/**
 *
 * @author choirulhuda
 */
public class AdWeight {
    private final LinkedList< Map<Integer, Integer>>[] adjList;

    public AdWeight(int simpul) {
        this.adjList = new LinkedList[simpul];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public LinkedList<Map<Integer, Integer>>[] getAdjList() {
        return adjList;
    }
    
    //tambah busur
    public void addBusur(int source, int dest, int weight){
        Map<Integer, Integer> object = new HashMap<>();
        object.put(dest, weight);
        adjList[source].add(object);
    }
    
    //jmlSimpul
    public int getSimpul(){
        return adjList.length;
    }
    
    //jml Busur dari Simpul
    public int getJmlBusur(int source){
        return adjList[source].size();
    }
    
    //ngambil busur dari simpul
    public LinkedList<Map<Integer, Integer>> getBusurDariSimpul(int source){
        LinkedList<Map<Integer, Integer>> listBusur = new LinkedList<>();
        
        return listBusur;
    }
    
    //tampilkan Adj List
    public void printAdjList(LinkedList< Map<Integer, Integer>>[] adjList){
        System.out.println();
        LinkedList<Map<Integer, Integer>>[] source = adjList;
        for (int j = 1; j < source.length-1; j++) {
            System.out.print(j+" : ");
            for(int i = 0; i <= source[j].size(); i++){
                Iterator it = source[j].element().entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    System.out.print(entry.getKey()+"("+entry.getValue()+")");
                }
                
            }
            /*source[j].element().entrySet().forEach((result) -> {
                System.out.print(result.getKey()+"("+result.getValue()+")");
            });*/
            System.out.println();
        }
        
    }
    
    //hapus busur
    public boolean removeBusur(int source, Map<Integer, Integer> busur){
        return adjList[source].remove(busur);
    }

    private Map<Integer, Integer> source() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
