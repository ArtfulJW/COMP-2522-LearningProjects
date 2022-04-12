package PracticeMidterm;

/*
 * Error, Line 14.
 * There is an error because the class that's implementing the interface 
 * has not implemented all of the functions define in the interface "Face",
 * therefore, the class "Head" throws an error saying, it must implement 
 * functions defined in the implemented interface "Face".
 */

interface Face{
    void eyes();
    void mouth();
    void nose();
    void ears();
}

public class Head implements Face{
    public void eyes() {
        
    }
    public void mouth() {
        
    }
    public void nose() {
        
    }
    /*
     * public void ears(){
     * }
     */

}
