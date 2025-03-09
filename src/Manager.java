// Manager.java
public class Manager extends employee {
    private int EkipBoyutu;

    public Manager(int Id, String Name, double Salary, String Department, int EkipBoyutu) {
        super(Id, Name, Salary, Department);
        this.EkipBoyutu = EkipBoyutu;
    }

    @Override
    public double CalculateBonus() {
        return Salary * 0.20;
    }

    public void displayManagerInfo() {
        displayInfo();
        System.out.println("Ekip Boyutu: " + EkipBoyutu + ", Prim: " + CalculateBonus());
    }
}
