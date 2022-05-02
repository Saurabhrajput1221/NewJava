public class Throw_Throws {

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Throw and Throws ...");

        try {
            int c = divide(5, 1);
            System.out.println(c);

        } catch (Exception e) {
            System.out.println("This is an Exception...");
        }
    }
}
