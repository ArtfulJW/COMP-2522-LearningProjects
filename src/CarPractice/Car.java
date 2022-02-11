package CarPractice;

// Practice Composition and Inheritance.

class Transmission{
    //Instance Variables
    String transmissionType;
    
    // Constructor
    public Transmission(String transmissionType) {
        System.out.println("Constructing Transmission.");
        this.transmissionType = transmissionType;
    }
    
    //Getter
    public String getTransmission() {
        return transmissionType;
    }
    
    public void setTransmission(String transmissionType) {
        this.transmissionType = transmissionType;
    }
    
    public String toString() {
        return transmissionType;
    }
}

class Engine{
    //Instance Variables
    String engineType;
    Transmission engineTransmission;
    
    // Constructor
    public Engine(String engineType, String transmissionType) {
        System.out.println("Constructing Engine.");
        this.engineType = engineType;
        this.engineTransmission = new Transmission(transmissionType);
    }
    
    protected String getEngineType() {
        return this.engineType;
    }
    
    protected void setEngine(String engineType){
        this.engineType = engineType;
    }
    
}

class Frame{
    // Instance Variable
    String style;
        
    // Default Constructor
    public Frame() {
        System.out.println("Constructing Frame.");
        this.style = "Ford";
    }
    
    public Frame(String frameStyle) {
        this.style = frameStyle;
    }
    
    protected String getFrameStyle() {
        return this.style;
    }
    
    protected void setFrameStyle(String style) {
        this.style = style;
    }
    
}

class Wheel{
    
}

class Window{
    
}

public class Car extends Vehicle{
    // Instance Variables
    Engine carEngine;
    Frame carFrame;
    
    // Constructor
    public Car(String engineType, String transmissionType, String carFrame) {
        System.out.println("Creating Car..");
        this.carEngine  = new Engine(engineType, transmissionType);
        this.carFrame = new Frame(carFrame);
    }
    
    public String getEngineType() {
        return this.carEngine.getEngineType();
    }
    
    public String getTransmissionType() {
        return this.carEngine.engineTransmission.getTransmission();
    }
    
    public String getFrameStyle() {
        return this.carFrame.getFrameStyle();
    }
    
    public void horn() {
        System.out.println("HONK!");
    }
    
    public String toString() {
        return ("Engine Type: " + this.getEngineType() + 
                "\nTransmission Type: " + this.getTransmissionType() + 
                "\nFrame Style: " + this.getFrameStyle() +  "\n");
    }
    
}
