/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Rekursif;

/**
 *
 * @author choirul.huda
 */
public class Rekursif2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hasil : "+fungsi(4));
        System.out.println("Hasil : ");
        for (int i = 0; i <= 4; i++) {
            System.out.print(fungsi(i)+", ");
        }
        System.out.println();
    }
    
    public static int fungsi(int n) {
        if (n == 0) {
            return 3;
        }
        int result = 2*fungsi(n - 1) + 3;
        return result;
    }
}

