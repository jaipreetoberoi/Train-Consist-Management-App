package UCs;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\nBogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}