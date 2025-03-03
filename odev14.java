import java.util.ArrayList;

public class odev14 {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Bursa");
        sehirler.add("Antalya");

        String ikinciSehir = sehirler.get(1);
        System.out.println("İkinci şehir: " + ikinciSehir);

        sehirler.set(2, "Eskişehir");
        System.out.println("Şehirler set() ile güncellenmiş: " + sehirler);

        sehirler.remove(3);
        System.out.println("Remove ile silinmiş şehir: " + sehirler);

        sehirler.clear();
        System.out.println("Liste clear() ile temizlendi: " + sehirler);

        System.out.println("Liste boyutu: " + sehirler.size());
    }
}
