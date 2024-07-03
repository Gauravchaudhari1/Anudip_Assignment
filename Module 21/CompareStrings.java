import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();

        // Prompt the user to enter the second string (character sequence)
        System.out.print("Enter the second string (character sequence): ");
        String secondString = sc.nextLine();

        // Compare the two strings
        boolean areEqual = firstString.equals(secondString);

        // Print the result
        if (areEqual) {
            System.out.println("The first string is equal to the second string.");
        } else {
            System.out.println("The first string is not equal to the second string.");
        }

        // Close the scanner
        sc.close();
    }
}

// Dry Run

// First string: "Hello, World!"
// Second string: "Hello, World!"
// Start of the Program

// The program starts, and the main method is executed.
// User Input

// The program prompts the user to enter the first string.
// User inputs the first string: "Hello, World!".
// The program stores this input in the variable firstString.
// User Input

// The program prompts the user to enter the second string (character sequence).
// User inputs the second string: "Hello, World!".
// The program stores this input in the variable secondString.
// String Comparison

// The program compares firstString and secondString using the equals method.
// "Hello, World!" is equal to "Hello, World!", so the equals method returns
// true.
// The program stores the result in the variable areEqual.
// Output

// The program checks the value of areEqual.
// Since areEqual is true, the program prints: The first string is equal to the
// second string.
// End of Program

// The scanner is closed, and the program ends.
