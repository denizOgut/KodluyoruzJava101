package çinzodyağıhesaplama;

import java.util.Scanner;

public class ÇinZodyağıHesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear;
        String zodiacSign;
        System.out.print("Lütfen doğum yılınızı giriniz");
        birthYear = sc.nextInt();
        int birthYearMode = birthYear % 12;

        switch (birthYearMode) {
            case 0:
                zodiacSign = "Maymun";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 1:
                zodiacSign = "Horoz";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 2:
                zodiacSign = "Köpek";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 3:
                zodiacSign = "Domuz";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 4:
                zodiacSign = "Fare";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 5:
                zodiacSign = "Öküz";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 6:
                zodiacSign = "Kaplan";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 7:
                zodiacSign = "Tavşan";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 8:
                zodiacSign = "Ejderha";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 9:
                zodiacSign = "Yılan";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 10:
                zodiacSign = "At";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;
            case 11:
                zodiacSign = "Koyun";
                System.out.print("Çin Zodyağı Burcunuz: " + zodiacSign);
                break;

        }
        
        
    }

}
