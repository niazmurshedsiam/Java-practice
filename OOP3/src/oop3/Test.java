
package oop3;


public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.animal_name = "DOG";
        animal.animal_nickname = "mimo";
        animal.age = 2;
       animal.DI();
        Animal animal1 = new Animal();
        animal1.animal_name = "Cat";
        animal1.animal_nickname = "mao";
        animal1.age = 2;
       animal1.DI();
    }
  
}
