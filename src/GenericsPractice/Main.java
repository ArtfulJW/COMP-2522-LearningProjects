package GenericsPractice;

import java.util.ArrayList;

class Printer <T>{
    T thingToPrint;
    
    Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    
    public void print() {
        System.out.println(thingToPrint);
    }
    
}

public class Main {
    
    public static <T> void shout(T thingToShout) {
        
    }
    
    public static <T> void printList(ArrayList<T> list) {
        for (T i : list) {
            System.out.println(i);
        }
    }
    
    public static void main(String[]args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        
        
        printList(integerList);
        
        
        Printer<Double> printer = new Printer<Double>(66.1);
        printer.print();
        
    }
    
}
