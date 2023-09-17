import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int number, count = 0, total = 0;

        //Kullanıcıdan Veri İstendi
        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        System.out.println(number + " sayısına kadar olan 4'ün kuvvetleri");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        System.out.println(number + " sayısına kadar olan 5'in kuvvetleri");
        for (int a = 1; a <= number; a *= 5) {
            System.out.println(a);
        }
    }
}

