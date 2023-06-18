package javaCodes.day10;

interface prints {
    void print();
}

class A6 implements prints {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}