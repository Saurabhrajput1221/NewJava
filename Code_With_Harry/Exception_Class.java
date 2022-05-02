// import java.io.PrintStream;

class MyException extends Exception {
    public String toString() {

        return "I am toString method...";

    }

    public String getMessage() {

        return "I am getMessage...";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        System.out.println("Exception Class in java...");

        try {

            // Below line is necessary
            throw new MyException();
            // System.out.println("Welcome...");

        } catch (Exception e) {

            System.out.println(e.toString());
            System.out.println(e.getMessage());
            // e calls toSrting method...
            System.out.println(e);
            // printStackTrace is not an error...
            e.printStackTrace();
             // getLocalizedMessage calls getMessage method...
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getCause());
            System.out.println(e.getClass());
            System.out.println(e.getSuppressed());
            System.out.println(e.hashCode());
            e.notify();
           e.notifyAll();
           

        }
    }
}
