
package stringreplace;


public class StringReplace {


    public static void main(String[] args) {
       String S1 = " This_is_my_country ";
        System.out.println(S1);
        String S2 = S1.replace("i","j");
        System.out.println(S2);
        String S3[] = S1.split("_");
        for (String X : S3) {
            System.out.println(X); 
        }
        
        
    }
    
}
