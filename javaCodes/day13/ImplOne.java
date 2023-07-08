package javaCodes.day13;

public class ImplOne implements StdDfOne {
    @Override
    public String getName() {
        return null;
    }

    public static void main(String[] args) {
        StdDfOne stdfone = new ImplOne();

        System.out.println(StdDfOne.getNameOne());
        System.out.println(stdfone.getNameTwo());
    }

}
