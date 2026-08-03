package OOPs.Abstraction;
abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("Sleeping . . ...");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Barking . . ...");

    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meowing . . ...");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal myDog=new Dog();
        myDog.makeSound();
        myDog.sleep();
        Animal myCat=new Dog();
        myCat.makeSound();
        myCat.sleep();

    }
}
