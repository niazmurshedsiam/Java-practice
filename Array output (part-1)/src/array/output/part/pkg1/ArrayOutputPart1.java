
package array.output.part.pkg1;

public class ArrayOutputPart1 {

   
    public static void main(String[] args) {
       int num[][] = new int[4][5];
       int k=0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                
                num[row][col] = k;
                System.out.print(" "+k);
                k++;
                
            }
            System.out.println();
            
            
        }
        System.out.println("output = ");
          for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                
                System.out.printf(" "+num[row][col]);
            }
             System.out.println();
            
        }
       
        
    }
    
}
