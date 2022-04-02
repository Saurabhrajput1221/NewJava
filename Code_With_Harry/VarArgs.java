public class VarArgs {


    // Best Example of VarArgs...
    static int sumfun(int ...arr){
        int sum = 0;
        for(int a: arr){
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Example of VarArgs...

        System.out.print(sumfun(2,3,45,5,5));
        // you can pass Number of Arguments... for same function or method...
        System.out.println(sumfun(345,5,657,6,4,5566,76,565));
        System.out.println(sumfun(2,3,45,5,5));
        System.out.println(sumfun(5,5));
        System.out.println(sumfun(2,3,5,5));
        System.out.println(sumfun(2,3,45,5));
        System.out.println(sumfun(6,3,45,5));
    }
}
