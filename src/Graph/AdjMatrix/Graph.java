/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjMatrix;


/**
 *
 * @author choirulhuda
 */
public class Graph {
    private int maksSimpul;
    int busur[][];

    public Graph() {
    }
    
    public Graph(int maksSimpul) {
        this.maksSimpul = maksSimpul;
        this.busur = new int [maksSimpul][maksSimpul];
    }
    
    public void setBusurUndirect(int source, int dest){
        try {
            this.busur[source][dest] = 1;
            this.busur[dest][source] = 1;
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Error : "+err.toString());
        }

    }
    
    public void setBusurDirectIn(int source, int dest){
        try {
            this.busur[source][dest] = 1;
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Error : "+err.toString());
        }
    }
    
    public void setBobotBusurDirect(int source, int dest, int bobot){
        try {
            this.busur[source][dest] = bobot;
            this.busur[dest][source] = bobot;
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Error : "+err.toString());
        }
    }
    
    public void setBusurDirectOut(int source, int dest){
        try {
            this.busur[source][dest] = 1;
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Error : "+err.toString());
        }
    }
    
    public int[][] getBusur(){
        return busur;
    }

    public int getMaksSimpul() {
        return maksSimpul;
    }
    
}
