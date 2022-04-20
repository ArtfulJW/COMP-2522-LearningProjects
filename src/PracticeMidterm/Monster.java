package PracticeMidterm;

/*
 * Error in line 29, method boo is undefined for type GeneralI.
 * The interface GeneralI does not have any implementation of the method boo().
 * 
 * Solution:
 * Implement method boo in the interface GeneralI.
 */

interface GeneralI{
    //public void boo();
}

class Scary implements GeneralI{
    public void boo() {
        System.out.println("Boo");
    }
}

class UnHappy extends Scary{
    public void boo() {
        System.out.println("Hoo");
    }
}

public class Monster {
    public static void foo(GeneralI x) {
        x.boo();
    }
    public static void main(String[]args) {
        foo(new UnHappy());
    }
}
