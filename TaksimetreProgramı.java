
package taksimetre.programı;

import java.util.Scanner;

public class TaksimetreProgramı {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minTutar = 20;
        System.out.println("Gidilecek Mesafeyi KM Olarak Giriniz");
        int km = sc.nextInt();
        int acılısUcretı = 10;
        double odenecekTutar;
        double kmTutar = 2.25;
        
        odenecekTutar = acılısUcretı + km * kmTutar;
        System.out.println("Toplam Ucret; " + odenecekTutar);
        boolean kosul1 = odenecekTutar > 20;
        double sonuc = kosul1 == true ? odenecekTutar : minTutar;
        System.out.println("sonuc: " + sonuc);
    }
    
}
