package oop.OopDemo.Interface;

public interface MyInterface {//编译之后还会产生.class文件
    //接口中只有两个东西：常量、抽象方法
     String name = "fada";//接口中常量默认前缀 public static final
     double PI = 3.14159;
     void run();//接口中，方法默认是public abstract
     double sum(double num1,double num2);
}
