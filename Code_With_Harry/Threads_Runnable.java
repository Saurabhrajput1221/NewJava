class MyThreadRunnable implements Runnable {
    // run method is necessary
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("I am Thread 1...");

            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("I am Thread 2...");

            i++;
        }
    }
}

public class Threads_Runnable {
    public static void main(String[] args) {
        System.out.println("Threads using Runnable Interfaces...");

        // 1st way to access Runnable Threads...
        MyThreadRunnable Bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(Bullet1);
        MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(Bullet2);
        gun1.start();
        gun2.start();

        // 2nd way to access Runnable Threads...
        // MyThreadRunnable t1 = new MyThreadRunnable();
        // MyThreadRunnable2 t2 = new MyThreadRunnable2();
        // t1.run();
        // t2.run();
    }
}
