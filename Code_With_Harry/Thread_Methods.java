class Mainthr1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("This is Mainthrd1...");
            i++;
        }
    }
}

class childthr2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("This is childthr2...");
            i++;
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        System.out.println("Thread Methods.....");
        Mainthr1 t1 = new Mainthr1();
        childthr2 t2 = new childthr2();

        t1.start();
        // M.join();
        // Watch video again when try cacth finished...
        // Using join Method when t1 is fully excuted then t2 will be excuted
        try {
            t1.join();
        } catch (Exception e) {
           
            System.out.println(e);
        }
        t2.start();
    }
}
