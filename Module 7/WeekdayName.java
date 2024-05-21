import java.util.Scanner;

public class WeekdayName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7 (corresponding to weekdays): ");
        int dayNum = scanner.nextInt();

        if (dayNum < 1 || dayNum > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");

        }

        String weekday;
        switch (dayNum) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            default:
                weekday = "Sunday";
        }

        System.out.println("The corresponding weekday is: " + weekday);

        scanner.close();
    }
}
