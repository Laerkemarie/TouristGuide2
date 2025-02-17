package superOgSubKlasser;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, int salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Bonus " + bonus);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Hannah", 40000);
        employee.printDetails();

        Manager manager = new Manager("Brian", 60000, 1000);
        manager.printDetails();
    }
}
