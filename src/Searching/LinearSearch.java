/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Searching;

/**
 *
 * @author choirul.huda
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nilai = {4,3,2,6,2,56,1};
        int[] terkecil = {0,0};
        
        terkecil[0] = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (terkecil[0] > nilai[i] == true) {
                terkecil[0] = nilai[i];
                terkecil[1] = i;
            }
        }
        
        System.out.println("Nilai terkecil : "+terkecil[0]);
        System.out.println("Index terletak : "+terkecil[1]);
    }
    
}
