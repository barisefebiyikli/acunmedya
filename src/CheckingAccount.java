// CheckingAccount.java
public class CheckingAccount extends BankAccount {

    public CheckingAccount(String hesapSahibi, double bakiye) {
        super(hesapSahibi, bakiye);
    }

    @Override
    public void CalculateInterest() {
        System.out.println("Checking accounts do not earn interest.");
    }
}
