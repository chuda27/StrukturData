/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjMatrix;

import java.util.Scanner;

/**
 *
 * @author choirulhuda
 */
public class MatrixUndirect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jml simpul : ");
        int jmlSimpul = scan.nextInt();
        System.out.println("Masukkan jml busur : ");
        int jmlBusur = scan.nextInt();
        
        System.out.println("Busur : (source) (destination)");
        Graph grap = new Graph(jmlSimpul+1);
        int count = 1;
        while (count <= jmlBusur) {            
            int source = scan.nextInt();
            int dest = scan.nextInt();
            grap.setBusurUndirect(source, dest);
            count++;
        }
        
        showMatrix(grap.getBusur());
        showDegree(grap.getBusur());
    }
    
    public static void showMatrix(int[][] data){
        System.out.println("\nAdjacency Matrix Graph");
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
    
    
    public static void showDegree(int[][] data){
        int jmlDegree [] = new int[data.length];
        
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                //hitung degree
                if (data[i][j] == 1) {
                    jmlDegree[i] += 1;
                }
            }
        }
        
        System.out.println("=====   Degree  =====");
        for (int i = 1; i < data.length; i++) {
            System.out.println("Simpul : "+i+", degree : "+jmlDegree[i]);
        }
    }
    
}
