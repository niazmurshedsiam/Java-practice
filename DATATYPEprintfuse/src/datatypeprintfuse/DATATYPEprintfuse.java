
package datatypeprintfuse;


public class DATATYPEprintfuse {

    
    public static void main(String[] args) {
        boolean b;
        short s=21;
        int i;
        char c;
        float f = 3.14f;
        double d = 3.14162;
        b = true;
        c = 'a';
        i = 10;
        
        System.out.printf("Boolean b = %b\n",b);
        System.out.printf("Short s = %d\n",s);
        System.out.printf("Integer i = %d\n",i);
        System.out.printf("Charecter c = %c\n",c);
        System.out.printf("Float f = %.1f\n",f);
        System.out.printf("Double d = %.3f\n",d);
        
    }
    
}
