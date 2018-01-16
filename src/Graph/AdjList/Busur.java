/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjList;

/**
 *
 * @author choirulhuda
 */
public class Busur {
    private int dest;
    private int bobot;

    public Busur() {
    }
    
    public Busur(int dest, int bobot) {
        this.dest = dest;
        this.bobot = bobot;
    }


    @Override
    public String toString() {
        return dest+"("+bobot+")"; 
    }

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public int getBobot() {
        return bobot;
    }

    public void setBobot(int bobot) {
        this.bobot = bobot;
    }
    
    
}
