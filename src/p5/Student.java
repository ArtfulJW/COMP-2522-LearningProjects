package p5;
public class Student {
    int numStudents = 0;

    public Student() {
        numStudents++;
    }



public static void main(String[] args){
    Student s1, s2, s3;
    s1= new Student();
    s2= new Student();
    s3= new Student();
    System.out.println("Total number of students is " +s3.numStudents);
    }
}