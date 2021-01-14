
package oopperameter;


public class Animal {
      String animal_name;
String animal_nickname;
int age;
void SI(String a,String n,int g){
    animal_name = a;
    animal_nickname = n;
    age = g;
}
void DI(){
     System.out.println("Animal Name = "+animal_name);
     System.out.println("Animal Nickname = "+animal_nickname);
     System.out.println("Animal Age = "+age);
     System.out.println("\n\n");
}
}
