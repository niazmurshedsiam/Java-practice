
package constructoroop43;

public class Teacher {
      String name;
String gender;
int phone;
Teacher (String n,String g,int p){
    name = n;
    gender = g;
    phone = p;
}
void DI(){
    System.out.println("Name = "+name);
    System.out.println("Gender = "+gender);
    System.out.println("Phone = "+phone);
}
}
