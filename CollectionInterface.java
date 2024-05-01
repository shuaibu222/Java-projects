import java.util.*;

public class CollectionInterface {
    public static void main(String[] args) {
        // Creating a Collection (ArrayList) of Strings
        Collection<String> names = new ArrayList<>();

        // Adding elements to the Collection
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Displaying the elements of the Collection
        System.out.println("Names: " + names);

        // Removing an element from the Collection
        names.remove("Bob");


        // Checking if an element is present in the Collection
        if (names.contains("Charlie")) {
            System.out.println("Charlie is present in the collection.");
        }

        // Iterating through the Collection using an Iterator
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the Collection
        names.clear();

        // Checking if the Collection is empty
        if (names.isEmpty()) {
            System.out.println("The collection is empty.");
        }
    }
}
