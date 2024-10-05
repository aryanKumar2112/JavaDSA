package DSA;

import java.util.Scanner;

public class ReadIntPrintSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int enenSum=0,oddSum=0;
        int n,choice;
        do{
             n=sc.nextInt();
            if(n%2==0){
                enenSum+=n;
            }
            else
                oddSum+=n;
            System.out.println("choice 1 for continue ");
            choice= sc.nextInt();

        }
        while (choice==1);

        System.out.println(enenSum);
        System.out.println(oddSum);
    }
}
