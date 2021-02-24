package practice2;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// konsola iiki sayı girniz ve bunların 10 adet artırark çarpım tablosunu çıkarsın
        System.out.println("Enter a integer = ");
        int a = scan.nextInt();

        System.out.println("Enter a ineteger =  ");
        int b = scan.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.print(a + "*" + b + "=" + a * b + "   ");
            b++;
        }

    }
}
