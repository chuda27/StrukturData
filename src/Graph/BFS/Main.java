/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.BFS;

/**
 *
 * @author choirulhuda
 */
public class Main {
    private static Graph g;
    
    public static void main(String[] args) {
        Graph g = new Graph(9);
 
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 8);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(5, 8);
        g.addEdge(6, 3);
        g.addEdge(3, 7);
        g.addEdge(6, 4);
 
        //System.out.println("Breadth First Traversal ");
        //g.BFS(1);
        
        Graph graph = new Graph(9);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);
        
        System.out.println("== Breadth First Traversal == ");
        graph.BFS(1);
    }
}
