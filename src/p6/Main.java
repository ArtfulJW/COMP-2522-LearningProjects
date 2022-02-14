package p6;

interface GeneralI {
    public void boo();
}
class Scarry implements GeneralI {
    public void boo(){
        System.out.println("Boo");
    }
}
class UnHappy extends Scarry {
    public void boo(){
        System.out.println("Hoo");
    }
}
public class Main {
    public static void main(String[] args){
        UnHappy x = new UnHappy();
        foo(x);
    }
    private static void foo(GeneralI x){
        x.boo();
    }
}