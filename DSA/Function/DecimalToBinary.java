package DSA.Function;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int decNum){
       int rem;
       int n=0;
       int p=0;

       while (decNum>0){
           rem=decNum%2;
           n=n+(int)(rem*Math.pow(10,p));
           decNum=decNum/2;
           p++;

       }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        decToBin(n);
    }
}
