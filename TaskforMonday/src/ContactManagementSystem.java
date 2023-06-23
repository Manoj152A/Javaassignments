import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContactManagementSystem {
    static Set<Contact> contacts = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Contact Management System");

        while (true) {
            System.out.println("1. Add a contact");
            System.out.println("2. View all contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;

                case 2:
                    viewContacts();
                    break;

                case 3:
                    System.out.println("Exiting the Contact Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    private static void addContact(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email address: ");
        String emailAddress = scanner.nextLine();

        contacts.add(new Contact(name, phoneNumber, emailAddress));
        System.out.println("Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts in the Contact Management System:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }}