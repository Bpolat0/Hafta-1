import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int km, travelType, age;
        double normalTotal, discountTotal, discountAge, discountOptional;

        //Kullanıcıdan Veri İstendi

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz :");
        age = input.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz\n1 - Tek-Yön\n2 - Gidiş-Dönüş");
        travelType = input.nextInt();

        normalTotal = km * 0.10;

        //Yapı Kuruldu
        if (age >= 0 && km >= 0) {
            switch (travelType) {
                case 1:
                    if (age < 12) {
                        discountAge = normalTotal * 0.50;
                        discountTotal = normalTotal - discountAge;
                        System.out.print("Toplam Tutar : " + discountTotal);
                    } else if (age >= 12 && age <= 24) {
                        discountAge = normalTotal * 0.10;
                        discountTotal = normalTotal - discountAge;
                        System.out.print("Toplam Tutar : " + discountTotal);
                    } else if (age > 24 && age < 65) {
                        System.out.print("Toplam Tutar : " + normalTotal);
                    } else if (age >= 65) {
                        discountAge = normalTotal * 0.30;
                        discountTotal = normalTotal - discountAge;
                        System.out.print("Toplam Tutar : " + discountTotal);
                    }
                    break;
                case 2:
                    if (age < 12) {
                        discountAge = normalTotal * 0.50;
                        discountTotal = normalTotal - discountAge;
                        discountOptional = discountTotal * 0.20;
                        normalTotal = (discountTotal - discountOptional) * 2;
                        System.out.print("Toplam Tutar : " + normalTotal);
                    } else if (age >= 12 && age <= 24) {
                        discountAge = normalTotal * 0.10;
                        discountTotal = normalTotal - discountAge;
                        discountOptional = discountTotal * 0.20;
                        normalTotal = (discountTotal - discountOptional) * 2;
                        System.out.print("Toplam Tutar : " + normalTotal);
                    } else if (age > 24 && age < 65) {
                        discountAge = normalTotal * 0.30;
                        discountTotal = normalTotal - discountAge;
                        discountOptional = discountTotal * 0.20;
                        normalTotal = (discountTotal - discountOptional) * 2;
                        System.out.print("Toplam Tutar : " + normalTotal);
                    } else if (age >= 65) {
                        discountAge = normalTotal * 0.30;
                        discountTotal = normalTotal - discountAge;
                        discountOptional = discountTotal * 0.20;
                        normalTotal = (discountTotal - discountOptional) * 2;
                        System.out.print("Toplam Tutar : " + normalTotal);
                    }
                    break;
                default:
                    System.out.print("Yanlış Değer Girdin!");
            }
        } else {
            System.out.println("Yanlış Değer Girdin!");
        }
    }
}