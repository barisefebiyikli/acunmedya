import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class odev9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        System.out.println("Lütfen 10 adet sayı girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayısı " + (i + 1) + ": ");
            int sayi = scanner.nextInt();
            sayilar.add(sayi);
        }
        Collections.sort(sayilar, Collections.reverseOrder());
        System.out.println("Büyükten küçüğe sıralanmış sayılar:");
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}
