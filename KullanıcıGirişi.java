package kullanıcıgirişi;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.util.Scanner;

public class KullanıcıGirişi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, password,cevap;
        System.out.print("Kullanıcı adını giriniz: ");
        userName = sc.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = sc.nextLine();

        if (userName.equals("Deniz") && password.equals("123456")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Kullanıcı adı veya Şifre hatalı");

        }

        if (!password.equals("123456")) {
            System.out.println("Şifrenizi Sıfırlamak İster misiniz ? (Y/N)");
            cevap = sc.nextLine();
            if (cevap.equals("Y")) {
                System.out.println("Lütfen yeni şifrenizi giriniz");
                password = sc.nextLine();
               if (password.equals("123456")) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                password = sc.nextLine();
            } else {
                System.out.println("Şifre oluşturuldu");
            }
            }
            
        }
    }

}
