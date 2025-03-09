// Main.java
public class Main {
    public static void main(String[] args) {
        // Çalışanlar
        Manager yonetici = new Manager(1, "Ali Yılmaz", 15000, "Yönetim", 5);
        Developer gelistirici = new Developer(2, "Ayşe Demir", 12000, "Yazılım", "Java Backend Developer");

        yonetici.displayManagerInfo();
        System.out.println("-------------------------");
        gelistirici.displayDeveloperInfo();

        System.out.println("=========================");

        // Banka Hesapları
        SavingsAccount vadeli = new SavingsAccount("Mehmet Kaya", 10000);
        CheckingAccount vadesiz = new CheckingAccount("Zeynep Ak", 5000);

        vadeli.displayAccountInfo();
        vadeli.CalculateInterest();

        System.out.println("-------------------------");

        vadesiz.displayAccountInfo();
        vadesiz.CalculateInterest();
    }
}
