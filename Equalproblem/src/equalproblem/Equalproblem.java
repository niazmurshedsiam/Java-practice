
package equalproblem;

public class Equalproblem {

 
    public static void main(String[] args) {
    String S1 = "siam";
    String S2 = new String ("Siam");
        System.out.println("S1 = "+S1);
        if(S1.equalsIgnoreCase(S2))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    
    }
    
}
