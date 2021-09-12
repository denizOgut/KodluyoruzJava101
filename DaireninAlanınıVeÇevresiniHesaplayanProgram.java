
package dairenin.alanını.ve.çevresini.hesaplayan.program;

import java.util.Scanner;


public class DaireninAlanınıVeÇevresiniHesaplayanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        int r = sc.nextInt();
        double pi = 3.14;
        
        double alan = pi * r * r;
        double cevre =  2 * pi * r;
    
        System.out.println("Dairenin Alanı: " + alan + "\n" + "Dairenin Çevresi: " + cevre );
        
        System.out.print("Dairenin merkez açısısının ölçüsünü giriniz: ");
        double a = sc.nextInt();
        
        alan =  (pi * (r*r)*a) / 360;
        System.out.println("Dairenin Alanı: " + alan);
    }
    
    
}
