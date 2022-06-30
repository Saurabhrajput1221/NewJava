package Questions.GreeksOfGreeks;

public class MaxAndMin {

    public static void main(String args[]) {
        System.out.println("hello");
        int items[] = { 5000, 11, 445, 6, 330, 3000 };

        int min = items[0];
        int max = items[0];

        for (int i = 1; i < items.length; i++) {
            if (min > items[i]) {
                min = items[i];
            } else if (max < items[i]) {
                max = items[i];
            }
        }
        System.out.println("Maximum Number from array is " +max);
        System.out.println("Minimum Number from array is " +min);

    }

}
