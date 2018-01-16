/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.DFS;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author choirulhuda
 */
public class Graph {

    private final int jmlSimpul;
    private final LinkedList<Integer> adj[];

    Graph(int simpul) {
        this.jmlSimpul = simpul;
        adj = new LinkedList[simpul];
        for (int i = 0; i < simpul; ++i) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int dest) {
        adj[source].add(dest);  
    }

    public void cekSimpul(int source, boolean visited[]) {
        visited[source] = true;
        System.out.print(source + " ");
        Iterator<Integer> i = adj[source].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                cekSimpul(n, visited);
            }
        }
    }

    public void DFS(int source) {
        boolean visited[] = new boolean[jmlSimpul];
        
        cekSimpul(source, visited);
        System.out.println("\n");
    }
}
