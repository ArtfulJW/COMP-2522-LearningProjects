package LambdaPractice;

interface D {
    enum TYPE {
        MULT, ADD
    }
    public void display(int start, int end, LambdaPractice.Table.TYPE mult);
}


public  class Table {
    enum TYPE {
        MULT, ADD
    }

    public void display(int start, int end, TYPE t) {
        for (int i = start; i < end; i++) {
            for (int j = start; j < end; j++) {
                if (t == TYPE.MULT)
                    System.out.printf("%3d ", (i * j));
                else
                    System.out.printf("%3d ", (i + j));
            }
            System.out.println("");
        }
    }
    


    public static void main(String[] args) {
//        Table t = new Table();
//        t.display(1, 10, TYPE.MULT);
        
        
        D d = (int start, int end, TYPE t)->{
            for (int i = start; i < end; i++) {
                for (int j = start; j < end; j++) {
                    if (t == TYPE.MULT)
                        System.out.printf("%3d ", (i * j));
                    else
                        System.out.printf("%3d ", (i + j));
                }
                System.out.println("");
            }
        };
        
        d.display(1, 10, TYPE.MULT);
        
    }
}