import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Değişkenler Oluşturuldu
        String userName, password, newPassword, forgot;

        //Kullanıcıdan Veri İstendi
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifre :");
        password = input.nextLine();

        if (userName.equals("Patika") && (password.equals("1234"))) {
            System.out.print("Başarıyla Giriş Yaptınız!");

        } else {

            System.out.println("Hatalı Bilgi Girişi!");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz? Evet-Hayır");

            forgot = input.nextLine();

            switch (forgot) {
                case "Evet":
                    System.out.print("Yeni şifrenizi giriniz :");
                    newPassword = input.nextLine();
                    password = newPassword;
                    if (((newPassword.equals("1234")) || (newPassword.equals(password)))) {
                        System.out.println("Lütfen girdiğiniz şifre eski  ve hatalı şifrenizle aynı olmasın.");

                    } else {

                        System.out.println("Şifrenizi Başarılı Bir Şekilde Değiştirilmiştir! Yeni Şifre : " + password);
                    }
                    break;
                case "Hayır":
                    System.out.print("İşlem sonu.");
                    break;
                default:
                    System.out.println("Yanlış giriş yapılmıştır.");
            }
        }
    }
}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        //Değişkenler Oluşturuldu
//        String userName, password, newPassword, forgot;
//
//        //Kullanıcıdan Veri İstendi
//        System.out.print("Kullanıcı Adınız : ");
//        userName = input.nextLine();
//
//        System.out.print("Şifre :");
//        password = input.nextLine();
//
//        if (userName.equals("Patika") && (password.equals("1234"))) {
//            System.out.print("Başarıyla Giriş Yaptınız!");
//
//        } else if (!userName.equals("Patika") && (!password.equals("1234"))) {
//            System.out.println("Hatalı Bilgi Girişi!");
//            System.out.println("Şifrenizi Sıfırlamak İster Misiniz? Evet-Hayır");
//            forgot = input.nextLine();
//            switch (forgot) {
//                case "Evet":
//                    System.out.print("Yeni şifrenizi giriniz :");
//                    newPassword = input.nextLine();
//                    if (((newPassword.equals("1234")) || (newPassword.equals(password)))) {
//                        System.out.println("Lütfen girdiğiniz şifre eski  ve hatalı şifrenizle aynı olmasın.");
//                    } else {
//                        password = newPassword;
//                        System.out.println("Şifrenizi Başarılı Bir Şekilde Değiştirilmiştir! Yeni Şifre : " + password);
//                    }
//            }
//        } else {
//        }
//    }
//}