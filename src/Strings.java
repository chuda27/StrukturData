/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author choirul.huda
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] coba = new String[5];
        coba[0] = "abc";
        coba[1] = "cde";
        
        for (String string : coba) {
            System.out.println(string);
        }
        
        System.out.println("=================");
        
        String a = "a";
        String c = "A";
        int hasil = a.compareTo(c);
        
        System.out.println(hasil);
        String bla = "bu fitri pintar";
        System.out.println(bla.substring(2));
        char b = 'S';
        if (Character.isUpperCase(b)) {
            System.out.println("Benar");
        } else
            System.out.println("Salah");

        String hello = "Hella";
        String hayy = "HellA";
        int resul = hello.compareToIgnoreCase(hayy);
        System.out.println(resul);
        
        String abc = "12345";
        int abcInt = Integer.parseInt(abc);
        double hasildouble = Double.parseDouble(abc);
        System.out.println(hasildouble);
                
        String kalimat = "Frederik mahasiswa filkom";
        
        String[] pisahkan = kalimat.split(" ");
        for (int i = 0; i < pisahkan.length; i++) {
            System.out.println(pisahkan[i]);
        }
        
    }
    
}
