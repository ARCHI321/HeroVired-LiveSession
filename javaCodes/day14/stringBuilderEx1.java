package javaCodes.day14;

public class stringBuilderEx1 {
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sb = new StringBuilder(s);
        StringBuffer sf = new StringBuffer("tutorial");
        System.out.println(sf.reverse());

        // String is immutable
        // StringBuilder & StringBuffer is mutable

        // StringBuilder is faster as it is non-synchronized
        // StringBuffer is slow as it is synchronized
    }
}
