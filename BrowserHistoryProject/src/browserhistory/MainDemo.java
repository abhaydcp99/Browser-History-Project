package browserhistory;
import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        BrowserHistoryDemo history = new BrowserHistoryDemo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Visit Page");
            System.out.println("2. Move Backward");
            System.out.println("3. Move Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Clear History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    history.visitPage(url);
                    break;
                case 2:
                    history.moveBackward();
                    break;
                case 3:
                    history.moveForward();
                    break;
                case 4:
                    history.displayCurrentPage();
                    break;
                case 5:
                    history.clearHistory();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
