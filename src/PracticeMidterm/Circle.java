package PracticeMidterm;

/*
 * Predict the outcome:
 * 
 * "creating shape"
 * "Draw Circle, radius = 0"
 * "finished drawing shape"
 * "Circle has radius = 5"
 * 
 * 1. Instantiate class Shape
 * 2. Print "creating shape"
 * 3. draw method call, from class Circle.
 * 4. Print "finished drawing shape" (Radius is not instantiated yet, hence 0)
 * 5. Instantiate class Circle (radius is 5)
 * 6. Print "Draw Circle, radius = 5"
 * 
 */

abstract class Shape {
    void draw(){
        System.out.println("no shape yet");
    }

    Shape(){
        System.out.println("creating shape");
        draw();
        System.out.println("finished drawing shape");
    }
}

public class Circle extends Shape {
    int radius = 1;

    Circle(int r){
        radius = r;
        System.out.println("Circle has radius = "+radius);
    }

    void draw(){
        System.out.println("Draw Circle, radius = "+radius);
    }

    public static void main(String[] args) {
        new Circle(5);
    }
}