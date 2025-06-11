package Tasks.Tasks9thJune;



//Create a Rectangle class. Pass length and breadth via constructor, calculate and print area.
public class RectangleArea {

    private int length,breadth;

    RectangleArea(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public void calculateArea()
    {
        double area = length * breadth;
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Area of the Rectangle is:" + area );

    }

    public static void main(String[] args) {
        RectangleArea ra1= new RectangleArea(4,5);
        ra1.calculateArea();
    }

}
