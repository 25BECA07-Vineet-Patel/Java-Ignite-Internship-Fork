import java.util.Scanner;

public class Travel_expense {
    public static void main(String args[]) {
        int dist;
        double petr, pprice, mil, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter travel distance : ");
        dist = sc.nextInt();
        System.out.println("Enter petrol price : ");
        pprice = sc.nextDouble();
        System.out.println("Enter mileage of vehicle : ");
        mil = sc.nextDouble();
        petr = dist / mil; // Calculating total petrol use for journey
        total = petr * pprice;
        System.out.println("Total distance : " + dist);
        System.out.println("Petrol required : " + petr);
        System.out.println("Total Travel cost : " + total);
        sc.close();
    }
}
