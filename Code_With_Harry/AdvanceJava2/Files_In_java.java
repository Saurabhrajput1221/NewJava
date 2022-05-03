package AdvanceJava2;
import java.io.File;
import java.util.Scanner;

public class Files_In_java {
    public static void main(String[] args) {
        System.out.println("File in java...");
        // read file
        File myfile = new File("CreatedFileUsingFile.txt");
        try {
            Scanner sc = new Scanner(myfile);
            String Line = sc.nextLine();
            System.out.println(Line);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

   // created file

    //  try {
    //     myfile.createNewFile();
    //  } catch (Exception e) {
    //      //TODO: handle exception
    //      System.out.println(e);
         
    //  }
    }
}
