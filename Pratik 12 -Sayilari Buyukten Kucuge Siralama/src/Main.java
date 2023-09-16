import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int a, b, c;

        //Kullanıcıdan Veri İstendi
        System.out.print("1. Sayıyı giriniz : ");
        a = input.nextInt();

        System.out.print("2. Sayıyı giriniz : ");
        b = input.nextInt();

        System.out.print("3. Sayıyı giriniz : ");
        c = input.nextInt();

        //İf Yapısı Kuruldu
        if (a > b && a > c) {
            if (b > c) {
                System.out.print("a > b > c");
            } else
                System.out.print("a > c > b");
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.print("b > a > c");
            } else
                System.out.print("b > c > a");
        } else
            if (a > b)
                System.out.print("c > a > b");
            else
                System.out.println("c > b > a");
    }
}