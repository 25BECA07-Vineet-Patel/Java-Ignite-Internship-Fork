import java.util.HashSet;

public class hash_set {
    public static void main(String[] args) {

        // Create a HashSet called participants
        HashSet<String> participants = new HashSet<>();

        // Add participant names
        participants.add("Arun");
        participants.add("Priya");
        participants.add("Ravi");
        participants.add("Meena");
        participants.add("Karthik");
        participants.add("Priya"); // Duplicate
        participants.add("Ravi"); // Duplicate
        participants.add("Divya");
        participants.add("Arun"); // Duplicate

        // Display all registered participants
        System.out.println("Registered Participants:");
        for (String name : participants) {
            System.out.println(name);
        }

        // Display total number of unique participants
        System.out.println("\nTotal Unique Participants: " + participants.size());
    }
}