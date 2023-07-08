package javaCodes.day11;

public class base implements Parent1, Parent2 {
    public void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        base b = new base();
        b.printHello();
    }
}
