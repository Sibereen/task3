import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter real numbers for a, b, and c[cite: 1]
        System.out.print("Enter coefficients a, b, and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Hint 1: Check if the user has entered zero as 'a'[cite: 1]
        if (a == 0) {
            System.out.println("Error: 'a' cannot be zero for a quadratic equation.");
            return;
        }

        // Hint 2: Calculate delta and determine the number of roots[cite: 1]
        double delta = (b * b) - (4 * a * c);
        int rootsCount;

        if (delta > 0) {
            rootsCount = 2;
        } else if (delta == 0) {
            rootsCount = 1;
        } else {
            rootsCount = 0;
        }

        double x1 = 0, x2 = 0;

        // Hint 3: Use a switch statement depending on the number of roots[cite: 1]
        switch (rootsCount) {
            case 2:
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                break;
            case 1:
                x1 = -b / (2 * a);
                break;
            case 0:
            default:
                // No real roots
                break;
        }

        // Display variables a, b, c, x1, and x2 with an accuracy of two decimal places[cite: 1]
        System.out.println("\n--- Quadratic Equation Results ---");
        System.out.printf("a = %.2f\n", a);
        System.out.printf("b = %.2f\n", b);
        System.out.printf("c = %.2f\n", c);

        switch (rootsCount) {
            case 2:
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
                break;
            case 1:
                System.out.printf("x1 = %.2f\n", x1);
                break;
            case 0:
                System.out.println("The equation has no real roots (delta is negative).");
                break;
        }

        scanner.close();
    }
}