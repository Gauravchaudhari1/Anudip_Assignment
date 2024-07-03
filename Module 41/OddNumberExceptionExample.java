public class OddNumberExceptionExample {
    public static void main(String[] args) {
        try {
            int number = 5; // You can change this value to test with different numbers
            checkEven(number);
            System.out.println(number + " is even.");
        } catch (OddNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that checks if a number is even, and throws an exception if it's odd
    public static void checkEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is odd.");
        }
    }
}

// Custom exception class
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

// Dry Run
// Test Case: Number is 5
// The program starts execution.
// The main method is executed.
// The variable number is assigned the value 5.
// The checkEven method is called with the argument 5.
// Inside the checkEven method, the condition 5 % 2 != 0 is checked. This
// condition is true since 5 is odd.
// An OddNumberException is thrown with the message "5 is odd."
// The exception is caught by the catch block in the main method.
// The message "Exception caught: 5 is odd." is printed.
// The program ends.
// Explanation
// The checkEven method checks if a number is even. If the number is odd, it
// throws an OddNumberException.
// The custom exception class OddNumberException is defined to handle odd number
// cases.
// In the main method, the checkEven method is called with a test number.
// If the number is odd, the exception is thrown and caught in the catch block,
// and an appropriate message is printed.