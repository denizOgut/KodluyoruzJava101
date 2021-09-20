package palindromsayıbulanprogram;

import java.util.Scanner;

public class PalindromSayıBulanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isPalindrom(247);
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.print("Sayı: " + temp);
            lastNumber = temp % 10;
            System.out.print(" Son Basamak: " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println(" Yeni sayı: " + reverseNumber);
            temp /= 10;
        }
        return true;
    }

}
