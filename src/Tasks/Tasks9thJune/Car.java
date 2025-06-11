package Tasks.Tasks9thJune;

//Define a Car class with brand, model, and price. Initialize using constructor and print car details.
public class Car {
    private String model;
    private String brand;
    private double price;

    Car(String model, String brand,double price) {

        this.model = model;
        this.price = price;
        this.brand = brand;
    }

    void display() {
        System.out.println("Model of car is:" + model);
        System.out.println("Price of the car is:" + price);
        System.out.println("Brand of the car is:" + brand);

    }


    public static void main(String[] args) {
        Car c1 = new Car("Creta", "Maruti Suzuki",1100000);
        c1.display();
    }
}