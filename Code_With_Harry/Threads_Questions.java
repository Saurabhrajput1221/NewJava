// import java.nio.channels.spi.SelectorProvider;

// code is same fo all questions...
class GoodMorning extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("Good Morning...");
            i++;
        }
    }
}

class welcome extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            /*************************** */
            // question 2 ans
            // try {
            // Thread.sleep(1000);
            // } catch (Exception e) {
            // System.out.println(e);
            // }
            /****************************** */
            System.out.println("Welcome...");
            i++;
        }
    }
}

public class Threads_Questions {
    public static void main(String[] args) {
        System.out.println("Threads Questions...");
        // Above code is same fo all questions...
        // Question 1 ans
        GoodMorning G = new GoodMorning();
        welcome W = new welcome();
        G.start();
        W.start();

        // question 3 ans

        // G.start();
        // G.setPriority(5);
        // W.start();
        // W.setPriority(9);

        // question 3 ans
        // get state

        // System.out.println(G.getState());
        // question 4 ans
        // Current thread method in Threads ...
        System.out.println(Thread.currentThread().getState());

    }
}
