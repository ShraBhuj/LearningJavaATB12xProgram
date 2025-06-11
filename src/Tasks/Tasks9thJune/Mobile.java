package Tasks.Tasks9thJune;
//Create a class Mobile Use constructor overloading:
//First constructor → takes only brand
//Second constructor → takes brand and price
public class Mobile {

    private String brand;
    private double price;

    Mobile(String brand){
        this.brand=brand;
    }

    Mobile(String brand,double price ){
        this.brand=brand;
        this.price=price;
    }

    public void displayDetails()
    {
        System.out.println("Mobile brand is :"+ brand);
        System.out.println("Mobile price is: "+ price);
    }

    public static void main(String[] args) {
        Mobile m1= new Mobile("SamSung");
        Mobile m2= new Mobile("Motorola", 500000);
        m1.displayDetails();
        m2.displayDetails();
    }
}
