public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            int a = 10;
            int b = 0;
            int c = a / b;    // risky code
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program ended");
    }
}
