package Tasks.Task12thJune_Hierarchical_Inheritance;

public class Main {
    public static void main(String[] args) {
        Car myCar1= new Car();

        myCar1.start_stop();
        myCar1.driveCar();

        System.out.println();

        Bike myBike1= new Bike();
        myBike1.start_stop();
        myBike1.rideBike();

        System.out.println();
    }
}
