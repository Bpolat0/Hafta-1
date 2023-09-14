import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        double numberOne, numberTwo, result;
        int selection;

        //Kullanıcıdan Veri İstendi
        System.out.print("1. Sayıyı Giriniz : ");
        numberOne = input.nextDouble();

        System.out.print("2. Sayıyı Giriniz : ");
        numberTwo = input.nextDouble();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapılmak istenen işlem : ");
        selection = input.nextInt();

        //Switch Yapısı Kullanılarak Hesaplama Sağlandı
        switch (selection) {
            case 1:
                result = numberOne + numberTwo;
                System.out.println("Sonuç : " + result);
                break;
            case 2:
                result = numberOne - numberTwo;
                System.out.println("Sonuç : " + result);
                break;
            case 3:
                result = numberOne * numberTwo;
                System.out.println("Sonuç : " + result);
                break;
            case 4:
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                    System.out.println("Sonuç : " + result);
                }
                else
                    System.out.println("Bir Sayı 0'a Bölünemez!");
                break;

            default:
                System.out.println("Hatalı Tuşlama Yaptınız!");
        }
    }
}
