
package palimdome;


public class Palimdome {

  
    public static void main(String[] args) {
     String S1 = "121";
     StringBuffer sb = new StringBuffer(S1);
     String S2 = sb.reverse().toString();
     if(S1.equals(S2))
         
     {
         System.out.println("palimdom number");
         
     }
     else
     {
          System.out.println("not palimdom number");
     }
     
    }
    
}
