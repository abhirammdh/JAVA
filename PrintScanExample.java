import java.util.Scanner;  // Import the Scanner class

public class PrintScanExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        // Asking user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Scans a line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Scans an integer

        // Printing output
        System.out.println("\n--- Output ---");
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        scanner.close();  // Close the scanner
    }
}
