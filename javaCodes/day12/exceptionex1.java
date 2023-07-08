package javaCodes.day12;

public class exceptionex1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        try {
            // int c = b / a;
            // System.out.println(c);
            String s = null;
            int d = s.length();
        }

        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am good");

        }

    }
}
