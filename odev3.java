import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        /*hiz cezasi*/
        int speed;
        System.out.println("Azami Hiz Siniri 90 km/s");
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.print("Hizinizi Girin: ");
            speed = scanner.nextInt();
            if (speed <= 0) {
                System.out.println("Gecerli hiz degeri girin.");
            } if (speed > 0 && 90 >= speed) {
                System.out.println("Hiziniz Normal Sorun Yok.");
                return;
            } if (speed > 90 && 110 >= speed) {
                System.out.println("1000Tl Ceza Aldiniz!");
                return;
            } if (speed > 110 && 130 > speed) {
                System.out.println("2000TL ceza Aldiniz!");
                return;
            } if (speed >= 130) {
                System.out.println("Ehliyetinize El Konuldu!");
                return;
            }
        }

    }
}
