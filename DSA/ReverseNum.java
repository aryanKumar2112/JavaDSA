package DSA;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int rev=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            rev=rev*10+rem;


        }
        System.out.println("Reverse of a number is "+rev);
    }
}
