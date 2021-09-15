
package girilensayıdanküçük2.ninkuvvetlerinibulanprogram;

import java.util.Scanner;


public class GirilenSayıdanKüçük2NinKuvvetleriniBulanProgram {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        int lımıt = sc.nextInt();
        for (int i  = 1; i <= lımıt; i*=4) {
            System.out.println(i);
        }
        
        System.out.println("---------------------------------------");
        
         for (int i  = 1; i <= lımıt; i*=5) {
            System.out.println(i);
        }
    }
    
}
