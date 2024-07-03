public class VowelChecker {

    // Method to check for vowels
    public static void checkForVowels(String input) throws NoVowelException {
        if (input == null || input.isEmpty()) {
            throw new NoVowelException("Input string is empty or null");
        }

        String vowels = "AEIOUaeiou";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                System.out.println("The string contains vowels.");
                return;
            }
        }

        // If no vowel is found, throw an exception
        throw new NoVowelException("No vowels found in the input string");
    }

    // Custom exception class
    public static class NoVowelException extends Exception {
        public NoVowelException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            checkForVowels("Hello"); // Should pass
            checkForVowels("bcdfg"); // Should throw exception
        } catch (NoVowelException e) {
            System.err.println(e.getMessage());
        }
    }
}

// Dry Run

// Call checkForVowels("Hello"):

// Input string: "Hello"
// The method checks if the string is null or empty: it is not.
// Iterates over each character in the string:
// 'H': Not a vowel
// 'e': A vowel (found in "AEIOUaeiou")
// The method prints "The string contains vowels." and returns without throwing
// an exception.
// Call checkForVowels("bcdfg"):

// Input string: "bcdfg"
// The method checks if the string is null or empty: it is not.
// Iterates over each character in the string:
// 'b': Not a vowel
// 'c': Not a vowel
// 'd': Not a vowel
// 'f': Not a vowel
// 'g': Not a vowel
// No vowels found in the entire string.
// The method throws a NoVowelException with the message "No vowels found in the
// input string".
// The main method catches this exception and prints "No vowels found in the
// input string".