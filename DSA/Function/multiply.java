package DSA.Function;

import java.util.Scanner;

public class multiply {
    public static int multiply(int a,int b){
        int mult=a*b;
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int prod=multiply(num1,num2);
        System.out.println(prod);

    }
}
