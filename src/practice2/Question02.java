package practice2;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

   /*
Baslangıc ve bitis arasndaki
tum cift sayıları yazdırın
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
        for (int i = num_1; i <= num_2; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
