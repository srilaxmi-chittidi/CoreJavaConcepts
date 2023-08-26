package com.info;

public class InnerClassesDemo {

    public static void main(String[] args) {
        Car.Wheel cw = new Car.Wheel();
        System.out.println(cw.noOfWheels);

        Car car = new Car();
        Car.Seats seats = car.new Seats();
        System.out.println(seats.noOfSeats);
        final int x =87;
        class Foo{
         // int y =x;
         // System.out.println(y);
        }
    }
}

class Car{


    static class Wheel{
        public int noOfWheels =7;
    }
    class Seats{
        public int noOfSeats = 4;
    }
}



