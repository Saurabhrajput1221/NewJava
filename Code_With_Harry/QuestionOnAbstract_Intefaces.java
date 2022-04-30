/***********************/
// // question 1 and 2
// abstract class pen{

//     abstract void write();
//     abstract void refill();
// }
// class Fountainpen extends pen{
//     void write (){
//         System.out.println("write...");
//     }
//     void refill(){
//         System.out.println("refill...");
//     }
//     void changenib(){
//         System.out.println("changing nib...");
//     }
// }
/***********************/

/***********************/
// // Question 3
// class Monkey {
//     void jump() {
//         System.out.println("Jumpping...");
//     }

//     void bite() {
//         System.out.println("Bite apple...");
//     }

// }

// interface BasicAnimals {
//     void eat();

//     void sleep();
// }

// class Human extends Monkey implements BasicAnimals {
//     void speak() {
//         System.out.println("Jay shree ram");
//     }

//     public void eat() {
//         System.out.println("eating...");
//     }

//     public void sleep() {
//         System.out.println("sleeping...");
//     }
// }

/***********************/
// question 4
/***********************/
class Telephone {
    void ring() {
        System.out.println("Ringing...");
    }

    void lift() {
        System.out.println("Lift call...");
    }

    void disconnect() {
        System.out.println("disconneting...");
    }

}

class smartTelephone extends Telephone{
    void smartTele() {
        System.out.println("This is smartTelephone... ");  
    }
}

public class QuestionOnAbstract_Intefaces {
    public static void main(String[] args) {
        System.out.println("QuestionOnAbstract_Intefaces...");
        /***********************/
        // // Question 1 and 2
        // Fountainpen p = new Fountainpen();
        // p.changenib();
        // p.refill();
        // p.write();
        /***********************/

        // question No 3
        /***********************/

        // Human H = new Human();
        // H.bite();
        // H.sleep();
        /***********************/

        // question No 5

        // demonstrate Polymorphism

        // BasicAnimals animal = new Human();
        // animal.eat();

        /***********************/
        // question No 4
    //    smartTelephone tel = new smartTelephone();
    //    tel.disconnect();
       
    }
}
