interface Mycamera2 {
    void takesnap();

    void recordvideo();
}

interface Mywifi2 {
    String[] getnetwork();

    void connetToNetwork(String network);
}

class myCellPhone2 {
    void callNumber(int n) {
        System.out.println("calling..." + n);

    }

    void pickCall(int m) {
        System.out.println("PickUp..." + m);
    }
}

class Mysmartphone2 extends myCellPhone2 implements Mycamera2, Mywifi2 {
    public void takesnap() {
        System.out.println("taking snap...");
    }

    public void recordvideo() {
        System.out.println("recording video...");
    }

    public String[] getnetwork() {
        System.out.println("Getting List of networks...");
        String[] networklist = { "harry ", "Rohit ", "jay" };
        return networklist;
    }

    public void connetToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        System.out.println("This is polymorphism..");
        // // we can acess only Mycamera inteface data
        // Mycamera2 cam = new Mysmartphone2();
        // cam.takesnap();
        // cam.recordvideo();
        // // this is not accepted
        // // cam.getnetwork();

        // // we can excess only Mywifi inteface data
        // Mywifi2 wifi = new Mysmartphone2();
        // wifi.getnetwork();
        // wifi.connetToNetwork("jio...");

        // we can excess all intefaces data.
        Mysmartphone2 alldata = new Mysmartphone2();
        alldata.callNumber(1234567890);
        alldata.getnetwork();
        alldata.takesnap();
        alldata.connetToNetwork("Airtel...");

    }
}