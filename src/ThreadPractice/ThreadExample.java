package ThreadPractice;

import java.util.concurrent.TimeUnit;

/*
 * To identify a Race Condition, there must be a globally accessed value.
 * If multiple threads are racing to access this global variable, then it is
 * a Race Condition.
 */

import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample implements Runnable{

    public static int counter = 1; // Global Counter  
    
    static ReentrantLock counterLock = new ReentrantLock(true);
    
    public void incrementCounter() {
        try {
            while(!counterLock.tryLock(1, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + " Waiting for Lock");
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        try {
            Thread.sleep(2000);
        } catch (Exception e){
            
        }

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
