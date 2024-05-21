import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        scanner.close();

        int sum = sumOfOddNumbers(n);
        System.out.println("Sum of the first " + n + " odd natural numbers: " + sum);
    }

    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        int count = 0;
        int num = 1;

        while (count < n) {
            if (num % 2 != 0) {
                sum += num;
                count++;
            }
            num++;
        }

        return sum;
    }
}
