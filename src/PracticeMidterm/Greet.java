package PracticeMidterm;

interface Greeting {
    String sendGreeting();
}

class Hello implements Greeting {
    public String sendGreeting(){
        return "Hello";
    }
}

class Goodbye implements Greeting {
    public String sendGreeting(){
        return "Goodbye";
    }
}

public class Greet {
    static Greeting g1, g2;

    public static <T> void swap(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args){

        g1 = new Hello();
        g2 = new Goodbye();
        System.out.println(g1.sendGreeting());
        //swap<Goodbye>(g1, g2);
        System.out.println(g1.sendGreeting());
    }
}