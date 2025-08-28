
interface Animal {
    void walk();// by default public and abstract

    void eat();

}

class Student {
    String name;
    static String school; // only once memory is allocated while functions memory are allocated
                          // everytie=me its
                          // called
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    public void eat() {
        System.out.println("Eats");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        // we can change the value once and updates for all student

        Student.school = "ABC School";
        Student s1 = new Student();
        s1.name = "John";
        System.out.println(s1.name);
        System.out.println(s1.school);

    }
}

// Static keyword --> it is used to create static variable e.g sschool name same
// for all students of the school
