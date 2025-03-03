public class odev8 {
    public static void main(String[] args) {
        int[] sayilar = {5, -3, 8, -2, 1, -7, 6};

        int pozitifToplam = 0;
        int negatifToplam = 0;

        for (int sayi : sayilar) {
            if (sayi > 0) {
                pozitifToplam += sayi;
            } else if (sayi < 0) {
                negatifToplam += sayi;
            }
        }


        System.out.println("Pozitif sayıların toplamı: " + pozitifToplam);
        System.out.println("Negatif sayıların toplamı: " + negatifToplam);
    }
}
