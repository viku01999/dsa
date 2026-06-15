package exception_handling;

public class Example1 {

    public static void main(String[] args) {
        int n = 10;
        int m = 0;
        int age = 20;
        try {
            if (age < 25) {
                throw new IllegalArgumentException("Invalid age");
            }

            int res = n / m;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Always execute");
        }
    }

}
