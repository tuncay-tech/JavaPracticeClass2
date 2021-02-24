package practice2;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        /*
        BaslangÄ±c ve bitis arasndaki
        tum sayÄ±larÄ±n toplamÄ±nÄ± bulan program
        start:3
        end: 7
        3+4+5+6+7
        output: 25
         */
        int ilk_sayi, son_sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        ilk_sayi = scanner.nextInt();
        System.out.print("son sayıyı giriniz: ");
        son_sayi = scanner.nextInt();
       int toplam = 0;
        for (int i = ilk_sayi; i <= son_sayi; i++) {
            toplam = toplam + i;
        }
        System.out.println(" toplam sonç: " + toplam);

    }
}
