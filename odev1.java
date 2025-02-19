import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        /*atm*/
        int pin = 1234;
        int userPin;
        int balance = 1000;
        boolean retry = true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("BANKACILIK UYGULAMASINA HOSGELDINIZ!");
        System.out.print("Pini Gir= ");
        userPin = scanner.nextInt();

            if (userPin == pin) {
                retry = true;
                System.out.println("giris basarili!");
                break;
            } else {
                System.out.println("SIFRE YANLIS!");

            }
        }
        while (retry) {
            System.out.println("----MENU----\n1.Bakiye Goruntule\n2.Para Yatir\n3.Para Cek\n4.Cikis");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("BAKIYENIZ= " + balance);
                    break;
                case 2:
                    System.out.print("Yatirmak Istediginiz Miktar= ");
                    int deposit = scanner.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Islem basarili");
                        System.out.println("Yeni Bakiye=" + balance);
                    } else {
                        System.out.println("Gecersiz Deger. Lutfen gecerli bir deger giriniz");
                    }
                    break;
                case 3:
                    System.out.print("Cekmek istediginiz miktar= ");
                    int withdraw = scanner.nextInt();
                    if (withdraw < balance && withdraw > 0) {
                        balance -= withdraw;
                        System.out.println("Islem Basarili.");
                    } else {
                        System.out.println("Gecerli Bir Deger Girin.");
                    }
                    break;
                case 4:
                    System.out.println("Iyi gunler dileriz.");
                    retry = false;
                    break;
                default:
                    System.out.println("Gecersiz Secim Lutfen Tekrar Deneyin");
            }
        }
    }
}
