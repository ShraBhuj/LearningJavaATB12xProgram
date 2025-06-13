package Tasks.Task12thJune_Single_Inheritance;

public class Animal {
    public void sound()
    {
        System.out.println("The animal makes a sound"); //Parent class
    }
}

//subclass that inherits from animal
class Dog extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("The dog barks woof woof");
    }
}