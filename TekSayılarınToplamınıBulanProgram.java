
package teksayılarıntoplamınıbulanprogram;

import java.util.Scanner;


public class TekSayılarınToplamınıBulanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int toplam = 0;
      /*
        do {         
            System.out.println("Lütfen Bir Sayı Giriniz: ");
            n = sc.nextInt();
            if (n % 2 == 1) {
                toplam += n;
            }
        } while (n > 0);
        */
       do {         
            System.out.println("Lütfen Bir Sayı Giriniz: ");
            n = sc.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                toplam += n;
            }
        } while (n > 0);
        
      
      
        System.out.println("Toplam: " + toplam);
        
    }
    
}
