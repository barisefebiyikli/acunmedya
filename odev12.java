import java.util.ArrayList;
import java.util.Scanner;

public class odev12 {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Bursa");
        sehirler.add("Antalya");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir şehir adı girin: ");
        String girilenSehir = scanner.nextLine();

        if (sehirler.contains(girilenSehir)) {
            int indeks = sehirler.indexOf(girilenSehir);
            System.out.println("Şehir listede var. İndeksi: " + indeks);
        } else {
            System.out.println("Girdiğiniz şehir listede bulunmamaktadır.");
        }
    }
}
