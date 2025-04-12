package ACT1;

import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.println("Enter details for Car:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String carFuelType = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int numDoors = scanner.nextInt();

        Car car = new Car(carBrand, carSpeed, carFuelType, numDoors);
        System.out.println("\nCar Details:");
        car.displayInfo();

        // Input for Motorcycle
        System.out.println("\nEnter details for Motorcycle:");
        System.out.print("Brand: ");
        String motorcycleBrand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int motorcycleSpeed = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Fuel Type: ");
        String motorcycleFuelType = scanner.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, hasSidecar);
        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();

        scanner.close();
    }
}
