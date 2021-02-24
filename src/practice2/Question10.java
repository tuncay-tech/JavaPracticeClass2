package practice2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // İSİİM VE SOY İSİM GİRİN VE ,İLK HARFLERİNİ BÜYÜK
        // SONRAKİ HARFLERİ  KÜÇÜK YAPSIN
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fn = scan.next();

        System.out.print("Enter lastname: ");
        String ln = scan.next();

        System.out.println(fn.substring(0, 1).toUpperCase() + fn.substring(1).toLowerCase());
        System.out.println(ln.substring(0, 1).toUpperCase() + ln.substring(1).toLowerCase());
    }
}
