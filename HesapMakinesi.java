package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, select;
        System.out.println("İlk sayıyı giriniz: ");
        a = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        b = sc.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çıkarma\n4-Bölme");
        select = sc.nextInt();

        if (select == 1) {
            System.out.println("Toplam: " + (a + b));
        } else if (select == 2) {
            System.out.println("Fark: " + (a - b));
        } else if (select == 3) {
            System.out.println("Çaprım: " + (a * b));
        } else if (select == 4) {
            if (b != 0) {
                System.out.println("Bölüm: " + (a / b));
            } else {
                System.out.println("Bir sayı 0'a bölünemez");
            }
        } else {

            System.out.println("Lütfen geçerli bir sayı giriniz");
        }

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (a + b));
                break;
            case 2:
                System.out.println("Fark: " + (a - b));
                break;
            case 3:
                System.out.println("Çaprım: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Bölüm: " + (a / b));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;

            default:
                System.out.println("Lütfen geçerli bir sayı giriniz");
                break;
        }

    }

}
