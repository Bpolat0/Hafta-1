public class Main {
    public static void main(String[] args) {

        //Döngü İçine Döngü Kurularak Asal Sayıların Çıktısı Alındı
        for (int k = 2; k <= 100; k++) {
            boolean asalMi = true;

            for (int i = 2; i <= k / 2; i++) {
                if (k % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(k+",");
            }
        }
    }
}