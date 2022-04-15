// // package chapter09;


// class Cylinder {
//     // private static final int R = 0;
//     private int height;
//     private int redius;


//     // // Problem 1 ....first way to solve.
//     // public int getRedius() {
//     //     return redius;
//     // }
//     // public void setRedius(int redius) {
//     //  this.redius = redius;
//     // }
//     // public int getHeight(){
//     //     return height;
//     // }
//     // public void setHeight (int height){
//     //   this.height = height;
//     // }

//      // Problem 1 ....second way to solve.
//     public void setHeight(int H){        
//         this.height = H;
//     }
//     public void setRedius(int R){
//         this.redius = R;
//     }
//     public int getHeight(){
//         return height;
//     }
//     public int getRedius(){
//         return redius ;
//     }

//     // // problem No 2
//     // // calculate surfacearea of cylinder.
//     // public double surfacearea(){
//     //     return 2 * Math.PI  * redius * height + 2 * 3.14 * redius * redius; 
//     // }
//     //  // problem No 2
//     // // calculate volume of cylinder.
    
//     // public double volume(){
//     //     return  Math.PI  *   redius * redius *  height ; 
//     // }

//      // problem No 3
//      public Cylinder(int H , int R){
//          height = H;
//          redius = R ;                 
//      }
    



//     }
// public class QuestionsConstructor {
//     public static void main(String[] args) {
//         System.out.println("Questions On Constructor ");

//         // Provblem 1.
//         // Cylinder newCylinder = new Cylinder();
//         // System.out.println("Height of my cylinder is ");
//         // newCylinder.setHeight(12);
//         // System.out.println(newCylinder.getHeight());

//         // System.out.println("Redius of my cylinder is ");
//         // newCylinder.setRedius(9);
//         // System.out.println(newCylinder.getRedius());

//         //  // problem No 2
//         // System.out.println("Surface Area of Cylinder");
//         // System.out.println(newCylinder.surfacearea()); 

//         //  // problem No 2
//         // System.out.println("volume of Cylinder");
//         // System.out.println(newCylinder.volume()); 

//          // problem No 3
//          Cylinder newCylinder = new Cylinder(8, 6);
//          System.out.println(newCylinder.getHeight());
//          System.out.println(newCylinder.getRedius());
            
//     }
// }
