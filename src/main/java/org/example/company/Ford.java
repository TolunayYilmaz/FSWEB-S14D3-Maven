package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override()
    public String startEngine(){
        System.out.println("the Ford's engine is starting");
        return getClass().getSimpleName();
    }
    @Override()
    public String accelerate(){
        System.out.println("the Ford is accelerating");
        return getClass().getSimpleName();
    }
    @Override()
    public String brake(){
        System.out.println("the Ford is braking");
        return getClass().getSimpleName();
    }
}
