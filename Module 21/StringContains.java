import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        // Prompt the user to enter the substring to search for
        System.out.print("Enter the substring to search for: ");
        String substring = sc.nextLine();

        // Check if the main string contains the specified substring
        boolean contains = mainString.contains(substring);

        // Print the result
        if (contains) {
            System.out.println("The main string contains the substring.");
        } else {
            System.out.println("The main string does not contain the substring.");
        }

        // Close the scanner
        sc.close();
    }
}

// Dry Run

// Main string: "Hello, World!"
// Substring: "World"
// Start of the Program

// The program starts, and the main method is executed.
// User Input

// The program prompts the user to enter the main string.
// User inputs the main string: "Hello, World!".
// The program stores this input in the variable mainString.
// User Input

// The program prompts the user to enter the substring to search for.
// User inputs the substring: "World".
// The program stores this input in the variable substring.
// Check if Main String Contains Substring

// The program checks if mainString contains substring using the contains
// method.
// "Hello, World!" contains "World", so the contains method returns true.
// The program stores the result in the variable contains.
// Output

// The program checks the value of contains.
// Since contains is true, the program prints: The main string contains the
// substring.
// End of Program

// The scanner is closed, and the program ends.
