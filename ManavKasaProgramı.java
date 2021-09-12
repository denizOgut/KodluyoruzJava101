
package manavkasaprogramı;

import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, toplamTutar;
        double armutKgFiyat = 2.14;
        double elmaKgFiyat = 3.67;
        double domatesKgFiyat = 1.11;
        double muzKgFiyat = 0.95;
        double patlıcanKgFiyat = 5.00;
        
        System.out.print("Armut Kaç Kilo ? :");
        armut = sc.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elma = sc.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domates = sc.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muz = sc.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = sc.nextDouble();
        
        toplamTutar = (armut * armutKgFiyat) + (elma * elmaKgFiyat) + (domates * domatesKgFiyat) + (muz * muzKgFiyat) + (patlican * patlıcanKgFiyat);
        System.out.print("Toplam Tutar : " + toplamTutar + "TL");
        
    }
    
}
