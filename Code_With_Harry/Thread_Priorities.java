class Mythrds extends Thread {
    public Mythrds(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This is a Thread..." + this.getName());
    }
}

public class Thread_Priorities { 
    public static void main(String[] args) {
        System.out.println("Thread Priorities...");
        Mythrds t1 = new Mythrds("hello1");
        Mythrds t2 = new Mythrds("hello2");
        Mythrds t3 = new Mythrds("hello3");
        Mythrds t4 = new Mythrds("hello4");
        Mythrds t5 = new Mythrds("hello5 (most Important)");

        // t5 having most Prioritie ...t5 will be printing most of the times if we are using loop for same problem
        t5.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
