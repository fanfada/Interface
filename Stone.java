package oop.OopDemo.Interface;

public class Stone implements Flyable,Attack,MyInterface{//可以实现多个接口
    int num=0;
    @Override
    public void fly() {
        System.out.println("Stone was throwing!");
    }

    @Override
    public void fuelLoss() {
        System.out.println("Stone is not fueling!");
    }

    @Override
    public void attack() {
        System.out.println("Stone can attacking!");
    }

    @Override
    public void run() {

    }

    @Override
    public double sum(double num1, double num2) {
        return 0;
    }
}
