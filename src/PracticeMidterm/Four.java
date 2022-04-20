package PracticeMidterm;

/*
 * There is an error thrown at line 18.
 * The problem is that we are assigning an Four object to a variable of type Five
 * Which mean, we are calling class Five's definition of the number() method, which is bad because it's parameter requires an int, and not a double.
 * 
 * Solution: change argument in the definition of the number method in Class Five to take in a double.
 */

class Five {
    public void number(int x){
        System.out.println("Five: " + (x+5));
    }
}
public class Four extends Five {
    public void number(double x){
        System.out.println("Four: " + (x+4));
    }
    public static void main(String[] args){
        Five f = new Four();
        f.number(3.141579);
    }
}