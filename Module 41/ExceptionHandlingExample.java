public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Deliberately causing an ArithmeticException by dividing by zero
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that divides two numbers
    public static int divide(int a, int b) {
        return a / b;
    }
}

// Dry Run
// Test Case: Dividing 10 by 0
// The program starts execution.
// The main method is executed.
// The try block is entered.
// The divide method is called with parameters 10 and 0.
// Inside the divide method, the division 10 / 0 is attempted.
// An ArithmeticException is thrown because division by zero is not allowed in
// Java.
// The exception is caught by the catch block in the main method.
// The message "Exception caught: / by zero" is printed.
// The program ends.
// Explanation
// The divide method is defined to perform division of two integers.
// In the main method, the divide method is called with arguments 10 and 0.
// This results in an ArithmeticException because division by zero is illegal in
// Java.
// The exception is caught by the catch block, and an appropriate message is
// printed.