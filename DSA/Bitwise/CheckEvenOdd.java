package DSA.Bitwise;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void checkEvenOrOdd(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Entered number is even");
        }
        else
            System.out.println("Enterd number is odd");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkEvenOrOdd(n);
    }
}
