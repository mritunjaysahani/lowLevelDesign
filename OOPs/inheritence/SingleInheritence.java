package OOPs.inheritence;
class Animal{
    void eat(){
         System.out.print("This Animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
         System.out.print("Dog Barking");
    }
}
public class SingleInheritence {
    public static void main(String args[]){
        Dog tommy=new Dog();
        tommy.bark();
        tommy.eat();
    }
}
