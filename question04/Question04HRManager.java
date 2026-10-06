package labsheet06.question04;

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR manager is managing human resources.");
    }

    public void addEmployee(String employeeName) {
        System.out.println(employeeName + " was added as an employee.");
    }
}

public class Question04HRManager {
    public static void main(String[] args) {
        HRManager manager = new HRManager(75000.00);
        manager.work();
        System.out.println("Salary: " + manager.getSalary());
        manager.addEmployee("Asha");
    }
}