package org.example;

public class Singleton {
    public static Singleton singleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (singleton == null){
            System.out.println("Creating new singleton");
            singleton = new Singleton();
        }
        else {
            System.out.println("Singleton Already Created");
        }
        return singleton;
    }

}
