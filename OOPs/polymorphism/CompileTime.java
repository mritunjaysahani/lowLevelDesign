package OOPs.polymorphism;
class Vehicle{
    public void start(String vehicaltype){
        System.out.println("Name :"+ vehicaltype);
    }
    public void start(String vehicaltype,int age){
        System.out.println("Name :"+ vehicaltype +"Age :" +age);
    }
}
public class CompileTime {
    public static void main(String args[]){
        Vehicle maruti=new Vehicle();
        maruti.start("wagonR");
        Vehicle suv=new Vehicle();
        suv.start("kia",4);
    }
}
 