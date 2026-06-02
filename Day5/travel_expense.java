import java.util.Scanner;

public class travel_expense {

    // Method to calculate travel cost
    static double calculateTravelCost(double distance, double mileage, double petrolPrice) {

        double petrolNeeded = distance / mileage;

        double travelCost = petrolNeeded * petrolPrice;

        return travelCost;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Travel Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter Vehicle Mileage (km/litre): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter Petrol Price per Litre: ");
        double petrolPrice = sc.nextDouble();

        // Method call
        double cost = calculateTravelCost(distance, mileage, petrolPrice);

        System.out.println("Estimated Travel Cost: " + cost);

        sc.close();
    }
}