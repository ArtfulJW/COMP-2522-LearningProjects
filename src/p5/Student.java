package p5;

import java.util.Scanner;

class Admin {
    
}

public class Student {
    
    ID studentID;
    int THING = 0;
    
    class ID {
        
        // Fields
        String num;
        String name;
        
        // Constructor
        ID (String num, String name) {
            this.num = num;
            this.name = name;
        }
        
        public String getName() {
            return this.name;
        }
        
        public String toString() {
            System.out.println("THING: " + Student.this.THING);
            return ("Student ID:\nID Number: " + this.num + "\nName: " + this.name); 
        }
    }
    
    String inputID() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Student ID: ");
        return s.next();
    }
    
    String inputName() {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Student Name: ");
        return s.next();
    }
    
    ID assignID(String num, String name) {
       return new ID(num, name); 
    }
    
    
    public Student() {
        studentID = assignID(inputID(),inputName());
    }
    
    public String toString() {
        return ("My name is " + studentID.getName() + "\n" + studentID.toString());
    }

    public static void main(String[] args){
        // First ID created on creation of a new Student.
        Student s1 = new Student();
        
        
        
        // Second ID Created Manually
        //Student.ID s1ID2 = s1.new ID(s1.inputID(), s1.inputName());
        
        System.out.println(s1.toString());
        
    
    }
}