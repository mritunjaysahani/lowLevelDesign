package OOPs.inheritence;
class Animal{
    void eat(){
         System.out.print("This Animal eats food");
    }
}
class Cat extends Animal{
    void walk(){
        System.out.print("This mammal walks");
    }
}
class Dog extends Animal{
    void bark(){
         System.out.print("Dog Barking");
    }
}
public class HierarchicalInheritence {
     public static void main(String args[]){
        Dog tommy=new Dog();
        tommy.bark();
        tommy.eat();
        Cat kitty=new Cat();
        kitty.walk();
        kitty.eat();
    }
}
