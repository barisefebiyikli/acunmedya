import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
        /*restoran siparis*/
        int total=0;
        int menu[]=new int[7];
        Scanner scanner=new Scanner(System.in);
        while (true) {
        System.out.println("1.Adana  100TL" +
                "\n2.Mercimek Corbasi   40TL\n" +
                "3.Sutlac   50TL\n" +
                "4.Sulu Kofte   80TL\n" +
                "5.Su   10TL\n"+
                "6.Kola   30TL\n"+
                "7.Adisyonu Hesapla Toplam Tutari Ekrana Yazdir.");
        int choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    menu[0]++;
                    total += 100;
                    break;
                case 2:
                    menu[1]++;
                    total += 40;
                    break;
                case 3:
                    menu[2]++;
                    total += 50;
                    break;
                case 4:
                    menu[3]++;
                    total += 80;
                    break;
                case 5:
                    menu[4]++;
                    total += 10;
                    break;
                case 6:
                    menu[5]++;
                    total += 30;
                    break;
                case 7:
                    System.out.println(menu[0] + " tane Adana\n" +
                            menu[1] + " tane Mercimek Corbasi\n" +
                            menu[2] + " tane Sutlac\n" +
                            menu[3] + " tane Sulu Kofte\n" +
                            menu[4] + " tane Su\n" +
                            menu[5] + " tane Kola\n" +
                            "TOPLAM ODEYECEGINIZ TUTAR: " + total);
                    return;
                default:
                    System.out.println("GECERSIZ DEGER GIRDINIZ.");
            }
        }
    }
}
