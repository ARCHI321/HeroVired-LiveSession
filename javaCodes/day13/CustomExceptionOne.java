package javaCodes.day13;

class invalidAgeExeption extends Exception {
    public invalidAgeExeption(String message) {
        super(message);
    }
}

public class CustomExceptionOne {
    public static void main(String[] args) throws invalidAgeExeption {

        int age = 14;
        if (age < 18) {
            throw new invalidAgeExeption("Age is less than 18");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}
