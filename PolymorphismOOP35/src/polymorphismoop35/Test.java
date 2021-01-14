
package polymorphismoop35;


public class Test {
    public static void main(String[] args) {
        Shape [] S = new Shape[3];
           S[0] =new Shape();
        S [1]= new Rectangle(10,20);
        S[2] = new Triangle(20,15);
        for (int i = 0; i < 3; i++) {
            System.out.println(S[i].Area());
        }
    }
}
