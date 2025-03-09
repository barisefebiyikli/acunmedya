// BankAccount.java
public abstract class BankAccount {
    protected String hesapSahibi; // AccountHolder
    protected double bakiye;      // Balance

    public BankAccount(String hesapSahibi, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.bakiye = bakiye;
    }

    public abstract void CalculateInterest();

    public void displayAccountInfo() {
        System.out.println("Hesap Sahibi: " + hesapSahibi + ", Bakiye: " + bakiye);
    }
}
