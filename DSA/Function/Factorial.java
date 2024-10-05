package DSA.Function;

import java.util.Scanner;

public class Factorial {
    public static int calcFact(int n){
        int product=1;
        if(n==0){
            return product;
        }
        for (int i = 1; i <=n ; i++) {
            product=product*i;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//        int fact=calcFact(num);
//        System.out.println("Factorial of "+num+" is "+fact);
        System.out.println(calcFact(num));
    }

}
