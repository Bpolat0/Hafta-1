import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int birthYear;
        String chZodiac = "";

        //Kullanıcıdan Veri İstendi
        System.out.print("Doğum Yılınızı Giriniz : ");
        birthYear = input.nextInt() % 12;


        if (birthYear >= 0) {
            switch (birthYear) {
                case 0:
                    chZodiac = "Maymun";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 1:
                    chZodiac = "Horoz";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 2:
                    chZodiac = "Köpek";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 3:
                    chZodiac = "Domuz";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 4:
                    chZodiac = "Fare";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 5:
                    chZodiac = "Öküz";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 6:
                    chZodiac = "Kaplan";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 7:
                    chZodiac = "Tavşan";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 8:
                    chZodiac = "Ejderha";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 9:
                    chZodiac = "Yılan";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 10:
                    chZodiac = "At";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                case 11:
                    chZodiac = "Koyun";
                    System.out.print("Çin Zodyağı Burcunuz : " + chZodiac);
                    break;
                default:

            }
        } else {
            System.out.print("Lütfen Geçerli Bir Sayı Değeri Giriniz!");
        }
    }
}