/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.DFS;

/**
 *
 * @author choirulhuda
 */
public class Main {
    private static Graph g;
    
    public static void main(String[] args) {
        Graph g = new Graph(9);
 
        g.addEdge(1, 2);
        g.addEdge(2, 5);
        g.addEdge(5, 8);
        g.addEdge(8, 1);
        g.addEdge(2, 6);
        g.addEdge(6, 3);
        g.addEdge(3, 7);
        g.addEdge(6, 4);
        
        Graph g2 = new Graph(9);
        g2.addEdge(1, 2);
        g2.addEdge(2, 4);
        g2.addEdge(4, 8);
        g2.addEdge(8, 5);
        g2.addEdge(8, 6);
        g2.addEdge(6, 3);
        g2.addEdge(3, 7);
 
        //System.out.println("Depth First Traversal");
        //g.DFS(1);
        System.out.println("== Depth First Traversal ==");
        g2.DFS(1);
    }
}
