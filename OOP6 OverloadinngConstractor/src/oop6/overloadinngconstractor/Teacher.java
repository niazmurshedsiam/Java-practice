
package oop6.overloadinngconstractor;


public class Teacher {
  String name;
String gender;
int age;
Teacher()
{
    System.out.println("Not Information");
    
}
Teacher(String n,String g)
{
    name = n;
    gender = g;
}
Teacher(String n,String g,int a)
{
    name = n;
    gender = g;
    age = a;
}
void DI()
{
    System.out.println("Teacher Name = "+name);
    System.out.println("Teacher Gender = "+gender);
    System.out.println("Teacher Age = "+age);
}

}
