package OOPs.privateConstructor;

import OOPs.privateConstructor.Singleton;

class Singleton {
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
public class SingletonConstructor{
    public static void main(String[] args){
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1==s2);

    }

}
