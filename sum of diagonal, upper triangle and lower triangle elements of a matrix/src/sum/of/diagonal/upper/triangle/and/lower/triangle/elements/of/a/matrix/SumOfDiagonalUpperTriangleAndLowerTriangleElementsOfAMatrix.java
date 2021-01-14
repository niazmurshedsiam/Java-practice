
package sum.of.diagonal.upper.triangle.and.lower.triangle.elements.of.a.matrix;

import java.util.Scanner;


public class SumOfDiagonalUpperTriangleAndLowerTriangleElementsOfAMatrix {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int A[][] = new int[3][3];
     int sumofdiagonaelement = 0;
     int sumofupperelement = 0;
     int sumoflowerelement = 0;
        System.out.println("Enter your array element input A = "); 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col);
               A[row][col]= input.nextInt();  
            }
            System.out.println();
          
        }
            System.out.println("Enter your array element output A = "); 
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if(row==col)
                {
                    sumofdiagonaelement = sumofdiagonaelement + A[row][col];
                }
                if(row<col)
                {
                   sumofupperelement = sumofupperelement + A[row][col];
                }
                if(row>col)
                {
                     sumoflowerelement = sumoflowerelement + A[row][col];
                }
            }
          
        }
        System.out.println(sumofdiagonaelement);
        System.out.println(sumofupperelement);
        System.out.println(sumoflowerelement);
    
     
    }
    
}
