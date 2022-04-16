package p4;

interface Something {

    public void alert();
    
}

class Instrument implements Something {
    int id;
    
    // Constructor
    Instrument(){
        System.out.println("Created Instrument");
    }
    
    public void alert() {
        System.out.println("INSTRUMENT ALERT");
    }
    
    public void maintain() {
        System.out.println("Maintain Instrument");
    }
    
}

class Percussion extends Instrument{
    
    // Constructor
    public Percussion(){
        System.out.println("Created Percussion");
    }
    
    public void alert() {
        System.out.println("Percussion ALERT");
    }
    
}

class Wind extends Instrument{
    
    // Constructor
    public Wind(){
        System.out.println("Created Wind");
    }
    
    public void alert() {
        System.out.println("WIND ALERT");
    }
    
}

class Brass extends Wind{
    
    // Constructor
    public Brass(){
        System.out.println("Created Brass");
    }
    
    public void alert() {
        System.out.println("Brass ALERT");
    }
    
}

public class Main {
    
    public static void main(String[]args) {
        Instrument Orchestra[] = {new Brass(),new Wind(), new Percussion()};
        
        System.out.println("ALERT TIME");
        for (Instrument i : Orchestra) {
            if (i instanceof Something) {
                i.alert();
            }
        }
        
    }
    
}


