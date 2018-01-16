/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.Adjecency;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author choirulhuda
 */
public class Graph {
    int limit;
    AdjList array[];

    public Graph(int limit) {
        this.limit = limit;
        array = new AdjList[limit];
        
        for (int i = 0; i < limit; i++) {
            array[i] = new AdjList();
            array[i].head = null;
        }
    }
    
    public void addEdge(int source, int dest) {
        AdjNode node = new AdjNode(source, dest);
        node.next = array[source].head;
        array[source].head = node;
        
    }
    
    public void Bfs(int startVertex) {
        boolean[] visited = new boolean[limit];
        
		Queue<Integer> s = new LinkedList<Integer>();

		s.add(startVertex);
		while (s.isEmpty() == false) {
			int n = s.poll();
			System.out.print(" " + n);
			visited[n] = true;
			AdjNode head = array[n].head;
			while (head != null) {
				if (visited[head.getDest()] == false) {
					s.add(head.getDest());
					visited[head.getDest()] = true;
				}
				head = head.next;
			}
                }
    }
    public void showGraph(Graph grap) {
        int vertex = grap.limit;
        AdjNode node;
        for (int i = 0; i < vertex; i++) {
            node = grap.array[i].head;
            if (node != null) {
                System.out.println("Node connect to vertex "+node.getSource()+" are : ");
                while (node != null) {
                    System.out.println(" "+node.getDest());
                    node = node.next;
                }
            }
        }
                
    }
    
    
}
