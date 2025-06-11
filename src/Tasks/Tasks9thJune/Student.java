package Tasks.Tasks9thJune;
//Create a class Student with a constructor to initialize name and age. Print both using a display method.
public class Student {
    private String name;
    private int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Student Name -> "+name);
        System.out.println("Student Age -> "+age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Neeya Pingale",22);
        Student s2 = new Student("Shradha Pingale",31);
        s1.display();
        s2.display();
    }
}