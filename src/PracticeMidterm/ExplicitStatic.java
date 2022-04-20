package PracticeMidterm;

/*
 * Predict the outcome:
 * 
 * 
 * Execution sequence:
 * Parent Class -> Sub Class
 * Static Attribute - Static Code Block -> 
 * Common Attribute - Constructing Code Block -> 
 * Constructing Method -> 
 * Common Code Block (where method is called before execution)
 */


class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup c1;
    static Cup c2;
    static {
        c1 = new Cup(1);
        c2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    static Cups x = new Cups();
    static Cups y = new Cups();
    
    public static void main(String[] args) {
        System.out.println("Inside main()");
        
    }
}