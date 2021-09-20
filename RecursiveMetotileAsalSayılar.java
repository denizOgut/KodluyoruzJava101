
package recursivemetotileasalsayılar;

import java.util.Scanner;

public class RecursiveMetotileAsalSayılar {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = scan.nextInt();
        int i = 2;
        System.out.println(ısAsalSayı(sayi, i) ? "Asal" : "Asal Değil");

    }
    
    static boolean ısAsalSayı(int num , int num2){
        if (num == num2 || num == 1) {
            return  true;
        }
        
        if (num % num2 == 0) {
            return  false;
        }
        
        return ısAsalSayı(num, num2+1);
    }
}
