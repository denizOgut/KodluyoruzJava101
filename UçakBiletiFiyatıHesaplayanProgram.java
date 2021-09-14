package uçakbiletifiyatıhesaplayanprogram;

import java.util.Scanner;

public class UçakBiletiFiyatıHesaplayanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mesafe, yolculukTipi, yas;
        double pricePerKm = 0.10;
        double yasIndırımTutarı = 0;
        double yolculukTıpıIndırım = 0.20;
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = sc.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi = sc.nextInt();
        
        if (yas < 12) {
            yasIndırımTutarı = 0.50;
        }else if (yas >= 12 && yas <=24) {
            yasIndırımTutarı = 0.10;
        }else if (yas >= 65) {
            yasIndırımTutarı = 0.30;
        }

        if ((yolculukTipi != 1 && yolculukTipi != 2) || (yas <= 0 || mesafe <= 0)) {
            System.out.print("Hatalı Veri Girdiniz ");
        } else {

            System.out.print("CORRECT");
        }

        double normalTutar = mesafe * pricePerKm;
        double yasIndırımı = normalTutar * yasIndırımTutarı;
        double ındırımlıTutar = normalTutar - yasIndırımı;
        double yolculukBıletIndırımı = ındırımlıTutar * yolculukTıpıIndırım;
        double toplamTutar = (ındırımlıTutar - yolculukBıletIndırımı) * 2;
        
        if (yolculukTipi == 1) {
            System.out.print("Toplam Tutar: " + ındırımlıTutar +" TL");
        }else{
            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        }

    }

}
