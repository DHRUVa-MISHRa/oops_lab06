package labsheet06.question10;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();
}

class Manager extends Employee {
    private double monthlySalary;
    private double bonus;

    public Manager(String name, double monthlySalary, double bonus) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Monthly salary including bonus: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double monthlySalary;
    private double overtimePay;

    public Programmer(String name, double monthlySalary, double overtimePay) {
        super(name);
        this.monthlySalary = monthlySalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + overtimePay;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer: " + name);
        System.out.println("Monthly salary including overtime: " + calculateSalary());
    }
}

public class Question10EmployeeRoles {
    public static void main(String[] args) {
        Employee manager = new Manager("Asha", 90000.00, 10000.00);
        Employee programmer = new Programmer("Ravi", 70000.00, 5000.00);
        manager.displayInfo();
        programmer.displayInfo();
    }
}