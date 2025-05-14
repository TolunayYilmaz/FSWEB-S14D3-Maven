package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private  String name;
    private  int wheels;
    public Car(int cylinders, String name) {
        this.engine=true;
        this.wheels=4;
        this.cylinders = cylinders;
        this.name = name;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    @Override()
    public String toString(){
        return name;
    }
    @Override()
    public boolean equals(Object object){
     if(((Car)object).getName().equals(this.name)&&((Car)object).cylinders==this.cylinders)
     {
         return true;
     }
     else{
         return  false;
     }

    }
    public String startEngine(){
        System.out.println("Returned value: " + getClass().getSimpleName());

        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println("Returned value: " + getClass().getSimpleName());

        return "the car is accelerating";
    }
    public String brake(){

        System.out.println("Returned value: " + getClass().getSimpleName());

        return "the car is braking";
    }

}
