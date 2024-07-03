public class CreateStringFromArray {
    public static void main(String[] args) {
        // Define a character array
        char[] charArray = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!' };

        // Create a String object from the character array
        String str = new String(charArray);

        // Print the resulting String
        System.out.println("The created string is: " + str);
    }
}

// Dry Run

// Start of the Program

// The program starts, and the main method is executed.
// Character Array Definition

// The program defines a character array charArray with the elements {'H', 'e',
// 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!'}.
// String Creation

// The program creates a String object str using the constructor new
// String(charArray).
// The constructor converts the character array into a String with the value
// "Hello, World!".
// The program stores this String in the variable str.
// Output

// The program prints the resulting String using System.out.println("The created
// string is: " + str).
// The output is: The created string is: Hello, World!
// End of Program

// The program ends.