package javaCodes.day6;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class errorHandling {

    public static void main(String[] args) throws InvalidAgeException {
        try {

            // int i=10/0;
            // int[] a1 = {1,2,3,4,5};
            // // System.out.println(i);
            // System.out.println(a1[8]);
            int age = -18;
            if (age < 0) {
                throw new InvalidAgeException("AGE CANNOT BE NEGATIVE");
            }

        } catch (Exception e) {
            // System.out.println("An exception was occurred , as denominator was 0");
            System.out.println("error occurred " + e.getMessage());
            // e.printStackTrace();

        } finally {
            System.out.println("This piece will executed everytime,whether there is an exception or not.");
        }
    }
}
