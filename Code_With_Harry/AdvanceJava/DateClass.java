package AdvanceJava;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        System.out.println("DateClass in java...");
        // System.out.println(System.currentTimeMillis());
        Date d = new  Date(); 
       System.out.println(d); 

       System.out.println(d.getTime());
    //    System.out.println(d.getYear() - 1900);
    }
}
