package DSA.Function;

import java.util.Scanner;

public class ReturnInt {
    public static int calcSum(int x,int y){

        int sum=x+y;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        int sum=calcSum(a,b);
        System.out.println("Sum of two number is "+sum);

    }

}
