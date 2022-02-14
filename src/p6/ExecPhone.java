package p6;

interface Phone {
    void number();
    void message();
}
abstract class FancyPhone implements Phone {
public void number(){
System.out.println("The number you are calling is not available");
}
public void message(String m){
        System.out.println("The message is "+m);
    }
}
public class ExecPhone extends FancyPhone implements Phone {
    public static void main(String[] args){
        ExecPhone exec = new ExecPhone();
        exec.number();
        exec.message(“Hello”);
    }
}