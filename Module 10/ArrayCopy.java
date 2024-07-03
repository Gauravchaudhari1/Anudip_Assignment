public class ArrayCopy {
    public static void main(String[] args) {

        int[] originalArray = { 1, 2, 3, 4, 5 };

        // Create a new array to hold the copy
        int[] copiedArray = new int[originalArray.length];

        // Copy elements from the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Print the original and copied arrays to verify the copy
        System.out.print("Original array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        System.out.print("Copied array: ");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}
