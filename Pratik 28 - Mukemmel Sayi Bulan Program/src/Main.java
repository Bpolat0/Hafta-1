import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int n, total = 0;

        //Kullanıcıdan Veri İstendi
        System.out.print("Sayıyı Giriniz : ");
        n = input.nextInt();

        //Döngü Kuruldu
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (total == n) {
            System.out.println(n + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(n + " Mükemmel bir sayı değildir.");
        }
    }
}