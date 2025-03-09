// Developer.java
public class Developer extends employee {
    private String Hakkinda;

    public Developer(int Id, String Name, double Salary, String Department, String Hakkinda) {
        super(Id, Name, Salary, Department);
        this.Hakkinda = Hakkinda;
    }

    @Override
    public double CalculateBonus() {
        return Salary * 0.10;
    }

    public void displayDeveloperInfo() {
        displayInfo();
        System.out.println("Hakkında: " + Hakkinda + ", Prim: " + CalculateBonus());
    }
}
