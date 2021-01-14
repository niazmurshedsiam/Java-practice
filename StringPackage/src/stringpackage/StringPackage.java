
package stringpackage;

public class StringPackage {

  
    public static void main(String[] args) {
       StringBuffer sb = new StringBuffer("siam");
        System.out.println(sb);
        sb.append(" khan");
        sb.append(25); 
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
    }
    
}
