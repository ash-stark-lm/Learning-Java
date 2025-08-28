class Shape {
    String color;
}

// in c++ we do inheritance using colon(:)
// e.g class Rectangle : Shape{}
// Base class-> parent class and derived class-> child class

// both rectangle and triangle are using same class shape we can tell this
// Hierarchical Inheritance
class Rectangle extends Shape {
    int length;
    int breadth;
}

class Triangle extends Shape {
    int base;
    int height;
}

public class OOPS {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";

        Rectangle r1 = new Rectangle();
        r1.color = "Blue";

        System.out.println(t1.color);
        System.out.println(r1.color);
    }
}

/*
 * In java we have 4 types of inheritance in c++ we have
 * Single level Inheritance -> one class inherits from one parent
 * Multi Level Inheritance-> like grandson inherits from father who inherits
 * from grandfather
 * Hierarchical Inheritance
 * Hybrid Inheritance -> all mixed up
 * 
 * 
 */