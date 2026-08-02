package OOPs;
public class Car{
     String name;
     int year;
     String model;
     public Car(String name,int year,String model){
        this.name=name;
        this.year=year;
        this.model=model;
     }
     public void print(){
        System.out.print(name +" " +year +" "+model);
        
     }

}
class Main{
    public static void main(String [] args){
       Car maruti=new Car("maruti",2004,"x8");
       maruti.print(); 
    }
}