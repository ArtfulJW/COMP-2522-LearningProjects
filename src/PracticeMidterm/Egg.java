package PracticeMidterm;

/*
 * Breakdown Attempt 1:
 * Egg object e is created.
 * Egg e has and int i.
 * Egg e has a reference Yolk y to inner class Yolk.
 * Note: Inner class has access to outer class, unless it's static.
 * e.y.setI Call: Set i as given value, 5.
 * Print out Egg e's int i
 * 
 * Answer:
 * The reason the code is not working as expected is because the reference 
 * to the inner class has NOT BEEN instantiated yet. Even though Egg has 
 * a reference to Yolk y, it doesn't mean anything until a Yolk y has been created.
 */

public class Egg {
    private int i;
    Yolk y;
    // Answer: Yolk y = new Yolk();
    class Yolk {
        public void setI(int value){ i = value;}
    }
    public static void main(String[] args){
        Egg e = new Egg();
        e.y.setI(5);
        System.out.println("i="+e.i);
    }
}