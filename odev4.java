import java.util.Arrays;
import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        /*ogrenci not ortalama*/
        Scanner scanner=new Scanner(System.in);
        int score;
        int[][] not=new int[1][5];
        double total=0,average;
        boolean otuzunAltindami=false;
        for (int i = 0; i < 5; i++) {
            System.out.print(i+1+".Notunuzu giriniz.: ");
            score= scanner.nextInt();
            total+=score;
            not[0][i]=score;
        }
        average=total/5;
        Arrays.sort(not[0]);
        for (int i:not[0]) {
            if(i<30){
                otuzunAltindami=true;
                break;
            }
        }
        if (otuzunAltindami){
            System.out.println("30'un altinda aldiginiz dersler var!");
        }
        if (average>50){
            System.out.println("TEBRIKLER GECTINIZ!");
        }
        else {
            System.out.println("MAALESEF KALDINIZ :(");
        }
        System.out.println("Ortalama: "+average);
        System.out.println("EN YUKSEK NOT: "+not[0][4]+"\nEN DUSUK NOT: "+not[0][0]);
    }
}
