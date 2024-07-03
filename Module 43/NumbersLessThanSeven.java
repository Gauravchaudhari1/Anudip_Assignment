import java.util.TreeSet;

public class NumbersLessThanSeven {
    public static void main(String[] args) {
        // Create a TreeSet and add some numbers
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(10);
        treeSet.add(5);

        // Find numbers less than 7
        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) treeSet.headSet(7);

        // Print the numbers less than 7
        System.out.println("Numbers less than 7: " + lessThanSeven);
    }
}

// Dry Run
// Initialization:

// A TreeSet<Integer> named treeSet is created.
// Elements 3, 8, 1, 6, 2, 10, and 5 are added to treeSet.
// Automatic Sorting:

// The TreeSet automatically sorts its elements in natural order.
// After adding elements, treeSet contains: [1, 2, 3, 5, 6, 8, 10].
// Finding Numbers Less Than 7:

// The headSet(7) method is called on treeSet.
// This method returns a view of the portion of the set whose elements are
// strictly less than 7.
// The resulting lessThanSeven set contains: [1, 2, 3, 5, 6].
// Output:

// The program prints: Numbers less than 7: [1, 2, 3, 5, 6].