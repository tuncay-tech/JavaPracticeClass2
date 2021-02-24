package practice2;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        /*
0 ile 100 arası puanlama
50 den dusuk ise D
50 ile 70 arası ise C
70  ie 85 arası ise B
daha yukarıs ise A
notlar 100 e kadar
kullanıcı dan not girisi alınacak
in : 80
output : B
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir not giriniz: ");
        int not = scanner.nextInt();
        if (not >= 0 && not < 50) {
            System.out.println("Notunuz>> D");
        } else if (not >= 50 && not < 70) {
            System.out.println("Notunuz>> C");
        } else if (not >= 70 && not < 85) {
            System.out.println("Notunuz>> B");
        } else if (not >= 85 && not <= 100){
            System.out.println("Notunuz>> A");
    } else

    {
        System.out.println("geçerli bir not giriniz ??? ");
    }
}
}
