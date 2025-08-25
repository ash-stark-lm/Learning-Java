
public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.append(" Stark");
        System.out.println(sb);

        sb.insert(2, "N");
        System.out.println(sb);

        // delete the extra n
        sb.delete(2, 3);
        System.out.println(sb);

        int length = sb.length();
        System.out.println(length);
    }
}
