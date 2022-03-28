import java.util.Scanner;

public class CBSC_percetages {
    public static void main(String[] args) {
        System.out.println("Students marks convert to percentages....(out of 100)...");
        Scanner sc = new Scanner(System.in);
        float Math = sc.nextInt();
        float Phy = sc.nextInt();
        float Che = sc.nextInt();
        float Eng = sc.nextInt();
        float His = sc.nextInt();
        float Obtained = (Math + Phy + Che + Eng + His);

        float OutofMarks = 500;

        float percentage = ((Obtained/OutofMarks)*100);
        System.out.println(percentage);

    }
}
