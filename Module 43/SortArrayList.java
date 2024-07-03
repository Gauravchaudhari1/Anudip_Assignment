import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(9);

        // Print the unsorted ArrayList
        System.out.println("Unsorted ArrayList: " + arrayList);

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + arrayList);
    }
}

// Dry Run
// Initialization:

// An ArrayList<Integer> named arrayList is created.
// Elements 5, 3, 8, 1, and 9 are added to arrayList.
// Before Sorting:

// The ArrayList arrayList contains: [5, 3, 8, 1, 9].
// Sorting:

// The Collections.sort(arrayList) method is called.
// Internally, Collections.sort() uses a modified merge sort algorithm to sort
// the elements.
// Let's go through the sorting step-by-step:

// Step 1: Divide the list into smaller sublists.

// Split [5, 3, 8, 1, 9] into [5, 3, 8] and [1, 9].
// Step 2: Further divide until sublists contain single elements.

// Split [5, 3, 8] into [5], [3], and [8].
// [1, 9] is already divided into [1] and [9].
// Step 3: Merge and sort the sublists.

// Merge [5] and [3] to form [3, 5].
// Merge [3, 5] and [8] to form [3, 5, 8].
// Merge [1] and [9] to form [1, 9].
// Finally, merge [3, 5, 8] and [1, 9] to form [1, 3, 5, 8, 9].
// After Sorting:

// The ArrayList arrayList now contains: [1, 3, 5, 8, 9].
// Output:

// The program prints the sorted ArrayList: Sorted ArrayList: [1, 3, 5, 8, 9].