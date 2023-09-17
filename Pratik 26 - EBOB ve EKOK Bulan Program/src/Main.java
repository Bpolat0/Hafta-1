import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        int n1, n2, i = 1, ebob = 1;

        //Kullanıcıdan Veri İstendi
        System.out.print("n1 sayısını giriniz : ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        n2 = input.nextInt();

        //While İle EBOB
        i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("EBOB : " + ebob);
                break;
            }
            i--;
        }

        System.out.println("EKOK : " + (n1 * n2) / ebob);

//While İle Direkt EKOK bulma
//        while (i <= (n1 * n2)) {
//            if (i % n1 == 0 && i % n2 == 0) {
//                break;
//            }
//            i++;
//        }


// EBOB DİĞER YÖNTEM
//        while (i <= n1) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                System.out.println(i);
//                ebob = i;
//            }
//            i++;
//        }

    }
}