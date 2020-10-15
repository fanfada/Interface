package oop.OopDemo.Interface;

public interface Attack extends Flyable{//接口可以继承，并且支持多继承
    char isHit = '0';
    void attack();
}
