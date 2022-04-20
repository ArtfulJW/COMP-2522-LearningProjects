package PracticeMidterm;

/*
 * Output:
 * Mastif
    Dog
    Kohkoh
    Ridgeback
    Mastif
    Mastif 
 */

interface Animal {
    void draw();
}

class Dog implements Animal {
    public void draw(){
        System.out.println("Dog");
    }
}

class Kohkoh extends Dog {
    public void draw(){
        super.draw();
        System.out.println("Kohkoh");
    }
}

class Mastif extends Dog implements Animal {
    public void draw(){
        System.out.println("Mastif");
    }
}

class Ridgeback extends Kohkoh {
    Mastif m = new Mastif();

    public void draw(){
        m.draw();
        super.draw();
        System.out.println("Ridgeback");
    }
}

public class Kennel {
    public static void main(String[] args) {
        Animal a;
        Dog d;
        d = new Mastif();
        a = new Ridgeback();
        a.draw();
        d.draw();
        a = d;
        a.draw();
    }
}