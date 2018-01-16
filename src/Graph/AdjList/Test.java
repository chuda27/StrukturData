package Graph.AdjList;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author choirulhuda
 */
public class Test {
    public static void main(String[] args) {
        int jmlSimpul = 0;
        int jmlBusur = 0;
        int count = 1;
        int source = 0;
        int dest  = 0;
        
        
        
        AdjList grap;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Masukkan jml Simpul: ");
            jmlSimpul = scan.nextInt();
            System.out.println("Masukkan jml Busur: ");
            jmlBusur = scan.nextInt();
            grap = new AdjList(jmlSimpul);
            System.out.println("Masukkan Graph : (source) (dest)");
            while (count <= jmlBusur) {
                source = scan.nextInt();
                dest = scan.nextInt();
                grap.setBusur(source, dest);
                count++;
            }
        }
        showList(grap.getBusur());
        
    }
    
    public static void showList(Map<Integer, List<Integer>> hasil) {
        System.out.println("\n====  Adjacency List ====");
        for (Map.Entry<Integer, List<Integer>> hasilnya : hasil.entrySet()) {
            if (hasilnya.getKey() != 0) {
                System.out.print(hasilnya.getKey() + " :");
                for (int i = 0; i < hasilnya.getValue().size(); i++) {
                    if (i == 0) {
                        System.out.print(" " + hasilnya.getValue().get(i));
                    } else {
                        System.out.print("->" + hasilnya.getValue().get(i));
                    }
                }
                //System.out.print(" : "+hasilnya.getValue().size());
                System.out.println();
            }
            
        }

    }
}
