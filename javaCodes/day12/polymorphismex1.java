package javaCodes.day12;

class test {
    int a;
    int b;

    test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum(int c) {
        System.out.println("sum of 3 variables");
        return (a + b + c);
    }

    public int getSum() {
        System.out.println("sum of 2 variables");
        return (a + b);
    }
}

public class polymorphismex1 {
    public static void main(String[] args) {
        test obj = new test(2, 3);
        System.out.println(obj.getSum());
        System.out.println(obj.getSum(4));

    }
}
