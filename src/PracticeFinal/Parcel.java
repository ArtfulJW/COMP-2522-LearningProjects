package PracticeFinal;

class Wrapping {
    private int i;
    public Wrapping(int x) { i = x; }
    public int value() { return i; }
}

public class Parcel {
    public Wrapping wrapping(int x) {
        
        return new Wrapping(x){
            private int i;
            public int value () {
                return (47*i);
            }
        };
        //return an anonymous inner class object of Wrapping type
        //with overloaded method “public int value (){ return 47*i;}”
    }
    public static void main(String[] args) {
        Parcel p = new Parcel();
        Wrapping w = p.wrapping(10);
    }
}