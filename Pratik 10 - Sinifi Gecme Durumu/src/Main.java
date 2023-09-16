import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int Matematik, Fizik, Turkce, Kimya, Muzik, hesaplanacakDersler = 0;
        double Ortalama = 0;

        //Kullanıcıdan Veri İstendi ve Matematik Değeri İf Yapısı İle Sorgulandı
        System.out.print("Lütfen Matematik Notunuzu Giriniz = ");
        Matematik = input.nextInt();

        if ((Matematik <= 100) && (Matematik >= 0)) {
            hesaplanacakDersler++;
            Ortalama += Matematik;
        } else
            System.out.println("0-100 Arası bir değer girilmediği için ortalama hesaplanırken matematik dersi hesaba katılmayacaktır.");

        //Kullanıcıdan Veri İstendi ve Fizik Değeri İf Yapısı İle Sorgulandı
        System.out.print("Lütfen Fizik Notunuzu Giriniz = ");
        Fizik = input.nextInt();

        if ((Fizik <= 100) && (Fizik >= 0)) {
            hesaplanacakDersler++;
            Ortalama += Fizik;
        } else
            System.out.println("0-100 Arası bir değer girilmediği için ortalama hesaplanırken fizik dersi hesaba katılmayacaktır.");

        //Kullanıcıdan Veri İstendi ve Türkçe Değeri İf Yapısı İle Sorgulandı
        System.out.print("Lütfen Türkçe Notunuzu Giriniz = ");
        Turkce = input.nextInt();

        if ((Turkce <= 100) && (Turkce >= 0)) {
            hesaplanacakDersler++;
            Ortalama += Turkce;
        } else
            System.out.println("0-100 Arası bir değer girilmediği için ortalama hesaplanırken türkçe dersi hesaba katılmayacaktır.");

        //Kullanıcıdan Veri İstendi ve Kimya Değeri İf Yapısı İle Sorgulandı
        System.out.print("Lütfen Kimya Notunuzu Giriniz = ");
        Kimya = input.nextInt();

        if ((Kimya <= 100) && (Kimya >= 0)) {
            hesaplanacakDersler++;
            Ortalama += Kimya;
        } else
            System.out.println("0-100 Arası bir değer girilmediği için ortalama hesaplanırken kimya dersi hesaba katılmayacaktır.");

        //Kullanıcıdan Veri İstendi ve Müzik Değeri İf Yapısı İle Sorgulandı
        System.out.print("Lütfen Müzik Notunuzu Giriniz = ");
        Muzik = input.nextInt();

        if ((Muzik <= 100) && (Muzik >= 0)) {
            hesaplanacakDersler++;
            Ortalama += Muzik;
        } else
            System.out.println("0-100 Arası bir değer girilmediği için ortalama hesaplanırken muzik dersi hesaba katılmayacaktır.");

        //Ortalama Uygun Girilen Derslere Göre Hesaplandı
        Ortalama /= hesaplanacakDersler;

        //Ortalama Değerinin 55 Değerine Eşit Ya Da 55 Değerinden Yukarı Olduğu Sorgulandı
        if (Ortalama >= 55) {
            System.out.println("Tebrikler Geçtiniz Ortalamanız : " + Ortalama);
        } else System.out.println("Kaldınız Ortalamanız : " + Ortalama);
    }
}