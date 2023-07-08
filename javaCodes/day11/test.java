package javaCodes.day11;

public class test {
    public static void getMessage() {
        System.out.println("Hello");
    }

    public int getCount() {
        return (1);
    }

    public static void main(String[] args) {
        getMessage();
        test obj = new test();
        System.out.println(obj.getCount());
        // obj.getMessage();
        test.getMessage();
    }
}
