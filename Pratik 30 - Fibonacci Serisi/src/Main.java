import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Tanımlandı Ve Kullanıcıdan Değer İstendi
        System.out.print("Kaç Elemanlı Fibonacci Serisi İstersiniz : ");
        int n = input.nextInt();
        int ilkEleman = 0;
        int ikinciEleman = 1;

        System.out.println("Fibonacci Serisi:");
        System.out.print(ilkEleman + " " + ikinciEleman + " ");

        //For Döngüsü Kuruldu
        for (int i = 2; i < n; i++) {
            int sonrakiEleman = ilkEleman + ikinciEleman;
            System.out.print(sonrakiEleman + " ");
            ilkEleman = ikinciEleman;
            ikinciEleman = sonrakiEleman;
        }
    }
}