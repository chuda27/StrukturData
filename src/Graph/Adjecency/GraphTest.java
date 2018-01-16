/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.Adjecency;

/**
 *
 * @author choirulhuda
 */
public class GraphTest {
    public static void main(String[] args) {
        Graph grap = new Graph(5);
        grap.addEdge(0, 1);
        grap.addEdge(0, 2);
        grap.addEdge(0, 3);
        grap.addEdge(1, 2);
        grap.addEdge(2, 3);
        grap.showGraph(grap);
    }
}
