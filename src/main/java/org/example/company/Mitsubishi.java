package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override()
    public String startEngine(){
        System.out.println("the Mitsubishi's engine is starting");
        return getClass().getSimpleName();
    }
    @Override()
    public String accelerate(){
        System.out.println("the Mitsubishi is accelerating");
        return getClass().getSimpleName();
    }
    @Override()
    public String brake(){
        System.out.println("the Mitsubishi is braking");
        return getClass().getSimpleName();
    }
}
