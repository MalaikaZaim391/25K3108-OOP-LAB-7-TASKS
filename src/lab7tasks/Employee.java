package lab7tasks;

public class Employee {
    void calculateSalary(){
        System.out.println("Calculating Salary...");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary(){
        double base_salary = 5000;
        //20 percent bonus for manager
        double salary2 = base_salary * 1.2;
        System.out.println("Manager Salary: " + salary2);
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary(){
        double base_salary = 5000;
        //10 percent bonus for developer
        double salary2 = base_salary * 1.1;
        System.out.println("Developer Salary: " + salary2);
    }
}

class Intern extends Employee {
    @Override
    void calculateSalary(){
        double base_salary = 5000;
        //5 percent bonus for intern
        double salary2 = base_salary * 1.05;
        System.out.println("Intern Salary: " + salary2);
    }
}

class main4{
    public static void main(String[] args) {
        Employee emp2 = new Manager();
        Employee emp3 = new Developer();
        Employee emp4 = new Intern();

        emp2.calculateSalary();
        emp3.calculateSalary();
        emp4.calculateSalary();

    }
}