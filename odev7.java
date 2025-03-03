import java.util.Arrays;

public class odev7 {
    public static void main(String[] args) {
        int[] sayilar = {5, 3,3, 8, 3, 1, 5, 8};

        Arrays.sort(sayilar);

        System.out.print("Tekrar eden sayılar: ");
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] == sayilar[i - 1]) {
                if (i == 1 || sayilar[i] != sayilar[i - 2]) {
                    System.out.print(sayilar[i] + " ");
                }
            }
        }
    }
}
