package girilensayıyakadarolançiftsayılarıbulanprogram;

import java.util.Scanner;

public class GirilenSayıyaKadarOlanÇiftSayılarıBulanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int userInput = sc.nextInt();
        int sayac = 0, sum = 0;
        for (int i = 0; i < userInput; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        for (int i = 0; i < userInput; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac++;
                sum += i;
            }
        }

        int avg = sum / sayac;
        System.out.println("Ortalama: " + avg);
    }

}
