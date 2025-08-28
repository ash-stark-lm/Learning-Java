//Compile-time polymorphism
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public void printInfo(int age) {
        System.out.println("Age: " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);

    }
}

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.age = 24;
        s.name = "John";
        s.printInfo(s.name);
        s.printInfo(s.age);
        s.printInfo(s.name, s.age);
    }
}
