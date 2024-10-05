package DSA.Recursion;

import java.util.Scanner;

public class CalcFact {
    public static int calcFact(int n){
        if(n==0){
            return 1;
        }
         int fnm=calcFact(n-1);
        int fn=n*fnm;
        return fn;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calcFact(n));

    }

}
