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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hasil Fibonacci");
        for (int i = 0; i <= 5; i++) {
            System.out.print(fibonacci(i)+",");
        }
        System.out.println();
    }
    
    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
}
