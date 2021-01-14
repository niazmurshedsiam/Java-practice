
package overloadingconstructoroop44;


public class Teacher {
    String name,gender;
    int phone;
    Teacher(){
        System.out.println("Not found");
    }
    Teacher(String n,String g,int p){
        name = n;
        gender = g;
        phone = p;
        
    }
    Teacher (String n,String g){
        name = n;
        gender = g;
        
    }
    void DI(){
        System.out.println("Name "+name);
        System.out.println("Gender "+gender);
        System.out.println("Phone "+phone);
    }
    
}
