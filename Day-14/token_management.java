import java.util.Queue;
import java.util.LinkedList;

public class token_management {
    public static void main(String[] args) {

        // Create a Queue called patientQueue
        Queue<String> patientQueue = new LinkedList<>();

        // Add patients to the queue
        patientQueue.offer("Arun");
        patientQueue.offer("Priya");
        patientQueue.offer("Ravi");
        patientQueue.offer("Meena");
        patientQueue.offer("Karthik");

        // Display all patients waiting in the queue
        System.out.println("Patients Waiting in Queue:");
        System.out.println(patientQueue);

        // Serve the first patient
        String servedPatient = patientQueue.poll();

        // Display the served patient
        System.out.println("\nServed Patient: " + servedPatient);

        // Display the remaining patients in the queue
        System.out.println("\nRemaining Patients in Queue:");
        System.out.println(patientQueue);
    }
}