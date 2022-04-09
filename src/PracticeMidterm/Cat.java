package PracticeMidterm;

/*
 * No Errors.
 * Output is not like the Desired Output.
 * 
 * Solution:
 * Call super.walk i the Superclass walk() methods.
 * 
 */

class Animal {
    public void walk(){
        System.out.println("Walk like an animal");
    }
}
class Tiger extends Animal {
    public void walk(){
        //super.walk();
        System.out.println("Walk like a Tiger");
    }
}
public class Cat extends Tiger {
    public void walk(){
        //super.walk();
        System.out.println("Walk like a Cat");
    }
    public static void main(String[] args){
        Animal c = new Cat();
        c.walk();
    }
}