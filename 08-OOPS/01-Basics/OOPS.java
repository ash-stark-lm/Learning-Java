class Pen {
    // Properties or variables=> data
    String color;
    String type;
    String company;

    // Methods --> Members

    public void write() {
        String brand = company;
        System.out.println("Writing...  with " + brand);
    }

    public void printColor() {

        // this keyword refers to current object whoever is calling it
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    // Non -parametrised constructor -> Java by default has a default constructor
    // constructor called only once when object is created
    // In c++ we need to write out destructor in java it is by default _> we have a
    // garbage collector in java it automatically deletes the object and all which
    // is not used
    Student() {
        System.out.println("Constructor called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor --> User has to define it by himself in java
    // in c++ we have copy constructor by default
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Fountain";
        pen1.company = "Parker";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ball";
        pen2.company = "Bic";

        pen1.printColor();
        pen2.printColor();

        // Student()-> constructor
        Student s1 = new Student(); // creating an object memory heap ke andar object allocate hogi

        s1.name = "John";
        s1.age = 24;
        s1.printInfo();

        Student s2 = new Student("Thor", 24);
        s2.printInfo();

        Student s3 = new Student(s2);
        s3.printInfo();

    }

}
