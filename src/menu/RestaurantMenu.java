package menu;

import model.Chef;
import model.Waiter;
import model.Staff;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMenu implements Menu {
    private ArrayList<Staff> allStaff;
    private Scanner scanner;

    public RestaurantMenu() {
        this.allStaff = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        allStaff.add(new Chef(2001, "Murat", 600000, 12, "Kazakh"));
        allStaff.add(new Waiter(3001, "Dana", 300000, 4, 95));
    }

    @Override
    public void displayMenu() {
        System.out.println("\nRESTAURANT MANAGEMENT SYSTEM");
        System.out.println("1. Add Chef");
        System.out.println("2. Add Waiter");
        System.out.println("3. View All Staff");
        System.out.println("4. Make All Staff Work");
        System.out.println("0. Exit");
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            System.out.print("Enter choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1: addChef(); break;
                    case 2: addWaiter(); break;
                    case 3: viewAllStaff(); break;
                    case 4: demonstrateWork(); break;
                    case 0: running = false; break;
                    default: System.out.println("Invalid!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private void addChef() {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Experience: ");
            int exp = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Specialization: ");
            String spec = scanner.nextLine();
            Chef chef = new Chef(id, name, salary, exp, spec);
            allStaff.add(chef);
            System.out.println("Chef added!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addWaiter() {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Experience: ");
            int exp = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Service Rating: ");
            int rating = scanner.nextInt();
            scanner.nextLine();
            Waiter waiter = new Waiter(id, name, salary, exp, rating);
            allStaff.add(waiter);
            System.out.println("Waiter added!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void viewAllStaff() {
        for (Staff s : allStaff) {
            s.displayInfo();
        }
    }

    private void demonstrateWork() {
        System.out.println("\n--- POLYMORPHISM: All Staff Working ---");
        for (Staff s : allStaff) {
            s.work();
        }
    }
}