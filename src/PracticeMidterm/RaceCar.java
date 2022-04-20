package PracticeMidterm;

/*
 * There is no instance of RaceCar. Thus assigning a value to driverName cannot be possible
 * because there is no instance of a RaceCar's driverName to assign to.
 * 
 * Solution:
 * Instantiate a new RaceCar, then assign to THAT RACECAR'S driverName instance member variable.
 */

public class RaceCar {
    String driverName;
    
    public static void main(String[]args) {
        //RaceCar A = new RaceCar();
        if (args[0] != null) {
            //A.driverName = args[0];
            driverName = args[0];
        }
    }
    
}
