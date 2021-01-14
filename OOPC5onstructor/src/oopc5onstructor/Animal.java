
package oopc5onstructor;

public class Animal {
              String animal_name;
String animal_nickname;
int age;
Animal()
{
    System.out.println("Not Value");
}
Animal (String a,String n, int ag )
{
    animal_name = a;
    animal_nickname = n;
    age = ag;

}
void DI(){
     System.out.println("Animal Name = "+animal_name);
     System.out.println("Animal Nickname = "+animal_nickname);
     System.out.println("Animal Age = "+age);
     System.out.println("\n\n");
}
}
