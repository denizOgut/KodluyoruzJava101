
package girilensayılardanminvemaxdeğerlibulanprogram;

import java.util.Scanner;


public class GirilenSayılardanMinveMaxDeğerliBulanProgram {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int min = 0 , max = 0 , limit;
        System.out.print ("Kaç tane sayı gireceksiniz ? ");
        limit = sc.nextInt();
        
        for (int i = 1; i <= limit; i++) {
            System.out.print(i +". Sayıyı giriniz: ");
            int x = sc.nextInt();
           if (i == 1){
                max = x;
                min = x;
            }
            
            if (x < min) {
                min = x;
            }else{
            max = x;
            }
        }
        System.out.print("En küçük sayı: "+min);
        System.out.print(" En büyük sayı: "+max);
    }
    
}
