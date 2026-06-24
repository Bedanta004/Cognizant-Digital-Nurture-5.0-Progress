class Vehicle {
  // Method to start a vehicle with basic information
  void start(String vehicleType) {
    System.out.println("Starting a " + vehicleType);
  }

  // Overloaded method to start a vehicle with extra information
  void start(String vehicleType, int speed) {
    System.out.println(
        "Starting a " + vehicleType + " with speed: " + speed + " km/h");
  }
}


public class CompileTimePolymorphism {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();

    // Calls method with one argument
    vehicle.start("Car");

    // Calls overloaded method with two arguments
    vehicle.start("Bike", 60);
  }
}
