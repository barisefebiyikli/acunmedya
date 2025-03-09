// SavingsAccount.java
public class SavingsAccount extends BankAccount {

    public SavingsAccount(String hesapSahibi, double bakiye) {
        super(hesapSahibi, bakiye);
    }

    @Override
    public void CalculateInterest() {
        double faiz = bakiye * 0.05;
        System.out.println("Vadeli hesap faizi: " + faiz);
    }
}
