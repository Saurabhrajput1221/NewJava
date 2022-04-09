// I did more practice on Custom class
class saurabh {
    int id;
    String Lname;
    int salary;

    public void Details() {
        System.out.println(" My surname  is " + Lname);
        System.out.println(" and my id is " + id);
    }
    public int MoreDetails(){
        return salary ;

    }

}
public class Custom_class {
    public static void main(String[] args) {
        System.out.println("My practice Custom class ");
        saurabh abc = new saurabh();

        abc.id = 45;
        abc.Lname = "Rajput";

        System.out.println(abc.id);
        System.out.println(abc.Lname);

        abc.Details();

        abc.salary = 56000;
        int salary = abc.MoreDetails() ;
        System.out.println(salary);

    }
}



// // You need more and more Practice 
// class Employee {
//     int id;
//     String name;
//     int salary;
//     String Info;

//     public void printDetails() {
//         System.out.println("My id is " + id);
//         System.out.println("and my name is " + name);
//     }

//     public int getsalary() {

//         return salary;

//     }
//     public String Information(){
//         return Info;
//     }

// }

// public class Custom_class {
//     public static void main(String[] args) {
//         // pls do Practice more...
//         Employee harry = new Employee(); // Instantiating a new Employee object

//         // Setting Attributes...
//         harry.id = 55;
//         harry.name = "saurabh";
//         harry.printDetails();

//         harry.salary = 56000;
//         int abc = harry.getsalary();
//         System.out.println(abc);

//         harry.Info = "He is having BMW and own plane....";
//         String moreInfo = harry.Info;
//         System.out.println(moreInfo);

//     }
// }
