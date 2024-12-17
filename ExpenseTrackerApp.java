import java.util.Scanner;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        String filename = "expenses.txt"; // File to save/load expenses

        while (true) {
            System.out.println("\nExpense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. Remove Expense");
            System.out.println("3. View All Expenses");
            System.out.println("4. View Summary by Category");
            System.out.println("5. Save Expenses to File");
            System.out.println("6. Load Expenses from File");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    manager.addExpense(new Expense(category, description, amount, date));
                    System.out.println("Expense added.");
                    break;
                case 2:
                    manager.displayExpenses();
                    System.out.print("Enter the number of the expense to remove: ");
                    int index = scanner.nextInt() - 1;
                    manager.removeExpense(index);
                    break;
                case 3:
                    manager.displayExpenses();
                    break;
                case 4:
                    manager.displaySummaryByCategory();
                    break;
                case 5:
                    manager.saveToFile(filename);
                    break;
                case 6:
                    manager.loadFromFile(filename);
                    break;
                case 7:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
