public class ConstructureEx {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(10);
        System.out.println(c1.mileage);
        System.out.println(c2.mileage);


    }
}

class Car{
    int seats;
    int wheels;
    double weight;
    double mileage;
    Car(){
        mileage = 5;
    }
    Car(int numberOfSeats){
        this();
        seats = numberOfSeats;
    }
}