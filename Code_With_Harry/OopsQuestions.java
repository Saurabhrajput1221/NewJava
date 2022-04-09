// problem 1
// class Employee {
//      int salary;
//      String name;
//      String sname;

//     public int getsalary(){
//         return salary;
        
//     }
//     public String getname(){
//         return name;
//     }
//     public String setname(){
//         return sname;
//     }
// }

// // problem 2

class squre {
    int side;
    public int area(){
        return side*side;
    }
    public int parimeter(){
        return 4 * side;
    }
}


public class OopsQuestions {
    public static void main(String[] args) {
        System.out.println("Oops Questions...");
        // // problem 1 calling
        // Employee Saurabh = new Employee();
        // Saurabh.salary = 65000;
        
        // System.out.println("getsalary Method");
        // int mysalary = Saurabh.getsalary();
        // System.out.println(mysalary);
        
        // System.out.println("getname Method");
        // Saurabh.name = "Myname"; 
        // String Nameofmethod = Saurabh.getname();
        // System.out.println(Nameofmethod);

        // System.out.println("setname Method");
        // Saurabh.sname = "This is my set name Saurabh";
        // String SetMethod = Saurabh.setname();
        // System.out.println(SetMethod);

        // // problem 2 
        squre mySqure = new squre();
        mySqure.side =3;
        // mySqure.parimeter = 5;
        System.out.println(mySqure.area());
        System.out.println(mySqure.parimeter());


    }
}


