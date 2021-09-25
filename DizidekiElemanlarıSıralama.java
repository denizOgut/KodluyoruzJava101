package dizidekielemanlarısıralama;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarıSıralama {

    static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sıralama:");
        for (int i : array) {
            System.out.print(" " + i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lımıt, eleman;
        System.out.print("Dizinin boyutunu giriniz: ");
        lımıt = sc.nextInt();
        int[] array = new int[lımıt];
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + " .Elemanı: ");
            eleman = sc.nextInt();
            array[i] = eleman;
        }
        sortArray(array);
    }

}
