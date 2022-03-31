public class Arrays {
    public static void main(String[] args) {
        System.out.println("Array....");
        // Ways of declering Array...
        // Way No1.
        // int[] marks = new int[5];
        // marks[0] = 100;
        // marks[1] = 140;
        // marks[2] = 50;
        // marks[3] = 80;
        // marks[4] = 90;
        // System.out.println(marks[4]);

        // Way No2.
        // int[] rollno = {3,45,6,6,78,88};
        // // rollno[5] = 76;
        // System.out.println(rollno[5]);
        // System.out.println(rollno.length);

        // // float Array...
        // float[] abc = {56.6f, 76.67f, 67.7f, 87.8f};
        // System.out.println(abc[2]);

        // // String Array...
        // String[] Str = {"Ajay", "Rohit", "Rohan", "Soham"};

        // System.out.println(Str[2]);

        // How to Display Array...1st way of displyaing Array

    //    int[] rollno = {3,45,6,6,78,88};
    //    for(int i=0; i<rollno.length; i++){
    //        System.out.print(rollno[i]);
    //    }

    //    2nd way of displyaing Array
    int[] rollno = {3,45,6,6,78,88};
    for(int element : rollno){
        System.out.println(element);
    }

    }
}
