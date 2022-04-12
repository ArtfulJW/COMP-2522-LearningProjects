package ThreadPractice;

class Examine {
    static int[] data = new int[10];

    public static void dance(int value) {
        int i = 0;
        while (i < data.length) {
            for (int j = 0; j < 100; j++)
                ;
            data[i] = value;
        }
    }

    static Runnable launch(int id){
        return new Runnable(){
            public void run(){
                dance(id);
            }
        };
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(launch(1));
        Thread t2 = new Thread(launch(2));
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
    }
}