package Operators_02;

public class Main {
    public static void main(String[] args){
        // other ways to create variables;
//        int x; // creates the variable but has not yet initialised the variable
//        x = 3; // initialised the variable
//        System.out.println(x);

        int x = 5;
        double y = 7;
        int z = 8;
        double u = x*z;
        double d = Math.pow(x,y);
        double sum = x - y * z;

        //using type-casting

        double sum2 = x/(double)z;
        System.out.println(sum2);
    }
}
