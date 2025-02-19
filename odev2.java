import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
/*market*/
        Scanner scanner=new Scanner(System.in);
        double total=0;
        int marulFiyat=10;
        int domatFiyat=25;
        int salatalikFiyat=20;
        int list[]=new int[3];
        boolean discount=false;
        System.out.println("Markete Hosgeldiniz!");
        while(true){

            System.out.println("----MENU----");
            System.out.println("1.Marul 10TL\n2.Domates 25TL\n3.Salatalik 20TL\n4.Tutari hesapla Ode ve Cik\n5.indirim uygula(kupon kodu gir)");
            int choice= scanner.nextInt();
            switch (choice){
                default:
                    System.out.println("GECERSIZ SECIM!");
                case 4:
                    if (discount){
                        total=total-(total*0.1);
                        System.out.println("INDIRIM KODLU Toplam Tutar= " + total + "\nMarul: " + list[0] + " tane\nDomates: " + list[1] + " tane\nSalatalik: " + list[2] + " tane");
                    }
                    else {
                        System.out.println("Toplam Tutar= " + total + "\nMarul: " + list[0] + " tane\nDomates: " + list[1] + " tane\nSalatalik: " + list[2] + " tane");
                    }

                    return;
                case 5:
                    discount=true;
                    break;
                case 1:
                    total+=marulFiyat;
                    list[0]++;
                    System.out.println("1 Adet Marul Eklendi Toplam Fiyat: "+total+" TL");
                    break;
                case 2:
                    total+=domatFiyat;
                    list[1]++;
                    System.out.println("1 Adet Domates Eklendi Toplam Fiyat: "+total+" TL");
                    break;
                case 3:
                    total+=salatalikFiyat;
                    list[2]++;
                    System.out.println("1 Adet Salatalik Eklendi Toplam Fiyat: "+total+" TL");
                    break;
            }

        }
    }
}
