import java.util.Scanner;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        scanner.close();

        displayNaturalNumbersAndSum(n);
    }

    public static void displayNaturalNumbersAndSum(int n) {
        int sum = 0;
        System.out.println("First " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum of the first " + n + " natural numbers: " + sum);
    }
}
