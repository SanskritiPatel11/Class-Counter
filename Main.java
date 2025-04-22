

class Employee {
    private String name;
    private double baseSalary;

    
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    
    public double calculateSalary() {
        return baseSalary;
    }

    
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}


class Manager extends Employee {
    private double bonus;

    
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    
    @Override
    public double calculateSalary() {
        double finalSalary = super.calculateSalary() + bonus;
        return finalSalary;
    }

    
    public double getBonus() {
        return bonus;
    }
}


public class Main {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("Suman Tiwari", 50000);
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Base Salary: $" + employee.calculateSalary());

            Manager manager = new Manager("Pankaj Singh", 70000, 10000);
            System.out.println("Manager Name: " + manager.getName());
            System.out.println("Final Salary (including bonus): $" + manager.calculateSalary());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}