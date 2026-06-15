package exception_handling;

public class CustomException {
    public static void main(String[] args) {
        int age = 10;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }

            System.out.println("Valid age");

            System.out.println("=================>>>>>>>>>>>>>>>>>>>>>");
            checkAge(age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }

}


class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}