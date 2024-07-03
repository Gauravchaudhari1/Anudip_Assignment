class EvenThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}

// Dry Run
// Initialization:

// Two classes EvenThread and OddThread extend the Thread class.
// The EvenThread class overrides the run method to print even numbers from 1 to
// 20.
// The OddThread class overrides the run method to print odd numbers from 1 to
// 20.
// Creating Threads:

// In the main method, two instances of EvenThread and OddThread are created:
// evenThread and oddThread.
// Starting Threads:

// The start method is called on evenThread, which internally calls the run
// method of EvenThread.
// The start method is called on oddThread, which internally calls the run
// method of OddThread.
// Execution of EvenThread:

// The run method of EvenThread executes a loop from 1 to 20.
// For each number, it checks if the number is even (i % 2 == 0).
// If the number is even, it prints Even: followed by the number.
// This prints:
// Even: 2
// Even: 4
// Even: 6
// Even: 8
// Even: 10
// Even: 12
// Even: 14
// Even: 16
// Even: 18
// Even: 20

// Execution of OddThread:

// The run method of OddThread executes a loop from 1 to 20.
// For each number, it checks if the number is odd (i % 2 != 0).
// If the number is odd, it prints Odd: followed by the number.
// This prints:
// Odd: 1
// Odd: 3
// Odd: 5
// Odd: 7
// Odd: 9
// Odd: 11
// Odd: 13
// Odd: 15
// Odd: 17
// Odd: 19
