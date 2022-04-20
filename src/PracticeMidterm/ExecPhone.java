package PracticeMidterm;

/*
 * The problem is in the class ExecPhone.
 * FancyPhone class defines the interface Phone methods, but the message method is not the same.
 * Therefore, message() method has not been formally implemented in the class Fancyphone that has implemented Phone Interface.
 * 
 * Solution:
 * 1. Implement the message Method from Phone
 * 
 */

interface Phone {
    void number();
    void message();
}

abstract class FancyPhone implements Phone {
    public void number(){
        System.out.println("The number you are calling is not available");
    }
    public void message(String m){
        System.out.println("The message is "+m);
    }
}
public class ExecPhone extends FancyPhone implements Phone {
    
    public static void main(String[] args){
        ExecPhone exec = new ExecPhone();
        exec.number();
        exec.message("Hello");
    }
    
    /* Solution:
     * Implement unimplemented methods from Interface Phone
     * public void message() {}
     */

    
}