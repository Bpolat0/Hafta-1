import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int ay, gun;
        String burc = "";
        boolean isError = false;

        //Kullanıcıdan Veri İstendi
        System.out.print("Ay : ");
        ay = input.nextInt();

        System.out.print("Gün : ");
        gun = input.nextInt();

        //İf Yapısı İle Kontrol Sağlandı
        if (ay == 1) {
            if ((gun >= 1 && gun <= 31) && (gun < 22)) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }
        } else if (ay == 2) {
            if ((gun >= 1 && gun <= 28) && (gun < 20)) {
                burc = "Kova";
            } else {
                burc = "Balık";
            }
        } else if (ay == 3) {
            if ((gun >= 1 && gun <= 31) && (gun < 21)) {
                burc = "Balık";
            } else {
                burc = "Koç";
            }
        } else if (ay == 4) {
            if ((gun >= 1 && gun <= 30) && (gun < 21)) {
                burc = "Koç";
            } else {
                burc = "Boğa";
            }
        } else if (ay == 5) {
            if ((gun >= 1 && gun <= 31) && (gun < 22)) {
                burc = "Boğa";
            } else {
                burc = "İkizler";
            }
        } else if (ay == 6) {
            if ((gun >= 1 && gun <= 30) && (gun < 23)) {
                burc = "İkizler";
            } else {
                burc = "Yengeç";
            }
        } else if (ay == 7) {
            if ((gun >= 1 && gun <= 31) && (gun < 23)) {
                burc = "Yengeç";
            } else {
                burc = "Aslan";
            }
        } else if (ay == 8) {
            if ((gun >= 1 && gun <= 31) && (gun < 23)) {
                burc = "Aslan";
            } else {
                burc = "Başak";
            }
        } else if (ay == 9) {
            if ((gun >= 1 && gun <= 30) && (gun < 23)) {
                burc = "Başak";
            } else {
                burc = "Terazi";
            }
        } else if (ay == 10) {
            if ((gun >= 1 && gun <= 31) && (gun < 23)) {
                burc = "Terazi";
            } else {
                burc = "Akrep";
            }
        } else if (ay == 11) {
            if ((gun >= 1 && gun <= 30) && (gun < 22)) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }
        } else if (ay == 12) {
            if ((gun >= 1 && gun <= 31) && (gun < 22)) {
                burc = "Yay";
            } else {
                burc = "Oğlak";
            }
        } else {
            isError = true;
        }

        //Hatalı Giriş Kontrolü Sağlandı.
        if (isError) {
            System.out.print("Yanlış Giriş yaptın!");
        } else {
            System.out.print("Burcunuz : " + burc);
        }
    }
}