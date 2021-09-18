package tersüçgenyapımı;

import java.util.Scanner;

public class TersÜçgenYapımı {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Basamak sayısı giriniz: ");
        int n = sc.nextInt();
        
        for (int i = n; i > 0; --i) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        
    }

}
