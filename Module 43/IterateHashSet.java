import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("date");
        hashSet.add("elderberry");

        // Using an iterator to iterate through the HashSet
        Iterator<String> iterator = hashSet.iterator();

        // Print each element
        System.out.println("Iterating through the HashSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

// Dry Run
// Initialization:

// A HashSet<String> named hashSet is created.
// Elements "apple", "banana", "cherry", "date", and "elderberry" are added to
// hashSet.
// Before Iteration:

// The HashSet hashSet contains elements, but the order is not specified since
// HashSet does not maintain any order.
// Using an Iterator:

// An Iterator<String> named iterator is created for the hashSet using the
// iterator() method.
// The while (iterator.hasNext()) loop is used to iterate through the HashSet.
// In each iteration, iterator.next() is called to get the next element and
// print it.
// Iteration Steps:

// The loop iterates through each element of the HashSet.
// The elements are printed in an unspecified order because HashSet does not
// guarantee any order.
// Output:

// The program prints: Iterating through the HashSet:
