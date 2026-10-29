import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Randomly generated numbers:");

        // Use a while loop to generate 10 numbers
        while (count < 10) {
            // Generate a random integer from 1 to 100
            int currentNumber = random.nextInt(100) + 1;
            System.out.print(currentNumber + " ");

            // Update the largest number found so far
            if (currentNumber > largest) {
                largest = currentNumber;
            }

            // Update the smallest number found so far
            if (currentNumber < smallest) {
                smallest = currentNumber;
            }

            count++;
        }

        // Display the final results
        System.out.println("\n\n--- Results ---");
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}