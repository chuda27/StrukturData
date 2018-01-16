/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author choirulhuda
 */
public class AdjList {
    private final Map<Integer, List<Integer>> incidentList;
    //private final LinkedList< Map<Integer, Integer>>[] adjListWeight;

    public AdjList(int jmlSimpul) {
        jmlSimpul += 1;
        incidentList = new HashMap<>();
        for (int i = 0; i < jmlSimpul; i++) {
            incidentList.put(i, new LinkedList<>());
        }
    }
    
    public void setBusur(int source, int dest){
        if (source> incidentList.size() || dest > incidentList.size()) {
            System.out.println("simpul tidak ada");
            return;
        }
        List<Integer> sourceList = incidentList.get(dest);
        sourceList.add(source);
        List<Integer> destList = incidentList.get(source);
        destList.add(dest);
    }
    
    public Map getBusur(){
        return incidentList;
    }
    
    
}
