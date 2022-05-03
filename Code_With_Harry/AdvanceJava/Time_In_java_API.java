package AdvanceJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_In_java_API {
    public static void main(String[] args) {
        System.out.println("Time In java (API)...");
        LocalDate d = LocalDate.now();
        System.out.println(d);
        /********************************************/
        LocalTime T = LocalTime.now();
        System.out.println(T);
        /********************************************/

        LocalDateTime DT = LocalDateTime.now();
        System.out.println(DT);
        /********************************************/
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String Mydate = DT.format(DTF);
        System.out.println(Mydate);
        /********************************************/
    }
}
