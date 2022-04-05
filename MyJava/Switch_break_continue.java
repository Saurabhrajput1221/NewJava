import java.util.Scanner;
public class Switch_break_continue {
    public static void main(String[] args) {
        



    System.out.println ("Hello World");
//              if else if and else conditions
    Scanner sc = new Scanner (System.in);
    // int choice = sc.nextInt ();
    // int a = sc.nextInt ();
    // int b = sc.nextInt ();
//              if(choice == 1){

//              }else if(choice==2){

//              }
//              else if(choice==3){

//              }else if(choice==4){

//              }else if(choice==5){

//              }
//              else if(choice==6){

//              }else{

//              }

//     switch (choice)
//       {
//       case 1:
// 	System.out.println (a + b);
// 	break;
// 	case 2:System.out.println (a - b);
// 	break;
// 	case 3:System.out.println (a*b);
// 	break;
// 	case 4:System.out.println (a/b);
// 	break;
// 	case 5:System.out.println (a%b);
// 	break;
// 	case 6:System.out.println (((float)a/b)*100);
// 	break;
// 	default:
// 	System.out.println("pls enter someting right...");


// break in for loop...

// int n = sc.nextInt();
// Strting[] fruits = new Strting[n];
// for( int i =0; i<fruits.length; i++){
//     fruits[i] = sc.next();
    
// }
//       String query = sc.next();
//       for (int i =0 ; i<fruits.length; i++){
//           if (fruits[i].equals(query));
//           System.out.println(i);
//       }

int n = sc.nextInt();
String[] fruits = new String[n];
for(int i=0;i<n;i++){
    fruits[i]=sc.next();
}
String query=sc.next();
for(int i=0;i<n;i++){

System.out.println("Searching at index" + i);
    if(fruits[i].equals(query)){
  
   }
}

  }
}


    