package DSA.Function;

import java.util.Scanner;

public class Binomial {
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

    public static int calcBinomial(int n,int r){
        int fact_n=calcFact(n);
        int fact_r=calcFact(r);
        int fact_n_min_r=calcFact(n-r);
        int binomial=fact_n/(fact_r*fact_n_min_r);
        return binomial;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(calcBinomial(n,r));
    }
}
