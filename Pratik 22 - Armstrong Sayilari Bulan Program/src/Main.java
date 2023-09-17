import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int number, tempA, b, c = 0;

        //Kullanıcıdan Veri İstendi

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();
        tempA = number;

        while (number > 0) {
            b = number % 10;
            number /= 10;
            c += b;
        }
        System.out.println(tempA + " sayısının basamakları toplamı : " + c);
    }
}