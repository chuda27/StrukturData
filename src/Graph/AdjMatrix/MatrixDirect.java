package Graph.AdjMatrix;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author choirulhuda
 */
public class MatrixDirect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jml simpul : ");
        int jmlSimpul = scan.nextInt();
        Graph grap = new Graph(jmlSimpul + 1);
        
        System.out.println("Masukkan jml busur in: ");
        int jmlBusurIn = scan.nextInt();

        System.out.println("Busur : (source) (destination)");
        int countIn = 1;
        while (countIn <= jmlBusurIn) {
            int source = scan.nextInt();
            int dest = scan.nextInt();
            grap.setBusurDirectIn(source, dest);
            countIn++;
        }
        
        System.out.println("\nMasukkan jml busur out: ");
        int jmlBusurOut = scan.nextInt();
        System.out.println("Busur : (source) (destination)");
        int countOut = 1;
        while (countOut <= jmlBusurOut) {
            int source = scan.nextInt();
            int dest = scan.nextInt();
            grap.setBusurDirectIn(source, dest);
            countOut++;
        }
        showMatrix(grap.getBusur());
    }
    
    public static void showMatrix(int[][] data){
        System.out.println("\nAdjacency Matrix Direct Graph");
        System.out.print("  ");
        for (int i = 1; i < data.length; i++) {
            System.out.print(" "+i);
        }
        System.out.println();
        
        for (int i = 1; i < data.length; i++) {
            System.out.print(+i+"|");
            for (int j = 1; j < data.length; j++) {
                System.out.print(" "+data[i][j]);
            }
            System.out.println();
        }
        
    }
    
    /*
    public static void Coba(int[][] data){
        int jmlOutdegree [] = new int[data.length];
        int jmlIndegree [] = new int[data.length];
        int dataT[][] = new int[data.length][data.length];
        
        
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                //hitung degree
                if (data[i][j] == 1) {
                    jmlOutdegree[i] += 1;
                }
                dataT[j][i] = data[i][j];
            }
        }
        
        for (int i = 1; i < dataT.length; i++) {
            for (int j = 1; j < dataT.length; j++) {
                //hitung degree
                if (dataT[i][j] == 1) {
                    jmlIndegree[i] += 1;
                }
            }
        }
        
        System.out.println("=====   Outdegree  =====");
        for (int i = 1; i < data.length; i++) {
            System.out.println("Simpul : "+i+", degree : "+jmlOutdegree[i]);
        }
        
        System.out.println("\n=====   Indegree  =====");
        for (int i = 1; i < dataT.length; i++) {
            System.out.println("Simpul : "+i+", degree : "+jmlIndegree[i]);
        }
    }*/
}
