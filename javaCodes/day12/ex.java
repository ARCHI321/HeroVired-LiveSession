package javaCodes.day12;

public class ex {
    public static void main(String[] args) {
        // String s1 = new String("Hi");
        // String s2 = new String("Hi");
        // System.out.println(s1.equals(s2));
        // System.out.println(s1 == s2);

        ex x = new ex();
        System.out.println(x.toString());
        System.out.println(x.hashCode());
        System.out.println(x.getClass());
        try {
            x.notify();
        } catch (Exception e) {
            System.out.println(e);
        }

        // System.out.println();
    }
}
