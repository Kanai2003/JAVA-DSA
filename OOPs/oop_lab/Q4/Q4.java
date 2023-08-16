class Vehicle{
    protected int regnNumber;
    protected int speed;
    protected String ownerName;
    public Vehicle(int regnNumber, int speed, String ownerName){
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.ownerName = ownerName;
    }
    public void showData(){
        System.out.println("Regn Number: " + regnNumber+ " , Speed: " + speed + " , Owner Name: " + ownerName);
    }
}

class Car extends Vehicle{
    private String manufacturerName;

    public Car(int regnNumber, int speed, String ownerName, String manufacturerName) {
        super(regnNumber, speed, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

class Bus extends Vehicle{
    private int routeNumber;

    public Bus(int regnNumber, int speed, String ownerName, int routeNumber) {
        super(regnNumber, speed, ownerName);
        this.routeNumber = routeNumber;
    }
    @Override
    public void showData(){
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}

public class Q4 {
    public static void main(String[] args) {
        
        Car c = new Car(1001, 100, "Kanai", "Maruti");
        c.showData();
        
        Bus b = new Bus(2001, 80, "Pancho", 1);
        b.showData();   
    }
}
