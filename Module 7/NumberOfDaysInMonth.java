
import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        scanner.close();

        int numDays = getNumberOfDays(year, month);

        if (numDays != -1) {
            System.out.println("Number of days in month " + month + " of year " + year + ": " + numDays);
        } else {
            System.out.println("Invalid input. Please enter a valid month (1-12).");
        }
    }

    public static int getNumberOfDays(int year, int month) {
        if (month < 1 || month > 12) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
