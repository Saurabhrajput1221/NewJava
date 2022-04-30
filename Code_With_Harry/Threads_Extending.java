// import javax.sound.sampled.SourceDataLine;

class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("My Thread is Running");
            i++;

        }

    }

}

class MyThread2 extends Thread {
    public void run() {

        int i = 0;
        while (i <= 10) {
            System.out.println("Thread2 for chatting with her...");
            // System.out.println("I am sad...");
            i++;
        }
    }
}

public class Threads_Extending {
    public static void main(String[] args) {
        System.out.println("Threads using Extending class");
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
