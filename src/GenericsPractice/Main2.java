package GenericsPractice;

import java.util.ArrayList;

class CopyMachine<T>{
    
    public <T extends Number> void copy(ArrayList<T> list) {
        for (T i : list) {
            System.out.println(i);

        }
    }
    
}

public class Main2 {
       
    public static void main(String[]args) {
        CopyMachine<Integer> cm = new CopyMachine<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        al.add(1);
        al.add(2);
        
        cm.copy(al);
        
    }
    
    
    
}
