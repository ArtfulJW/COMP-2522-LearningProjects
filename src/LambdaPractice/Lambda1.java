package LambdaPractice;

interface Printable{
    void print(String prefix, String suffix);
}
 

public class Lambda1 {
    
    static void printThing(Printable input) {
        input.print("A", "!");
    }
    
    public static void main(String[]args) {
        Printable printable = (p, s) -> System.out.println(p + " Meow" + s);
        printThing(printable);
    }
}
