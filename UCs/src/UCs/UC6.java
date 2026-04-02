package UCs;
import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for Bogie -> Capacity
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display all entries using entrySet()
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example: fast lookup
        System.out.println("\nCapacity of Sleeper: " +
                bogieCapacityMap.get("Sleeper"));
    }
}