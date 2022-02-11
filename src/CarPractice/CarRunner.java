package CarPractice;

class AutoBodyShop {
    
    public void switchEngine(Car inputCar, String inputEngine) {
        inputCar.carEngine.setEngine(inputEngine);
        updateClient(inputCar);
    }
    
    public void switchTransmission(Car inputCar, String inputTransmission) {
        inputCar.carEngine.engineTransmission.setTransmission(inputTransmission);
        updateClient(inputCar);
    }
    
    public void updateClient(Car inputCar) {
        System.out.println("Changed your specs to...");
        System.out.println(inputCar.toString());
    }
    
    public void inspect(Vehicle inputVehicle) {
        if (inputVehicle instanceof Vehicle) {
            System.out.println("Upon inspection, this is indeed a vehicle.");
        }
    }
    
}

public class CarRunner {
    
    public static void main(String[]args) {
        // Instantiate Car 
        Car A = new Car("V8", "Manual", "Ferrari");
        AutoBodyShop C = new AutoBodyShop();
        // Get Engine Type
        //System.out.println(A.getEngineType());
        // Get Transmission Type
        //System.out.println(A.getTransmissionType());
        // toString (Car)
        System.out.println(A.toString());
        
        C.inspect(A);
        
        C.switchEngine(A, "V10");
        C.switchTransmission(A, "Automatic");
        
        if (A instanceof Car) {
            A.horn();
        }
        
    }
    
}
