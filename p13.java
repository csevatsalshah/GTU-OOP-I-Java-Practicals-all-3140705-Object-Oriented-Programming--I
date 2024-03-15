import java.util.Scanner;

public class p13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter your expression (e.g., 3 + 4): ");
        String expression = scanner.nextLine();

        String[] parts = expression.trim().split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid expression format. Please try again.");
            return;
        }

        double num1;
        double num2;
        try {
            num1 = Double.parseDouble(parts[0]);
            num2 = Double.parseDouble(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numbers entered. Please enter only numbers.");
            return;
        }

        char operator = parts[1].charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                return;
        }

        System.out.println(expression + " = " + result);
    }
}
