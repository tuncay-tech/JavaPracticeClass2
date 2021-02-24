package practice2;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        /*
Baslangıc ve bitis arasndaki
tum 3 e bolunebilen sayıları yazdırın

start:4
end: 20

outpu: 6 9 12 15 18
 */
        int sayi1, sayi2, i;

        Scanner scanner = new Scanner(System.in);

        System.out.print("birinci sayı: ");
        sayi1 = scanner.nextInt();

        System.out.print("ikiinici sayı: ");
        sayi2 = scanner.nextInt();

        for (i = sayi1; i <= sayi2; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }

        }

    }
}
