import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeDatabase {
    private static HashSet<Employee> employees = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Database");

        while (true) {
            System.out.println("1. Add employee details");
            System.out.println("2. View employee details");
            System.out.println("3. Remove employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    removeEmployees(scanner);
                    break;
                case 4:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }

    private static void removeEmployees(Scanner scanner) {
        System.out.print("Enter the name of the employee to remove: ");
        String name = scanner.nextLine();

        boolean removed = false;
        Employee employeeToRemove = null;

        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                employeeToRemove = employee;
                removed = true;
                break;
            }
        }

        if (removed) {
            employees.remove(employeeToRemove);
            System.out.println("Employee removed successfully!");
        } else {
            System.out.println("Employee not found in the database.");
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String employeeId = scanner.nextLine();
        System.out.println("Enter mail ID: ");
        String mailid = scanner.nextLine();

        employees.add(new Employee(name, employeeId, mailid));
        System.out.println("Employee added successfully!");
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employees in the Employee Database:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
