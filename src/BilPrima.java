/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author choirul.huda
 */
public class BilPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan batas atas : ");
        Scanner reader = new Scanner(System.in);
        int bilangan = reader.nextInt();
        ArrayList result = new ArrayList();
        result = cariBilPrima(bilangan);
        System.out.println("=============");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
                
    }
    
    public static ArrayList cariBilPrima(int batas){
        ArrayList hasil = new ArrayList();
        boolean isPrime;
        for(int i = 2; i <= batas; i++){
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                hasil.add(i);
            }
        }
        return hasil;
    }
    
    public static ArrayList cariPrima(int data){
        ArrayList hasil = new ArrayList();
        for (int i = 2; i <= data; i++) {
            if (i == 2) {
                hasil.add(i);
            } else if (i % 2 != 0) {
                hasil.add(i);
            }
        }
        return hasil;
    }
    
}
