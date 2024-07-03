public class ArrayAverage {
    public static void main(String[] args) {

        double[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Call the method to calculate the average of the array elements
        double average = calculateAverage(numbers);

        // Print the result
        System.out.println("The average of the array elements is: " + average);
    }

    // Method to calculate the average of the elements of an array
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
