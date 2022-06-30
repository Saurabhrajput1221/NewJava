package Questions.DSA;
// import javax.swing.tree.RowMapper;

public class Arrays2 {
    public static void main(String[] args) {
        System.out.println("Arrays2");
        // int[][] PracticeArr = new int[3][3];
        // PracticeArr[0][0] = 100;
        // PracticeArr[0][1] = 101;
        // PracticeArr[0][2] = 102;

        // PracticeArr[1][0] = 223;
        // PracticeArr[1][1] = 223;
        // PracticeArr[1][2] = 223;

        // PracticeArr[2][0] = 323;
        // PracticeArr[2][1] = 323;
        // PracticeArr[2][2] = 323;

        // for (int i = 0; i < PracticeArr.length; i++) {
        //     for (int j = 0; j <PracticeArr[i].length; j++) {
        //         System.out.print(PracticeArr[i][j]);
        //         System.out.print(" ");
        //     }
        //     System.out.print(" ");

        // }

        int[][] Rooms = new int[2][2];

        Rooms[0][0] = 111;
        Rooms[0][1] = 112;

        Rooms[1][0] = 211;
        Rooms[1][1] = 212;

        for(int i =0; i<Rooms.length; i++){
            for(int j = 0 ; j<Rooms[i].length; j++){
                System.out.print(Rooms[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
