package DSA;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i,n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        n=sc.nextInt() ;

        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
