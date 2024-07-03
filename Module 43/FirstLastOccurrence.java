import java.util.LinkedList;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");
        linkedList.add("banana");
        linkedList.add("date");
        linkedList.add("cherry");
        linkedList.add("banana");

        // Specify the element to find
        String element = "banana";

        // Get the first and last occurrence of the specified element
        int firstOccurrence = linkedList.indexOf(element);
        int lastOccurrence = linkedList.lastIndexOf(element);

        // Print the results
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First occurrence of '" + element + "': " + firstOccurrence);
        System.out.println("Last occurrence of '" + element + "': " + lastOccurrence);
    }
}

// Dry Run
// Initialization:

// A LinkedList<String> named linkedList is created.
// Elements "apple", "banana", "cherry", "banana", "date", "cherry", and
// "banana" are added to linkedList.
// Before Finding Occurrences:

// The LinkedList linkedList contains: ["apple", "banana", "cherry", "banana",
// "date", "cherry", "banana"].
// Specify the Element to Find:

// The element to find is "banana".
// Finding Occurrences:

// The indexOf(element) method is called to find the first occurrence of
// "banana".
// It returns 1 because "banana" first appears at index 1.
// The lastIndexOf(element) method is called to find the last occurrence of
// "banana".
// It returns 6 because "banana" last appears at index 6.
// Output:

// The program prints the LinkedList: LinkedList: [apple, banana, cherry,
// banana, date, cherry, banana].
// The program prints the first occurrence of "banana": First occurrence of
// 'banana': 1.
// The program prints the last occurrence of "banana": Last occurrence of
// 'banana': 6.
