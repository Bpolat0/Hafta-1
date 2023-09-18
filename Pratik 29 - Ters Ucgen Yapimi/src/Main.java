import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        //Kullanıcıdan Değerler Alındı
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        //Üçgenin Döngüsü Kuruldu
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}