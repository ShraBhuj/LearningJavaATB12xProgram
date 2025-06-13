package Tasks.Task12thJune_Hierarchical_Inheritance;

public class Vehicle {
    public void start_stop()
    {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle
        {
            public void driveCar()
            {
                System.out.println("This is a Car");
            }
        }

class Bike extends Vehicle
{
    public void rideBike()
    {
        System.out.println("This is Bike");
    }
}