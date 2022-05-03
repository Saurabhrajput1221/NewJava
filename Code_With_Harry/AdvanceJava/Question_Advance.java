package AdvanceJava;

// import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

// import javax.print.DocFlavor.STRING;

public class Question_Advance {
    public static void main(String[] args) {
        System.out.println("Question Advance Java...");

        // Question 1...Solved example using ArrayList...
        ArrayList<String> Arrlist = new ArrayList<String>();

        // Arrlist.add("hello");
        // Arrlist.add("hi");
        // Arrlist.add("bro");
        // Arrlist.add("good");

        Arrlist.add("happy");
        

        // // System.out.println(Arrlist.clone());

        // System.out.println(Arrlist);
        // // for(int i = 0 ; i<Arrlist.size(); i++){
        // // System.out.println(Arrlist.get(i));
        // // }
        /********************************************/

        // Question 2... solve example using Hashset...
        HashSet<Integer> N = new HashSet<>();
        N.add(1);
        N.add(2);
        N.add(3);
        N.add(4);
        N.add(5);
        N.add(6);
        N.add(7);
        N.add(6);
        System.out.println(N);

        /********************************************/
        // Question No 3... use Date class and print (21:47:02)
        Date d = new Date();
        // System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        System.out.println(d);

        // Question No 4... use calender class and print (21:47:02)
        Calendar C =  Calendar.getInstance();
        System.out.println(C.get(Calendar.HOUR_OF_DAY) + ":" + C.get(Calendar.MINUTE) + ":"  + C.get(Calendar.SECOND));

        //    Question No 5... use API class and print (21:47:02)
        LocalTime L = LocalTime.now();
        System.out.println(L);
    }
}
