
package wrapperprimativeobjectiveop;


public class WrapperprimativeobjectiveOP {

   
    public static void main(String[] args) {
        //primative - Objective
        int X = 30;
        Integer Z = X;//Integer valueOf(x) autoboxing
        System.out.println("Z = "+Z);
        
        Integer Y = Integer.valueOf(X);
        System.out.println("Y = "+Y);
    }
    
}
