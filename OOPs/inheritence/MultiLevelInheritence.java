package OOPs.inheritence;

class Animal{
    void eat(){
         System.out.print("This Animal eats food");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.print("This mammal walks");
    }
}
class Dog extends Mammal{
    void bark(){
         System.out.print("Dog Barking");
    }
}
public class MultiLevelInheritence {
     public static void main(String args[]){
        Dog tommy=new Dog();
        tommy.bark();
        tommy.walk();
        tommy.eat();
    }
}
