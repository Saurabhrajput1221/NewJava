// Using Thread ...

class Mythr extends Thread {
    public Mythr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i <= 1) {
            System.out.println("I am a Thread...");
            i++;
        }
    }
}
/***********************************/
// Using Runnable ...

class Mythr2 implements Runnable {
    public Mythr2(String name) {
        // super(name);
    }

    public void run() {
        int i = 0;
        while (i <= 1) {
            System.out.println("I am a Thread...");
            i++;
        }
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        System.out.println("This is Thread Constructor...");
        // Using Runnable ...
        System.out.println("Using Runnable ...");
        Mythr t1 = new Mythr("saurabh");
        Thread gun = new Thread(t1);
        gun.start();


        // Using Thread ...
        System.out.println("Using Thread ...");
        // Mythr M = new Mythr("Rajput");
        // M.start();
        // System.out.println("This is my thread id " + M.getId());
        // System.out.println("My thread real name is " + M.getName());
    }
}
