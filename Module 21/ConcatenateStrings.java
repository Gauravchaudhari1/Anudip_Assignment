import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();

        // Concatenate the second string to the end of the first string
        String concatenatedString = firstString + secondString;

        // Print the concatenated string
        System.out.println("Concatenated string: " + concatenatedString);

        // Close the scanner
        sc.close();
    }
}

// Dry Run

// First string: "Hello"
// Second string: " World"
// Start of the Program

// The program starts, and the main method is executed.
// User Input

// The program prompts the user to enter the first string.
// User inputs the first string: "Hello".
// The program stores this input in the variable firstString.
// User Input

// The program prompts the user to enter the second string.
// User inputs the second string: " World".
// The program stores this input in the variable secondString.
// String Concatenation

// The program concatenates the second string " World" to the end of the first
// string "Hello".
// The concatenated string is "Hello World".
// The program stores the result in the variable concatenatedString.
// Output

// The program prints the concatenated string: Concatenated string: Hello World.
// End of Program

// The scanner is closed, and the program ends.