
package bildderprintdeleteadding;


public class BildderPrintDeleteAdding {

    
    public static void main(String[] args) {
      StringBuilder str = new StringBuilder("Niaz");
        System.out.println("Str = "+str);
        str.append(" Murshed");
        System.out.println(str);
        str.append( 25);
        str.append( 23.567);
        System.out.println(str);
        str.delete(2,7);
        System.out.println(str);
    }
    
}
