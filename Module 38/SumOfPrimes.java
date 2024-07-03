import java.util.ArrayList;
import java.util.List;

class PrimeCalculatorThread extends Thread {
    private int start, end;
    private int sum = 0;

    public PrimeCalculatorThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public int getSum() {
        return sum;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }
}

public class SumOfPrimes {
    public static void main(String[] args) {
        int limit = 100; // Specify the limit up to which to calculate prime numbers
        int numberOfThreads = 4;
        int range = limit / numberOfThreads;

        List<PrimeCalculatorThread> threads = new ArrayList<>();
        int start = 1;

        for (int i = 0; i < numberOfThreads; i++) {
            int end = (i == numberOfThreads - 1) ? limit : start + range - 1;
            PrimeCalculatorThread thread = new PrimeCalculatorThread(start, end);
            threads.add(thread);
            thread.start();
            start = end + 1;
        }

        int totalSum = 0;

        for (PrimeCalculatorThread thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of all prime numbers up to " + limit + ": " + totalSum);
    }
}
