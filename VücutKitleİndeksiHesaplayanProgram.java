
package vücutkitleindeksihesaplayanprogram;

import java.util.Scanner;

public class VücutKitleİndeksiHesaplayanProgram {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
     double boy = sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        int kilo = sc.nextInt();
        double vcdKıtleIndex = kilo / (boy * boy);
        
        System.out.println("Vücut Kitle İndeksiniz : " + vcdKıtleIndex);
    }
    
}
