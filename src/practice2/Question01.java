package practice2;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
       /*
Kullanıcıddan baslangıc ve bitis degerlerini alalım
Bastan sona yazdıralım
baslangıc : 5
bitis: 12
output: 5 6 7 8 9 10 11 12
 */
        int sayi_ilk, sayi_son;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Bir sayı giriniz  :");
        sayi_ilk = girdi.nextInt();

        System.out.println("İkinci sayıyı giriniz :");
        sayi_son = girdi.nextInt();

        for (int i = sayi_ilk; i <= sayi_son; i++) {
            System.out.print(i + " ");
        }
}
}