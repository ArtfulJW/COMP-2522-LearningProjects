package PracticeFinal;

import java.io.FileNotFoundException;

public class Example {
    public void open() throws FileNotFoundException{
        System.out.println("attempting to open file");
        throw new FileNotFoundException();
    }

    public void close() throws Exception {
        System.out.println("attempting to close file");
        throw new Exception();
    }

    public static void main(String[] args) throws Exception{
        Example e = new Example();
        try{
            e.open();
            System.out.println("after opening file");
        }finally{
            System.out.println("finally");
            e.close();
            System.out.println("after closing file");
        }
            System.out.println("end of program");
    }
}
