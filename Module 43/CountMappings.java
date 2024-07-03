import java.util.HashMap;

public class CountMappings {
    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("cherry", 5);
        map.put("date", 4);
        map.put("elderberry", 1);

        // Get the number of key-value mappings
        int size = map.size();

        // Print the number of key-value mappings
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}

// Dry Run
// Initialization:

// A HashMap<String, Integer> named map is created.
// Key-value pairs "apple" -> 3, "banana" -> 2, "cherry" -> 5, "date" -> 4, and
// "elderberry" -> 1 are added to map.
// Adding Key-Value Pairs:

// map.put("apple", 3) adds the key "apple" with the value 3 to the map.
// map.put("banana", 2) adds the key "banana" with the value 2 to the map.
// map.put("cherry", 5) adds the key "cherry" with the value 5 to the map.
// map.put("date", 4) adds the key "date" with the value 4 to the map.
// map.put("elderberry", 1) adds the key "elderberry" with the value 1 to the
// map.
// Counting Key-Value Mappings:

// The size() method is called on map.
// This method returns the number of key-value pairs in the map.
// Since there are 5 key-value pairs, size will be 5.
// Output:

// The program prints: Number of key-value mappings in the map: 5.