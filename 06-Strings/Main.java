
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Tony Stark";
        System.out.println(name);
        name = name + " is Ironman";
        System.out.println(name);

        name = "Peter Parker";
        System.out.println(name);

        // String methods
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("Parker"));

        // User Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = sc.nextLine(); // takes whole line as input
        System.out.println("Hello, " + userName + "!");

        // concatenation
        String firstName = "Bruce";
        String lastName = "Wayne";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Strings are immutanle in java meaning once declared we can't change
        // the character
        // Like we can't do => name.charAt(0)='b';
        // we can't modify the string once declared like updat delete any character

        // so to do peter parker-> beter parker
        name = "b" + name.substring(1);
        System.out.println(name);
        // Or we can use string builder

        // Compare strings
        String s1 = "hello";
        String s2 = "hello";

        // Now it works here but it sin't recommedned to compare strings using ==
        // because strings are stored in heap and its reference is stored in stack
        if (s1 == s2) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

        // see this both have different references -> give not equal
        if (new String("hello") == new String("hello")) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

        // Better Approach
        // helo celo -> s1>s2 and so on like first dissimilar character comparison

        if (s1.compareTo(s2) == 0) {
            System.out.println("s1 and s2 are equal");
        } else {
            System.out.println("s1 and s2 are not equal");
        }

    }
}
