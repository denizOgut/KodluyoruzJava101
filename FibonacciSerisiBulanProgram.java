package fibonacciserisibulanprogram;

import java.util.Scanner;

public class FibonacciSerisiBulanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = sc.nextInt() ,n1=0,n2=1, i = 1;
         System.out.print(num+"  Elemanlı Fibonacci Serisi :");
        while (i <= num) { 
             System.out.print(n1+" ");
            int fabToplam = n1+n2;
            n1 = n2;
            n2 = fabToplam;
            i++;
        }
        
       
    }

}
