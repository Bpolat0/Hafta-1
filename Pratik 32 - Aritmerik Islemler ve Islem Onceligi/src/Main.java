import java.util.Scanner; // Scanner sınıfını içe aktar

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Kullanıcıdan değer alındı
        System.out.print("Lütfen a sayısını giriniz:");
        int a = in.nextInt();

        System.out.print("Lütfen b sayısını giriniz:");
        int b = in.nextInt();

        System.out.print("Lütfen c sayısını giriniz:");
        int c = in.nextInt();

        int result = a + b * c - b; // İşlemi yap ve sonucu ata
        System.out.println("Sonuç: " + result);
        in.close();
    }
}