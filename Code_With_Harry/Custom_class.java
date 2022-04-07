class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getsalary(){
        
        return salary;
         
    }

}
public class Custom_class {
    public static void main(String[] args) {
        // pls do Practice more...
        Employee harry = new Employee();

        harry.id = 55;
        harry.name = "saurabh";
        harry.salary = 56000;

        harry.printDetails();
        harry.getsalary();


    }
}

