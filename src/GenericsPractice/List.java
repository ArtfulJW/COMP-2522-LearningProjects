package GenericsPractice;

interface Iterator<T>{
    boolean hasNext();
    T next();
}

public class List <T>{
    int pos = 0;
    T[] data;
    
    class MyIterator<T> implements Iterator<T>{
        public T next() {
            return data[pos++];
        }
        public boolean hasNext() {
            return ((pos>0) && (pos < data.length));
        }
    }
}
