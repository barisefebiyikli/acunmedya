import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sayilar = new int[10];
        System.out.println("Lütfen 10 adet tam sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayısı " + (i + 1) + ": ");
            sayilar[i] = scanner.nextInt();
        }
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        double ortalama = toplam / (double) sayilar.length;

        System.out.println("Dizinin ortalaması: " + ortalama);
        System.out.println("50'den büyük olan elemanlar:");
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > 50) {
                System.out.println(sayilar[i]);
            }
        }
    }
}
