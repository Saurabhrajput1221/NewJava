package chapter09;

class MyEmployee {
    private int id;
    private String name;

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

public class Modifier_private {
    public static void main(String[] args) {
        System.out.println("Private modifier...");
        MyEmployee abc = new MyEmployee();
        // abc.id = 56;
        // abc.name = "Salman";

        // setname and getname
        abc.setname("Saurabh");
        System.out.println(abc.getname());

        // SetId and getId
        abc.setId(453);
        System.out.println(abc.getId());

    }
}