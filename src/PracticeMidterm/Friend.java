package PracticeMidterm;

import Friendly.Me;

/*
 * Line 11 Error.
 * This line is throwing an error because the method greet() from 
 * package Friendly, class Me, is not visible from this package.
 * Solution:
 * Define that the function is public, or protected to define if the function
 * is visible.
 */

public class Friend extends Me{
    protected void talk() {
        greet();
        System.out.println("Hi");
    }
    public static void main(String []args) {
        Friend F = new Friend();
        F.talk();
    }
}
