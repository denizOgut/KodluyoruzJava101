package artıkyılhesaplama;

import java.util.Scanner;

public class ArtıkYılHesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print(year + " Artık yıldır!");
        } else {
            System.out.print(year + " Artık yıl değildir!");
        }
    }

}
