import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = Sc.nextInt();

        while (number < 0) {
            System.out.print("Invalid input. Please enter a positive integer: ");
            number = Sc.nextInt();
        }

        long factorial = 1;
        int i = number;

        while (i > 0) {
            factorial *= i;
            i--;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
