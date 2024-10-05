package DSA.Function;

import java.util.Scanner;

public class FunctionOverloadin {
    public static void calcprod(int a,int b){
        int product=a*b;
        System.out.println(product);
    }

    public static void calcprod(int a,int b,int c){
        float product=a*b*c;
        System.out.println(product);
    }

    public static void main(String[] args) {

        calcprod(5,6);
    }


}
