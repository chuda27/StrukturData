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
public class AdjNode {
    private int source;
    private int dest;
    AdjNode next;

    public AdjNode(int source, int dest) {
        this.source = source;
        this.dest = dest;
        next = null;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }
    
    
}
