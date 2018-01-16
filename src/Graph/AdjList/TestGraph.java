/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author choirulhuda
 */
public class TestGraph {

    private static Graph grap;
    public static void main(String[] args) {
        Graph graph;
        int jmlSimpul = 6;
        grap = new Graph(jmlSimpul);
        grap.addBusur(1, 2, 8);
        grap.addBusur(1, 3, 7);
        grap.addBusur(1, 5, 9);
        grap.addBusur(2, 4, 5);
        grap.addBusur(3, 4, 11);
        grap.addBusur(5, 3, 12);
        grap.addBusur(4, 5, 3);
        //System.out.println(grap);
        
        Graph graphDirect = new Graph(6);
        graphDirect.addBusurDirect(1, 2, 8);
        graphDirect.addBusurDirect(2, 1, 7);
        graphDirect.addBusurDirect(1, 3, 4);
        graphDirect.addBusurDirect(3, 1, 5);
        graphDirect.addBusurDirect(2, 4, 6);
        graphDirect.addBusurDirect(3, 4, 11);
        graphDirect.addBusurDirect(4, 3, 10);
        graphDirect.addBusurDirect(4, 5, 9);
        graphDirect.addBusurDirect(5, 3, 5);
        System.out.println(graphDirect);
    }
    
    public static void showDegree(List<Busur>[] hasil){
        for (int i = 1; i < hasil.length; i++) {
            System.out.print("Simpul : "+i+" = ");
            int j = 0;
            for (Busur result : hasil[i]) {
                j += 1;
            }
            System.out.print(j+"\n");
        }
    }
    
}
