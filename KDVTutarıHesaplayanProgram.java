
package kdv.tutarı.hesaplayan.program;

import java.util.Scanner;

public class KDVTutarıHesaplayanProgram {

    public static void main(String[] args) {
  
     double anaPara, kdv, kdvFiyat, kdv18=18, kdv8=8;

// Kullanıcıdan anapara değeri alındı.
        Scanner input = new Scanner(System.in);
        System.out.print("Ana paranızı giriniz :");
        anaPara = input.nextDouble();

// Girilen anaparanın istenen değerler içerisinde olup olmadığı sorgulandı.
        boolean kosul1 = anaPara >= 0;
        boolean kosul2 = anaPara <= 1000;
        boolean sonuc = kosul1 && kosul2;

// KDV değeri sorgulama sonucuna göre işlemlere aktarıldı ve sonuçlar ekrana yazdırıldı.
        System.out.println("KDV'siz Fiyat :" + anaPara);

        kdv= sonuc ? kdv18 : kdv8;
        kdvFiyat = anaPara + ((anaPara * kdv)/100);

        System.out.println("KDV'li Fiyat :" + kdvFiyat + "KDV tutarı :" + kdv/10);
        

    }
}
