import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int n, r, i, total = 1;

        //Kullanıcıdan Veri İstendi
        System.out.print("Sayı giriniz : ");
        n = input.nextInt();

        System.out.print(n + " sayısının kaçıncı üssünü hesaplamak istersiniz :  ");
        r = input.nextInt();

        //for Döngüsü Kurularak Sonuca Ulaşıldı
        for ( i = 1; i<=r; i++) {
            total *= n;
        }
        System.out.println(total);
    }
}