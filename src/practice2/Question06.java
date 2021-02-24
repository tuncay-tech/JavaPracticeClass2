package practice2;

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        /*
kullanıcı adı ve Sifre girisini kullanıcıdan alın
Secim Palut
123456
output:
Secim P****
******
 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("isim ve soyisim giriniz: ");
        String name = scanner.next();

        System.out.println(name.replace(name.substring(0),"****"));

        System.out.println("şifrenizi giriniz: ");
        String password = scanner.next();

        System.out.println(password.replace(password.substring(0),"******"));

    }
}
