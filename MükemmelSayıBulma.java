
package mükemmelsayıbulma;

import java.util.Scanner;

public class MükemmelSayıBulma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = sc.nextInt();
         int result = 0;
        for (int i = 1; i < num; i++) {           
            if (num % i == 0) {
                System.out.println(i);
                result+=i;
            }
            
        }
        
        System.out.println(result);
        if (result ==  num) {
            System.out.print( num + " Mükemmel sayıdır. ");
        }else{
        System.out.print( num + " Mükemmel sayı değildir. ");

        }
    }
    
}
