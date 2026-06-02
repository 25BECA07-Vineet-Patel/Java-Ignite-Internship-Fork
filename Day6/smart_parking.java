import java.util.Scanner;

class SmartParkingSystem {
    String vehicleNumber;
    int hoursParked;
    String vehicleType;
    double parkingFee;

    SmartParkingSystem(String vehicleNumber, int hoursParked, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.hoursParked = hoursParked;
        this.vehicleType = vehicleType;

        if (vehicleType.equalsIgnoreCase("Bike")) {
            parkingFee = hoursParked * 10;
        } else if (vehicleType.equalsIgnoreCase("Car")) {
            parkingFee = hoursParked * 30;
        } else if (vehicleType.equalsIgnoreCase("Bus")) {
            parkingFee = hoursParked * 50;
        } else {
            parkingFee = 0;
            System.out.println("Invalid Vehicle Type!");
        }
    }

    void display() {
        System.out.println("\nVehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Hours Parked   : " + hoursParked);
        System.out.println("Parking Fee    : Rs " + parkingFee);
    }
}

public class smart_parking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Hours Parked: ");
        int hoursParked = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Vehicle Type (Bike/Car/Bus): ");
        String vehicleType = sc.nextLine();

        SmartParkingSystem vehicle = new SmartParkingSystem(vehicleNumber, hoursParked, vehicleType);

        vehicle.display();

        sc.close();
    }
}