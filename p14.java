import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class p14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<Object> objectList = new ArrayList<>();

        // Loan object
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter interest rate (e.g., 5.0 for 5%): ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter loan term (years): ");
        int term = scanner.nextInt();
        Loan loan = new Loan(loanAmount, interestRate, term);
        objectList.add(loan);

        // Date (remains the same)
        Date today = new Date();
        objectList.add(today);

        // String
        System.out.print("Enter a message: ");
        String message = scanner.nextLine(); // Consume entire line including spaces
        objectList.add(message);

        // Circle object
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        objectList.add(circle);

        // Display object information
        System.out.println("\n**Content of the List:**");
        for (Object item : objectList) {
            System.out.println(item.toString());
        }

        scanner.close(); // Close Scanner to avoid resource leaks
    }
}

class Loan {
    // Loan object attributes
    private double amount;
    private double interestRate;
    private int term;

    // Constructor with more details
    public Loan(double amount, double interestRate, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    @Override
    public String toString() {
        return String.format("Loan(amount: %.2f \ninterest rate: %.2f%% \nterm: %d years",
                amount, interestRate * 100, term);
    }
}

class Circle {
    // Circle object attribute
    private double radius;

    // Constructor to initialize circle attribute
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle Radius: %.2f)", radius);
    }
}
