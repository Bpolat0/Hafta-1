import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int number, total = 0;

        //Kullanıcıdan Veri İstendi
        System.out.print("Sayıyı Giriniz : ");
        number = input.nextInt();

        while (number % 2 == 0) {
            if (number % 4 == 0) {
                total += number;
            }
            System.out.print("Tekrar Giriniz : ");
            number = input.nextInt();
        }
        System.out.print("Toplam = " + total);
    }
}