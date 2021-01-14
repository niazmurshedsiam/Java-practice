
package llbstatic;


public class Counter {
    static int counter = 0;
    public Counter(){
        Counter.counter++;
        System.out.println("I am no"+Counter.counter);
    }
    public static int getCounter(){
        return counter;
        
    }
    public static void setCounter(int counter){
        Counter.counter=counter;
    }
    
}
