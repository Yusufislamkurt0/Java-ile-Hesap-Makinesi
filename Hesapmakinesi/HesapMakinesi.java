
import java.util.Scanner;

/**
 * HesapMakinesi
 */
public class HesapMakinesi {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int sayi1, sayi2, secim;
            System.out.println("İlk sayıyı giriniz : ");
            sayi1 = scan.nextInt();
            System.out.println("\nİkinci sayıyı giriniz : ");
            sayi2 = scan.nextInt();
            System.out.println("Lütfen yapmak istediginiz işlemi seçiniz : ");
            System.out.println("\n 1 - Toplama\n 2 - Çıkarma\n 3 - Çarpma\n 4 - Bölme ");
            System.out.println("Seçiminiz : ");
            secim = scan.nextInt();

            if (secim == 1) {
                System.out.println("Toplama " + (sayi1 + sayi2));
            }

            else if (secim == 2) {
                System.out.println("Çıkarma " + (sayi1 - sayi2));
            }

            else if (secim == 3) {
                System.out.println("Çarpma " + (sayi1 * sayi2));
            }

            else if (secim == 4) {

                System.out.println("Bölme " + (sayi1 / sayi2));
            }
            if (sayi2 == 0) {

                System.out.println("İkinci sayı sıfıra eşittir ve sonuç belirsizdir");
            }
        }

    }
}