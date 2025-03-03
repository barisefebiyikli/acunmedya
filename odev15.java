import java.util.Arrays;

public class odev15 {
    public static void main(String[] args) {
        int[] sayilar = {5, 3, 8, 1, 2, 7};
        int[] sayilarKopya;
        int[] aramaDizisi = {1, 2, 3, 4, 5, 6, 7, 8};

        Arrays.sort(sayilar);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(sayilar));

        int aramaSonucu = Arrays.binarySearch(sayilar, 5);
        System.out.println("5 sayısının indeksi: " + aramaSonucu);

        sayilarKopya = Arrays.copyOfRange(sayilar, 1, 4);
        System.out.println("Kopyalanmış dizi (1. ile 3. indeks arasındaki): " + Arrays.toString(sayilarKopya));

        int[] dizi2 = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean esittir = Arrays.equals(aramaDizisi, dizi2);
        System.out.println("İki dizi eşit mi? " + esittir);

        Arrays.fill(sayilar, 9);
        System.out.println("Tüm elemanlar 9 ile doldurulmuş dizi: " + Arrays.toString(sayilar));
    }
}
