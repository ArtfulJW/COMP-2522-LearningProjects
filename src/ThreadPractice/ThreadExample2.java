package ThreadPractice;

/*
 * To identify a Race Condition, there must be a globally accessed value.
 * If multiple threads are racing to access this global variable, then it is
 * a Race Condition.
 */

public class ThreadExample2 implements Runnable{

    public static int counter = 1; // Global Counter  
    
    public synchronized void incrementCounter() {

        System.out.println(Thread.currentThread().getName() + ": "+ counter);
        counter++;
        
    }
    
    @Override
    public void run() {
        
        while (counter < 20) {
            incrementCounter();
        }
        
    }
    
    public static void main(String []args) {
        ThreadExample2 TE = new ThreadExample2();
        Thread One = new Thread(TE);
        Thread Two = new Thread(TE);
        One.start();
        Two.start();

    }

}
