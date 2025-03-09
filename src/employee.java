public class employee {
    protected int Id;
    protected String Name;
    protected double Salary;
    protected String Department;

    public employee(int Id, String Name, double Salary, String Department) {
        this.Id = Id;
        this.Name = Name;
        this.Salary = Salary;
        this.Department = Department;
    }

    public double CalculateBonus() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("ID: " + Id + ", Adı: " + Name + ", Maaşı: " + Salary + ", Departmanı: " + Department);
    }
}
