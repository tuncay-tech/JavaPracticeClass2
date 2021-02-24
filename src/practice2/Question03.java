package practice2;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
         /*
Baslangıc ve bitis arasndaki   "BENDEN"
2 şer artarak  sayıları yazdırın
start:4
end: 10
outpu: 4 6 8 10
 */
        int num_1, num_2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        num_1 = scanner.nextInt();
        System.out.print("diğer sayıyı giriniz: ");
        num_2 = scanner.nextInt();
        for (int i = num_1; i <= num_2; i=i+2) { // i = i+2 yazarsak 2 şer artarak gider.

                System.out.print(i + " ");
            }
    }
}
