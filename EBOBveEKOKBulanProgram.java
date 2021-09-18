package ebobveekokbulanprogram;

import java.util.Scanner;

public class EBOBveEKOKBulanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, ebob = 1;
        System.out.println("1. Sayıyı giriniz: ");
        n1 = sc.nextInt();

        System.out.println("2. Sayıyı giriniz: ");
        n2 = sc.nextInt();

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }

        System.out.println("EBOB: " + ebob);
        
        for (int i = n1; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
        }
        
        int a = 1;
        while (a<n1) { 
            
            if (n1 % a == 0 && n2 % a == 0) {
                ebob = a;
            } 
            a++;
        }
        //-------------------------------EKOK---------------------------//
        int ekok = 0;
        for (int i = 1; i <= (n1*n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println("EKOK: " + ekok);
        int b = 1;
        while (b<n1) {            
            if (b % n1 == 0 && b % n2 == 0) {
                ekok = b;
                break;
            }
            b++;
        }
        System.out.println("EKOK: " + ekok);
    }
    

}
