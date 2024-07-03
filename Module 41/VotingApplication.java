import java.util.Scanner;

public class VotingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new IllegalArgumentException("You must be at least 18 years old to vote.");
            }

            System.out.println("You are eligible to vote.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// Dry Run
// Test Case 1: User age is 20
// The program starts.
// The user is prompted to enter their age.
// The user enters 20.
// The program checks if 20 is less than 18. This condition is false.
// The program prints "You are eligible to vote."
// The program ends.
// Test Case 2: User age is 16
// The program starts.
// The user is prompted to enter their age.
// The user enters 16.
// The program checks if 16 is less than 18. This condition is true.
// The program throws an IllegalArgumentException with the message "You must be
// at least 18 years old to vote."
// The exception is caught in the catch block.
// The program prints "Exception: You must be at least 18 years old to vote."
// The program ends.
// Explanation
// The program uses Scanner to take input from the user.
// It checks if the age entered by the user is less than 18.
// If the age is less than 18, it throws an IllegalArgumentException.
// The catch block catches the exception and prints an appropriate message.
// The finally block ensures that the Scanner is closed, releasing any resources
// it might be using.