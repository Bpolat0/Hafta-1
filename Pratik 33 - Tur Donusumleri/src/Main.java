import java.util.Scanner; // Scanner sınıfını içe aktar

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Lütfen bir tam sayı giriniz:"); // Kullanıcıya mesaj göster
        int a = in.nextInt(); // Tam sayıyı oku ve a değişkenine ata

        System.out.print("Lütfen bir ondalıklı sayı giriniz:"); // Kullanıcıya mesaj göster
        double b = in.nextDouble(); // Ondalıklı sayıyı oku ve b değişkenine ata

        double c = (double) a; // Tam sayıyı ondalıklı sayıya dönüştür ve c değişkenine ata
        int d = (int) b; // Ondalıklı sayıyı tam sayıya dönüştür ve d değişkenine ata

        System.out.println("Tam sayının ondalıklı hali: " + c);
        System.out.println("Ondalıklı sayının tam hali: " + d);

    }
}