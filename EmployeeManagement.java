// Employee Class
class Employee {

    String name;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        System.out.println("New Employee Joined: " + name);
    }

    // Method to increase employee salary
    void giveRaise(double amount) {
        salary += amount;
        System.out.println(name + "'s salary increased by " + amount);
    }

    // Method to display employee details
    void showDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + salary);
    }
}

// Main Class
public class EmployeeManagement {

    public static void main(String[] args) {

        // Creating an Employee object
        Employee employee = new Employee("Krishu", 75000.0);

        // Display employee details
        employee.showDetails();

        // Increase salary
        employee.giveRaise(5000);

        // Display updated details
        employee.showDetails();
    }
}
