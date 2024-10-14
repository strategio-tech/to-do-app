package tech.strategio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {
    private static List<ToDo> todoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Options:");
            System.out.println("1. View all to-do items");
            System.out.println("2. View items by order (name or due date)");
            System.out.println("3. View not started items");
            System.out.println("4. Add new item");
            System.out.println("5. Delete item");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewAllItems();
                    break;
                case 2:
                    viewItemsByOrder(scanner);
                    break;
                case 3:
                    viewNotStartedItems();
                    break;
                case 4:
                    addNewItem(scanner);
                    break;
                case 5:
                    deleteItem(scanner);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // View all to-do items
    public static void viewAllItems() {
        if (todoList.isEmpty()) {
            System.out.println("No items found.");
        } else {
            for (ToDo todo : todoList) {
                System.out.println(todo);
            }
        }
    }

    // View items by specified order (name or due date)
    public static void viewItemsByOrder(Scanner scanner) {
        System.out.println("View by: 1. Name  2. Due Date");
        int orderChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (orderChoice == 1) {
            // TODO
            System.out.println("Not Implemented yet.");
        } else if (orderChoice == 2) {
            // TODO
            System.out.println("Not Implemented yet.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // View not started items
    public static void viewNotStartedItems() {
       // TODO
        System.out.println("Not Implemented yet.");
    }

    // Add new item
    public static void addNewItem(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter due date (YYYY-MM-DD): ");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        ToDo newItem = new ToDo(name, dueDate, description, Status.NOT_STARTED);
        todoList.add(newItem);
        System.out.println("New to-do item added.");
    }

    // Delete item
    public static void deleteItem(Scanner scanner) {
        // TODO
        System.out.println("Not Implemented yet.");
    }
}
