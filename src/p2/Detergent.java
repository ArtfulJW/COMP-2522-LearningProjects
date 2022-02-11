package p2;

//: reusing/Detergent.java
//Inheritance syntax & properties.

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.print(x);
    }
}

public class Detergent extends Cleanser {
//Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }

//Add methods to the interface:
    public void foam() {
        append(" foam()");
    }

//Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.print(x);
        System.out.print("Testing base class:");
        Cleanser.main(args);
    }
} 

class Acid extends Detergent {
    public void scrub() {
        append(" Acid Scrub");
        super.scrub();
    }
    public void sterilize() {
        append(" Sterilize");
    }
    public static void main(String[]args) {
        Acid acid = new Acid();
        acid.scrub();
        acid.sterilize();
        System.out.print(acid);
    }
}

/*
   * Output: Cleanser dilute() apply() Detergent.scrub() scrub() foam() Testing
   * base class: Cleanser dilute() apply() scrub()
   */// :~