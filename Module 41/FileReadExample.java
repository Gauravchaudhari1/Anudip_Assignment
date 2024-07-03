import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            // Specify the file path (change this path to a file that exists or doesn't
            // exist for testing)
            String filePath = "example.txt";
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to read a file and throw an exception if the file is not found
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Reading and printing the file content
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}

// Dry Run
// Test Case: File "example.txt" does not exist
// The program starts execution.
// The main method is executed.
// The variable filePath is assigned the value "example.txt".
// The readFile method is called with the argument "example.txt".
// Inside the readFile method, a File object is created for "example.txt".
// A Scanner object is attempted to be created to read from the file.
// Since the file "example.txt" does not exist, a FileNotFoundException is
// thrown.
// The exception is caught by the catch block in the main method.
// The message "Exception caught: example.txt (No such file or directory)" is
// printed.
// The program ends.
// Explanation
// The readFile method attempts to read a file specified by filePath.
// If the file is not found, a FileNotFoundException is thrown.
// The exception is caught in the catch block in the main method, and an
// appropriate message is printed.