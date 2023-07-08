package javaCodes.day13;

public interface StdDfOne {
    public String getName();

    public static int getNameOne() {
        System.out.println("example of static method");
        int i = 1, j = 2;
        int k = i + j;
        return k;
    }

    public default String getNameTwo() {
        return "example of default method";
    }
}
