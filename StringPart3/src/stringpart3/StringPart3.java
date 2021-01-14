
package stringpart3;


public class StringPart3 {

  
    public static void main(String[] args) {
     String Country = "  Bangladesh is My Country  ";
        System.out.println(Country);
        char ch = Country.charAt(0);
        System.out.println("Ch is = "+ch);
        int value = Country.codePointAt(1);
        System.out.println("Value is = "+value);
        int pos = Country.indexOf("de");
        System.out.println("Pos is = "+pos);
        pos = Country.lastIndexOf("n");
        System.out.println("Pos is = "+pos);
          String s = Country.trim();
          System.out.println("S is = "+s);
        
    }
    
}
