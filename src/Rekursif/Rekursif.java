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
public class Rekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(fungsi(0));
        System.out.println("Hasil Rekursif \n");
        for (int i = 0; i <= 5; i++) {
            System.out.print(fungsi(i)+", ");
        }
        System.out.println();
    }
    
    public static int fungsi(int var){
        if (var == 0 || var == 1) {
            return 1;
        } else {
            return var * fungsi(var - 1);
            
        }
    }
    
}
