
package binaryconother;


public class BinaryconOther {

    
    public static void main(String[] args) {
       String Binary ="100001";
       Integer Dicimal1 = Integer.parseInt(Binary,2);
        System.out.println(Dicimal1);
        String Octal = "23";
        Integer Dicimal2 = Integer.parseInt(Octal, 8);
        System.out.println(Dicimal2);
        String hexadicimal = "a";
        Integer Decimal3 = Integer.parseInt(hexadicimal, 16);
        System.out.println(Decimal3);
        
        
    }
    
}
