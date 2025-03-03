import java.util.ArrayList;
import java.util.Random;

public class odev11 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            sayilar.add(random.nextInt(100));
        }
        ArrayList<Integer> ciftSayilar = new ArrayList<>();
        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            }
        }
        System.out.println("Çift sayılar:");
        for (int ciftSayi : ciftSayilar) {
            System.out.println(ciftSayi);
        }
    }
}
