package org.example.arge;

public class HybridCar extends CarSkeleton {

    private  double avgKmPerLitre;
    private  int cylinders;
    private  int batterySize;

    public HybridCar(String name,String description,double avgKmPerLitre,int batterySize,int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
        this.batterySize=batterySize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override()
    public void startEngine(){
        System.out.println("HybridCar araba çalıştı");
    }
    @Override()
    public void drive(){
        System.out.println("HybridCar araba gidiyor");
        this.runEngine();
    }
}
