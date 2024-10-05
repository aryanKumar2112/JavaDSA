package DSA.Function;

import java.util.Scanner;

public class Sum {
    public static void printSum(int a,int b){

        System.out.println("Sum of a and b is "+(a+b));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       int  b=sc.nextInt();
        printSum(a,b);
    }
}
