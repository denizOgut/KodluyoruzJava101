package dizidekielemanlarınmaxvemindeğerlerinibulanprogram;

import java.util.Scanner;

public class DizidekiElemanlarınMaxveMinDeğerleriniBulanProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        System.out.print("Bir sayı giriniz: ");
        int val = sc.nextInt();
        int currentMin = list[0];
        int currentMax = list[0];
        for (int i : list) {
            if (i > val) {
                if (Math.abs(val - i) < Math.abs(val - currentMax)) {
                    currentMax = i;
                }
              

            }
            
              if (i < val) {
                    if (Math.abs(val - i) < Math.abs(val - currentMin)) {
                        currentMin = i;
                    }
                }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :  " + currentMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı :  " + currentMax);
    }
}
