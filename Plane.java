package oop.OopDemo.Interface;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying!");
    }

    @Override
    public void fuelLoss() {
        System.out.println("Plane's fuelLoss is high!");
    }

    public void attack() {
        System.out.println("The plane is hitting!");
    }
}
