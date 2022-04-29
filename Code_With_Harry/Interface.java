
interface Bicycle {
    void applyBrake(int decrement);

    void speedup(int increment);

    int a = 55;
}

interface MotorCycle {
    void electric();

    void petrol(int pet);
}

class AvonCycle implements Bicycle, MotorCycle {
    void BlowHorn() {
        System.out.println("pee poo poo.....");

    }

    public void applyBrake(int decrement) {
        System.out.println("applying brake");
    }

    public void speedup(int increment) {
        System.out.println("Applying Speed up");
    }

    public void electric() {
        System.out.println("This is electric vehicle");

    }

    public void petrol(int pet) {
      
        System.out.println("This is petrol vechicle");
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("Interfaces.....");
        AvonCycle Objcreate = new AvonCycle();
        // We are access data of Bicycle interface data.
        Objcreate.applyBrake(1);

        System.out.println(Objcreate.a);

        // We are access data of Motorcycle interface data.

        Objcreate.electric();
        // you can pass argumnets also
        Objcreate.petrol(1);

    }
}
