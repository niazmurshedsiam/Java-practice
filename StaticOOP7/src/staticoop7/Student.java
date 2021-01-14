
package staticoop7;


public class Student {
    String name;
    String id;
    static String university_name = "DIU";
    Student(String n,String i){
        name = n;
        id = i;
        
    }
    void DI()
    {
        System.out.println("Name = "+name);
        System.out.println("ID = "+id);
        System.out.println("university_name = "+university_name);
        System.out.println("\n\n");
    }
}
