import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class odev10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> kelimeler = new ArrayList<>();

        System.out.println("Lütfen 10 adet kelime girin:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Kelime " + (i + 1) + ": ");
            String kelime = scanner.nextLine();
            kelimeler.add(kelime);
        }
        Collections.sort(kelimeler);
        System.out.println("Alfabetik sıraya göre sıralanmış kelimeler:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
    }
}
