package faktöriyelhesaplayanprogram;

import java.util.Scanner;

public class FaktöriyelHesaplayanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Faktöriyel N sayısını giriniz: ");
        int n = sc.nextInt();

        System.out.print("Faktöriyel R sayısını giriniz: ");
        int r = sc.nextInt();
        
        int factN = 1;
        int factR = 1;
        int factZ = 1;

        for (int i = 1; i <= n; i++) {
            factN *= i;
        }
        System.out.print("Faktöriyel: " + factN + " ");

        for (int i = 1; i <= r; i++) {
            factR *= i;
        }
        System.out.print("Faktöriyel: " + factR + " ");
        
        int z = n-r;
        for (int i = 1; i <= z; i++) {
            factZ *= i;
        }
        System.out.print("Faktöriyel: " + factZ + " ");
        
        
        int comb = factN / (factR *factZ);
        System.out.println("Kombinasyon: " + comb);
    }
    
}
