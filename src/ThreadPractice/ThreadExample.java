package ThreadPractice;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample implements Runnable{

    public static int counter = 1; // Global Counter  
    
    static ReentrantLock counterLock = new ReentrantLock(true);
    
    public void incrementCounter() {
        counterLock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + ": "+ counter);
            counter++;
        } finally {
            counterLock.unlock();
        }
        
    }
    
    @Override
    public void run() {
        
        while (counter < 20) {
            incrementCounter();
        }
        
    }
    
    public static void main(String []args) {
        ThreadExample TE = new ThreadExample();
        Thread One = new Thread(TE);
        Thread Two = new Thread(TE);
        One.start();
        Two.start();
    }

}
