package PracticeMidterm;

/*
 * There is an error thrown at Line 12.
 * The true problem lies in the syntax of the constructor. It is defined with 
 * the keyword 'void', which is wrong. It cannot have the return type 'void'
 * 
 * Solution:
 * Remove the keyword 'void' from the constructor definition.
 */

public class Awake {
    /*
     * Remove the 'void' keyword.
     * public Awake(String time){
     *      System.out.println("Time is " + time);
     * }
     */
    public void Awake(String time) {
        System.out.println("Time is " + time);
    }
    public static void main(String[]args) {
        Awake a = new Awake("up!");
    }
}
