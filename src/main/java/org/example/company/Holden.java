package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override()
    public String startEngine(){
        System.out.println("the Holden's engine is starting");
        return getClass().getSimpleName();
    }
    @Override()
    public String accelerate(){
        System.out.println("the Holden is accelerating");
        return getClass().getSimpleName();
    }
    @Override()
    public String brake(){
        System.out.println("the Holden is braking");
        return getClass().getSimpleName();
    }
}
