
package üslüsayıhesaplayanprogram;

import java.util.Scanner;

public class ÜslüSayıHesaplayanProgram {

    public static void main(String[] args) {
       int taban , us;
       Scanner sc = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı:");
        taban = sc.nextInt();
         System.out.println("Üs alınacak sayı:");
        us = sc.nextInt();
        
        int i = 1;
        int total = 1;
        int totalFor = 1;
        while (i <= us) {            
            total*=taban;
            i++;
        }
        System.out.println("Cevap: " + total);
        
        for (int j = 1; j <= us; j++) {
            totalFor*=taban;
            
        }
        System.out.println("Cevap: " + totalFor);
    }
    
}
