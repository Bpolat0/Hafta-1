import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int n, sayi, enBuyuk = 0, enKucuk = 0;

        //Kullanıcıdan Veri İstendi
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = input.nextInt();

        //Döngü Oluşturuldu
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz : ");
            sayi = input.nextInt();

            if (i == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }
        }

        //Çıktı Verildi
        System.out.println("En büyük sayı : " + enBuyuk);
        System.out.println("En küçük sayı : " + enKucuk);
    }
}