package DSA;

public class TwoDArray {

    public static void main(String[] args) {
        System.out.println("Two-D Arrays...");
        // 2D Array...
        // int[][] floor = new int[2][2];
        // floor[0][0] = 111;
        // floor[0][1] = 112;

        // floor[1][0] = 211;
        // floor[1][1] = 212;

        // // System.out.println(floor.length);
        // for(int i = 0; i<floor.length; i++){
        // for(int j = 0; j<floor[i].length; j++ ){
        // System.out.print(floor[i][j]);
        // System.out.print(" ");
        // }
        // System.err.println("");
        // }

        // 3D Array...
        int[][] flats = new int[3][3];

        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;

        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;

        flats[2][0] = 300;
        flats[2][1] = 301;
        flats[2][2] = 302;

        // System.out.println(flats.length);
        // 2D array

        for (int i = 0; i < flats.length; i++) {
        // below for loop print 0 to N numbers from array...
        for (int j = 0; j < flats[i].length; j++) {
   
        System.out.print(flats[i][j]);
        System.out.print(" ");
        }
        System.out.println("");
        }

        /*********************************************** */
        // int[][] flats = new int[3][3];
        // flats[0][0] = 100;
        // flats[0][1] = 101;
        // flats[0][2] = 102;

        // flats[1][0] = 200;
        // flats[1][1] = 201;
        // flats[1][2] = 202;

        // flats[2][0] = 300;
        // flats[2][1] = 301;
        // flats[2][2] = 302;

        // for(int i = 0 ; i<flats.length; i++){
        //     for(int j =0 ; j<flats[i].length ; j++){
        //         System.out.print(flats[i][j]);

        //         System.out.print(" ");
        //     }
        //     System.out.println("");
        // }

    }
}