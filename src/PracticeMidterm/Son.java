package PracticeMidterm;

/*
 * Line 13: Error.
 * Because the Super class talk() method has a final keyword, the subclass
 * may not override it. 
 * 
 */

class Father {
    public final void talk(){
        System.out.println("Manners");
    }
}
public class Son extends Father {
    public final void talk(){
        System.out.println("Sloppy");
    }
    public static void main(String[] args){
        Son s = new Son();
            s.talk();
    }
}
