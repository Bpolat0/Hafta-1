import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int temp;

        //Kullanıcıdan Veri İstendi
        System.out.print("Sıcaklık değerini giriniz : ");
        temp = input.nextInt();

        //İf Yapısı Kuruldu
        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temp >= 5 && temp <= 15) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (temp >= 15 && temp <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        } else
            System.out.println("Yüzmeye gidebilirsiniz.");

        //Koşullar :
        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    }
}