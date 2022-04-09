package PracticeMidterm;

/* For this example, the problem is at Line 15.
 * Notice how in the Beta class, the foo() method's access modifier is different. Because of this, it will throw a compile-time error.
 * To fix this, keep the access modifier the same as it's parent definition of foo() method, which is 'public'.
 */

class Alpha {
    public void foo(){
        System.out.println("Alpha");
    }
}

public class Beta extends Alpha {
    /*
     * Answer:
     * Keep the access modifier the same as the inherited class.
     * public void foo(){
     *      System.out.println("Beta");
     * }
     */
    protected void foo(){
        System.out.println("Beta");
    }
    //DO NOT ALTER MAIN
    public static void main(String[] args){
        Alpha a = new Beta();
        a.foo();
    }
}