import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int n, b, i;
        double result = 0.0;

        //Kullanıcıdan Veri İstendi
        System.out.print("Hesaplamak istediğiniz sayıyı giriniz : ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            result += 1.0 / i;
        }
        System.out.println(result);
    }
}