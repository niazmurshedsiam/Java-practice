
package polymorphismoop34;

public class Rectangle extends Shape {
    double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
        
    }
    double Area(){
        return length*width;
    }
}
