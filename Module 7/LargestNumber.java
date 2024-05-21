import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int largest;
        if (num1 >= num2) {
            largest = num1;
            if (largest < num3) {
                largest = num3;
            }
        } else {
            largest = num2;
            if (largest < num3) {
                largest = num3;
            }
        }

        System.out.println("The greatest number is: " + largest);

        scanner.close();
    }
}
