
package decimaltobinary;

public class DecimaltoBinary {

   
    public static void main(String[] args) {
        int Dicimal = 16;
        String Binary = Integer.toBinaryString(Dicimal);
        System.out.println(Binary);
        String hex = Integer.toHexString(Dicimal);
        System.out.println(hex);
        String Octal = Integer.toOctalString(Dicimal);
        System.out.println(Octal);
        
    }
    
}
