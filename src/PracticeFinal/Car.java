package PracticeFinal;

class Race{
    public static final int MAX = 5;
    public static final int MIN = 1;
    
    private static int data = Race.MIN;
    
    public static int getData() {
        return data;
    }
    public static void incData() {
        if (data < Race.MAX) {
            data++;
        }
    }
    public static void foo() throws Exception{
        while (data <Race.MAX) {
            System.out.println("Data: " + data + " Thread: " + Thread.currentThread().getName());
            incData();
        }
    }
}

public class Car implements Runnable{
    public void run() {
        try {
            Race.foo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[]args) throws Exception{
        Thread t1 = new Thread (new Car());
        Thread t2 = new Thread (new Car());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Race.getData());
    }
}
