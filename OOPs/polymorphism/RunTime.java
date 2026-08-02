package OOPs.polymorphism;

class Animal{
    void sound(){
         System.out.print("Animal Sound");
    }
}
class Dog extends Animal{
     void sound(){
         System.out.print("dog barks");
    }
}
public class RunTime  {
   public static void main(String args[]){
    Animal obj=new Dog();
    obj.sound();
   }
}
