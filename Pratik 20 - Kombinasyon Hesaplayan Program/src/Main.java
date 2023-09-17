import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Değişkenler Oluşturuldu
        int n, r, totalN = 1, totalR = 1, totalNR = 1, combination;

        //Kullanıcıdan Veri İstendi
        System.out.print("Kümenin eleman sayısını giriniz : ");
        n = input.nextInt();

        System.out.print("Seçilen eleman sayısını giriniz : ");
        r = input.nextInt();

        //n'nin faktöriyeli hesaplandı
        for (int i = 1; i <= n; i++) {
            totalN = totalN * i;

        }

        //r'nin faktöriyeli hesaplandı
        for (int i = 1; i <= r; i++) {
            totalR = totalR * i;

        }

        //n-r'nin faktöriyeli hesaplandı
        for (int i = 1; i <= n - r; i++) {
            totalNR = totalNR * i;

        }

        //Kombinasyon formülü uygulandı
        combination = totalN / (totalR * (totalNR));

        //Kombinasyon sayısı ekrana yazdırıldı
        System.out.print("Kombinasyon : " + combination);
    }
}