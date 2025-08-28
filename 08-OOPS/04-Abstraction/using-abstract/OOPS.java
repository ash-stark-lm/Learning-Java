//Not pure abstraction for pure abstractionwe use interfaces
abstract class Animal {
    abstract void walk();// not implementing here

    public void eats() {
        System.out.println("Eats");
    }

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eats();
    }
}
