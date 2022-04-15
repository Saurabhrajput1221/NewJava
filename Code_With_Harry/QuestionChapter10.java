// package chpter10;

// I did not get chapter 10 Questions set.
class circle {
    int redius;
    int height;

    public void area(int n) {
       this.redius = n;

    }
}

class cylinder extends circle {

    public double Area(int n) {
        return Math.PI * redius * redius;

    }
}

public class QuestionChapter10 {
    public static void main(String[] args) {
        System.out.println("chapter No. 10 Questions.");

        cylinder a = new cylinder();
        System.out.println(a.Area(25));

    }
}
