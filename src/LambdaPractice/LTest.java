package LambdaPractice;

public class LTest {
    public static void main(String[]args) {
//        new Thread(new Runnable() {
//            public void run() {
//                System.out.println("hello world!");
//            }}).start();
        
        Runnable R = ()->{
            System.out.println("hello world!");
        };
        
        Thread thread = new Thread(R);
        thread.start();
        
    }
}
