// Base class Vehicle
class Vehicle {
    // Method to start the engine
    public void startEngine() {
        System.out.println("The vehicle's engine starts.");
    }

    // Method to stop the engine
    public void stopEngine() {
        System.out.println("The vehicle's engine stops.");
    }
}

// Subclass Car that extends Vehicle
class Car extends Vehicle {
    // Override startEngine method for Car
    @Override
    public void startEngine() {
        System.out.println("The car's engine starts with a key or push button.");
    }

    // Override stopEngine method for Car
    @Override
    public void stopEngine() {
        System.out.println("The car's engine stops with a key or push button.");
    }
}

// Subclass Motorcycle that extends Vehicle
class Motorcycle extends Vehicle {
    // Override startEngine method for Motorcycle
    @Override
    public void startEngine() {
        System.out.println("The motorcycle's engine starts with a kick or button.");
    }

    // Override stopEngine method for Motorcycle
    @Override
    public void stopEngine() {
        System.out.println("The motorcycle's engine stops by turning off the ignition.");
    }
}

// Main class to test the functionality
public class Problem_4 {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        // Test the startEngine and stopEngine methods for Car
        myCar.startEngine();
        myCar.stopEngine();

        // Test the startEngine and stopEngine methods for Motorcycle
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
