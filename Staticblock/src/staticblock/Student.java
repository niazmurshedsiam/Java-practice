
package staticblock;


public class Student {
    static String name;
    static String id;
    
    static {
        id = "173-35-2262";
        name = "siam";
    }
    void DI(){
        System.out.println(id);
        System.out.println(name);
    }
    
}
