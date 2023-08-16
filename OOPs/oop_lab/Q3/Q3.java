import java.util.Scanner;

class Vehicle {
    static int nextId = 100001;

    int id;
    String companyName;
    double price;

    public Vehicle(String companyName, double price) {
        this.id = nextId++;
        this.companyName = companyName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Company Name: " + companyName + ", Price: " + price;
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    public LightMotorVehicle(String companyName, double price, double mileage) {
        super(companyName, price);
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mileage: " + mileage;
    }
}

class HeavyMotorVehicle extends Vehicle {
    private double capacityInTons;

    public HeavyMotorVehicle(String companyName, double price, double capacityInTons) {
        super(companyName, price);
        this.capacityInTons = capacityInTons;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity in Tons: " + capacityInTons;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicle type (1 for Light, 2 for Heavy): ");
            int vehicleType = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter company name: ");
            String companyName = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            if (vehicleType == 1) {
                System.out.print("Enter mileage: ");
                double mileage = scanner.nextDouble();
                vehicles[i] = new LightMotorVehicle(companyName, price, mileage);
            } else if (vehicleType == 2) {
                System.out.print("Enter capacity in tons: ");
                double capacityInTons = scanner.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(companyName, price, capacityInTons);
            } else {
                System.out.println("Invalid vehicle type");
                i--; 
            }
        }

        System.out.println("\nVehicle Information:\n");
        for (Vehicle vehicle : vehicles) {
            
            System.out.println(vehicle.toString());
            
        }

        scanner.close();
    }
}
