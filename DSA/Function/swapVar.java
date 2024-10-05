package DSA.Function;

import java.util.Scanner;

public class swapVar {
    public static void swap(int a,int b ){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
    }

}
