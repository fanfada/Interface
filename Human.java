package oop.OopDemo.Interface;

public class Human implements Flyable {
    public void fly() {
        System.out.println("I'm a person, I'm flying!");
    }

    @Override
    public void fuelLoss() {
    }
}
