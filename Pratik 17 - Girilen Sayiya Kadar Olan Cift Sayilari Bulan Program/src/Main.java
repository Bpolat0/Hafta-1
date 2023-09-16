import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int number, a = 1, count = 0, average = 0;

        //Kullanıcıdan Veri İstendi
        System.out.print("İstediğiniz sayıyı giriniz : ");
        number = input.nextInt();

        while (a <= number) {
            if (a % 3 == 0 && a % 4 == 0) {
                System.out.println(a);
                average += a;
                count++;
            }
            a++;
        }
        average /= count;
        System.out.println("Ortlama = " + average);
    }
}

//        for (int i = 1; i <= number; i++) {
//            if (i % 3 == 0 && i % 4 == 0) {
//                System.out.println(i);
//                average += i;
//                count++;
//            }
//        }
//        average /= count;
//        System.out.println("Ortlama = " + average);