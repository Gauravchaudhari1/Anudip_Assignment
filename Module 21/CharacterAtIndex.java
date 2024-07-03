import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Prompt the user to enter an index
        System.out.print("Enter an index: ");
        int index = sc.nextInt();

        // Check if the index is within the valid range
        if (index >= 0 && index < inputString.length()) {
            // Get the character at the given index
            char character = inputString.charAt(index);
            // Print the character
            System.out.println("Character at index " + index + ": " + character);
        } else {
            // Print an error message if the index is out of range
            System.out.println("Index out of range.");
        }

        // Close the scanner
        sc.close();
    }
}

// Dry Run

// String: "Hello, World!"
// Index: `7`
// Start of the Program

// The program starts, and the main method is executed.
// User Input

// The program prompts the user to enter a string.
// User inputs the string: "Hello, World!".
// The program stores this input in the variable inputString.
// User Input

// The program prompts the user to enter an index.
// User inputs the index: 7.
// The program stores this input in the variable index.
// Index Validation

// The program checks if the index 7 is within the valid range (0 to
// inputString.length() - 1).
// inputString.length() is 13, so the valid index range is 0 to 12.
// Since 7 is within this range, the program proceeds to the next step.
// Character Retrieval

// The program retrieves the character at index 7 from the string "Hello,
// World!".
// The character at index 7 is 'W'.
// Output

// The program prints the character: Character at index 7: W.
// End of Program

// The scanner is closed, and the program ends.