package javaCodes.day10;

public class multipleInheritance1 implements Printable, Showable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        multipleInheritance1 obj = new multipleInheritance1();
        obj.print();
    }
}