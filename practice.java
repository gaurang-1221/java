import java.util.Scanner;

// Parent class
class BaseEmployee {
    String name;
    int employeeId;
    double salary;

    // Constructor
    BaseEmployee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

// Child class
class Developer extends BaseEmployee {
    String programmingLanguage;

    // Constructor
    Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary); // call parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        String name = sc.nextLine();
        int employeeId = sc.nextInt();
        double salary = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        String programmingLanguage = sc.nextLine();

        // Create Developer object
        Developer dev = new Developer(name, employeeId, salary, programmingLanguage);

        // Display details
        dev.displayDetails();

        sc.close();
    }
}

