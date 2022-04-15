// package chapter09;
class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(String Myname, int n) {
        // if your constuctor having same name like your class then it call
        // automatically
        // you can also pass argumnts like
        name = Myname;
        id = n;
    }

    public void setname(String n) {
        name = n;
    }
    public String getname() {
        return name;
    }
    public int setId(int i) {
        return id = i;
    }

    public int getId() {
        return id;
    }
}

public class Constuctors {
    public static void main(String[] args) {
        System.out.println("Constructors...");
        MyMainEmployee xyz = new MyMainEmployee("hello", 89);
        // MyMainEmployee xyz = new MyMainEmployee();

        // xyz.setname("Saurabh");
        // xyz.setId(4546);

        System.out.println(xyz.getId());
        System.out.println(xyz.getname());

    }
}
