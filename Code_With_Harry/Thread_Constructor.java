class Mythr implements Runnable {
    public Mythr(String name) {
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
        Mythr t1 = new Mythr("saurabh");
        Thread gun = new Thread(t1);
        gun.start();
        // System.out.println("This is my thread id" + t1.getName());
        // System.out.println("My thread real name is " + t1.getName());
    }
}
