
package abstractclassshapeoop37;


public class Cycle extends Shape {
  Cycle(double r){
       super(r,r);
    }
    void area(){
        double result = Math.PI * dim1 * dim2;
         System.out.println("Triangle = "+result);
    }   
}
