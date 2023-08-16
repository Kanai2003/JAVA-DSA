class Employee {
    private int id;
    private String name;
    private String department;
    protected double salary;

    
    public Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0.0;
    }

    
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

class Manager extends Employee {
    private double bonus;

    
    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

     public double getTotalSalary() {
        return super.salary + bonus;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }
}

public class Q2 {
    public static void main(String[] args) {
        
        Manager[] managers = new Manager[3];

        
        managers[0] = new Manager(1, "Pancho", "Sales", 50000, 10000);
        managers[1] = new Manager(2, "Anubrate", "Marketing", 60000, 12000);
        managers[2] = new Manager(3, "Tousif", "Finance", 70000, 15000);

        
        Manager maxSalaryManager = managers[0];
        for (int i = 1; i < 3; i++) {
            if (managers[i].getTotalSalary() > maxSalaryManager.getTotalSalary()) {
                maxSalaryManager = managers[i];
            }
        }

        System.out.println("Details of Manager with Maximum Total Salary: "+ maxSalaryManager.toString());
        
    }
}
