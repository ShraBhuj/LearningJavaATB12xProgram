package Tasks.Task12thJune_Method_Overriding;

public class Animal {
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound()
    {
        System.out.println("Dog makes a sound of barking like woof woof");
    }
}

class Cat extends Animal{
    @Override
    public void sound()
    {
        System.out.println("Cat makes a sound of meowing like meow meow");
    }
}