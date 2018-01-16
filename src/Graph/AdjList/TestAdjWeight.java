/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph.AdjList;

import java.util.Scanner;

/**
 *
 * @author choirulhuda
 */
public class TestAdjWeight {
    public static void main(String[] args) {
        int weight = 0;
        int source = 0;
        int dest = 0;
        int count = 1;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jumlah Simpul");
        int jmlSimpul = scan.nextInt();
        System.out.println("Masukkan jumlah Busur");
        int jmlBusur = scan.nextInt();
        AdWeight grap = new AdWeight(jmlSimpul+1);
        
        System.out.println("Graph : (source) (dest) (bobot)");
        while (count <= jmlBusur) {            
            source = scan.nextInt();
            dest = scan.nextInt();
            weight = scan.nextInt();
            grap.addBusur(source, dest, weight);
            count++;
        }
        
        grap.printAdjList(grap.getAdjList());
    }
}
