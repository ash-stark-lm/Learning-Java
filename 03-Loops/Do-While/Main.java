
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 1);
        // runs at least once even if condition is false
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 20);
    }
}
