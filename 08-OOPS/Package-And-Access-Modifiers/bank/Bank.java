package bank;//should match with its folder name

public class Bank {
    private String name;// Now this isnt accesible outside

    public void setBankName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }
}
