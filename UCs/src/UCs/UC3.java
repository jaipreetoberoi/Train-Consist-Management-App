package UCs;
import java.util.HashSet;
import java.util.Set;

public class UC3UC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add Bogie IDs (including duplicates)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // duplicate
        bogieIds.add("B102"); // duplicate

        // Display final set
        System.out.println("\nBogie IDs in the Train:");
        System.out.println(bogieIds);

        // Show size to confirm duplicates removed
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}