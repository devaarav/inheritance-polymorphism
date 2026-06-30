abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public abstract void drive();
}

class Car extends Vehicle {
    public int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void drive() {
        System.out.println("Car is being driven on the road.");
    }
    public int getNumDoors() {
        return numDoors;
    }
}

class Truck extends Vehicle {
    public double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Truck is being driven on the road.");
    }
    public double getPayloadCapacity() {
        return payloadCapacity;
    }
}

public class veihical_polymorphism {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2020, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2021, 2000);

        car.drive();
        truck.drive();
    }
}