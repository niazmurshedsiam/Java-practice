
package abstractclassshapeoop37;


public class Rectriangle extends Shape {
    Rectriangle(double dim1,double dim2){
       super(dim1,dim2);
    }
    void area(){
        double result = dim1*dim2;
        System.out.println("Rectriangle = "+result);
    }
    
}
