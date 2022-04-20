package PracticeMidterm;

/*
 * Big class has a reference s which points to the inner class Small.
 * An object of type "Big" does not have access to the inner classes instance variables by itself.
 * Which means I have to use the reference to Small class that Big class has, called "s" to access 
 * the instance variable "size".
 * 
 * Solution:
 * Use the reference the inner class. (The remote controller that points to the inner class)
 * b.s.size
 */

public class Big {
    
    private Small s = new Small();
    
    private class Small{
        public int size = 1;
    }
    
    public static void main(String[]args) {
        Big b = new Big();
        b.size;
    }
    
}
