package Tasks.Task12thJune_superkeyword;

public class Employee {
    public void displayDetails()
    {
        System.out.println("Name: John Wick");
        System.out.println("Position:Employee");
    }
}

class Manager extends Employee
        {
            @Override
            public void displayDetails()
            {
                System.out.println("Department:Sales");

                // Call parent class method using super
                super.displayDetails();
            }
        }