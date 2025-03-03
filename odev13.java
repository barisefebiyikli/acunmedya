import java.util.ArrayList;
import java.util.Collections;

public class odev13 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(45);
        sayilar.add(23);
        sayilar.add(89);
        sayilar.add(12);
        sayilar.add(67);
        sayilar.add(34);
        sayilar.add(56);
        sayilar.add(78);
        sayilar.add(90);
        sayilar.add(11);
        int enBuyuk = Collections.max(sayilar);
        int enKucuk = Collections.min(sayilar);

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
