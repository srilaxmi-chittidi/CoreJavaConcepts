package com.info;

public class FinalDemo {    //extends MyClass{
    public static void main(String[] args) {
        final MyClass myClass = new MyClass();
        myClass.seats = 6;
       // myClass.wheels = 9;
        System.out.println("No of Seats "+myClass.seats);
        System.out.println("No.of wheels "+myClass.wheels);
    }
}

final class MyClass{
    public int seats;
    final public int wheels =4;
    public  int weight;
    public int topSpeed;
}
