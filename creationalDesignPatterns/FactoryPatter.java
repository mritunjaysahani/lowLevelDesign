package creationalDesignPatterns;
interface Vehicle{
  void start();
  void stop();
}

// Concrete vehicle classes remain the same
 class Car implements Vehicle {
    @Override 
  public void start() {
    System.out.println("Car is starting...");
  }
  @Override 
  public void stop() {
    System.out.println("Car is stopping...");
  }
}

 class Truck implements Vehicle {
    @Override 
  public void start() {
    System.out.println("Truck is starting...");
  }
  @Override 
  public void stop() {
    System.out.println("Truck is stopping...");
  }
}

 class Bike implements Vehicle {
    @Override 
  public void start() {
    System.out.println("Bike is starting...");
  }
  @Override 
  public void stop() {
    System.out.println("Bike is stopping...");
  }
}
 class VehicleFactory {
  public static Vehicle getVehicle(String vehicleType) {
    if (vehicleType.equals("Car")) {
      return new Car();
    } else if (vehicleType.equals("Truck")) {
      return new Truck();
    } else if (vehicleType.equals("Bike")) {
      return new Bike();
    } else {
      throw new IllegalArgumentException("Unknown vehicle type");
    }
  }
}
public class FactoryPatter {
   public static void main(String[] args) {
    Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
    vehicle1.start();
    vehicle1.stop();
    Vehicle vehicle2 = VehicleFactory.getVehicle("Truck");
    vehicle2.start();
    vehicle2.stop();
    Vehicle vehicle3 = VehicleFactory.getVehicle("Bike");
    vehicle3.start();
    vehicle3.stop();
  } 
}
