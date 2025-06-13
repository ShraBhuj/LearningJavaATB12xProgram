package Tasks.Task12thJune_Multilevel_Inheritance;

public class Grandparent {
    public void showGrandparent()
    {
        System.out.println("I am the Grandparent");
    }
}

class Parent extends Grandparent{
    public void showParent()
    {
        System.out.println("I am the Parent");
    }
}

class Child extends Parent {
    public void showChild() {
        System.out.println("I am the Child");
    }
}