package practice2;

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {

        /*
kullancıdan 4 haneli bir sayı alın
rakamları toplamını bulan program
1234
10
 */
        int last;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your integer = ");
        int num = scanner.nextInt();

        for (int i=0; i<4;i++) {
            last = num % 10;
            sum = sum + last;
            num = (num-last) / 10;
        }
        System.out.println("rakamları toplamı = " + sum);
    }
}
